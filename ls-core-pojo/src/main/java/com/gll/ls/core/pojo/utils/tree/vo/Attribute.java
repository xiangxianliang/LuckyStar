package com.gll.ls.core.pojo.utils.tree.vo;

import java.io.Serializable;

/**
 * 树 的属性对象
 * 
 * @author XL
 * @Date 2017年4月25日 上午10:18:22
 */
public class Attribute implements Serializable {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	private Integer pid;
	private Integer isSeaf;// 是否叶子节点：1：叶子节点；0：目录节点
	private String url;

	// ============ get * set ========================================

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
	 * @return isSeaf
	 */
	public Integer getIsSeaf() {
		return isSeaf;
	}

	/**
	 * @param isSeaf
	 *            要设置的 isSeaf
	 */
	public void setIsSeaf(Integer isSeaf) {
		this.isSeaf = isSeaf;
	}

}
