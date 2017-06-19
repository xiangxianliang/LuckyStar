package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.Date;

public class SysDictInfo implements Serializable {
    /**
     * 字典代码
     */
    private Integer infoId;

    /**
     * 字典类型代码
     */
    private Integer typeId;

    /**
     * 字典信息
     */
    private String infoValue;

    /**
     * 字典描述
     */
    private String infoDescription;

    /**
     * 字典备注
     */
    private String infoRemark;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 值类型（1：业务字段；0字典字段）
     */
    private Integer valueType;

    /**
     * 排序
     */
    private Integer showorder;

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
     * sys_dict_info
     */
    private static final long serialVersionUID = 1L;

    /**
     * 字典代码
     * @return info_id 字典代码
     */
    public Integer getInfoId() {
        return infoId;
    }

    /**
     * 字典代码
     * @param infoId 字典代码
     */
    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    /**
     * 字典类型代码
     * @return type_id 字典类型代码
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 字典类型代码
     * @param typeId 字典类型代码
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 字典信息
     * @return info_value 字典信息
     */
    public String getInfoValue() {
        return infoValue;
    }

    /**
     * 字典信息
     * @param infoValue 字典信息
     */
    public void setInfoValue(String infoValue) {
        this.infoValue = infoValue == null ? null : infoValue.trim();
    }

    /**
     * 字典描述
     * @return info_description 字典描述
     */
    public String getInfoDescription() {
        return infoDescription;
    }

    /**
     * 字典描述
     * @param infoDescription 字典描述
     */
    public void setInfoDescription(String infoDescription) {
        this.infoDescription = infoDescription == null ? null : infoDescription.trim();
    }

    /**
     * 字典备注
     * @return info_remark 字典备注
     */
    public String getInfoRemark() {
        return infoRemark;
    }

    /**
     * 字典备注
     * @param infoRemark 字典备注
     */
    public void setInfoRemark(String infoRemark) {
        this.infoRemark = infoRemark == null ? null : infoRemark.trim();
    }

    /**
     * 修改时间
     * @return updatetime 修改时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 修改时间
     * @param updatetime 修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 值类型（1：业务字段；0字典字段）
     * @return value_type 值类型（1：业务字段；0字典字段）
     */
    public Integer getValueType() {
        return valueType;
    }

    /**
     * 值类型（1：业务字段；0字典字段）
     * @param valueType 值类型（1：业务字段；0字典字段）
     */
    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    /**
     * 排序
     * @return showorder 排序
     */
    public Integer getShoworder() {
        return showorder;
    }

    /**
     * 排序
     * @param showorder 排序
     */
    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
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