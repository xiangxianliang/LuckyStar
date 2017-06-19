package com.gll.ls.core.dao.system.mapper;

import com.gll.ls.core.pojo.system.po.SysPermission;
import com.gll.ls.core.pojo.system.po.SysPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionMapper {
	int countByExample(SysPermissionExample example);

	int deleteByExample(SysPermissionExample example);

	int deleteByPrimaryKey(Integer permissionId);

	int insert(SysPermission record);

	int insertSelective(SysPermission record);

	List<SysPermission> selectByExample(SysPermissionExample example);

	SysPermission selectByPrimaryKey(Integer permissionId);

	int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

	int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

	int updateByPrimaryKeySelective(SysPermission record);

	int updateByPrimaryKey(SysPermission record);
}