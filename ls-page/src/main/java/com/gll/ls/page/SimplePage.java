package com.gll.ls.page;

import java.io.Serializable;

public class SimplePage implements Serializable, Paginable {

	private static final long serialVersionUID = 1L;

	public static final int DEF_COUNT = 20;
	// 总记录数
	protected int totalCount;
	// 每页记录数
	protected int pageSize;
	// 当前页
	protected int pageNo;

	/**
	 * 构造方法 默认值设置
	 */
	public SimplePage() {
		// 总记录数
		totalCount = 0;
		// 每页记录数
		pageSize = 20;
		// 总页数
		pageNo = 1;
	}

	/**
	 * 构造方法 传入参数值设置
	 * 
	 * @param pageNo
	 *            当前页
	 * @param pageSize
	 *            每页数
	 * @param totalCount
	 *            总页数
	 */
	public SimplePage(int pageNo, int pageSize, int totalCount) {
		this.totalCount = 0;
		this.pageSize = 20;
		this.pageNo = 1;
		setTotalCount(totalCount);
		setPageSize(pageSize);
		setPageNo(pageNo);
		adjustPageNo();
	}

	/**
	 * 当前页数 控制设置
	 * 
	 * @param pageNo
	 * @return
	 */
	public static int cpn(Integer pageNo) {
		return pageNo != null && pageNo.intValue() >= 1 ? pageNo.intValue() : 1;
	}

	public void adjustPageNo() {
		if (pageNo == 1)
			return;
		int tp = getTotalPage();
		if (pageNo > tp)
			pageNo = tp;
	}

	/**
	 * 获取当前页
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * 获取页面大小
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 总页数
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * 获取 TotalPage
	 */
	public int getTotalPage() {
		int totalPage = totalCount / pageSize;
		if (totalPage == 0 || totalCount % pageSize != 0)
			totalPage++;
		return totalPage;
	}

	/**
	 * 是否 首页
	 */
	public boolean isFirstPage() {
		return pageNo <= 1;
	}

	/**
	 * 是否 最后一页
	 */
	public boolean isLastPage() {
		return pageNo >= getTotalPage();
	}

	/**
	 * 获取 下一页
	 */
	public int getNextPage() {
		if (isLastPage())
			return pageNo;
		else
			return pageNo + 1;
	}

	/**
	 * 获取 上一页
	 */
	public int getPrePage() {
		if (isFirstPage())
			return pageNo;
		else
			return pageNo - 1;
	}

	/**
	 * 设置总页数
	 * 
	 * @param totalCount
	 */
	public void setTotalCount(int totalCount) {
		if (totalCount < 0)
			this.totalCount = 0;
		else
			this.totalCount = totalCount;
	}

	/**
	 * 设置 页面大小
	 * 
	 * @param pageSize
	 */
	public void setPageSize(int pageSize) {
		if (pageSize < 1)
			this.pageSize = 20;
		else
			this.pageSize = pageSize;
	}

	/**
	 * 设置 当前页
	 * 
	 * @param pageNo
	 *            当前页
	 */
	public void setPageNo(int pageNo) {
		if (pageNo < 1)
			this.pageNo = 1;
		else
			this.pageNo = pageNo;
	}
}
