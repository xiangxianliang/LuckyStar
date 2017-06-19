package com.gll.ls.core.dao.resource.mapper;

import com.gll.ls.core.pojo.resource.po.ResType;
import com.gll.ls.core.pojo.resource.po.ResTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResTypeMapper {
	int countByExample(ResTypeExample example);

	int deleteByExample(ResTypeExample example);

	int deleteByPrimaryKey(Integer typeId);

	int insert(ResType record);

	int insertSelective(ResType record);

	List<ResType> selectByExample(ResTypeExample example);

	ResType selectByPrimaryKey(Integer typeId);

	int updateByExampleSelective(@Param("record") ResType record, @Param("example") ResTypeExample example);

	int updateByExample(@Param("record") ResType record, @Param("example") ResTypeExample example);

	int updateByPrimaryKeySelective(ResType record);

	int updateByPrimaryKey(ResType record);
}