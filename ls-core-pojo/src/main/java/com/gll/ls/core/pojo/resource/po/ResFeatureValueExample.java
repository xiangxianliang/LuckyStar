package com.gll.ls.core.pojo.resource.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResFeatureValueExample implements Serializable {
    /**
     * res_feature_value
     */
    protected String orderByClause;

    /**
     * res_feature_value
     */
    protected boolean distinct;

    /**
     * res_feature_value
     */
    protected List<Criteria> oredCriteria;

    /**
     * res_feature_value
     */
    private static final long serialVersionUID = 1L;

    public ResFeatureValueExample() {
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
     * res_feature_value 2017-06-18
     */
    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andFeatureValueIdIsNull() {
            addCriterion("feature_value_id is null");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdIsNotNull() {
            addCriterion("feature_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdEqualTo(Integer value) {
            addCriterion("feature_value_id =", value, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdNotEqualTo(Integer value) {
            addCriterion("feature_value_id <>", value, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdGreaterThan(Integer value) {
            addCriterion("feature_value_id >", value, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("feature_value_id >=", value, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdLessThan(Integer value) {
            addCriterion("feature_value_id <", value, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("feature_value_id <=", value, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdIn(List<Integer> values) {
            addCriterion("feature_value_id in", values, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdNotIn(List<Integer> values) {
            addCriterion("feature_value_id not in", values, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdBetween(Integer value1, Integer value2) {
            addCriterion("feature_value_id between", value1, value2, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("feature_value_id not between", value1, value2, "featureValueId");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameIsNull() {
            addCriterion("feature_value_name is null");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameIsNotNull() {
            addCriterion("feature_value_name is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameEqualTo(String value) {
            addCriterion("feature_value_name =", value, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameNotEqualTo(String value) {
            addCriterion("feature_value_name <>", value, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameGreaterThan(String value) {
            addCriterion("feature_value_name >", value, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameGreaterThanOrEqualTo(String value) {
            addCriterion("feature_value_name >=", value, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameLessThan(String value) {
            addCriterion("feature_value_name <", value, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameLessThanOrEqualTo(String value) {
            addCriterion("feature_value_name <=", value, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameLike(String value) {
            addCriterion("feature_value_name like", value, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameNotLike(String value) {
            addCriterion("feature_value_name not like", value, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameIn(List<String> values) {
            addCriterion("feature_value_name in", values, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameNotIn(List<String> values) {
            addCriterion("feature_value_name not in", values, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameBetween(String value1, String value2) {
            addCriterion("feature_value_name between", value1, value2, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueNameNotBetween(String value1, String value2) {
            addCriterion("feature_value_name not between", value1, value2, "featureValueName");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueIsNull() {
            addCriterion("feature_value_value is null");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueIsNotNull() {
            addCriterion("feature_value_value is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueEqualTo(String value) {
            addCriterion("feature_value_value =", value, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueNotEqualTo(String value) {
            addCriterion("feature_value_value <>", value, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueGreaterThan(String value) {
            addCriterion("feature_value_value >", value, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueGreaterThanOrEqualTo(String value) {
            addCriterion("feature_value_value >=", value, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueLessThan(String value) {
            addCriterion("feature_value_value <", value, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueLessThanOrEqualTo(String value) {
            addCriterion("feature_value_value <=", value, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueLike(String value) {
            addCriterion("feature_value_value like", value, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueNotLike(String value) {
            addCriterion("feature_value_value not like", value, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueIn(List<String> values) {
            addCriterion("feature_value_value in", values, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueNotIn(List<String> values) {
            addCriterion("feature_value_value not in", values, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueBetween(String value1, String value2) {
            addCriterion("feature_value_value between", value1, value2, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureValueValueNotBetween(String value1, String value2) {
            addCriterion("feature_value_value not between", value1, value2, "featureValueValue");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIsNull() {
            addCriterion("feature_id is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIsNotNull() {
            addCriterion("feature_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureIdEqualTo(Integer value) {
            addCriterion("feature_id =", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotEqualTo(Integer value) {
            addCriterion("feature_id <>", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThan(Integer value) {
            addCriterion("feature_id >", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("feature_id >=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThan(Integer value) {
            addCriterion("feature_id <", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdLessThanOrEqualTo(Integer value) {
            addCriterion("feature_id <=", value, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdIn(List<Integer> values) {
            addCriterion("feature_id in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotIn(List<Integer> values) {
            addCriterion("feature_id not in", values, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdBetween(Integer value1, Integer value2) {
            addCriterion("feature_id between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andFeatureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("feature_id not between", value1, value2, "featureId");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameIsNull() {
            addCriterion("is_display_name is null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameIsNotNull() {
            addCriterion("is_display_name is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameEqualTo(Integer value) {
            addCriterion("is_display_name =", value, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameNotEqualTo(Integer value) {
            addCriterion("is_display_name <>", value, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameGreaterThan(Integer value) {
            addCriterion("is_display_name >", value, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_display_name >=", value, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameLessThan(Integer value) {
            addCriterion("is_display_name <", value, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameLessThanOrEqualTo(Integer value) {
            addCriterion("is_display_name <=", value, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameIn(List<Integer> values) {
            addCriterion("is_display_name in", values, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameNotIn(List<Integer> values) {
            addCriterion("is_display_name not in", values, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameBetween(Integer value1, Integer value2) {
            addCriterion("is_display_name between", value1, value2, "isDisplayName");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNameNotBetween(Integer value1, Integer value2) {
            addCriterion("is_display_name not between", value1, value2, "isDisplayName");
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
     * res_feature_value
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * res_feature_value 2017-06-18
     */
    public static class Criterion implements Serializable {
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