package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;

public class SysBasicInfo implements Serializable {
    /**
     * 主键
     */
    private Integer basicInfoId;

    /**
     * 配置名称
     */
    private String basicInfoName;

    /**
     * 配置值
     */
    private String basicInfoValue;

    /**
     * 类型
     */
    private Integer basicInfoType;

    /**
     * 标签
     */
    private String basicInfoTag;

    /**
     * 描述
     */
    private String basicInfoDescription;

    /**
     * 备注
     */
    private String basicInfoRemark;

    /**
     * 是否可见：1：可见；0：不可见
     */
    private Integer isDisplay;

    /**
     * 是否可见：1：可见；0：不可见
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
     * sys_basic_info
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return basic_info_id 主键
     */
    public Integer getBasicInfoId() {
        return basicInfoId;
    }

    /**
     * 主键
     * @param basicInfoId 主键
     */
    public void setBasicInfoId(Integer basicInfoId) {
        this.basicInfoId = basicInfoId;
    }

    /**
     * 配置名称
     * @return basic_info_name 配置名称
     */
    public String getBasicInfoName() {
        return basicInfoName;
    }

    /**
     * 配置名称
     * @param basicInfoName 配置名称
     */
    public void setBasicInfoName(String basicInfoName) {
        this.basicInfoName = basicInfoName == null ? null : basicInfoName.trim();
    }

    /**
     * 配置值
     * @return basic_info_value 配置值
     */
    public String getBasicInfoValue() {
        return basicInfoValue;
    }

    /**
     * 配置值
     * @param basicInfoValue 配置值
     */
    public void setBasicInfoValue(String basicInfoValue) {
        this.basicInfoValue = basicInfoValue == null ? null : basicInfoValue.trim();
    }

    /**
     * 类型
     * @return basic_info_type 类型
     */
    public Integer getBasicInfoType() {
        return basicInfoType;
    }

    /**
     * 类型
     * @param basicInfoType 类型
     */
    public void setBasicInfoType(Integer basicInfoType) {
        this.basicInfoType = basicInfoType;
    }

    /**
     * 标签
     * @return basic_info_tag 标签
     */
    public String getBasicInfoTag() {
        return basicInfoTag;
    }

    /**
     * 标签
     * @param basicInfoTag 标签
     */
    public void setBasicInfoTag(String basicInfoTag) {
        this.basicInfoTag = basicInfoTag == null ? null : basicInfoTag.trim();
    }

    /**
     * 描述
     * @return basic_info_description 描述
     */
    public String getBasicInfoDescription() {
        return basicInfoDescription;
    }

    /**
     * 描述
     * @param basicInfoDescription 描述
     */
    public void setBasicInfoDescription(String basicInfoDescription) {
        this.basicInfoDescription = basicInfoDescription == null ? null : basicInfoDescription.trim();
    }

    /**
     * 备注
     * @return basic_info_remark 备注
     */
    public String getBasicInfoRemark() {
        return basicInfoRemark;
    }

    /**
     * 备注
     * @param basicInfoRemark 备注
     */
    public void setBasicInfoRemark(String basicInfoRemark) {
        this.basicInfoRemark = basicInfoRemark == null ? null : basicInfoRemark.trim();
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
     * 是否可见：1：可见；0：不可见
     * @return is_enable 是否可见：1：可见；0：不可见
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     * 是否可见：1：可见；0：不可见
     * @param isEnable 是否可见：1：可见；0：不可见
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