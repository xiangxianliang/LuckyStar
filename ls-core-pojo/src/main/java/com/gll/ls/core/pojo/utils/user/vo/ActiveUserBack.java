package com.gll.ls.core.pojo.utils.user.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.gll.ls.core.pojo.user.vo.UserBackUserCustom;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;

/**
 * 用户身份信息，存入session
 * 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * 
 * @author XL
 * @Date 2017年4月15日 上午7:47:06
 */
public class ActiveUserBack extends UserBackUserCustom implements Serializable {

	/**
	 * serialVersionUID = -1502721394999200252L;
	 */
	private static final long serialVersionUID = -1502721394999200252L;

	private Map<Integer, Tree> treeMap;

	private List<Tree> treeList;

	// 操作权限，包括用户点击菜单及操作菜单功能所有链接权限
	private List<Permission> permissions;

	// 权限代码 数组 （为了优化而设计的）
	private String[] permissionCode;

	// ============== get * set ===============================================================

	/**
	 * @return permissions
	 */
	public List<Permission> getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions
	 *            要设置的 permissions
	 */
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
		// 对 权限 代码 进行初始化
		permissionCode = new String[permissions.size()];
		for (int i = 0; i < permissions.size(); i++) {
			permissionCode[i] = permissions.get(i).getPermissionCode();
		}
	}

	/**
	 * @return permissionCode
	 */
	public String[] getPermissionCode() {
		return permissionCode;
	}

	/**
	 * @return treeList
	 */
	public List<Tree> getTreeList() {
		return treeList;
	}

	/**
	 * @param treeList
	 *            要设置的 treeList
	 */
	public void setTreeList(List<Tree> treeList) {
		this.treeList = treeList;
	}

	/**
	 * @return treeMap
	 */
	public Map<Integer, Tree> getTreeMap() {
		return treeMap;
	}

	/**
	 * @param treeMap
	 *            要设置的 treeMap
	 */
	public void setTreeMap(Map<Integer, Tree> treeMap) {
		this.treeMap = treeMap;
	}

}
