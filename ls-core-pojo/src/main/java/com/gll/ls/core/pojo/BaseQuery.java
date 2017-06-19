package com.gll.ls.core.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 条件对象公用对象
 * 
 * @author XL
 * @Date 2017年4月8日 上午10:21:34
 */
public class BaseQuery implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 定义常量 每页数
	 */
	public final static int DEFAULT_SIZE = 10;

	/**
	 * 每页数
	 */
	protected int pageSize = DEFAULT_SIZE;

	/**
	 * 起始行
	 */
	protected int startRow;// 起始行

	/**
	 * 页码
	 */
	protected int pageNo = 1;

	/**
	 * Sql查询字段
	 */
	protected String fields;

	/**
	 * 排序列表字段
	 */
	protected List<OrderField> orderFields = new ArrayList<OrderField>();

	protected List<String> selectFields = new ArrayList<String>();

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * 
	 * @author XL
	 * @Date 2017年4月8日 上午10:38:39
	 */
	public class OrderField {

		private String fieldName;
		private String order;

		public OrderField(String fieldName, String order) {
			super();
			this.fieldName = fieldName;
			this.order = order;
		}

		public String getFieldName() {
			return fieldName;
		}

		public OrderField setFieldName(String fieldName) {
			this.fieldName = fieldName;
			return this;
		}

		public String getOrder() {
			return order;
		}

		public OrderField setOrder(String order) {
			this.order = order;
			return this;
		}
	}

	/**
	 * ===================== get*set ================================
	 */
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
		this.startRow = (pageNo - 1) * this.pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public BaseQuery setPageSize(int pageSize) {
		if (pageSize != 0) {
			this.pageSize = pageSize;
			this.startRow = (pageNo - 1) * this.pageSize;
		}
		return this;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	/**
	 * @return orderFields
	 */
	public List<OrderField> getOrderFields() {
		return orderFields;
	}

	/**
	 * @param orderFields
	 *            要设置的 orderFields
	 */
	public void setOrderFields(List<OrderField> orderFields) {
		this.orderFields = orderFields;
	}

	/**
	 * @return selectFields
	 */
	public List<String> getSelectFields() {
		return selectFields;
	}

	/**
	 * @param selectFields
	 *            要设置的 selectFields
	 */
	public void setSelectFields(List<String> selectFields) {
		this.selectFields = selectFields;
	}

	/**
	 * ===================== get*set ==============================end
	 */

}
