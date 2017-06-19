package com.gll.ls.core.pojo.resource.po;

import java.io.Serializable;

public class ResFeatureValue implements Serializable {
    /**
     * 属相值 主键
     */
    private Integer featureValueId;

    /**
     * 属性值_名
     */
    private String featureValueName;

    /**
     * 属性值_值
     */
    private String featureValueValue;

    /**
     * 所属 属性id
     */
    private Integer featureId;

    /**
     * 是否显示属性值得名称
     */
    private Integer isDisplayName;

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
     * res_feature_value
     */
    private static final long serialVersionUID = 1L;

    /**
     * 属相值 主键
     * @return feature_value_id 属相值 主键
     */
    public Integer getFeatureValueId() {
        return featureValueId;
    }

    /**
     * 属相值 主键
     * @param featureValueId 属相值 主键
     */
    public void setFeatureValueId(Integer featureValueId) {
        this.featureValueId = featureValueId;
    }

    /**
     * 属性值_名
     * @return feature_value_name 属性值_名
     */
    public String getFeatureValueName() {
        return featureValueName;
    }

    /**
     * 属性值_名
     * @param featureValueName 属性值_名
     */
    public void setFeatureValueName(String featureValueName) {
        this.featureValueName = featureValueName == null ? null : featureValueName.trim();
    }

    /**
     * 属性值_值
     * @return feature_value_value 属性值_值
     */
    public String getFeatureValueValue() {
        return featureValueValue;
    }

    /**
     * 属性值_值
     * @param featureValueValue 属性值_值
     */
    public void setFeatureValueValue(String featureValueValue) {
        this.featureValueValue = featureValueValue == null ? null : featureValueValue.trim();
    }

    /**
     * 所属 属性id
     * @return feature_id 所属 属性id
     */
    public Integer getFeatureId() {
        return featureId;
    }

    /**
     * 所属 属性id
     * @param featureId 所属 属性id
     */
    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    /**
     * 是否显示属性值得名称
     * @return is_display_name 是否显示属性值得名称
     */
    public Integer getIsDisplayName() {
        return isDisplayName;
    }

    /**
     * 是否显示属性值得名称
     * @param isDisplayName 是否显示属性值得名称
     */
    public void setIsDisplayName(Integer isDisplayName) {
        this.isDisplayName = isDisplayName;
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