package com.gll.ls.core.service.system.ext.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysDictInfoMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysDictInfoMapper;
import com.gll.ls.core.pojo.system.po.SysDictInfo;
import com.gll.ls.core.pojo.system.po.SysDictInfoExample;
import com.gll.ls.core.pojo.system.vo.SysDictInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysDictInfoQueryVo;
import com.gll.ls.core.service.system.base.impl.SysDictInfoServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysDictInfoService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 数据字典信息
 * 
 * @author XL
 * @Date 2017年4月29日 上午7:54:36
 */
@Service
@Transactional
public class SysDictInfoServiceImpl extends SysDictInfoServiceBaseImpl implements SysDictInfoService {

	@Resource
	private SysDictInfoMapper sysDictInfoMapper;
	@Resource
	private SysDictInfoMapperCustom sysDictInfoMapperCustom;

	// =================================================================================================

	/**
	 * 分页查询
	 */
	@Override
	public DataGridResultInfo<SysDictInfoCustom> getDictInfoDataGridByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo, int rows, int page) {

		sysDictInfoQueryVo.orderbyShoworder(true);// 设置排序

		SysDictInfoCustom mc = sysDictInfoQueryVo.getSysDictInfoCustom();
		mc.setIsDel(1);// 查询未删除的
		sysDictInfoQueryVo.setPageSize(rows);// 每页显示个数
		sysDictInfoQueryVo.setPageNo(page);// 当前页码

		int count = sysDictInfoMapperCustom.getSysDictInfoCustomCount(sysDictInfoQueryVo);
		List<SysDictInfoCustom> list = sysDictInfoMapperCustom.getSysDictInfoCustomListWithPage(sysDictInfoQueryVo);

		DataGridResultInfo<SysDictInfoCustom> resultInfo = new DataGridResultInfo<SysDictInfoCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集

		return resultInfo;

	}

	/**
	 * 添加
	 */
	@Override
	public Integer addDictInfoByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo) {
		SysDictInfoCustom sysDictInfoCustom = sysDictInfoQueryVo.getSysDictInfoCustom();
		sysDictInfoCustom.setUpdatetime(new Date());// 更新时间
		sysDictInfoCustom.setIsDisplay(1);
		sysDictInfoCustom.setIsActivation(1);
		sysDictInfoCustom.setIsDel(1);

		return sysDictInfoMapperCustom.addSysDictInfoCustomByQueryVo(sysDictInfoQueryVo);
	}

	/**
	 * 根据id更新
	 */
	public Integer updateDictInfoByKey(SysDictInfoQueryVo sysDictInfoQueryVo) {
		SysDictInfoCustom sysDictInfoCustom = sysDictInfoQueryVo.getSysDictInfoCustom();
		sysDictInfoCustom.setUpdatetime(new Date());// 更新时间

		sysDictInfoQueryVo.setUpdateInfoDescription(true);
		sysDictInfoQueryVo.setUpdateInfoRemark(true);
		sysDictInfoQueryVo.setUpdateInfoValue(true);
		sysDictInfoQueryVo.setUpdateValueType(true);
		sysDictInfoQueryVo.setUpdateShoworder(true);
		sysDictInfoQueryVo.setUpdateIsEnable(true);
		sysDictInfoQueryVo.setUpdateUpdatetime(true);

		return sysDictInfoMapperCustom.updateSysDictInfoCustomByKeySnapshots(sysDictInfoQueryVo);
	}

	/**
	 * 删除字典 信息
	 */
	@Override
	public Integer updateDelDictInfoAndRelationByKey(Integer infoId) {
		SysDictInfoCustom infoCustom = sysDictInfoMapperCustom.getSysDictInfoCustomByKey(infoId);
		infoCustom.setIsDel(0);
		Integer count = sysDictInfoMapper.updateByPrimaryKeySelective(infoCustom);
		return count;
	}

	/**
	 * 删除字典 信息 多个
	 */
	@Override
	public Integer updateDelDictInfoAndRelationByKeys(List<Integer> infoIds) {
		Integer count = 0;
		for (Integer infoId : infoIds) {
			count += this.updateDelDictInfoAndRelationByKey(infoId);
		}
		return count;
	}

	/**
	 * 删除 字典 信息 根据 字典项 ID
	 */
	@Override
	public Integer updateDelDictInfoByTypeId(Integer typeId) {

		// 封装查询条件
		SysDictInfoExample example = new SysDictInfoExample();
		SysDictInfoExample.Criteria criteria = example.createCriteria();
		criteria.andTypeIdEqualTo(typeId);
		// 封装 更新条件
		SysDictInfo dictInfo = new SysDictInfo();
		dictInfo.setIsDel(0);
		// 进行删除
		Integer i = sysDictInfoMapper.updateByExample(dictInfo, example);
		return i;
	}

	/**
	 * 根据id删除
	 */
	public Integer deleteDictInfoByKey(Integer infoId) {
		// 硬深处 从 数据库中删除
		return sysDictInfoMapperCustom.deleteSysDictInfoCustomByKey(infoId);
	}

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteDictInfoByKeyList(List<Integer> infoIdList) {
		// 硬深处 从 数据库中删除
		return sysDictInfoMapperCustom.deleteSysDictInfoCustomByKeyList(infoIdList);
	}

	/**
	 * 根据id 批量删除
	 */
	@Override
	public Integer enableInfoByKey(Integer infoId, Integer isEnable) {
		// 根据id查询
		SysDictInfoCustom sysDictInfoCustom = sysDictInfoMapperCustom.getSysDictInfoCustomByKey(infoId);
		// 设置数据
		sysDictInfoCustom.setIsEnable(isEnable);
		// 更新数据
		int i = sysDictInfoMapper.updateByPrimaryKey(sysDictInfoCustom);
		return i;
	}

	/**
	 * 根据TypeId查询 数据字典
	 */
	@Override
	public List<SysDictInfoCustom> getSysDictInfoCustomByTypeId(Integer typeid) {

		// 封装查询条件
		SysDictInfoCustom infoCustom = new SysDictInfoCustom();
		infoCustom.setTypeId(typeid);
		infoCustom.setIsEnable(1);
		infoCustom.setIsDisplay(1);
		infoCustom.setIsActivation(1);
		infoCustom.setIsDel(1);

		SysDictInfoQueryVo queryVo = new SysDictInfoQueryVo();
		queryVo.orderbyShoworder(true);// 排序
		queryVo.setSysDictInfoCustom(infoCustom);

		// 查询数据库
		List<SysDictInfoCustom> listByQueryVo = sysDictInfoMapperCustom.getSysDictInfoCustomListByQueryVo(queryVo);

		return listByQueryVo;
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkDictInfo(Integer infoId, SysDictInfoQueryVo sysDictInfoQueryVo) {
		// TODO 自定义 快照

		List<SysDictInfoCustom> list = sysDictInfoMapperCustom.getSysDictInfoCustomListByQueryVo(sysDictInfoQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == infoId) {
				// 存在相同的模块
				return false;
			} else {
				Integer tid = list.get(0).getInfoId();
				if (tid.equals(infoId)) {
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

	// =================================================================================================

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}