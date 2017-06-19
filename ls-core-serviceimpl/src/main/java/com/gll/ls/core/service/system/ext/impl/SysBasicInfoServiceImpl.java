package com.gll.ls.core.service.system.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysBasicInfoMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysBasicInfoMapper;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoQueryVo;
import com.gll.ls.core.service.system.base.impl.SysBasicInfoServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysBasicInfoService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 基本信息
 * 
 * @author XL
 * @Date 2017年4月29日 上午7:51:26
 */
@Service
@Transactional
public class SysBasicInfoServiceImpl extends SysBasicInfoServiceBaseImpl implements SysBasicInfoService {

	@Resource
	private SysBasicInfoMapper sysBasicInfoMapper;
	@Resource
	private SysBasicInfoMapperCustom sysBasicInfoMapperCustom;

	// =================================================================================================

	/**
	 * 分页查询 ezsyui
	 */
	@Override
	public DataGridResultInfo<SysBasicInfoCustom> getBasicInfoDataGridByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo, Integer rows, Integer page) {

		SysBasicInfoCustom rc = sysBasicInfoQueryVo.getSysBasicInfoCustom();
		rc.setIsDel(1);// 查询未删除的
		sysBasicInfoQueryVo.setPageSize(rows);// 每页显示个数
		sysBasicInfoQueryVo.setPageNo(page);// 当前页码

		int count = sysBasicInfoMapperCustom.getSysBasicInfoCustomCount(sysBasicInfoQueryVo);
		List<SysBasicInfoCustom> list = sysBasicInfoMapperCustom.getSysBasicInfoCustomListWithPage(sysBasicInfoQueryVo);

		DataGridResultInfo<SysBasicInfoCustom> resultInfo = new DataGridResultInfo<SysBasicInfoCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集

		return resultInfo;

	}

	/**
	 * 添加
	 */
	@Override
	public Integer addBasicInfoByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.addSysBasicInfoCustomByQueryVo(sysBasicInfoQueryVo);
	}

	/**
	 * 根据id更新
	 */
	@Override
	public Integer updateBasicInfoByKey(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		// 自定义 快照
		sysBasicInfoQueryVo.setUpdateBasicInfoName(true);
		sysBasicInfoQueryVo.setUpdateBasicInfoValue(true);
		sysBasicInfoQueryVo.setUpdateBasicInfoType(true);
		sysBasicInfoQueryVo.setUpdateBasicInfoTag(true);
		sysBasicInfoQueryVo.setUpdateBasicInfoDescription(true);
		sysBasicInfoQueryVo.setUpdateBasicInfoRemark(true);
		return sysBasicInfoMapperCustom.updateSysBasicInfoCustomByKeySnapshots(sysBasicInfoQueryVo);
	}

	/**
	 * 根据id删除
	 */
	@Override
	public Integer deleteBasicInfoByKey(Integer basicInfoId) {
		return sysBasicInfoMapperCustom.deleteSysBasicInfoCustomByKey(basicInfoId);
	}

	/**
	 * 根据id 批量删除
	 */
	@Override
	public Integer deleteBasicInfoByKeyList(List<Integer> basicInfoIdList) {
		return sysBasicInfoMapperCustom.deleteSysBasicInfoCustomByKeyList(basicInfoIdList);
	}

	/**
	 * 启用 禁用
	 */
	@Override
	public Integer enableBasicInfoByKey(Integer basicInfoId, Integer isEnable) {
		// 根据id查询数据库
		SysBasicInfoCustom customByKey = sysBasicInfoMapperCustom.getSysBasicInfoCustomByKey(basicInfoId);
		// 设置值
		customByKey.setIsEnable(isEnable);
		// 更新到数据库
		Integer count = sysBasicInfoMapper.updateByPrimaryKey(customByKey);
		return count;
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkBasicInfo(Integer basicInfoId, SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		List<SysBasicInfoCustom> list = sysBasicInfoMapperCustom.getSysBasicInfoCustomListByQueryVo(sysBasicInfoQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == basicInfoId) {
				// 存在相同的模块
				return false;
			} else {
				Integer tid = list.get(0).getBasicInfoId();
				if (tid.equals(basicInfoId)) {
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
	 */
}