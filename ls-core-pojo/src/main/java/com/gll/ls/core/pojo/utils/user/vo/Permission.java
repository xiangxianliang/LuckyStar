package com.gll.ls.core.pojo.utils.user.vo;

import java.io.Serializable;

/**
 * 菜单下的操作模型类，配置菜单下各各操作链接是为了进行用户权限拦截
 * 
 * @author XL
 * @Date 2017年4月26日 上午10:05:25
 */
public class Permission implements Serializable {

	/**
	 * serialVersionUID = -5432351755716171044L;
	 */
	private static final long serialVersionUID = -5432351755716171044L;

	private Integer permissionId;// 主键
	private String permissionName;// 资源名称
	private String permissionCode;// 权限代码
	private String permissionMethod;// 权限访问的方法；访问url地址
	private String permissionIcon;// 权限图标
	private Integer parentModuleId;// 权限 父模块id

	/**
	 * @return permissionId
	 */
	public Integer getPermissionId() {
		return permissionId;
	}

	/**
	 * @param permissionId
	 *            要设置的 permissionId
	 */
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	/**
	 * @return permissionName
	 */
	public String getPermissionName() {
		return permissionName;
	}

	/**
	 * @param permissionName
	 *            要设置的 permissionName
	 */
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	/**
	 * @return permissionCode
	 */
	public String getPermissionCode() {
		return permissionCode;
	}

	/**
	 * @param permissionCode
	 *            要设置的 permissionCode
	 */
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	/**
	 * @return permissionMethod
	 */
	public String getPermissionMethod() {
		return permissionMethod;
	}

	/**
	 * @param permissionMethod
	 *            要设置的 permissionMethod
	 */
	public void setPermissionMethod(String permissionMethod) {
		this.permissionMethod = permissionMethod;
	}

	/**
	 * @return permissionIcon
	 */
	public String getPermissionIcon() {
		return permissionIcon;
	}

	/**
	 * @param permissionIcon
	 *            要设置的 permissionIcon
	 */
	public void setPermissionIcon(String permissionIcon) {
		this.permissionIcon = permissionIcon;
	}

	/**
	 * @return parentModuleId
	 */
	public Integer getParentModuleId() {
		return parentModuleId;
	}

	/**
	 * @param parentModuleId
	 *            要设置的 parentModuleId
	 */
	public void setParentModuleId(Integer parentModuleId) {
		this.parentModuleId = parentModuleId;
	}

}
