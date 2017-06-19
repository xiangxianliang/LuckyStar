package com.gll.ls.utils.web.result;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据查询列表结果
 * 
 * @author xxl
 * @param <T>
 *
 */
public class DataGridResultInfo<T> {

	public DataGridResultInfo() {
	}

	public DataGridResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}

	// 操作结果信息
	private ResultInfo resultInfo;

	// 总条数
	private int total;

	// 结果集
	private List<T> rows = new ArrayList<T>();

	// 总计告诉footer
	private List<T> footer = new ArrayList<T>();

	/**
	 * @return resultInfo
	 */
	public ResultInfo getResultInfo() {
		return resultInfo;
	}

	/**
	 * @param resultInfo
	 *            要设置的 resultInfo
	 */
	public void setResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}

	/**
	 * @return total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            要设置的 total
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return rows
	 */
	public List<T> getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            要设置的 rows
	 */
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	/**
	 * @return footer
	 */
	public List<T> getFooter() {
		return footer;
	}

	/**
	 * @param footer
	 *            要设置的 footer
	 */
	public void setFooter(List<T> footer) {
		this.footer = footer;
	}

}
