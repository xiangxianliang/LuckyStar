package com.gll.ls.core.pojo.utils.search.vo;

import java.io.Serializable;

/**
 * solr 索引bean
 * Search.java
 * 
 * @author xxlsg
 * @Date 2017年6月7日 下午8:49:56
 * @Version 1.0
 */
public class SearchItem implements Serializable {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String sell_point;
	private long price;
	private String image;
	private String category_name;

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            要设置的 id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            要设置的 title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return sell_point
	 */
	public String getSell_point() {
		return sell_point;
	}

	/**
	 * @param sell_point
	 *            要设置的 sell_point
	 */
	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}

	/**
	 * @return price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            要设置的 price
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @return image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image
	 *            要设置的 image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return category_name
	 */
	public String getCategory_name() {
		return category_name;
	}

	/**
	 * @param category_name
	 *            要设置的 category_name
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
}
