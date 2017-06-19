package com.gll.ls.core.service.user.base;

import java.util.List;

import com.gll.ls.core.pojo.user.po.UserBackUser;
import com.gll.ls.core.pojo.user.po.UserBackUserExample;
import com.gll.ls.core.pojo.user.vo.UserBackUserCustom;
import com.gll.ls.core.pojo.user.vo.UserBackUserQueryVo;

public interface UserBackUserServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param userBackUserQueryVo
	 *            查询 条件 对象
	 */
	public List<UserBackUserCustom> getUserBackUserCustomListWithPage(UserBackUserQueryVo userBackUserQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param userBackUserQueryVo
	 *            查询 条件 对象
	 */
	public int getUserBackUserCustomCount(UserBackUserQueryVo userBackUserQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param userBackUserQueryVo
	 *            查询 条件 对象
	 */
	public List<UserBackUserCustom> getUserBackUserCustomListByQueryVo(UserBackUserQueryVo userBackUserQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param userId
	 *            主键
	 */
	public UserBackUserCustom getUserBackUserCustomByKey(Integer userId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param userBackUserQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public UserBackUserCustom getUserBackUserCustomByKeyWithQueryVo(UserBackUserQueryVo userBackUserQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param userIdList
	 *            主键集合
	 */
	public List<UserBackUserCustom> getUserBackUserCustomListByKeyList(List<Integer> userIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param userBackUserQueryVo
	 *            要查询的主键封装对象
	 */
	public List<UserBackUserCustom> getUserBackUserListByKeyListWithQueryVo(UserBackUserQueryVo userBackUserQueryVo);

	/**
	 * 添加
	 * 
	 * @param userBackUserQueryVo
	 *            添加 的对象
	 */
	public Integer addUserBackUserCustomByQueryVo(UserBackUserQueryVo userBackUserQueryVo);

	/**
	 * 添加
	 * 
	 * @param userBackUserCustom
	 *            添加 的对象
	 */
	public Integer addUserBackUserCustomByCustom(UserBackUserCustom userBackUserCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param userId
	 *            删除的主键集合
	 */
	public Integer deleteUserBackUserCustomByKey(Integer userId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param userIdList
	 *            删除的主键集合
	 */
	public Integer deleteUserBackUserCustomByKeyList(List<Integer> userIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param userBackUserQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateUserBackUserCustomByKeySelective(UserBackUserQueryVo userBackUserQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param userBackUserQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateUserBackUserCustomByKeySnapshots(UserBackUserQueryVo userBackUserQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param userId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteUserBackUserCustomByKey(Integer userId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param userIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteUserBackUserCustomByKeyList(List<Integer> userIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(UserBackUserExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(UserBackUserExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param userId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer userId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(UserBackUser record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(UserBackUser record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<UserBackUser> selectByExample(UserBackUserExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public UserBackUser selectByPrimaryKey(Integer userId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(UserBackUser record, UserBackUserExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(UserBackUser record, UserBackUserExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(UserBackUser record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(UserBackUser record);

}
