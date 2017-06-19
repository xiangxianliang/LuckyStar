package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysModuleExample implements Serializable {
	/**
	 * sys_module
	 */
	protected String orderByClause;

	/**
	 * sys_module
	 */
	protected boolean distinct;

	/**
	 * sys_module
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * sys_module
	 */
	private static final long serialVersionUID = 1L;

	public SysModuleExample() {
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
	 * sys_module 2017-06-17
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

		public Criteria andModuleNameIsNull() {
			addCriterion("module_name is null");
			return (Criteria) this;
		}

		public Criteria andModuleNameIsNotNull() {
			addCriterion("module_name is not null");
			return (Criteria) this;
		}

		public Criteria andModuleNameEqualTo(String value) {
			addCriterion("module_name =", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameNotEqualTo(String value) {
			addCriterion("module_name <>", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameGreaterThan(String value) {
			addCriterion("module_name >", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
			addCriterion("module_name >=", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameLessThan(String value) {
			addCriterion("module_name <", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameLessThanOrEqualTo(String value) {
			addCriterion("module_name <=", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameLike(String value) {
			addCriterion("module_name like", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameNotLike(String value) {
			addCriterion("module_name not like", value, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameIn(List<String> values) {
			addCriterion("module_name in", values, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameNotIn(List<String> values) {
			addCriterion("module_name not in", values, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameBetween(String value1, String value2) {
			addCriterion("module_name between", value1, value2, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleNameNotBetween(String value1, String value2) {
			addCriterion("module_name not between", value1, value2, "moduleName");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionIsNull() {
			addCriterion("module_description is null");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionIsNotNull() {
			addCriterion("module_description is not null");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionEqualTo(String value) {
			addCriterion("module_description =", value, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionNotEqualTo(String value) {
			addCriterion("module_description <>", value, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionGreaterThan(String value) {
			addCriterion("module_description >", value, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("module_description >=", value, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionLessThan(String value) {
			addCriterion("module_description <", value, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionLessThanOrEqualTo(String value) {
			addCriterion("module_description <=", value, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionLike(String value) {
			addCriterion("module_description like", value, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionNotLike(String value) {
			addCriterion("module_description not like", value, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionIn(List<String> values) {
			addCriterion("module_description in", values, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionNotIn(List<String> values) {
			addCriterion("module_description not in", values, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionBetween(String value1, String value2) {
			addCriterion("module_description between", value1, value2, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andModuleDescriptionNotBetween(String value1, String value2) {
			addCriterion("module_description not between", value1, value2, "moduleDescription");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(Integer value) {
			addCriterion("parent_id =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(Integer value) {
			addCriterion("parent_id <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(Integer value) {
			addCriterion("parent_id >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("parent_id >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(Integer value) {
			addCriterion("parent_id <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(Integer value) {
			addCriterion("parent_id <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<Integer> values) {
			addCriterion("parent_id in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<Integer> values) {
			addCriterion("parent_id not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(Integer value1, Integer value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andModuleUrlIsNull() {
			addCriterion("module_url is null");
			return (Criteria) this;
		}

		public Criteria andModuleUrlIsNotNull() {
			addCriterion("module_url is not null");
			return (Criteria) this;
		}

		public Criteria andModuleUrlEqualTo(String value) {
			addCriterion("module_url =", value, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlNotEqualTo(String value) {
			addCriterion("module_url <>", value, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlGreaterThan(String value) {
			addCriterion("module_url >", value, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlGreaterThanOrEqualTo(String value) {
			addCriterion("module_url >=", value, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlLessThan(String value) {
			addCriterion("module_url <", value, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlLessThanOrEqualTo(String value) {
			addCriterion("module_url <=", value, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlLike(String value) {
			addCriterion("module_url like", value, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlNotLike(String value) {
			addCriterion("module_url not like", value, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlIn(List<String> values) {
			addCriterion("module_url in", values, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlNotIn(List<String> values) {
			addCriterion("module_url not in", values, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlBetween(String value1, String value2) {
			addCriterion("module_url between", value1, value2, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleUrlNotBetween(String value1, String value2) {
			addCriterion("module_url not between", value1, value2, "moduleUrl");
			return (Criteria) this;
		}

		public Criteria andModuleIconIsNull() {
			addCriterion("module_icon is null");
			return (Criteria) this;
		}

		public Criteria andModuleIconIsNotNull() {
			addCriterion("module_icon is not null");
			return (Criteria) this;
		}

		public Criteria andModuleIconEqualTo(String value) {
			addCriterion("module_icon =", value, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconNotEqualTo(String value) {
			addCriterion("module_icon <>", value, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconGreaterThan(String value) {
			addCriterion("module_icon >", value, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconGreaterThanOrEqualTo(String value) {
			addCriterion("module_icon >=", value, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconLessThan(String value) {
			addCriterion("module_icon <", value, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconLessThanOrEqualTo(String value) {
			addCriterion("module_icon <=", value, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconLike(String value) {
			addCriterion("module_icon like", value, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconNotLike(String value) {
			addCriterion("module_icon not like", value, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconIn(List<String> values) {
			addCriterion("module_icon in", values, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconNotIn(List<String> values) {
			addCriterion("module_icon not in", values, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconBetween(String value1, String value2) {
			addCriterion("module_icon between", value1, value2, "moduleIcon");
			return (Criteria) this;
		}

		public Criteria andModuleIconNotBetween(String value1, String value2) {
			addCriterion("module_icon not between", value1, value2, "moduleIcon");
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

		public Criteria andIsSeafIsNull() {
			addCriterion("is_seaf is null");
			return (Criteria) this;
		}

		public Criteria andIsSeafIsNotNull() {
			addCriterion("is_seaf is not null");
			return (Criteria) this;
		}

		public Criteria andIsSeafEqualTo(Integer value) {
			addCriterion("is_seaf =", value, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafNotEqualTo(Integer value) {
			addCriterion("is_seaf <>", value, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafGreaterThan(Integer value) {
			addCriterion("is_seaf >", value, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_seaf >=", value, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafLessThan(Integer value) {
			addCriterion("is_seaf <", value, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafLessThanOrEqualTo(Integer value) {
			addCriterion("is_seaf <=", value, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafIn(List<Integer> values) {
			addCriterion("is_seaf in", values, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafNotIn(List<Integer> values) {
			addCriterion("is_seaf not in", values, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafBetween(Integer value1, Integer value2) {
			addCriterion("is_seaf between", value1, value2, "isSeaf");
			return (Criteria) this;
		}

		public Criteria andIsSeafNotBetween(Integer value1, Integer value2) {
			addCriterion("is_seaf not between", value1, value2, "isSeaf");
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
	 * sys_module
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
	 * sys_module 2017-06-17
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