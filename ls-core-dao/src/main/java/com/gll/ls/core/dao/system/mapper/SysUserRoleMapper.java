package com.gll.ls.core.dao.system.mapper;

import com.gll.ls.core.pojo.system.po.SysUserRole;
import com.gll.ls.core.pojo.system.po.SysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleMapper {
	int countByExample(SysUserRoleExample example);

	int deleteByExample(SysUserRoleExample example);

	int deleteByPrimaryKey(Integer userRoleId);

	int insert(SysUserRole record);

	int insertSelective(SysUserRole record);

	List<SysUserRole> selectByExample(SysUserRoleExample example);

	SysUserRole selectByPrimaryKey(Integer userRoleId);

	int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

	int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

	int updateByPrimaryKeySelective(SysUserRole record);

	int updateByPrimaryKey(SysUserRole record);
}