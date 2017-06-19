package com.gll.ls.core.dao.user.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.user.vo.UserBackUserQueryVo;
import com.gll.ls.core.pojo.user.vo.UserBackUserCustom;

public interface UserBackUserMapperCustom {

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
	public List<UserBackUserCustom> getUserBackUserCustomListByKeyList(@Param("userIdList") List<Integer> userIdList);

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
	public Integer deleteUserBackUserCustomByKeyList(@Param("userIdList") List<Integer> userIdList);

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
	public Integer updateDeleteUserBackUserCustomByKeyList(@Param("userIdList") List<Integer> userIdList);

}
