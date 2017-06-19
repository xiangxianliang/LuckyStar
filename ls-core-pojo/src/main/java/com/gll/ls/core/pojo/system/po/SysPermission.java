package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;

public class SysPermission implements Serializable {
    /**
     * 主键
     */
    private Integer permissionId;

    /**
     * 资源名称
     */
    private String permissionName;

    /**
     * 权限代码
     */
    private String permissionCode;

    /**
     * 权限访问的方法；访问url地址
     */
    private String permissionMethod;

    /**
     * 权限描述
     */
    private String permissionDescription;

    /**
     * 权限图标
     */
    private String permissionIcon;

    /**
     * 父模块id
     */
    private Integer parentModuleId;

    /**
     * 显示序号
     */
    private Integer showorder;

    /**
     * 资源类型：menu,button,
     */
    private String type;

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
     * sys_permission
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return permission_id 主键
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 主键
     * @param permissionId 主键
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 资源名称
     * @return permission_name 资源名称
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 资源名称
     * @param permissionName 资源名称
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    /**
     * 权限代码
     * @return permission_code 权限代码
     */
    public String getPermissionCode() {
        return permissionCode;
    }

    /**
     * 权限代码
     * @param permissionCode 权限代码
     */
    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    /**
     * 权限访问的方法；访问url地址
     * @return permission_method 权限访问的方法；访问url地址
     */
    public String getPermissionMethod() {
        return permissionMethod;
    }

    /**
     * 权限访问的方法；访问url地址
     * @param permissionMethod 权限访问的方法；访问url地址
     */
    public void setPermissionMethod(String permissionMethod) {
        this.permissionMethod = permissionMethod == null ? null : permissionMethod.trim();
    }

    /**
     * 权限描述
     * @return permission_description 权限描述
     */
    public String getPermissionDescription() {
        return permissionDescription;
    }

    /**
     * 权限描述
     * @param permissionDescription 权限描述
     */
    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription == null ? null : permissionDescription.trim();
    }

    /**
     * 权限图标
     * @return permission_icon 权限图标
     */
    public String getPermissionIcon() {
        return permissionIcon;
    }

    /**
     * 权限图标
     * @param permissionIcon 权限图标
     */
    public void setPermissionIcon(String permissionIcon) {
        this.permissionIcon = permissionIcon == null ? null : permissionIcon.trim();
    }

    /**
     * 父模块id
     * @return parent_module_id 父模块id
     */
    public Integer getParentModuleId() {
        return parentModuleId;
    }

    /**
     * 父模块id
     * @param parentModuleId 父模块id
     */
    public void setParentModuleId(Integer parentModuleId) {
        this.parentModuleId = parentModuleId;
    }

    /**
     * 显示序号
     * @return showorder 显示序号
     */
    public Integer getShoworder() {
        return showorder;
    }

    /**
     * 显示序号
     * @param showorder 显示序号
     */
    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }

    /**
     * 资源类型：menu,button,
     * @return type 资源类型：menu,button,
     */
    public String getType() {
        return type;
    }

    /**
     * 资源类型：menu,button,
     * @param type 资源类型：menu,button,
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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