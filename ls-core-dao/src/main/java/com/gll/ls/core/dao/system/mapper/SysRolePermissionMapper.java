package com.gll.ls.core.dao.system.mapper;

import com.gll.ls.core.pojo.system.po.SysRolePermission;
import com.gll.ls.core.pojo.system.po.SysRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePermissionMapper {
	int countByExample(SysRolePermissionExample example);

	int deleteByExample(SysRolePermissionExample example);

	int deleteByPrimaryKey(Integer rolePermissionId);

	int insert(SysRolePermission record);

	int insertSelective(SysRolePermission record);

	List<SysRolePermission> selectByExample(SysRolePermissionExample example);

	SysRolePermission selectByPrimaryKey(Integer rolePermissionId);

	int updateByExampleSelective(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

	int updateByExample(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

	int updateByPrimaryKeySelective(SysRolePermission record);

	int updateByPrimaryKey(SysRolePermission record);
}