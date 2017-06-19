package com.gll.ls.core.pojo.utils.search.vo;

import com.gll.ls.core.pojo.BaseQuery;

/**
 * 搜索 queryVo
 * SearchItemQueryVo.java
 * 
 * @author xxlsg
 * @Date 2017年6月10日 上午9:30:56
 * @Version 1.0
 */
public class SearchItemQueryVo extends BaseQuery {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	private SearchItem searchItem;

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return searchItem
	 */
	public SearchItem getSearchItem() {
		return searchItem;
	}

	/**
	 * @param searchItem
	 *            要设置的 searchItem
	 */
	public void setSearchItem(SearchItem searchItem) {
		this.searchItem = searchItem;
	}

}
