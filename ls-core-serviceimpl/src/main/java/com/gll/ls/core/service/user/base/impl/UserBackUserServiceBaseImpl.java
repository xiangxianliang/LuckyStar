package com.gll.ls.core.service.user.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.user.custom.UserBackUserMapperCustom;
import com.gll.ls.core.dao.user.mapper.UserBackUserMapper;
import com.gll.ls.core.pojo.user.po.UserBackUser;
import com.gll.ls.core.pojo.user.po.UserBackUserExample;
import com.gll.ls.core.pojo.user.vo.UserBackUserCustom;
import com.gll.ls.core.pojo.user.vo.UserBackUserQueryVo;
import com.gll.ls.core.service.user.base.UserBackUserServiceBase;

@Service
@Transactional
public class UserBackUserServiceBaseImpl implements UserBackUserServiceBase {

	@Resource
	private UserBackUserMapper userBackUserMapper;
	@Resource
	private UserBackUserMapperCustom userBackUserMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<UserBackUserCustom> getUserBackUserCustomListWithPage(UserBackUserQueryVo userBackUserQueryVo) {
		return userBackUserMapperCustom.getUserBackUserCustomListWithPage(userBackUserQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getUserBackUserCustomCount(UserBackUserQueryVo userBackUserQueryVo) {
		return userBackUserMapperCustom.getUserBackUserCustomCount(userBackUserQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<UserBackUserCustom> getUserBackUserCustomListByQueryVo(UserBackUserQueryVo userBackUserQueryVo) {
		return userBackUserMapperCustom.getUserBackUserCustomListByQueryVo(userBackUserQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public UserBackUserCustom getUserBackUserCustomByKey(Integer userId) {
		return userBackUserMapperCustom.getUserBackUserCustomByKey(userId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public UserBackUserCustom getUserBackUserCustomByKeyWithQueryVo(UserBackUserQueryVo userBackUserQueryVo) {
		return userBackUserMapperCustom.getUserBackUserCustomByKeyWithQueryVo(userBackUserQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<UserBackUserCustom> getUserBackUserCustomListByKeyList(List<Integer> userIdList) {
		return userBackUserMapperCustom.getUserBackUserCustomListByKeyList(userIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<UserBackUserCustom> getUserBackUserListByKeyListWithQueryVo(UserBackUserQueryVo userBackUserQueryVo) {
		return userBackUserMapperCustom.getUserBackUserListByKeyListWithQueryVo(userBackUserQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addUserBackUserCustomByQueryVo(UserBackUserQueryVo userBackUserQueryVo) {
		return userBackUserMapperCustom.addUserBackUserCustomByQueryVo(userBackUserQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addUserBackUserCustomByCustom(UserBackUserCustom userBackUserCustom) {
		return userBackUserMapperCustom.addUserBackUserCustomByCustom(userBackUserCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteUserBackUserCustomByKey(Integer userId) {
		return userBackUserMapperCustom.deleteUserBackUserCustomByKey(userId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteUserBackUserCustomByKeyList(List<Integer> userIdList) {
		return userBackUserMapperCustom.deleteUserBackUserCustomByKeyList(userIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateUserBackUserCustomByKeySelective(UserBackUserQueryVo userBackUserQueryVo) {
		return userBackUserMapperCustom.updateUserBackUserCustomByKeySelective(userBackUserQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateUserBackUserCustomByKeySnapshots(UserBackUserQueryVo userBackUserQueryVo) {
		return userBackUserMapperCustom.updateUserBackUserCustomByKeySnapshots(userBackUserQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteUserBackUserCustomByKey(Integer userId) {
		return userBackUserMapperCustom.updateDeleteUserBackUserCustomByKey(userId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteUserBackUserCustomByKeyList(List<Integer> userIdList) {
		return userBackUserMapperCustom.updateDeleteUserBackUserCustomByKeyList(userIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(UserBackUserExample example) {
		return userBackUserMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(UserBackUserExample example) {
		return userBackUserMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer userId) {
		return userBackUserMapper.deleteByPrimaryKey(userId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(UserBackUser record) {
		return userBackUserMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(UserBackUser record) {
		return userBackUserMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<UserBackUser> selectByExample(UserBackUserExample example) {
		return userBackUserMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public UserBackUser selectByPrimaryKey(Integer userId) {
		return userBackUserMapper.selectByPrimaryKey(userId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(UserBackUser record, UserBackUserExample example) {
		return userBackUserMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(UserBackUser record, UserBackUserExample example) {
		return userBackUserMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(UserBackUser record) {
		return userBackUserMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(UserBackUser record) {
		return userBackUserMapper.updateByPrimaryKey(record);
	}

}
