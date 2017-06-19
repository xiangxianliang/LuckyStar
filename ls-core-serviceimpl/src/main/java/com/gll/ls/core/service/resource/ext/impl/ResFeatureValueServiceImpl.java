package com.gll.ls.core.service.resource.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.resource.custom.ResFeatureValueMapperCustom;
import com.gll.ls.core.dao.resource.mapper.ResFeatureValueMapper;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueQueryVo;
import com.gll.ls.core.service.resource.base.impl.ResFeatureValueServiceBaseImpl;
import com.gll.ls.core.service.resource.ext.ResFeatureValueService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

@Service
@Transactional
public class ResFeatureValueServiceImpl extends ResFeatureValueServiceBaseImpl implements ResFeatureValueService {

	@Resource
	private ResFeatureValueMapper resFeatureValueMapper;
	@Resource
	private ResFeatureValueMapperCustom resFeatureValueMapperCustom;

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<ResFeatureValueCustom> getFeatureValueListDataGridByQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo, int rows, int page) {
		// TODO 设置排序

		ResFeatureValueCustom t = resFeatureValueQueryVo.getResFeatureValueCustom();
		t.setIsDel(1);// 查询未删除的
		resFeatureValueQueryVo.setPageSize(rows);// 每页显示个数
		resFeatureValueQueryVo.setPageNo(page);// 当前页码

		int count = resFeatureValueMapperCustom.getResFeatureValueCustomCount(resFeatureValueQueryVo);
		List<ResFeatureValueCustom> list = resFeatureValueMapperCustom.getResFeatureValueCustomListWithPage(resFeatureValueQueryVo);

		DataGridResultInfo<ResFeatureValueCustom> resultInfo = new DataGridResultInfo<ResFeatureValueCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集
		return resultInfo;
	}

	/**
	 * 添加
	 */
	public Integer addFeatureValueByQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		// TODO 自定义

		return resFeatureValueMapperCustom.addResFeatureValueCustomByQueryVo(resFeatureValueQueryVo);
	}

	/**
	 * 根据id查询
	 */
	public ResFeatureValueCustom getFeatureValueByKey(Integer featureValueId) {
		// TODO 自定义

		return resFeatureValueMapperCustom.getResFeatureValueCustomByKey(featureValueId);
	}

	/**
	 * 根据id更新
	 */
	public Integer updateFeatureValueByKey(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		// TODO 自定义 快照

		return resFeatureValueMapperCustom.updateResFeatureValueCustomByKeySnapshots(resFeatureValueQueryVo);
	}

	/**
	 * 根据id删除
	 */
	public Integer deleteFeatureValueByKey(Integer featureValueId) {
		// TODO 自定义

		return resFeatureValueMapperCustom.updateDeleteResFeatureValueCustomByKey(featureValueId);
	}

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteFeatureValueByKeyList(List<Integer> featureValueIdList) {
		// TODO 自定义

		return resFeatureValueMapperCustom.updateDeleteResFeatureValueCustomByKeyList(featureValueIdList);
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkFeatureValue(Integer featureValueId, ResFeatureValueQueryVo resFeatureValueQueryVo) {
		// TODO 自定义 快照

		List<ResFeatureValueCustom> list = resFeatureValueMapperCustom.getResFeatureValueCustomListByQueryVo(resFeatureValueQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == featureValueId) {
				// 存在相同的模块
				return false;
			} else {
				Integer tid = list.get(0).getFeatureValueId();
				if (tid.equals(featureValueId)) {
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

	@Override
	public List<ResFeatureValueCustom> getFeatureValueListByFeatureKey(Integer featureId) {

		// 封装查询条件
		ResFeatureValueQueryVo queryVo = new ResFeatureValueQueryVo();
		ResFeatureValueCustom custom = new ResFeatureValueCustom();
		custom.setFeatureId(featureId);
		custom.setIsDel(1);
		queryVo.setResFeatureValueCustom(custom);

		List<ResFeatureValueCustom> list = resFeatureValueMapperCustom.getResFeatureValueCustomListByQueryVo(queryVo);

		return list;
	}

}
