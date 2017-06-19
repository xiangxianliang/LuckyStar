package com.gll.ls.core.service.system.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysBasicInfoMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysBasicInfoMapper;
import com.gll.ls.core.pojo.system.po.SysBasicInfo;
import com.gll.ls.core.pojo.system.po.SysBasicInfoExample;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoQueryVo;
import com.gll.ls.core.service.system.base.SysBasicInfoServiceBase;

@Service
@Transactional
public class SysBasicInfoServiceBaseImpl implements SysBasicInfoServiceBase {

	@Resource
	private SysBasicInfoMapper sysBasicInfoMapper;
	@Resource
	private SysBasicInfoMapperCustom sysBasicInfoMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListWithPage(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.getSysBasicInfoCustomListWithPage(sysBasicInfoQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysBasicInfoCustomCount(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.getSysBasicInfoCustomCount(sysBasicInfoQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.getSysBasicInfoCustomListByQueryVo(sysBasicInfoQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysBasicInfoCustom getSysBasicInfoCustomByKey(Integer basicInfoId) {
		return sysBasicInfoMapperCustom.getSysBasicInfoCustomByKey(basicInfoId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysBasicInfoCustom getSysBasicInfoCustomByKeyWithQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.getSysBasicInfoCustomByKeyWithQueryVo(sysBasicInfoQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListByKeyList(List<Integer> basicInfoIdList) {
		return sysBasicInfoMapperCustom.getSysBasicInfoCustomListByKeyList(basicInfoIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysBasicInfoCustom> getSysBasicInfoListByKeyListWithQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.getSysBasicInfoListByKeyListWithQueryVo(sysBasicInfoQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysBasicInfoCustomByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.addSysBasicInfoCustomByQueryVo(sysBasicInfoQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysBasicInfoCustomByCustom(SysBasicInfoCustom sysBasicInfoCustom) {
		return sysBasicInfoMapperCustom.addSysBasicInfoCustomByCustom(sysBasicInfoCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysBasicInfoCustomByKey(Integer basicInfoId) {
		return sysBasicInfoMapperCustom.deleteSysBasicInfoCustomByKey(basicInfoId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysBasicInfoCustomByKeyList(List<Integer> basicInfoIdList) {
		return sysBasicInfoMapperCustom.deleteSysBasicInfoCustomByKeyList(basicInfoIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysBasicInfoCustomByKeySelective(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.updateSysBasicInfoCustomByKeySelective(sysBasicInfoQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysBasicInfoCustomByKeySnapshots(SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		return sysBasicInfoMapperCustom.updateSysBasicInfoCustomByKeySnapshots(sysBasicInfoQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteSysBasicInfoCustomByKey(Integer basicInfoId) {
		return sysBasicInfoMapperCustom.updateDeleteSysBasicInfoCustomByKey(basicInfoId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteSysBasicInfoCustomByKeyList(List<Integer> basicInfoIdList) {
		return sysBasicInfoMapperCustom.updateDeleteSysBasicInfoCustomByKeyList(basicInfoIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysBasicInfoExample example) {
		return sysBasicInfoMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysBasicInfoExample example) {
		return sysBasicInfoMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer basicInfoId) {
		return sysBasicInfoMapper.deleteByPrimaryKey(basicInfoId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysBasicInfo record) {
		return sysBasicInfoMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysBasicInfo record) {
		return sysBasicInfoMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysBasicInfo> selectByExample(SysBasicInfoExample example) {
		return sysBasicInfoMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysBasicInfo selectByPrimaryKey(Integer basicInfoId) {
		return sysBasicInfoMapper.selectByPrimaryKey(basicInfoId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysBasicInfo record, SysBasicInfoExample example) {
		return sysBasicInfoMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysBasicInfo record, SysBasicInfoExample example) {
		return sysBasicInfoMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysBasicInfo record) {
		return sysBasicInfoMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysBasicInfo record) {
		return sysBasicInfoMapper.updateByPrimaryKey(record);
	}

}
