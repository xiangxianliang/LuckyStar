package com.gll.ls.core.dao.system.mapper;

import com.gll.ls.core.pojo.system.po.SysModule;
import com.gll.ls.core.pojo.system.po.SysModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysModuleMapper {
	int countByExample(SysModuleExample example);

	int deleteByExample(SysModuleExample example);

	int deleteByPrimaryKey(Integer moduleId);

	int insert(SysModule record);

	int insertSelective(SysModule record);

	List<SysModule> selectByExample(SysModuleExample example);

	SysModule selectByPrimaryKey(Integer moduleId);

	int updateByExampleSelective(@Param("record") SysModule record, @Param("example") SysModuleExample example);

	int updateByExample(@Param("record") SysModule record, @Param("example") SysModuleExample example);

	int updateByPrimaryKeySelective(SysModule record);

	int updateByPrimaryKey(SysModule record);
}