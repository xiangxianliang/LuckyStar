package com.gll.ls.core.dao.system.mapper;

import com.gll.ls.core.pojo.system.po.SysDictInfo;
import com.gll.ls.core.pojo.system.po.SysDictInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictInfoMapper {
	int countByExample(SysDictInfoExample example);

	int deleteByExample(SysDictInfoExample example);

	int deleteByPrimaryKey(Integer infoId);

	int insert(SysDictInfo record);

	int insertSelective(SysDictInfo record);

	List<SysDictInfo> selectByExample(SysDictInfoExample example);

	SysDictInfo selectByPrimaryKey(Integer infoId);

	int updateByExampleSelective(@Param("record") SysDictInfo record, @Param("example") SysDictInfoExample example);

	int updateByExample(@Param("record") SysDictInfo record, @Param("example") SysDictInfoExample example);

	int updateByPrimaryKeySelective(SysDictInfo record);

	int updateByPrimaryKey(SysDictInfo record);
}