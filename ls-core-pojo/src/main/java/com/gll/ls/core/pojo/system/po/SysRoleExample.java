package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleExample implements Serializable {
	/**
	 * sys_role
	 */
	protected String orderByClause;

	/**
	 * sys_role
	 */
	protected boolean distinct;

	/**
	 * sys_role
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * sys_role
	 */
	private static final long serialVersionUID = 1L;

	public SysRoleExample() {
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
	 * sys_role 2017-06-17
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

		public Criteria andRoleNameIsNull() {
			addCriterion("role_name is null");
			return (Criteria) this;
		}

		public Criteria andRoleNameIsNotNull() {
			addCriterion("role_name is not null");
			return (Criteria) this;
		}

		public Criteria andRoleNameEqualTo(String value) {
			addCriterion("role_name =", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotEqualTo(String value) {
			addCriterion("role_name <>", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameGreaterThan(String value) {
			addCriterion("role_name >", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
			addCriterion("role_name >=", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLessThan(String value) {
			addCriterion("role_name <", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLessThanOrEqualTo(String value) {
			addCriterion("role_name <=", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLike(String value) {
			addCriterion("role_name like", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotLike(String value) {
			addCriterion("role_name not like", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameIn(List<String> values) {
			addCriterion("role_name in", values, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotIn(List<String> values) {
			addCriterion("role_name not in", values, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameBetween(String value1, String value2) {
			addCriterion("role_name between", value1, value2, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotBetween(String value1, String value2) {
			addCriterion("role_name not between", value1, value2, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionIsNull() {
			addCriterion("role_description is null");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionIsNotNull() {
			addCriterion("role_description is not null");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionEqualTo(String value) {
			addCriterion("role_description =", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionNotEqualTo(String value) {
			addCriterion("role_description <>", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionGreaterThan(String value) {
			addCriterion("role_description >", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("role_description >=", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionLessThan(String value) {
			addCriterion("role_description <", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionLessThanOrEqualTo(String value) {
			addCriterion("role_description <=", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionLike(String value) {
			addCriterion("role_description like", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionNotLike(String value) {
			addCriterion("role_description not like", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionIn(List<String> values) {
			addCriterion("role_description in", values, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionNotIn(List<String> values) {
			addCriterion("role_description not in", values, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionBetween(String value1, String value2) {
			addCriterion("role_description between", value1, value2, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionNotBetween(String value1, String value2) {
			addCriterion("role_description not between", value1, value2, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkIsNull() {
			addCriterion("role_remark is null");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkIsNotNull() {
			addCriterion("role_remark is not null");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkEqualTo(String value) {
			addCriterion("role_remark =", value, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkNotEqualTo(String value) {
			addCriterion("role_remark <>", value, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkGreaterThan(String value) {
			addCriterion("role_remark >", value, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("role_remark >=", value, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkLessThan(String value) {
			addCriterion("role_remark <", value, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkLessThanOrEqualTo(String value) {
			addCriterion("role_remark <=", value, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkLike(String value) {
			addCriterion("role_remark like", value, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkNotLike(String value) {
			addCriterion("role_remark not like", value, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkIn(List<String> values) {
			addCriterion("role_remark in", values, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkNotIn(List<String> values) {
			addCriterion("role_remark not in", values, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkBetween(String value1, String value2) {
			addCriterion("role_remark between", value1, value2, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleRemarkNotBetween(String value1, String value2) {
			addCriterion("role_remark not between", value1, value2, "roleRemark");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateIsNull() {
			addCriterion("role_updatedate is null");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateIsNotNull() {
			addCriterion("role_updatedate is not null");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateEqualTo(Date value) {
			addCriterion("role_updatedate =", value, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateNotEqualTo(Date value) {
			addCriterion("role_updatedate <>", value, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateGreaterThan(Date value) {
			addCriterion("role_updatedate >", value, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateGreaterThanOrEqualTo(Date value) {
			addCriterion("role_updatedate >=", value, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateLessThan(Date value) {
			addCriterion("role_updatedate <", value, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateLessThanOrEqualTo(Date value) {
			addCriterion("role_updatedate <=", value, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateIn(List<Date> values) {
			addCriterion("role_updatedate in", values, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateNotIn(List<Date> values) {
			addCriterion("role_updatedate not in", values, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateBetween(Date value1, Date value2) {
			addCriterion("role_updatedate between", value1, value2, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andRoleUpdatedateNotBetween(Date value1, Date value2) {
			addCriterion("role_updatedate not between", value1, value2, "roleUpdatedate");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsIsNull() {
			addCriterion("is_permissions is null");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsIsNotNull() {
			addCriterion("is_permissions is not null");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsEqualTo(Integer value) {
			addCriterion("is_permissions =", value, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsNotEqualTo(Integer value) {
			addCriterion("is_permissions <>", value, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsGreaterThan(Integer value) {
			addCriterion("is_permissions >", value, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_permissions >=", value, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsLessThan(Integer value) {
			addCriterion("is_permissions <", value, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsLessThanOrEqualTo(Integer value) {
			addCriterion("is_permissions <=", value, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsIn(List<Integer> values) {
			addCriterion("is_permissions in", values, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsNotIn(List<Integer> values) {
			addCriterion("is_permissions not in", values, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsBetween(Integer value1, Integer value2) {
			addCriterion("is_permissions between", value1, value2, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsPermissionsNotBetween(Integer value1, Integer value2) {
			addCriterion("is_permissions not between", value1, value2, "isPermissions");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIsNull() {
			addCriterion("is_display is null");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIsNotNull() {
			addCriterion("is_display is not null");
			return (Criteria) this;
		}

		public Criteria andIsDisplayEqualTo(Integer value) {
			addCriterion("is_display =", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotEqualTo(Integer value) {
			addCriterion("is_display <>", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayGreaterThan(Integer value) {
			addCriterion("is_display >", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_display >=", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayLessThan(Integer value) {
			addCriterion("is_display <", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayLessThanOrEqualTo(Integer value) {
			addCriterion("is_display <=", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIn(List<Integer> values) {
			addCriterion("is_display in", values, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotIn(List<Integer> values) {
			addCriterion("is_display not in", values, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayBetween(Integer value1, Integer value2) {
			addCriterion("is_display between", value1, value2, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotBetween(Integer value1, Integer value2) {
			addCriterion("is_display not between", value1, value2, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsEnableIsNull() {
			addCriterion("is_enable is null");
			return (Criteria) this;
		}

		public Criteria andIsEnableIsNotNull() {
			addCriterion("is_enable is not null");
			return (Criteria) this;
		}

		public Criteria andIsEnableEqualTo(Integer value) {
			addCriterion("is_enable =", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotEqualTo(Integer value) {
			addCriterion("is_enable <>", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableGreaterThan(Integer value) {
			addCriterion("is_enable >", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_enable >=", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableLessThan(Integer value) {
			addCriterion("is_enable <", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableLessThanOrEqualTo(Integer value) {
			addCriterion("is_enable <=", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableIn(List<Integer> values) {
			addCriterion("is_enable in", values, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotIn(List<Integer> values) {
			addCriterion("is_enable not in", values, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableBetween(Integer value1, Integer value2) {
			addCriterion("is_enable between", value1, value2, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("is_enable not between", value1, value2, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsActivationIsNull() {
			addCriterion("is_activation is null");
			return (Criteria) this;
		}

		public Criteria andIsActivationIsNotNull() {
			addCriterion("is_activation is not null");
			return (Criteria) this;
		}

		public Criteria andIsActivationEqualTo(Integer value) {
			addCriterion("is_activation =", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationNotEqualTo(Integer value) {
			addCriterion("is_activation <>", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationGreaterThan(Integer value) {
			addCriterion("is_activation >", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_activation >=", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationLessThan(Integer value) {
			addCriterion("is_activation <", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationLessThanOrEqualTo(Integer value) {
			addCriterion("is_activation <=", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationIn(List<Integer> values) {
			addCriterion("is_activation in", values, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationNotIn(List<Integer> values) {
			addCriterion("is_activation not in", values, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationBetween(Integer value1, Integer value2) {
			addCriterion("is_activation between", value1, value2, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationNotBetween(Integer value1, Integer value2) {
			addCriterion("is_activation not between", value1, value2, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsDelIsNull() {
			addCriterion("is_del is null");
			return (Criteria) this;
		}

		public Criteria andIsDelIsNotNull() {
			addCriterion("is_del is not null");
			return (Criteria) this;
		}

		public Criteria andIsDelEqualTo(Integer value) {
			addCriterion("is_del =", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelNotEqualTo(Integer value) {
			addCriterion("is_del <>", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelGreaterThan(Integer value) {
			addCriterion("is_del >", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_del >=", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelLessThan(Integer value) {
			addCriterion("is_del <", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelLessThanOrEqualTo(Integer value) {
			addCriterion("is_del <=", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelIn(List<Integer> values) {
			addCriterion("is_del in", values, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelNotIn(List<Integer> values) {
			addCriterion("is_del not in", values, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelBetween(Integer value1, Integer value2) {
			addCriterion("is_del between", value1, value2, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
			addCriterion("is_del not between", value1, value2, "isDel");
			return (Criteria) this;
		}
	}

	/**
	 * sys_role
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
	 * sys_role 2017-06-17
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