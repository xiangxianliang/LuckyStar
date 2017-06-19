package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDictInfoExample implements Serializable {
	/**
	 * sys_dict_info
	 */
	protected String orderByClause;

	/**
	 * sys_dict_info
	 */
	protected boolean distinct;

	/**
	 * sys_dict_info
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * sys_dict_info
	 */
	private static final long serialVersionUID = 1L;

	public SysDictInfoExample() {
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
	 * sys_dict_info 2017-06-17
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

		public Criteria andInfoIdIsNull() {
			addCriterion("info_id is null");
			return (Criteria) this;
		}

		public Criteria andInfoIdIsNotNull() {
			addCriterion("info_id is not null");
			return (Criteria) this;
		}

		public Criteria andInfoIdEqualTo(Integer value) {
			addCriterion("info_id =", value, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdNotEqualTo(Integer value) {
			addCriterion("info_id <>", value, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdGreaterThan(Integer value) {
			addCriterion("info_id >", value, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("info_id >=", value, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdLessThan(Integer value) {
			addCriterion("info_id <", value, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
			addCriterion("info_id <=", value, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdIn(List<Integer> values) {
			addCriterion("info_id in", values, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdNotIn(List<Integer> values) {
			addCriterion("info_id not in", values, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdBetween(Integer value1, Integer value2) {
			addCriterion("info_id between", value1, value2, "infoId");
			return (Criteria) this;
		}

		public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
			addCriterion("info_id not between", value1, value2, "infoId");
			return (Criteria) this;
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

		public Criteria andInfoValueIsNull() {
			addCriterion("info_value is null");
			return (Criteria) this;
		}

		public Criteria andInfoValueIsNotNull() {
			addCriterion("info_value is not null");
			return (Criteria) this;
		}

		public Criteria andInfoValueEqualTo(String value) {
			addCriterion("info_value =", value, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueNotEqualTo(String value) {
			addCriterion("info_value <>", value, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueGreaterThan(String value) {
			addCriterion("info_value >", value, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueGreaterThanOrEqualTo(String value) {
			addCriterion("info_value >=", value, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueLessThan(String value) {
			addCriterion("info_value <", value, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueLessThanOrEqualTo(String value) {
			addCriterion("info_value <=", value, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueLike(String value) {
			addCriterion("info_value like", value, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueNotLike(String value) {
			addCriterion("info_value not like", value, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueIn(List<String> values) {
			addCriterion("info_value in", values, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueNotIn(List<String> values) {
			addCriterion("info_value not in", values, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueBetween(String value1, String value2) {
			addCriterion("info_value between", value1, value2, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoValueNotBetween(String value1, String value2) {
			addCriterion("info_value not between", value1, value2, "infoValue");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionIsNull() {
			addCriterion("info_description is null");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionIsNotNull() {
			addCriterion("info_description is not null");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionEqualTo(String value) {
			addCriterion("info_description =", value, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionNotEqualTo(String value) {
			addCriterion("info_description <>", value, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionGreaterThan(String value) {
			addCriterion("info_description >", value, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("info_description >=", value, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionLessThan(String value) {
			addCriterion("info_description <", value, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionLessThanOrEqualTo(String value) {
			addCriterion("info_description <=", value, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionLike(String value) {
			addCriterion("info_description like", value, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionNotLike(String value) {
			addCriterion("info_description not like", value, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionIn(List<String> values) {
			addCriterion("info_description in", values, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionNotIn(List<String> values) {
			addCriterion("info_description not in", values, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionBetween(String value1, String value2) {
			addCriterion("info_description between", value1, value2, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoDescriptionNotBetween(String value1, String value2) {
			addCriterion("info_description not between", value1, value2, "infoDescription");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkIsNull() {
			addCriterion("info_remark is null");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkIsNotNull() {
			addCriterion("info_remark is not null");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkEqualTo(String value) {
			addCriterion("info_remark =", value, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkNotEqualTo(String value) {
			addCriterion("info_remark <>", value, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkGreaterThan(String value) {
			addCriterion("info_remark >", value, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("info_remark >=", value, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkLessThan(String value) {
			addCriterion("info_remark <", value, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkLessThanOrEqualTo(String value) {
			addCriterion("info_remark <=", value, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkLike(String value) {
			addCriterion("info_remark like", value, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkNotLike(String value) {
			addCriterion("info_remark not like", value, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkIn(List<String> values) {
			addCriterion("info_remark in", values, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkNotIn(List<String> values) {
			addCriterion("info_remark not in", values, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkBetween(String value1, String value2) {
			addCriterion("info_remark between", value1, value2, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andInfoRemarkNotBetween(String value1, String value2) {
			addCriterion("info_remark not between", value1, value2, "infoRemark");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNull() {
			addCriterion("updatetime is null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNotNull() {
			addCriterion("updatetime is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeEqualTo(Date value) {
			addCriterion("updatetime =", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotEqualTo(Date value) {
			addCriterion("updatetime <>", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThan(Date value) {
			addCriterion("updatetime >", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("updatetime >=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThan(Date value) {
			addCriterion("updatetime <", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
			addCriterion("updatetime <=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIn(List<Date> values) {
			addCriterion("updatetime in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotIn(List<Date> values) {
			addCriterion("updatetime not in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeBetween(Date value1, Date value2) {
			addCriterion("updatetime between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
			addCriterion("updatetime not between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andValueTypeIsNull() {
			addCriterion("value_type is null");
			return (Criteria) this;
		}

		public Criteria andValueTypeIsNotNull() {
			addCriterion("value_type is not null");
			return (Criteria) this;
		}

		public Criteria andValueTypeEqualTo(Integer value) {
			addCriterion("value_type =", value, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeNotEqualTo(Integer value) {
			addCriterion("value_type <>", value, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeGreaterThan(Integer value) {
			addCriterion("value_type >", value, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("value_type >=", value, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeLessThan(Integer value) {
			addCriterion("value_type <", value, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeLessThanOrEqualTo(Integer value) {
			addCriterion("value_type <=", value, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeIn(List<Integer> values) {
			addCriterion("value_type in", values, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeNotIn(List<Integer> values) {
			addCriterion("value_type not in", values, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeBetween(Integer value1, Integer value2) {
			addCriterion("value_type between", value1, value2, "valueType");
			return (Criteria) this;
		}

		public Criteria andValueTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("value_type not between", value1, value2, "valueType");
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
	 * sys_dict_info
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
	 * sys_dict_info 2017-06-17
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