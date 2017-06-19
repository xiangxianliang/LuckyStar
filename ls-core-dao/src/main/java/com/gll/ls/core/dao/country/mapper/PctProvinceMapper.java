package com.gll.ls.core.dao.country.mapper;

import com.gll.ls.core.pojo.country.po.PctProvince;
import com.gll.ls.core.pojo.country.po.PctProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PctProvinceMapper {
	int countByExample(PctProvinceExample example);

	int deleteByExample(PctProvinceExample example);

	int deleteByPrimaryKey(String provinceCode);

	int insert(PctProvince record);

	int insertSelective(PctProvince record);

	List<PctProvince> selectByExample(PctProvinceExample example);

	PctProvince selectByPrimaryKey(String provinceCode);

	int updateByExampleSelective(@Param("record") PctProvince record, @Param("example") PctProvinceExample example);

	int updateByExample(@Param("record") PctProvince record, @Param("example") PctProvinceExample example);

	int updateByPrimaryKeySelective(PctProvince record);

	int updateByPrimaryKey(PctProvince record);
}