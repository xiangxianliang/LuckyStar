package com.gll.ls.core.dao.system.mapper;

import com.gll.ls.core.pojo.system.po.SysRoleModule;
import com.gll.ls.core.pojo.system.po.SysRoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleModuleMapper {
	int countByExample(SysRoleModuleExample example);

	int deleteByExample(SysRoleModuleExample example);

	int deleteByPrimaryKey(Integer roleModuleId);

	int insert(SysRoleModule record);

	int insertSelective(SysRoleModule record);

	List<SysRoleModule> selectByExample(SysRoleModuleExample example);

	SysRoleModule selectByPrimaryKey(Integer roleModuleId);

	int updateByExampleSelective(@Param("record") SysRoleModule record, @Param("example") SysRoleModuleExample example);

	int updateByExample(@Param("record") SysRoleModule record, @Param("example") SysRoleModuleExample example);

	int updateByPrimaryKeySelective(SysRoleModule record);

	int updateByPrimaryKey(SysRoleModule record);
}