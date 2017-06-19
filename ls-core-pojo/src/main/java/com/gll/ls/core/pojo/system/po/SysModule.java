package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;

public class SysModule implements Serializable {
    /**
     * 模块主键id
     */
    private Integer moduleId;

    /**
     * 账号
     */
    private String moduleName;

    /**
     * 模块描述
     */
    private String moduleDescription;

    /**
     * 父模块ID
     */
    private Integer parentId;

    /**
     * url
     */
    private String moduleUrl;

    /**
     * 模块图片
     */
    private String moduleIcon;

    /**
     * 显示顺序
     */
    private Integer showorder;

    /**
     * 是否叶子节点：1：叶子节点；0：目录节点
     */
    private Integer isSeaf;

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
     * sys_module
     */
    private static final long serialVersionUID = 1L;

    /**
     * 模块主键id
     * @return module_id 模块主键id
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * 模块主键id
     * @param moduleId 模块主键id
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 账号
     * @return module_name 账号
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 账号
     * @param moduleName 账号
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    /**
     * 模块描述
     * @return module_description 模块描述
     */
    public String getModuleDescription() {
        return moduleDescription;
    }

    /**
     * 模块描述
     * @param moduleDescription 模块描述
     */
    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription == null ? null : moduleDescription.trim();
    }

    /**
     * 父模块ID
     * @return parent_id 父模块ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 父模块ID
     * @param parentId 父模块ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * url
     * @return module_url url
     */
    public String getModuleUrl() {
        return moduleUrl;
    }

    /**
     * url
     * @param moduleUrl url
     */
    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl == null ? null : moduleUrl.trim();
    }

    /**
     * 模块图片
     * @return module_icon 模块图片
     */
    public String getModuleIcon() {
        return moduleIcon;
    }

    /**
     * 模块图片
     * @param moduleIcon 模块图片
     */
    public void setModuleIcon(String moduleIcon) {
        this.moduleIcon = moduleIcon == null ? null : moduleIcon.trim();
    }

    /**
     * 显示顺序
     * @return showorder 显示顺序
     */
    public Integer getShoworder() {
        return showorder;
    }

    /**
     * 显示顺序
     * @param showorder 显示顺序
     */
    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }

    /**
     * 是否叶子节点：1：叶子节点；0：目录节点
     * @return is_seaf 是否叶子节点：1：叶子节点；0：目录节点
     */
    public Integer getIsSeaf() {
        return isSeaf;
    }

    /**
     * 是否叶子节点：1：叶子节点；0：目录节点
     * @param isSeaf 是否叶子节点：1：叶子节点；0：目录节点
     */
    public void setIsSeaf(Integer isSeaf) {
        this.isSeaf = isSeaf;
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