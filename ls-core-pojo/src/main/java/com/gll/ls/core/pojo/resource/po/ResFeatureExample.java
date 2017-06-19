package com.gll.ls.core.pojo.resource.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResFeatureExample implements Serializable {
    /**
     * res_feature
     */
    protected String orderByClause;

    /**
     * res_feature
     */
    protected boolean distinct;

    /**
     * res_feature
     */
    protected List<Criteria> oredCriteria;

    /**
     * res_feature
     */
    private static final long serialVersionUID = 1L;

    public ResFeatureExample() {
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
     * res_feature 2017-06-18
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

        public Criteria andFeatureNameIsNull() {
            addCriterion("feature_name is null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIsNotNull() {
            addCriterion("feature_name is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureNameEqualTo(String value) {
            addCriterion("feature_name =", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotEqualTo(String value) {
            addCriterion("feature_name <>", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThan(String value) {
            addCriterion("feature_name >", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("feature_name >=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThan(String value) {
            addCriterion("feature_name <", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLessThanOrEqualTo(String value) {
            addCriterion("feature_name <=", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameLike(String value) {
            addCriterion("feature_name like", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotLike(String value) {
            addCriterion("feature_name not like", value, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameIn(List<String> values) {
            addCriterion("feature_name in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotIn(List<String> values) {
            addCriterion("feature_name not in", values, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameBetween(String value1, String value2) {
            addCriterion("feature_name between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNameNotBetween(String value1, String value2) {
            addCriterion("feature_name not between", value1, value2, "featureName");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcIsNull() {
            addCriterion("feature_name_pc is null");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcIsNotNull() {
            addCriterion("feature_name_pc is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcEqualTo(String value) {
            addCriterion("feature_name_pc =", value, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcNotEqualTo(String value) {
            addCriterion("feature_name_pc <>", value, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcGreaterThan(String value) {
            addCriterion("feature_name_pc >", value, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcGreaterThanOrEqualTo(String value) {
            addCriterion("feature_name_pc >=", value, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcLessThan(String value) {
            addCriterion("feature_name_pc <", value, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcLessThanOrEqualTo(String value) {
            addCriterion("feature_name_pc <=", value, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcLike(String value) {
            addCriterion("feature_name_pc like", value, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcNotLike(String value) {
            addCriterion("feature_name_pc not like", value, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcIn(List<String> values) {
            addCriterion("feature_name_pc in", values, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcNotIn(List<String> values) {
            addCriterion("feature_name_pc not in", values, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcBetween(String value1, String value2) {
            addCriterion("feature_name_pc between", value1, value2, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureNamePcNotBetween(String value1, String value2) {
            addCriterion("feature_name_pc not between", value1, value2, "featureNamePc");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionIsNull() {
            addCriterion("feature_description is null");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionIsNotNull() {
            addCriterion("feature_description is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionEqualTo(String value) {
            addCriterion("feature_description =", value, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionNotEqualTo(String value) {
            addCriterion("feature_description <>", value, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionGreaterThan(String value) {
            addCriterion("feature_description >", value, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("feature_description >=", value, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionLessThan(String value) {
            addCriterion("feature_description <", value, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionLessThanOrEqualTo(String value) {
            addCriterion("feature_description <=", value, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionLike(String value) {
            addCriterion("feature_description like", value, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionNotLike(String value) {
            addCriterion("feature_description not like", value, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionIn(List<String> values) {
            addCriterion("feature_description in", values, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionNotIn(List<String> values) {
            addCriterion("feature_description not in", values, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionBetween(String value1, String value2) {
            addCriterion("feature_description between", value1, value2, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureDescriptionNotBetween(String value1, String value2) {
            addCriterion("feature_description not between", value1, value2, "featureDescription");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkIsNull() {
            addCriterion("feature_remark is null");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkIsNotNull() {
            addCriterion("feature_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkEqualTo(String value) {
            addCriterion("feature_remark =", value, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkNotEqualTo(String value) {
            addCriterion("feature_remark <>", value, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkGreaterThan(String value) {
            addCriterion("feature_remark >", value, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("feature_remark >=", value, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkLessThan(String value) {
            addCriterion("feature_remark <", value, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkLessThanOrEqualTo(String value) {
            addCriterion("feature_remark <=", value, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkLike(String value) {
            addCriterion("feature_remark like", value, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkNotLike(String value) {
            addCriterion("feature_remark not like", value, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkIn(List<String> values) {
            addCriterion("feature_remark in", values, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkNotIn(List<String> values) {
            addCriterion("feature_remark not in", values, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkBetween(String value1, String value2) {
            addCriterion("feature_remark between", value1, value2, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andFeatureRemarkNotBetween(String value1, String value2) {
            addCriterion("feature_remark not between", value1, value2, "featureRemark");
            return (Criteria) this;
        }

        public Criteria andIsSpecIsNull() {
            addCriterion("is_spec is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecIsNotNull() {
            addCriterion("is_spec is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecEqualTo(Integer value) {
            addCriterion("is_spec =", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotEqualTo(Integer value) {
            addCriterion("is_spec <>", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecGreaterThan(Integer value) {
            addCriterion("is_spec >", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_spec >=", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecLessThan(Integer value) {
            addCriterion("is_spec <", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecLessThanOrEqualTo(Integer value) {
            addCriterion("is_spec <=", value, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecIn(List<Integer> values) {
            addCriterion("is_spec in", values, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotIn(List<Integer> values) {
            addCriterion("is_spec not in", values, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecBetween(Integer value1, Integer value2) {
            addCriterion("is_spec between", value1, value2, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSpecNotBetween(Integer value1, Integer value2) {
            addCriterion("is_spec not between", value1, value2, "isSpec");
            return (Criteria) this;
        }

        public Criteria andIsSelectIsNull() {
            addCriterion("is_select is null");
            return (Criteria) this;
        }

        public Criteria andIsSelectIsNotNull() {
            addCriterion("is_select is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelectEqualTo(Integer value) {
            addCriterion("is_select =", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotEqualTo(Integer value) {
            addCriterion("is_select <>", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectGreaterThan(Integer value) {
            addCriterion("is_select >", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_select >=", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectLessThan(Integer value) {
            addCriterion("is_select <", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectLessThanOrEqualTo(Integer value) {
            addCriterion("is_select <=", value, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectIn(List<Integer> values) {
            addCriterion("is_select in", values, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotIn(List<Integer> values) {
            addCriterion("is_select not in", values, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectBetween(Integer value1, Integer value2) {
            addCriterion("is_select between", value1, value2, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsSelectNotBetween(Integer value1, Integer value2) {
            addCriterion("is_select not between", value1, value2, "isSelect");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNull() {
            addCriterion("input_type is null");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNotNull() {
            addCriterion("input_type is not null");
            return (Criteria) this;
        }

        public Criteria andInputTypeEqualTo(Integer value) {
            addCriterion("input_type =", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotEqualTo(Integer value) {
            addCriterion("input_type <>", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThan(Integer value) {
            addCriterion("input_type >", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("input_type >=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThan(Integer value) {
            addCriterion("input_type <", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThanOrEqualTo(Integer value) {
            addCriterion("input_type <=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeIn(List<Integer> values) {
            addCriterion("input_type in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotIn(List<Integer> values) {
            addCriterion("input_type not in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeBetween(Integer value1, Integer value2) {
            addCriterion("input_type between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("input_type not between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andSelectValueIsNull() {
            addCriterion("select_value is null");
            return (Criteria) this;
        }

        public Criteria andSelectValueIsNotNull() {
            addCriterion("select_value is not null");
            return (Criteria) this;
        }

        public Criteria andSelectValueEqualTo(String value) {
            addCriterion("select_value =", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueNotEqualTo(String value) {
            addCriterion("select_value <>", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueGreaterThan(String value) {
            addCriterion("select_value >", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueGreaterThanOrEqualTo(String value) {
            addCriterion("select_value >=", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueLessThan(String value) {
            addCriterion("select_value <", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueLessThanOrEqualTo(String value) {
            addCriterion("select_value <=", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueLike(String value) {
            addCriterion("select_value like", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueNotLike(String value) {
            addCriterion("select_value not like", value, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueIn(List<String> values) {
            addCriterion("select_value in", values, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueNotIn(List<String> values) {
            addCriterion("select_value not in", values, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueBetween(String value1, String value2) {
            addCriterion("select_value between", value1, value2, "selectValue");
            return (Criteria) this;
        }

        public Criteria andSelectValueNotBetween(String value1, String value2) {
            addCriterion("select_value not between", value1, value2, "selectValue");
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
     * res_feature
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * res_feature 2017-06-18
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