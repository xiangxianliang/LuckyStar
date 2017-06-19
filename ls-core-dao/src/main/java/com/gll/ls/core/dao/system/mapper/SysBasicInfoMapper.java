package com.gll.ls.core.dao.system.mapper;

import com.gll.ls.core.pojo.system.po.SysBasicInfo;
import com.gll.ls.core.pojo.system.po.SysBasicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBasicInfoMapper {
	int countByExample(SysBasicInfoExample example);

	int deleteByExample(SysBasicInfoExample example);

	int deleteByPrimaryKey(Integer basicInfoId);

	int insert(SysBasicInfo record);

	int insertSelective(SysBasicInfo record);

	List<SysBasicInfo> selectByExample(SysBasicInfoExample example);

	SysBasicInfo selectByPrimaryKey(Integer basicInfoId);

	int updateByExampleSelective(@Param("record") SysBasicInfo record, @Param("example") SysBasicInfoExample example);

	int updateByExample(@Param("record") SysBasicInfo record, @Param("example") SysBasicInfoExample example);

	int updateByPrimaryKeySelective(SysBasicInfo record);

	int updateByPrimaryKey(SysBasicInfo record);
}