package com.gll.ls.core.pojo.country.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PctProvinceExample implements Serializable {
	/**
	 * pct_province
	 */
	protected String orderByClause;

	/**
	 * pct_province
	 */
	protected boolean distinct;

	/**
	 * pct_province
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * pct_province
	 */
	private static final long serialVersionUID = 1L;

	public PctProvinceExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * pct_province 2017-06-17
	 */
	protected abstract static class GeneratedCriteria implements Serializable {

		/**
		 * user_back_user
		 */
		private static final long serialVersionUID = 1L;

		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andProvinceCodeIsNull() {
			addCriterion("province_code is null");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeIsNotNull() {
			addCriterion("province_code is not null");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeEqualTo(String value) {
			addCriterion("province_code =", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeNotEqualTo(String value) {
			addCriterion("province_code <>", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeGreaterThan(String value) {
			addCriterion("province_code >", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
			addCriterion("province_code >=", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeLessThan(String value) {
			addCriterion("province_code <", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
			addCriterion("province_code <=", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeLike(String value) {
			addCriterion("province_code like", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeNotLike(String value) {
			addCriterion("province_code not like", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeIn(List<String> values) {
			addCriterion("province_code in", values, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeNotIn(List<String> values) {
			addCriterion("province_code not in", values, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeBetween(String value1, String value2) {
			addCriterion("province_code between", value1, value2, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeNotBetween(String value1, String value2) {
			addCriterion("province_code not between", value1, value2, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceNameIsNull() {
			addCriterion("province_name is null");
			return (Criteria) this;
		}

		public Criteria andProvinceNameIsNotNull() {
			addCriterion("province_name is not null");
			return (Criteria) this;
		}

		public Criteria andProvinceNameEqualTo(String value) {
			addCriterion("province_name =", value, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameNotEqualTo(String value) {
			addCriterion("province_name <>", value, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameGreaterThan(String value) {
			addCriterion("province_name >", value, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
			addCriterion("province_name >=", value, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameLessThan(String value) {
			addCriterion("province_name <", value, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameLessThanOrEqualTo(String value) {
			addCriterion("province_name <=", value, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameLike(String value) {
			addCriterion("province_name like", value, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameNotLike(String value) {
			addCriterion("province_name not like", value, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameIn(List<String> values) {
			addCriterion("province_name in", values, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameNotIn(List<String> values) {
			addCriterion("province_name not in", values, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameBetween(String value1, String value2) {
			addCriterion("province_name between", value1, value2, "provinceName");
			return (Criteria) this;
		}

		public Criteria andProvinceNameNotBetween(String value1, String value2) {
			addCriterion("province_name not between", value1, value2, "provinceName");
			return (Criteria) this;
		}
	}

	/**
	 * pct_province
	 */
	public static class Criteria extends GeneratedCriteria implements Serializable {

		/**
		 * user_back_user
		 */
		private static final long serialVersionUID = 1L;

		protected Criteria() {
			super();
		}
	}

	/**
	 * pct_province 2017-06-17
	 */
	public static class Criterion implements Serializable {

		/**
		 * user_back_user
		 */
		private static final long serialVersionUID = 1L;

		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}