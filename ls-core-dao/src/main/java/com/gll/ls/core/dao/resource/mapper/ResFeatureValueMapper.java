package com.gll.ls.core.dao.resource.mapper;

import com.gll.ls.core.pojo.resource.po.ResFeatureValue;
import com.gll.ls.core.pojo.resource.po.ResFeatureValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResFeatureValueMapper {
	int countByExample(ResFeatureValueExample example);

	int deleteByExample(ResFeatureValueExample example);

	int deleteByPrimaryKey(Integer featureValueId);

	int insert(ResFeatureValue record);

	int insertSelective(ResFeatureValue record);

	List<ResFeatureValue> selectByExample(ResFeatureValueExample example);

	ResFeatureValue selectByPrimaryKey(Integer featureValueId);

	int updateByExampleSelective(@Param("record") ResFeatureValue record, @Param("example") ResFeatureValueExample example);

	int updateByExample(@Param("record") ResFeatureValue record, @Param("example") ResFeatureValueExample example);

	int updateByPrimaryKeySelective(ResFeatureValue record);

	int updateByPrimaryKey(ResFeatureValue record);
}