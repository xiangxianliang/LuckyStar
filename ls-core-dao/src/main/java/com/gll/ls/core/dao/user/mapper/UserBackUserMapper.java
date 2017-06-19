package com.gll.ls.core.dao.user.mapper;

import com.gll.ls.core.pojo.user.po.UserBackUser;
import com.gll.ls.core.pojo.user.po.UserBackUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBackUserMapper {
	int countByExample(UserBackUserExample example);

	int deleteByExample(UserBackUserExample example);

	int deleteByPrimaryKey(Integer userId);

	int insert(UserBackUser record);

	int insertSelective(UserBackUser record);

	List<UserBackUser> selectByExample(UserBackUserExample example);

	UserBackUser selectByPrimaryKey(Integer userId);

	int updateByExampleSelective(@Param("record") UserBackUser record, @Param("example") UserBackUserExample example);

	int updateByExample(@Param("record") UserBackUser record, @Param("example") UserBackUserExample example);

	int updateByPrimaryKeySelective(UserBackUser record);

	int updateByPrimaryKey(UserBackUser record);
}