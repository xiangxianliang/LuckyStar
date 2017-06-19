package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {
    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDescription;

    /**
     * 角色备注
     */
    private String roleRemark;

    /**
     * 角色更新时间
     */
    private Date roleUpdatedate;

    /**
     * 是否分配权限：1分配权限；0没有分配权限
     */
    private Integer isPermissions;

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
     * sys_role
     */
    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     * @return role_id 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 角色名称
     * @return role_name 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 角色描述
     * @return role_description 角色描述
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * 角色描述
     * @param roleDescription 角色描述
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }

    /**
     * 角色备注
     * @return role_remark 角色备注
     */
    public String getRoleRemark() {
        return roleRemark;
    }

    /**
     * 角色备注
     * @param roleRemark 角色备注
     */
    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark == null ? null : roleRemark.trim();
    }

    /**
     * 角色更新时间
     * @return role_updatedate 角色更新时间
     */
    public Date getRoleUpdatedate() {
        return roleUpdatedate;
    }

    /**
     * 角色更新时间
     * @param roleUpdatedate 角色更新时间
     */
    public void setRoleUpdatedate(Date roleUpdatedate) {
        this.roleUpdatedate = roleUpdatedate;
    }

    /**
     * 是否分配权限：1分配权限；0没有分配权限
     * @return is_permissions 是否分配权限：1分配权限；0没有分配权限
     */
    public Integer getIsPermissions() {
        return isPermissions;
    }

    /**
     * 是否分配权限：1分配权限；0没有分配权限
     * @param isPermissions 是否分配权限：1分配权限；0没有分配权限
     */
    public void setIsPermissions(Integer isPermissions) {
        this.isPermissions = isPermissions;
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