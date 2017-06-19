package com.gll.ls.core.dao.country.mapper;

import com.gll.ls.core.pojo.country.po.PctCity;
import com.gll.ls.core.pojo.country.po.PctCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PctCityMapper {
	int countByExample(PctCityExample example);

	int deleteByExample(PctCityExample example);

	int deleteByPrimaryKey(String cityCode);

	int insert(PctCity record);

	int insertSelective(PctCity record);

	List<PctCity> selectByExample(PctCityExample example);

	PctCity selectByPrimaryKey(String cityCode);

	int updateByExampleSelective(@Param("record") PctCity record, @Param("example") PctCityExample example);

	int updateByExample(@Param("record") PctCity record, @Param("example") PctCityExample example);

	int updateByPrimaryKeySelective(PctCity record);

	int updateByPrimaryKey(PctCity record);
}