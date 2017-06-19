package com.gll.ls.core.service.resource.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.resource.custom.ResFeatureMapperCustom;
import com.gll.ls.core.dao.resource.mapper.ResFeatureMapper;
import com.gll.ls.core.pojo.resource.vo.ResFeatureCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureQueryVo;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueCustom;
import com.gll.ls.core.pojo.resource.vo.ResTypeCustom;
import com.gll.ls.core.service.resource.base.impl.ResFeatureServiceBaseImpl;
import com.gll.ls.core.service.resource.ext.ResFeatureService;
import com.gll.ls.core.service.resource.ext.ResFeatureValueService;
import com.gll.ls.core.service.resource.ext.ResTypeService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

@Service
@Transactional
public class ResFeatureServiceImpl extends ResFeatureServiceBaseImpl implements ResFeatureService {

	@Resource
	private ResFeatureMapper resFeatureMapper;
	@Resource
	private ResFeatureMapperCustom resFeatureMapperCustom;

	@Resource
	private ResTypeService resTypeService;
	@Resource
	private ResFeatureValueService resFeatureValueService;

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<ResFeatureCustom> getFeatureListDataGridByQueryVo(ResFeatureQueryVo resFeatureQueryVo, int rows, int page) {
		// TODO 设置排序

		ResFeatureCustom t = resFeatureQueryVo.getResFeatureCustom();
		t.setIsDel(1);// 查询未删除的
		resFeatureQueryVo.setPageSize(rows);// 每页显示个数
		resFeatureQueryVo.setPageNo(page);// 当前页码

		int count = resFeatureMapperCustom.getResFeatureCustomCount(resFeatureQueryVo);
		List<ResFeatureCustom> list = resFeatureMapperCustom.getResFeatureCustomListWithPage(resFeatureQueryVo);

		// 根据 类型id查询类型
		ResTypeCustom p_tc = resTypeService.getResTypeCustomByKey(t.getTypeId());
		String typeName = "";
		if (p_tc != null) {
			typeName = p_tc.getTypeName();
		} else {
			typeName = "系统根节点";
		}
		for (ResFeatureCustom efc : list) {
			efc.setTypeName(typeName);
		}

		DataGridResultInfo<ResFeatureCustom> resultInfo = new DataGridResultInfo<ResFeatureCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集
		return resultInfo;
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addFeatureByQueryVo(ResFeatureQueryVo resFeatureQueryVo, String[] featureValueNames, String[] featureValueValues) {
		Integer index = resFeatureMapperCustom.addResFeatureCustomByQueryVo(resFeatureQueryVo);

		Integer inputType = resFeatureQueryVo.getResFeatureCustom().getInputType();
		Integer featureId = resFeatureQueryVo.getResFeatureCustom().getFeatureId();
		for (int i = 0; i < featureValueValues.length; i++) {
			ResFeatureValueCustom fval = new ResFeatureValueCustom();
			fval.setFeatureId(featureId);
			fval.setFeatureValueValue(featureValueValues[i]);
			if (inputType == 4) {
				fval.setFeatureValueName(featureValueNames[i]);
				fval.setIsDisplayName(1);
			}
			index += resFeatureValueService.insertSelective(fval);
		}

		return index;
	}

	/**
	 * 根据id查询
	 */
	public ResFeatureCustom getFeatureByKey(Integer featureId) {
		ResFeatureCustom featureCustom = resFeatureMapperCustom.getResFeatureCustomByKey(featureId);

		// 查询所属的属性
		List<ResFeatureValueCustom> listByFeatureKey = resFeatureValueService.getFeatureValueListByFeatureKey(featureId);
		featureCustom.setResFeatureValueCustomList(listByFeatureKey);

		// 返回数据
		return featureCustom;
	}

	/**
	 * 根据id更新
	 */
	public Integer updateFeatureByKey(ResFeatureQueryVo resFeatureQueryVo) {
		// TODO 自定义 快照

		return resFeatureMapperCustom.updateResFeatureCustomByKeySnapshots(resFeatureQueryVo);
	}

	/**
	 * 根据id删除
	 */
	public Integer deleteFeatureByKey(Integer featureId) {
		// TODO 自定义

		return resFeatureMapperCustom.updateDeleteResFeatureCustomByKey(featureId);
	}

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteFeatureByKeyList(List<Integer> featureIdList) {
		// TODO 自定义

		return resFeatureMapperCustom.updateDeleteResFeatureCustomByKeyList(featureIdList);
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkFeature(Integer featureId, ResFeatureQueryVo resFeatureQueryVo) {
		// TODO 自定义 快照

		List<ResFeatureCustom> list = resFeatureMapperCustom.getResFeatureCustomListByQueryVo(resFeatureQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == featureId) {
				// 存在相同的模块
				return false;
			} else {
				Integer tid = list.get(0).getFeatureId();
				if (tid.equals(featureId)) {
					// id 相同， 并且size() 是1 return 可以使用
					return true;
				} else {
					// 存在相同的模块
					return false;
				}
			}
		}
		// 其他情况
		return false;
	}

}
