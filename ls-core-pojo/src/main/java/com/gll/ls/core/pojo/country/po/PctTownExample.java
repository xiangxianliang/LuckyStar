package com.gll.ls.core.pojo.country.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PctTownExample implements Serializable {
	/**
	 * pct_town
	 */
	protected String orderByClause;

	/**
	 * pct_town
	 */
	protected boolean distinct;

	/**
	 * pct_town
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * pct_town
	 */
	private static final long serialVersionUID = 1L;

	public PctTownExample() {
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
	 * pct_town 2017-06-17
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

		public Criteria andTownCodeIsNull() {
			addCriterion("town_code is null");
			return (Criteria) this;
		}

		public Criteria andTownCodeIsNotNull() {
			addCriterion("town_code is not null");
			return (Criteria) this;
		}

		public Criteria andTownCodeEqualTo(String value) {
			addCriterion("town_code =", value, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeNotEqualTo(String value) {
			addCriterion("town_code <>", value, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeGreaterThan(String value) {
			addCriterion("town_code >", value, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeGreaterThanOrEqualTo(String value) {
			addCriterion("town_code >=", value, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeLessThan(String value) {
			addCriterion("town_code <", value, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeLessThanOrEqualTo(String value) {
			addCriterion("town_code <=", value, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeLike(String value) {
			addCriterion("town_code like", value, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeNotLike(String value) {
			addCriterion("town_code not like", value, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeIn(List<String> values) {
			addCriterion("town_code in", values, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeNotIn(List<String> values) {
			addCriterion("town_code not in", values, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeBetween(String value1, String value2) {
			addCriterion("town_code between", value1, value2, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownCodeNotBetween(String value1, String value2) {
			addCriterion("town_code not between", value1, value2, "townCode");
			return (Criteria) this;
		}

		public Criteria andTownNameIsNull() {
			addCriterion("town_name is null");
			return (Criteria) this;
		}

		public Criteria andTownNameIsNotNull() {
			addCriterion("town_name is not null");
			return (Criteria) this;
		}

		public Criteria andTownNameEqualTo(String value) {
			addCriterion("town_name =", value, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameNotEqualTo(String value) {
			addCriterion("town_name <>", value, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameGreaterThan(String value) {
			addCriterion("town_name >", value, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameGreaterThanOrEqualTo(String value) {
			addCriterion("town_name >=", value, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameLessThan(String value) {
			addCriterion("town_name <", value, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameLessThanOrEqualTo(String value) {
			addCriterion("town_name <=", value, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameLike(String value) {
			addCriterion("town_name like", value, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameNotLike(String value) {
			addCriterion("town_name not like", value, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameIn(List<String> values) {
			addCriterion("town_name in", values, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameNotIn(List<String> values) {
			addCriterion("town_name not in", values, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameBetween(String value1, String value2) {
			addCriterion("town_name between", value1, value2, "townName");
			return (Criteria) this;
		}

		public Criteria andTownNameNotBetween(String value1, String value2) {
			addCriterion("town_name not between", value1, value2, "townName");
			return (Criteria) this;
		}

		public Criteria andCityCodeIsNull() {
			addCriterion("city_code is null");
			return (Criteria) this;
		}

		public Criteria andCityCodeIsNotNull() {
			addCriterion("city_code is not null");
			return (Criteria) this;
		}

		public Criteria andCityCodeEqualTo(String value) {
			addCriterion("city_code =", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeNotEqualTo(String value) {
			addCriterion("city_code <>", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeGreaterThan(String value) {
			addCriterion("city_code >", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
			addCriterion("city_code >=", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeLessThan(String value) {
			addCriterion("city_code <", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeLessThanOrEqualTo(String value) {
			addCriterion("city_code <=", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeLike(String value) {
			addCriterion("city_code like", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeNotLike(String value) {
			addCriterion("city_code not like", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeIn(List<String> values) {
			addCriterion("city_code in", values, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeNotIn(List<String> values) {
			addCriterion("city_code not in", values, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeBetween(String value1, String value2) {
			addCriterion("city_code between", value1, value2, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeNotBetween(String value1, String value2) {
			addCriterion("city_code not between", value1, value2, "cityCode");
			return (Criteria) this;
		}
	}

	/**
	 * pct_town
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
	 * pct_town 2017-06-17
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