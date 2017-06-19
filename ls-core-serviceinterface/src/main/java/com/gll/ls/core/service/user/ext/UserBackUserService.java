package com.gll.ls.core.service.user.ext;

import java.util.List;

import com.gll.ls.core.pojo.user.vo.UserBackUserCustom;
import com.gll.ls.core.pojo.user.vo.UserBackUserQueryVo;
import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.core.service.user.base.UserBackUserServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

public interface UserBackUserService extends UserBackUserServiceBase {

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<UserBackUserCustom> getBackUserListDataGridByQueryVo(UserBackUserQueryVo userBackUserQueryVo, int rows, int page);

	/**
	 * 添加用户 并添加 用户角色
	 */
	public Integer addBackUserByQueryVo(UserBackUserQueryVo ebBackUserQueryVo, Integer[] roles);

	/**
	 * 根据id查询
	 */
	public UserBackUserCustom getBackUserByKey(Integer userId);

	/**
	 * 根据id更新
	 * 更新用户
	 */
	public Integer updateBackUserByKey(UserBackUserQueryVo ebBackUserQueryVo, Integer[] roles);

	/**
	 * 根据id删除
	 * 删除用户 连带 删除 关联的用户绑定的角色
	 */
	public Integer deleteBackUserAndRoleByKey(Integer userId);

	/**
	 * 根据id 批量删除
	 * 删除用户 连带 删除 关联的用户绑定的角色
	 */
	public Integer deleteBackUserAndRoleByKeyList(List<Integer> userIdList);

	/**
	 * 启用禁用用户
	 */
	public Integer enableUserByKey(Integer userId, Integer isEnable);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkBackUser(Integer userId, UserBackUserQueryVo userBackUserQueryVo);

	// =============================================================================================

	/**
	 * 获取Active User 在测试
	 */
	public ActiveUserBack getActiveUserByUserid(Integer userid);

	/**
	 * 格式化 active 用户
	 */
	public ActiveUserBack formatActiveUser(UserBackUserCustom ebBackUserCustom);

	/**
	 * 用户登录
	 */
	public UserBackUserCustom getBackUserByLongin(UserBackUserQueryVo ebBackUserQueryVo);

	// ==============================================================================================

}
