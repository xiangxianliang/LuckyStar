package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysPermissionExample implements Serializable {
	/**
	 * sys_permission
	 */
	protected String orderByClause;

	/**
	 * sys_permission
	 */
	protected boolean distinct;

	/**
	 * sys_permission
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * sys_permission
	 */
	private static final long serialVersionUID = 1L;

	public SysPermissionExample() {
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
	 * sys_permission 2017-06-17
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

		public Criteria andPermissionIdIsNull() {
			addCriterion("permission_id is null");
			return (Criteria) this;
		}

		public Criteria andPermissionIdIsNotNull() {
			addCriterion("permission_id is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionIdEqualTo(Integer value) {
			addCriterion("permission_id =", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdNotEqualTo(Integer value) {
			addCriterion("permission_id <>", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdGreaterThan(Integer value) {
			addCriterion("permission_id >", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("permission_id >=", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdLessThan(Integer value) {
			addCriterion("permission_id <", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdLessThanOrEqualTo(Integer value) {
			addCriterion("permission_id <=", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdIn(List<Integer> values) {
			addCriterion("permission_id in", values, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdNotIn(List<Integer> values) {
			addCriterion("permission_id not in", values, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdBetween(Integer value1, Integer value2) {
			addCriterion("permission_id between", value1, value2, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdNotBetween(Integer value1, Integer value2) {
			addCriterion("permission_id not between", value1, value2, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionNameIsNull() {
			addCriterion("permission_name is null");
			return (Criteria) this;
		}

		public Criteria andPermissionNameIsNotNull() {
			addCriterion("permission_name is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionNameEqualTo(String value) {
			addCriterion("permission_name =", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameNotEqualTo(String value) {
			addCriterion("permission_name <>", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameGreaterThan(String value) {
			addCriterion("permission_name >", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
			addCriterion("permission_name >=", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameLessThan(String value) {
			addCriterion("permission_name <", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameLessThanOrEqualTo(String value) {
			addCriterion("permission_name <=", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameLike(String value) {
			addCriterion("permission_name like", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameNotLike(String value) {
			addCriterion("permission_name not like", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameIn(List<String> values) {
			addCriterion("permission_name in", values, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameNotIn(List<String> values) {
			addCriterion("permission_name not in", values, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameBetween(String value1, String value2) {
			addCriterion("permission_name between", value1, value2, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameNotBetween(String value1, String value2) {
			addCriterion("permission_name not between", value1, value2, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeIsNull() {
			addCriterion("permission_code is null");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeIsNotNull() {
			addCriterion("permission_code is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeEqualTo(String value) {
			addCriterion("permission_code =", value, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeNotEqualTo(String value) {
			addCriterion("permission_code <>", value, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeGreaterThan(String value) {
			addCriterion("permission_code >", value, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeGreaterThanOrEqualTo(String value) {
			addCriterion("permission_code >=", value, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeLessThan(String value) {
			addCriterion("permission_code <", value, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeLessThanOrEqualTo(String value) {
			addCriterion("permission_code <=", value, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeLike(String value) {
			addCriterion("permission_code like", value, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeNotLike(String value) {
			addCriterion("permission_code not like", value, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeIn(List<String> values) {
			addCriterion("permission_code in", values, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeNotIn(List<String> values) {
			addCriterion("permission_code not in", values, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeBetween(String value1, String value2) {
			addCriterion("permission_code between", value1, value2, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionCodeNotBetween(String value1, String value2) {
			addCriterion("permission_code not between", value1, value2, "permissionCode");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodIsNull() {
			addCriterion("permission_method is null");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodIsNotNull() {
			addCriterion("permission_method is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodEqualTo(String value) {
			addCriterion("permission_method =", value, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodNotEqualTo(String value) {
			addCriterion("permission_method <>", value, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodGreaterThan(String value) {
			addCriterion("permission_method >", value, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodGreaterThanOrEqualTo(String value) {
			addCriterion("permission_method >=", value, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodLessThan(String value) {
			addCriterion("permission_method <", value, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodLessThanOrEqualTo(String value) {
			addCriterion("permission_method <=", value, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodLike(String value) {
			addCriterion("permission_method like", value, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodNotLike(String value) {
			addCriterion("permission_method not like", value, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodIn(List<String> values) {
			addCriterion("permission_method in", values, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodNotIn(List<String> values) {
			addCriterion("permission_method not in", values, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodBetween(String value1, String value2) {
			addCriterion("permission_method between", value1, value2, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionMethodNotBetween(String value1, String value2) {
			addCriterion("permission_method not between", value1, value2, "permissionMethod");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionIsNull() {
			addCriterion("permission_description is null");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionIsNotNull() {
			addCriterion("permission_description is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionEqualTo(String value) {
			addCriterion("permission_description =", value, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionNotEqualTo(String value) {
			addCriterion("permission_description <>", value, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionGreaterThan(String value) {
			addCriterion("permission_description >", value, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("permission_description >=", value, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionLessThan(String value) {
			addCriterion("permission_description <", value, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionLessThanOrEqualTo(String value) {
			addCriterion("permission_description <=", value, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionLike(String value) {
			addCriterion("permission_description like", value, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionNotLike(String value) {
			addCriterion("permission_description not like", value, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionIn(List<String> values) {
			addCriterion("permission_description in", values, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionNotIn(List<String> values) {
			addCriterion("permission_description not in", values, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionBetween(String value1, String value2) {
			addCriterion("permission_description between", value1, value2, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionDescriptionNotBetween(String value1, String value2) {
			addCriterion("permission_description not between", value1, value2, "permissionDescription");
			return (Criteria) this;
		}

		public Criteria andPermissionIconIsNull() {
			addCriterion("permission_icon is null");
			return (Criteria) this;
		}

		public Criteria andPermissionIconIsNotNull() {
			addCriterion("permission_icon is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionIconEqualTo(String value) {
			addCriterion("permission_icon =", value, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconNotEqualTo(String value) {
			addCriterion("permission_icon <>", value, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconGreaterThan(String value) {
			addCriterion("permission_icon >", value, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconGreaterThanOrEqualTo(String value) {
			addCriterion("permission_icon >=", value, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconLessThan(String value) {
			addCriterion("permission_icon <", value, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconLessThanOrEqualTo(String value) {
			addCriterion("permission_icon <=", value, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconLike(String value) {
			addCriterion("permission_icon like", value, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconNotLike(String value) {
			addCriterion("permission_icon not like", value, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconIn(List<String> values) {
			addCriterion("permission_icon in", values, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconNotIn(List<String> values) {
			addCriterion("permission_icon not in", values, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconBetween(String value1, String value2) {
			addCriterion("permission_icon between", value1, value2, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andPermissionIconNotBetween(String value1, String value2) {
			addCriterion("permission_icon not between", value1, value2, "permissionIcon");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdIsNull() {
			addCriterion("parent_module_id is null");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdIsNotNull() {
			addCriterion("parent_module_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdEqualTo(Integer value) {
			addCriterion("parent_module_id =", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdNotEqualTo(Integer value) {
			addCriterion("parent_module_id <>", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdGreaterThan(Integer value) {
			addCriterion("parent_module_id >", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("parent_module_id >=", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdLessThan(Integer value) {
			addCriterion("parent_module_id <", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdLessThanOrEqualTo(Integer value) {
			addCriterion("parent_module_id <=", value, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdIn(List<Integer> values) {
			addCriterion("parent_module_id in", values, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdNotIn(List<Integer> values) {
			addCriterion("parent_module_id not in", values, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdBetween(Integer value1, Integer value2) {
			addCriterion("parent_module_id between", value1, value2, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andParentModuleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("parent_module_id not between", value1, value2, "parentModuleId");
			return (Criteria) this;
		}

		public Criteria andShoworderIsNull() {
			addCriterion("showorder is null");
			return (Criteria) this;
		}

		public Criteria andShoworderIsNotNull() {
			addCriterion("showorder is not null");
			return (Criteria) this;
		}

		public Criteria andShoworderEqualTo(Integer value) {
			addCriterion("showorder =", value, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderNotEqualTo(Integer value) {
			addCriterion("showorder <>", value, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderGreaterThan(Integer value) {
			addCriterion("showorder >", value, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderGreaterThanOrEqualTo(Integer value) {
			addCriterion("showorder >=", value, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderLessThan(Integer value) {
			addCriterion("showorder <", value, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderLessThanOrEqualTo(Integer value) {
			addCriterion("showorder <=", value, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderIn(List<Integer> values) {
			addCriterion("showorder in", values, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderNotIn(List<Integer> values) {
			addCriterion("showorder not in", values, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderBetween(Integer value1, Integer value2) {
			addCriterion("showorder between", value1, value2, "showorder");
			return (Criteria) this;
		}

		public Criteria andShoworderNotBetween(Integer value1, Integer value2) {
			addCriterion("showorder not between", value1, value2, "showorder");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
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
	 * sys_permission
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
	 * sys_permission 2017-06-17
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