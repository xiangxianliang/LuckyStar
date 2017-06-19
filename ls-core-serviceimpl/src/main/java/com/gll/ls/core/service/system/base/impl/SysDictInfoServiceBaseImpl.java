package com.gll.ls.core.service.system.base.impl;

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
import com.gll.ls.core.service.system.base.SysDictInfoServiceBase;

@Service
@Transactional
public class SysDictInfoServiceBaseImpl implements SysDictInfoServiceBase {

	@Resource
	private SysDictInfoMapper sysDictInfoMapper;
	@Resource
	private SysDictInfoMapperCustom sysDictInfoMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysDictInfoCustom> getSysDictInfoCustomListWithPage(SysDictInfoQueryVo sysDictInfoQueryVo) {
		return sysDictInfoMapperCustom.getSysDictInfoCustomListWithPage(sysDictInfoQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysDictInfoCustomCount(SysDictInfoQueryVo sysDictInfoQueryVo) {
		return sysDictInfoMapperCustom.getSysDictInfoCustomCount(sysDictInfoQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysDictInfoCustom> getSysDictInfoCustomListByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo) {
		return sysDictInfoMapperCustom.getSysDictInfoCustomListByQueryVo(sysDictInfoQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysDictInfoCustom getSysDictInfoCustomByKey(Integer infoId) {
		return sysDictInfoMapperCustom.getSysDictInfoCustomByKey(infoId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysDictInfoCustom getSysDictInfoCustomByKeyWithQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo) {
		return sysDictInfoMapperCustom.getSysDictInfoCustomByKeyWithQueryVo(sysDictInfoQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysDictInfoCustom> getSysDictInfoCustomListByKeyList(List<Integer> infoIdList) {
		return sysDictInfoMapperCustom.getSysDictInfoCustomListByKeyList(infoIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysDictInfoCustom> getSysDictInfoListByKeyListWithQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo) {
		return sysDictInfoMapperCustom.getSysDictInfoListByKeyListWithQueryVo(sysDictInfoQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysDictInfoCustomByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo) {
		return sysDictInfoMapperCustom.addSysDictInfoCustomByQueryVo(sysDictInfoQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysDictInfoCustomByCustom(SysDictInfoCustom sysDictInfoCustom) {
		return sysDictInfoMapperCustom.addSysDictInfoCustomByCustom(sysDictInfoCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysDictInfoCustomByKey(Integer infoId) {
		return sysDictInfoMapperCustom.deleteSysDictInfoCustomByKey(infoId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysDictInfoCustomByKeyList(List<Integer> infoIdList) {
		return sysDictInfoMapperCustom.deleteSysDictInfoCustomByKeyList(infoIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysDictInfoCustomByKeySelective(SysDictInfoQueryVo sysDictInfoQueryVo) {
		return sysDictInfoMapperCustom.updateSysDictInfoCustomByKeySelective(sysDictInfoQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysDictInfoCustomByKeySnapshots(SysDictInfoQueryVo sysDictInfoQueryVo) {
		return sysDictInfoMapperCustom.updateSysDictInfoCustomByKeySnapshots(sysDictInfoQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteSysDictInfoCustomByKey(Integer infoId) {
		return sysDictInfoMapperCustom.updateDeleteSysDictInfoCustomByKey(infoId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteSysDictInfoCustomByKeyList(List<Integer> infoIdList) {
		return sysDictInfoMapperCustom.updateDeleteSysDictInfoCustomByKeyList(infoIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysDictInfoExample example) {
		return sysDictInfoMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysDictInfoExample example) {
		return sysDictInfoMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer infoId) {
		return sysDictInfoMapper.deleteByPrimaryKey(infoId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysDictInfo record) {
		return sysDictInfoMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysDictInfo record) {
		return sysDictInfoMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysDictInfo> selectByExample(SysDictInfoExample example) {
		return sysDictInfoMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysDictInfo selectByPrimaryKey(Integer infoId) {
		return sysDictInfoMapper.selectByPrimaryKey(infoId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysDictInfo record, SysDictInfoExample example) {
		return sysDictInfoMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysDictInfo record, SysDictInfoExample example) {
		return sysDictInfoMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysDictInfo record) {
		return sysDictInfoMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysDictInfo record) {
		return sysDictInfoMapper.updateByPrimaryKey(record);
	}

}
