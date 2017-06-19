package com.gll.ls.core.pojo.utils.tree.vo;

import java.io.Serializable;

/**
 * 下拉列表框
 * 
 * @author XL
 * @Date 2017年4月25日 下午5:59:29
 */
public class ComboBox implements Serializable {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	public Integer id;
	private String text;
	private String selected;

	// =============== get * set ===============================================

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            要设置的 id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            要设置的 text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return selected
	 */
	public String getSelected() {
		return selected;
	}

	/**
	 * @param selected
	 *            要设置的 selected
	 */
	public void setSelected(String selected) {
		this.selected = selected;
	}

}
