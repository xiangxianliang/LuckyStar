package com.gll.ls.core.dao.system.mapper;

import com.gll.ls.core.pojo.system.po.SysDictType;
import com.gll.ls.core.pojo.system.po.SysDictTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictTypeMapper {
	int countByExample(SysDictTypeExample example);

	int deleteByExample(SysDictTypeExample example);

	int deleteByPrimaryKey(Integer typeId);

	int insert(SysDictType record);

	int insertSelective(SysDictType record);

	List<SysDictType> selectByExample(SysDictTypeExample example);

	SysDictType selectByPrimaryKey(Integer typeId);

	int updateByExampleSelective(@Param("record") SysDictType record, @Param("example") SysDictTypeExample example);

	int updateByExample(@Param("record") SysDictType record, @Param("example") SysDictTypeExample example);

	int updateByPrimaryKeySelective(SysDictType record);

	int updateByPrimaryKey(SysDictType record);
}