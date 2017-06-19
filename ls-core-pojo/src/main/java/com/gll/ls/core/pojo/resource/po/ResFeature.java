package com.gll.ls.core.pojo.resource.po;

import java.io.Serializable;

public class ResFeature implements Serializable {
    /**
     * id
     */
    private Integer featureId;

    /**
     * 名称
     */
    private String featureName;

    /**
     * 拼音码
     */
    private String featureNamePc;

    /**
     * 属性描述
     */
    private String featureDescription;

    /**
     * 属性备注
     */
    private String featureRemark;

    /**
     * 是否为规格：0:否;1:是
     */
    private Integer isSpec;

    /**
     * 是否为筛选：0:否;1:是
     */
    private Integer isSelect;

    /**
     * 是否前台显示：0:否;1:是
     */
    private Integer isShow;

    /**
     * 录入方式：1.树状菜单，2.单选，3.复选，4.文本框
     */
    private Integer inputType;

    /**
     * 属性可选值：用英文逗号分割的可选值，可选值里不许有逗号
     */
    private String selectValue;

    /**
     * 前台排序
     */
    private Integer showorder;

    /**
     * 关联的 类型的ID
     */
    private Integer typeId;

    /**
     * 是否可见：1：可见；0：不可见
     */
    private Integer isDisplay;

    /**
     * 是否启用：1：启用；0：未启用
     */
    private Integer isEnable;

    /**
     * 是否激活：1：激活；0：未激活
     */
    private Integer isActivation;

    /**
     * 是否删除：1：未删除；0：删除
     */
    private Integer isDel;

    /**
     * res_feature
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * @return feature_id id
     */
    public Integer getFeatureId() {
        return featureId;
    }

    /**
     * id
     * @param featureId id
     */
    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    /**
     * 名称
     * @return feature_name 名称
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * 名称
     * @param featureName 名称
     */
    public void setFeatureName(String featureName) {
        this.featureName = featureName == null ? null : featureName.trim();
    }

    /**
     * 拼音码
     * @return feature_name_pc 拼音码
     */
    public String getFeatureNamePc() {
        return featureNamePc;
    }

    /**
     * 拼音码
     * @param featureNamePc 拼音码
     */
    public void setFeatureNamePc(String featureNamePc) {
        this.featureNamePc = featureNamePc == null ? null : featureNamePc.trim();
    }

    /**
     * 属性描述
     * @return feature_description 属性描述
     */
    public String getFeatureDescription() {
        return featureDescription;
    }

    /**
     * 属性描述
     * @param featureDescription 属性描述
     */
    public void setFeatureDescription(String featureDescription) {
        this.featureDescription = featureDescription == null ? null : featureDescription.trim();
    }

    /**
     * 属性备注
     * @return feature_remark 属性备注
     */
    public String getFeatureRemark() {
        return featureRemark;
    }

    /**
     * 属性备注
     * @param featureRemark 属性备注
     */
    public void setFeatureRemark(String featureRemark) {
        this.featureRemark = featureRemark == null ? null : featureRemark.trim();
    }

    /**
     * 是否为规格：0:否;1:是
     * @return is_spec 是否为规格：0:否;1:是
     */
    public Integer getIsSpec() {
        return isSpec;
    }

    /**
     * 是否为规格：0:否;1:是
     * @param isSpec 是否为规格：0:否;1:是
     */
    public void setIsSpec(Integer isSpec) {
        this.isSpec = isSpec;
    }

    /**
     * 是否为筛选：0:否;1:是
     * @return is_select 是否为筛选：0:否;1:是
     */
    public Integer getIsSelect() {
        return isSelect;
    }

    /**
     * 是否为筛选：0:否;1:是
     * @param isSelect 是否为筛选：0:否;1:是
     */
    public void setIsSelect(Integer isSelect) {
        this.isSelect = isSelect;
    }

    /**
     * 是否前台显示：0:否;1:是
     * @return is_show 是否前台显示：0:否;1:是
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 是否前台显示：0:否;1:是
     * @param isShow 是否前台显示：0:否;1:是
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 录入方式：1.树状菜单，2.单选，3.复选，4.文本框
     * @return input_type 录入方式：1.树状菜单，2.单选，3.复选，4.文本框
     */
    public Integer getInputType() {
        return inputType;
    }

    /**
     * 录入方式：1.树状菜单，2.单选，3.复选，4.文本框
     * @param inputType 录入方式：1.树状菜单，2.单选，3.复选，4.文本框
     */
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    /**
     * 属性可选值：用英文逗号分割的可选值，可选值里不许有逗号
     * @return select_value 属性可选值：用英文逗号分割的可选值，可选值里不许有逗号
     */
    public String getSelectValue() {
        return selectValue;
    }

    /**
     * 属性可选值：用英文逗号分割的可选值，可选值里不许有逗号
     * @param selectValue 属性可选值：用英文逗号分割的可选值，可选值里不许有逗号
     */
    public void setSelectValue(String selectValue) {
        this.selectValue = selectValue == null ? null : selectValue.trim();
    }

    /**
     * 前台排序
     * @return showorder 前台排序
     */
    public Integer getShoworder() {
        return showorder;
    }

    /**
     * 前台排序
     * @param showorder 前台排序
     */
    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }

    /**
     * 关联的 类型的ID
     * @return type_id 关联的 类型的ID
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 关联的 类型的ID
     * @param typeId 关联的 类型的ID
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 是否可见：1：可见；0：不可见
     * @return is_display 是否可见：1：可见；0：不可见
     */
    public Integer getIsDisplay() {
        return isDisplay;
    }

    /**
     * 是否可见：1：可见；0：不可见
     * @param isDisplay 是否可见：1：可见；0：不可见
     */
    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    /**
     * 是否启用：1：启用；0：未启用
     * @return is_enable 是否启用：1：启用；0：未启用
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     * 是否启用：1：启用；0：未启用
     * @param isEnable 是否启用：1：启用；0：未启用
     */
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * 是否激活：1：激活；0：未激活
     * @return is_activation 是否激活：1：激活；0：未激活
     */
    public Integer getIsActivation() {
        return isActivation;
    }

    /**
     * 是否激活：1：激活；0：未激活
     * @param isActivation 是否激活：1：激活；0：未激活
     */
    public void setIsActivation(Integer isActivation) {
        this.isActivation = isActivation;
    }

    /**
     * 是否删除：1：未删除；0：删除
     * @return is_del 是否删除：1：未删除；0：删除
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 是否删除：1：未删除；0：删除
     * @param isDel 是否删除：1：未删除；0：删除
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}