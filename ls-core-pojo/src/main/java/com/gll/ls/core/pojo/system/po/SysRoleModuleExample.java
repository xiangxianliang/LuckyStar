package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysRoleModuleExample implements Serializable {
	/**
	 * sys_role_module
	 */
	protected String orderByClause;

	/**
	 * sys_role_module
	 */
	protected boolean distinct;

	/**
	 * sys_role_module
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * sys_role_module
	 */
	private static final long serialVersionUID = 1L;

	public SysRoleModuleExample() {
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
	 * sys_role_module 2017-06-17
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

		public Criteria andRoleModuleIdIsNull() {
			addCriterion("role_module_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdIsNotNull() {
			addCriterion("role_module_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdEqualTo(Integer value) {
			addCriterion("role_module_id =", value, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdNotEqualTo(Integer value) {
			addCriterion("role_module_id <>", value, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdGreaterThan(Integer value) {
			addCriterion("role_module_id >", value, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("role_module_id >=", value, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdLessThan(Integer value) {
			addCriterion("role_module_id <", value, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdLessThanOrEqualTo(Integer value) {
			addCriterion("role_module_id <=", value, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdIn(List<Integer> values) {
			addCriterion("role_module_id in", values, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdNotIn(List<Integer> values) {
			addCriterion("role_module_id not in", values, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdBetween(Integer value1, Integer value2) {
			addCriterion("role_module_id between", value1, value2, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleModuleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("role_module_id not between", value1, value2, "roleModuleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNull() {
			addCriterion("role_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("role_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(Integer value) {
			addCriterion("role_id =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(Integer value) {
			addCriterion("role_id <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(Integer value) {
			addCriterion("role_id >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("role_id >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(Integer value) {
			addCriterion("role_id <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
			addCriterion("role_id <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<Integer> values) {
			addCriterion("role_id in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<Integer> values) {
			addCriterion("role_id not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(Integer value1, Integer value2) {
			addCriterion("role_id between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("role_id not between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdIsNull() {
			addCriterion("module_id is null");
			return (Criteria) this;
		}

		public Criteria andModuleIdIsNotNull() {
			addCriterion("module_id is not null");
			return (Criteria) this;
		}

		public Criteria andModuleIdEqualTo(Integer value) {
			addCriterion("module_id =", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdNotEqualTo(Integer value) {
			addCriterion("module_id <>", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdGreaterThan(Integer value) {
			addCriterion("module_id >", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("module_id >=", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdLessThan(Integer value) {
			addCriterion("module_id <", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
			addCriterion("module_id <=", value, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdIn(List<Integer> values) {
			addCriterion("module_id in", values, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdNotIn(List<Integer> values) {
			addCriterion("module_id not in", values, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdBetween(Integer value1, Integer value2) {
			addCriterion("module_id between", value1, value2, "moduleId");
			return (Criteria) this;
		}

		public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("module_id not between", value1, value2, "moduleId");
			return (Criteria) this;
		}
	}

	/**
	 * sys_role_module
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
	 * sys_role_module 2017-06-17
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