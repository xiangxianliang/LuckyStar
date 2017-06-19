package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;

public class SysUserRole implements Serializable {
    /**
     * 用户角色id
     */
    private Integer userRoleId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * sys_user_role
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户角色id
     * @return user_role_id 用户角色id
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * 用户角色id
     * @param userRoleId 用户角色id
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
}