package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;

public class SysRoleModule implements Serializable {
    /**
     * 角色模块主键
     */
    private Integer roleModuleId;

    /**
     * 角色主键
     */
    private Integer roleId;

    /**
     * 模块主键
     */
    private Integer moduleId;

    /**
     * sys_role_module
     */
    private static final long serialVersionUID = 1L;

    /**
     * 角色模块主键
     * @return role_module_id 角色模块主键
     */
    public Integer getRoleModuleId() {
        return roleModuleId;
    }

    /**
     * 角色模块主键
     * @param roleModuleId 角色模块主键
     */
    public void setRoleModuleId(Integer roleModuleId) {
        this.roleModuleId = roleModuleId;
    }

    /**
     * 角色主键
     * @return role_id 角色主键
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色主键
     * @param roleId 角色主键
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 模块主键
     * @return module_id 模块主键
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * 模块主键
     * @param moduleId 模块主键
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }
}