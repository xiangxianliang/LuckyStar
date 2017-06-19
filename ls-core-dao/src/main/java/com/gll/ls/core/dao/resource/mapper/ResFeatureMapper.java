package com.gll.ls.core.dao.resource.mapper;

import com.gll.ls.core.pojo.resource.po.ResFeature;
import com.gll.ls.core.pojo.resource.po.ResFeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResFeatureMapper {
	int countByExample(ResFeatureExample example);

	int deleteByExample(ResFeatureExample example);

	int deleteByPrimaryKey(Integer featureId);

	int insert(ResFeature record);

	int insertSelective(ResFeature record);

	List<ResFeature> selectByExample(ResFeatureExample example);

	ResFeature selectByPrimaryKey(Integer featureId);

	int updateByExampleSelective(@Param("record") ResFeature record, @Param("example") ResFeatureExample example);

	int updateByExample(@Param("record") ResFeature record, @Param("example") ResFeatureExample example);

	int updateByPrimaryKeySelective(ResFeature record);

	int updateByPrimaryKey(ResFeature record);
}