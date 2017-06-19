package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;

public class SysRolePermission implements Serializable {
    /**
     * 角色全选 id
     */
    private Integer rolePermissionId;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer permissionId;

    /**
     * sys_role_permission
     */
    private static final long serialVersionUID = 1L;

    /**
     * 角色全选 id
     * @return role_permission_id 角色全选 id
     */
    public Integer getRolePermissionId() {
        return rolePermissionId;
    }

    /**
     * 角色全选 id
     * @param rolePermissionId 角色全选 id
     */
    public void setRolePermissionId(Integer rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

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
     * 权限id
     * @return permission_id 权限id
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 权限id
     * @param permissionId 权限id
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}