package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysBasicInfoExample implements Serializable {
	/**
	 * sys_basic_info
	 */
	protected String orderByClause;

	/**
	 * sys_basic_info
	 */
	protected boolean distinct;

	/**
	 * sys_basic_info
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * sys_basic_info
	 */
	private static final long serialVersionUID = 1L;

	public SysBasicInfoExample() {
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
	 * sys_basic_info 2017-06-17
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

		public Criteria andBasicInfoIdIsNull() {
			addCriterion("basic_info_id is null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdIsNotNull() {
			addCriterion("basic_info_id is not null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdEqualTo(Integer value) {
			addCriterion("basic_info_id =", value, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdNotEqualTo(Integer value) {
			addCriterion("basic_info_id <>", value, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdGreaterThan(Integer value) {
			addCriterion("basic_info_id >", value, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("basic_info_id >=", value, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdLessThan(Integer value) {
			addCriterion("basic_info_id <", value, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdLessThanOrEqualTo(Integer value) {
			addCriterion("basic_info_id <=", value, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdIn(List<Integer> values) {
			addCriterion("basic_info_id in", values, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdNotIn(List<Integer> values) {
			addCriterion("basic_info_id not in", values, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdBetween(Integer value1, Integer value2) {
			addCriterion("basic_info_id between", value1, value2, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoIdNotBetween(Integer value1, Integer value2) {
			addCriterion("basic_info_id not between", value1, value2, "basicInfoId");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameIsNull() {
			addCriterion("basic_info_name is null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameIsNotNull() {
			addCriterion("basic_info_name is not null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameEqualTo(String value) {
			addCriterion("basic_info_name =", value, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameNotEqualTo(String value) {
			addCriterion("basic_info_name <>", value, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameGreaterThan(String value) {
			addCriterion("basic_info_name >", value, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameGreaterThanOrEqualTo(String value) {
			addCriterion("basic_info_name >=", value, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameLessThan(String value) {
			addCriterion("basic_info_name <", value, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameLessThanOrEqualTo(String value) {
			addCriterion("basic_info_name <=", value, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameLike(String value) {
			addCriterion("basic_info_name like", value, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameNotLike(String value) {
			addCriterion("basic_info_name not like", value, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameIn(List<String> values) {
			addCriterion("basic_info_name in", values, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameNotIn(List<String> values) {
			addCriterion("basic_info_name not in", values, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameBetween(String value1, String value2) {
			addCriterion("basic_info_name between", value1, value2, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoNameNotBetween(String value1, String value2) {
			addCriterion("basic_info_name not between", value1, value2, "basicInfoName");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueIsNull() {
			addCriterion("basic_info_value is null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueIsNotNull() {
			addCriterion("basic_info_value is not null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueEqualTo(String value) {
			addCriterion("basic_info_value =", value, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueNotEqualTo(String value) {
			addCriterion("basic_info_value <>", value, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueGreaterThan(String value) {
			addCriterion("basic_info_value >", value, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueGreaterThanOrEqualTo(String value) {
			addCriterion("basic_info_value >=", value, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueLessThan(String value) {
			addCriterion("basic_info_value <", value, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueLessThanOrEqualTo(String value) {
			addCriterion("basic_info_value <=", value, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueLike(String value) {
			addCriterion("basic_info_value like", value, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueNotLike(String value) {
			addCriterion("basic_info_value not like", value, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueIn(List<String> values) {
			addCriterion("basic_info_value in", values, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueNotIn(List<String> values) {
			addCriterion("basic_info_value not in", values, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueBetween(String value1, String value2) {
			addCriterion("basic_info_value between", value1, value2, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoValueNotBetween(String value1, String value2) {
			addCriterion("basic_info_value not between", value1, value2, "basicInfoValue");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeIsNull() {
			addCriterion("basic_info_type is null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeIsNotNull() {
			addCriterion("basic_info_type is not null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeEqualTo(Integer value) {
			addCriterion("basic_info_type =", value, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeNotEqualTo(Integer value) {
			addCriterion("basic_info_type <>", value, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeGreaterThan(Integer value) {
			addCriterion("basic_info_type >", value, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("basic_info_type >=", value, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeLessThan(Integer value) {
			addCriterion("basic_info_type <", value, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeLessThanOrEqualTo(Integer value) {
			addCriterion("basic_info_type <=", value, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeIn(List<Integer> values) {
			addCriterion("basic_info_type in", values, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeNotIn(List<Integer> values) {
			addCriterion("basic_info_type not in", values, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeBetween(Integer value1, Integer value2) {
			addCriterion("basic_info_type between", value1, value2, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("basic_info_type not between", value1, value2, "basicInfoType");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagIsNull() {
			addCriterion("basic_info_tag is null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagIsNotNull() {
			addCriterion("basic_info_tag is not null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagEqualTo(String value) {
			addCriterion("basic_info_tag =", value, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagNotEqualTo(String value) {
			addCriterion("basic_info_tag <>", value, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagGreaterThan(String value) {
			addCriterion("basic_info_tag >", value, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagGreaterThanOrEqualTo(String value) {
			addCriterion("basic_info_tag >=", value, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagLessThan(String value) {
			addCriterion("basic_info_tag <", value, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagLessThanOrEqualTo(String value) {
			addCriterion("basic_info_tag <=", value, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagLike(String value) {
			addCriterion("basic_info_tag like", value, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagNotLike(String value) {
			addCriterion("basic_info_tag not like", value, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagIn(List<String> values) {
			addCriterion("basic_info_tag in", values, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagNotIn(List<String> values) {
			addCriterion("basic_info_tag not in", values, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagBetween(String value1, String value2) {
			addCriterion("basic_info_tag between", value1, value2, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoTagNotBetween(String value1, String value2) {
			addCriterion("basic_info_tag not between", value1, value2, "basicInfoTag");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionIsNull() {
			addCriterion("basic_info_description is null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionIsNotNull() {
			addCriterion("basic_info_description is not null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionEqualTo(String value) {
			addCriterion("basic_info_description =", value, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionNotEqualTo(String value) {
			addCriterion("basic_info_description <>", value, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionGreaterThan(String value) {
			addCriterion("basic_info_description >", value, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("basic_info_description >=", value, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionLessThan(String value) {
			addCriterion("basic_info_description <", value, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionLessThanOrEqualTo(String value) {
			addCriterion("basic_info_description <=", value, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionLike(String value) {
			addCriterion("basic_info_description like", value, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionNotLike(String value) {
			addCriterion("basic_info_description not like", value, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionIn(List<String> values) {
			addCriterion("basic_info_description in", values, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionNotIn(List<String> values) {
			addCriterion("basic_info_description not in", values, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionBetween(String value1, String value2) {
			addCriterion("basic_info_description between", value1, value2, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoDescriptionNotBetween(String value1, String value2) {
			addCriterion("basic_info_description not between", value1, value2, "basicInfoDescription");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkIsNull() {
			addCriterion("basic_info_remark is null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkIsNotNull() {
			addCriterion("basic_info_remark is not null");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkEqualTo(String value) {
			addCriterion("basic_info_remark =", value, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkNotEqualTo(String value) {
			addCriterion("basic_info_remark <>", value, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkGreaterThan(String value) {
			addCriterion("basic_info_remark >", value, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("basic_info_remark >=", value, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkLessThan(String value) {
			addCriterion("basic_info_remark <", value, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkLessThanOrEqualTo(String value) {
			addCriterion("basic_info_remark <=", value, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkLike(String value) {
			addCriterion("basic_info_remark like", value, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkNotLike(String value) {
			addCriterion("basic_info_remark not like", value, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkIn(List<String> values) {
			addCriterion("basic_info_remark in", values, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkNotIn(List<String> values) {
			addCriterion("basic_info_remark not in", values, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkBetween(String value1, String value2) {
			addCriterion("basic_info_remark between", value1, value2, "basicInfoRemark");
			return (Criteria) this;
		}

		public Criteria andBasicInfoRemarkNotBetween(String value1, String value2) {
			addCriterion("basic_info_remark not between", value1, value2, "basicInfoRemark");
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
	 * sys_basic_info
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
	 * sys_basic_info 2017-06-17
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