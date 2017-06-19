package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysDictTypeExample implements Serializable {
	/**
	 * sys_dict_type
	 */
	protected String orderByClause;

	/**
	 * sys_dict_type
	 */
	protected boolean distinct;

	/**
	 * sys_dict_type
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * sys_dict_type
	 */
	private static final long serialVersionUID = 1L;

	public SysDictTypeExample() {
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
	 * sys_dict_type 2017-06-19
	 */
	protected abstract static class GeneratedCriteria implements Serializable {

		/**
		 * sys_dict_type
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

		public Criteria andTypeIdIsNull() {
			addCriterion("type_id is null");
			return (Criteria) this;
		}

		public Criteria andTypeIdIsNotNull() {
			addCriterion("type_id is not null");
			return (Criteria) this;
		}

		public Criteria andTypeIdEqualTo(Integer value) {
			addCriterion("type_id =", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdNotEqualTo(Integer value) {
			addCriterion("type_id <>", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdGreaterThan(Integer value) {
			addCriterion("type_id >", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("type_id >=", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdLessThan(Integer value) {
			addCriterion("type_id <", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
			addCriterion("type_id <=", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdIn(List<Integer> values) {
			addCriterion("type_id in", values, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdNotIn(List<Integer> values) {
			addCriterion("type_id not in", values, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdBetween(Integer value1, Integer value2) {
			addCriterion("type_id between", value1, value2, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
			addCriterion("type_id not between", value1, value2, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeNameIsNull() {
			addCriterion("type_name is null");
			return (Criteria) this;
		}

		public Criteria andTypeNameIsNotNull() {
			addCriterion("type_name is not null");
			return (Criteria) this;
		}

		public Criteria andTypeNameEqualTo(String value) {
			addCriterion("type_name =", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotEqualTo(String value) {
			addCriterion("type_name <>", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameGreaterThan(String value) {
			addCriterion("type_name >", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
			addCriterion("type_name >=", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLessThan(String value) {
			addCriterion("type_name <", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLessThanOrEqualTo(String value) {
			addCriterion("type_name <=", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLike(String value) {
			addCriterion("type_name like", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotLike(String value) {
			addCriterion("type_name not like", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameIn(List<String> values) {
			addCriterion("type_name in", values, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotIn(List<String> values) {
			addCriterion("type_name not in", values, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameBetween(String value1, String value2) {
			addCriterion("type_name between", value1, value2, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotBetween(String value1, String value2) {
			addCriterion("type_name not between", value1, value2, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionIsNull() {
			addCriterion("type_description is null");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionIsNotNull() {
			addCriterion("type_description is not null");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionEqualTo(String value) {
			addCriterion("type_description =", value, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionNotEqualTo(String value) {
			addCriterion("type_description <>", value, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionGreaterThan(String value) {
			addCriterion("type_description >", value, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("type_description >=", value, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionLessThan(String value) {
			addCriterion("type_description <", value, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionLessThanOrEqualTo(String value) {
			addCriterion("type_description <=", value, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionLike(String value) {
			addCriterion("type_description like", value, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionNotLike(String value) {
			addCriterion("type_description not like", value, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionIn(List<String> values) {
			addCriterion("type_description in", values, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionNotIn(List<String> values) {
			addCriterion("type_description not in", values, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionBetween(String value1, String value2) {
			addCriterion("type_description between", value1, value2, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeDescriptionNotBetween(String value1, String value2) {
			addCriterion("type_description not between", value1, value2, "typeDescription");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkIsNull() {
			addCriterion("type_remark is null");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkIsNotNull() {
			addCriterion("type_remark is not null");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkEqualTo(String value) {
			addCriterion("type_remark =", value, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkNotEqualTo(String value) {
			addCriterion("type_remark <>", value, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkGreaterThan(String value) {
			addCriterion("type_remark >", value, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("type_remark >=", value, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkLessThan(String value) {
			addCriterion("type_remark <", value, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkLessThanOrEqualTo(String value) {
			addCriterion("type_remark <=", value, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkLike(String value) {
			addCriterion("type_remark like", value, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkNotLike(String value) {
			addCriterion("type_remark not like", value, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkIn(List<String> values) {
			addCriterion("type_remark in", values, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkNotIn(List<String> values) {
			addCriterion("type_remark not in", values, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkBetween(String value1, String value2) {
			addCriterion("type_remark between", value1, value2, "typeRemark");
			return (Criteria) this;
		}

		public Criteria andTypeRemarkNotBetween(String value1, String value2) {
			addCriterion("type_remark not between", value1, value2, "typeRemark");
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

		public Criteria andCodelengthIsNull() {
			addCriterion("codelength is null");
			return (Criteria) this;
		}

		public Criteria andCodelengthIsNotNull() {
			addCriterion("codelength is not null");
			return (Criteria) this;
		}

		public Criteria andCodelengthEqualTo(String value) {
			addCriterion("codelength =", value, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthNotEqualTo(String value) {
			addCriterion("codelength <>", value, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthGreaterThan(String value) {
			addCriterion("codelength >", value, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthGreaterThanOrEqualTo(String value) {
			addCriterion("codelength >=", value, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthLessThan(String value) {
			addCriterion("codelength <", value, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthLessThanOrEqualTo(String value) {
			addCriterion("codelength <=", value, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthLike(String value) {
			addCriterion("codelength like", value, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthNotLike(String value) {
			addCriterion("codelength not like", value, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthIn(List<String> values) {
			addCriterion("codelength in", values, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthNotIn(List<String> values) {
			addCriterion("codelength not in", values, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthBetween(String value1, String value2) {
			addCriterion("codelength between", value1, value2, "codelength");
			return (Criteria) this;
		}

		public Criteria andCodelengthNotBetween(String value1, String value2) {
			addCriterion("codelength not between", value1, value2, "codelength");
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
	 * sys_dict_type
	 */
	public static class Criteria extends GeneratedCriteria implements Serializable {

		/**
		 * sys_dict_type
		 */
		private static final long serialVersionUID = 1L;

		protected Criteria() {
			super();
		}
	}

	/**
	 * sys_dict_type 2017-06-19
	 */
	public static class Criterion implements Serializable {
		/**
		 * sys_dict_type
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