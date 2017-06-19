package com.gll.ls.core.pojo.utils.user.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单模型类
 * 
 * @author mrt
 *
 */
public class Menu implements Serializable {

	/**
	 * serialVersionUID = -8120654337519807709L;
	 */
	private static final long serialVersionUID = -8120654337519807709L;

	// 菜单id、模块id
	private Integer menuid;
	// 菜单名称/模块名称
	private String menuname;
	// 父菜单id
	private Integer pid;
	// 图标
	private String icon;
	// 菜单链接
	private String url;

	// 二级菜单
	private List<Menu> menuList;

	/**
	 * 格式化 去除空值
	 * 
	 * @param list
	 * @return
	 */
	public static List<Menu> formatMenuNull(List<Menu> list) {
		for (Menu menu : list) {
			List<Menu> mL = menu.getMenuList();
			for (Menu m2 : mL) {
				if (m2.getMenuid() == null) {
					menu.setMenuList(null);
				}
			}
		}
		return list;
	}

	// ======================= get * set ========================================

	/**
	 * @return menuid
	 */
	public Integer getMenuid() {
		return menuid;
	}

	/**
	 * @param menuid
	 *            要设置的 menuid
	 */
	public void setMenuid(Integer menuid) {
		this.menuid = menuid;
	}

	/**
	 * @return menuname
	 */
	public String getMenuname() {
		return menuname;
	}

	/**
	 * @param menuname
	 *            要设置的 menuname
	 */
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	/**
	 * @return pid
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * @param pid
	 *            要设置的 pid
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * @return icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            要设置的 icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            要设置的 url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return menuList
	 */
	public List<Menu> getMenuList() {
		return menuList;
	}

	/**
	 * @param menuList
	 *            要设置的 menuList
	 */
	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

}
