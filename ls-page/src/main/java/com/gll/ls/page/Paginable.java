package com.gll.ls.page;

/**
 * page接口
 * 
 * @author XL
 *
 */
public interface Paginable {

	/**
	 * 总记录数
	 * 
	 * @return
	 */
	public abstract int getTotalCount();

	/**
	 * 总页数
	 * 
	 * @return
	 */
	public abstract int getTotalPage();

	/**
	 * 每页数
	 * 
	 * @return
	 */
	public abstract int getPageSize();

	/**
	 * 当前页数
	 * 
	 * @return
	 */
	public abstract int getPageNo();

	/**
	 * 第一页
	 * 
	 * @return
	 */
	public abstract boolean isFirstPage();

	/**
	 * 最后一页
	 * 
	 * @return
	 */
	public abstract boolean isLastPage();

	/**
	 * 下一页
	 * 
	 * @return
	 */
	public abstract int getNextPage();

	/**
	 * 上一页
	 * 
	 * @return
	 */
	public abstract int getPrePage();
}
