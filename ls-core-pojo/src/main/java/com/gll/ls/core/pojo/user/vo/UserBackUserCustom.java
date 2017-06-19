package com.gll.ls.core.pojo.user.vo;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysRoleCustom;
import com.gll.ls.core.pojo.user.po.UserBackUser;
import com.gll.ls.utils.context.Constants;
import com.gll.ls.utils.utils.DateUtil;

public class UserBackUserCustom extends UserBackUser {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String regpassword;// 确认密码

	private List<SysRoleCustom> roleCustomList;// 用户角色

	// ======================================================

	public String getAllUrl() {
		return Constants.GET_IMAGE_URL + this.getImgUrl();
	}

	// 格式化 最后登录时间
	public String getLastLoginTimeStr() {
		return DateUtil.formatDateByFormat(getLastLoginTime(), DateUtil.DATETIME_FORMAT);
	}

	// 格式化 注册时间
	public String getRegisterTimeStr() {
		return DateUtil.formatDateByFormat(getRegisterTime(), DateUtil.DATETIME_FORMAT);
	}

	/**
	 * 账号是否锁定
	 */
	public String getIsAdminName() {
		if (null != this.getIsAdmin()) {
			switch (this.getIsAdmin()) {
			case 0:
				return "否";
			case 1:
				return "是";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 账号是否锁定
	 */
	public String getIsLockedName() {
		if (null != this.getIsLocked()) {
			switch (this.getIsLocked()) {
			case 0:
				return "锁定";
			case 1:
				return "未锁定";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 是否可见：1：可见；0：不可见
	 * 
	 * @return
	 */
	public String getIsDisplayName() {
		if (null != this.getIsDisplay()) {
			switch (this.getIsDisplay()) {
			case 0:
				return "不可见";
			case 1:
				return "可见";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 是否启用：1：启用；0：未启用
	 * 
	 * @return
	 */
	public String getIsEnableName() {
		if (null != this.getIsEnable()) {
			switch (this.getIsEnable()) {
			case 0:
				return "未启用";
			case 1:
				return "启用";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 是否激活：1：激活；0：未激活
	 * 
	 * @return
	 */
	public String getIsActivationName() {
		if (null != this.getIsActivation()) {
			switch (this.getIsActivation()) {
			case 0:
				return "未激活";
			case 1:
				return "激活";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * @return regpassword
	 */
	public String getRegpassword() {
		return regpassword;
	}

	/**
	 * @param regpassword
	 *            要设置的 regpassword
	 */
	public void setRegpassword(String regpassword) {
		this.regpassword = regpassword;
	}

	/**
	 * @return roleCustomList
	 */
	public List<SysRoleCustom> getRoleCustomList() {
		return roleCustomList;
	}

	/**
	 * @param roleCustomList
	 *            要设置的 roleCustomList
	 */
	public void setRoleCustomList(List<SysRoleCustom> roleCustomList) {
		this.roleCustomList = roleCustomList;
	}
}
