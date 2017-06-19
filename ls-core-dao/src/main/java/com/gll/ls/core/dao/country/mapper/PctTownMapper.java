package com.gll.ls.core.dao.country.mapper;

import com.gll.ls.core.pojo.country.po.PctTown;
import com.gll.ls.core.pojo.country.po.PctTownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PctTownMapper {
	int countByExample(PctTownExample example);

	int deleteByExample(PctTownExample example);

	int deleteByPrimaryKey(String townCode);

	int insert(PctTown record);

	int insertSelective(PctTown record);

	List<PctTown> selectByExample(PctTownExample example);

	PctTown selectByPrimaryKey(String townCode);

	int updateByExampleSelective(@Param("record") PctTown record, @Param("example") PctTownExample example);

	int updateByExample(@Param("record") PctTown record, @Param("example") PctTownExample example);

	int updateByPrimaryKeySelective(PctTown record);

	int updateByPrimaryKey(PctTown record);
}