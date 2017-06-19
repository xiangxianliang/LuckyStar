package com.gll.ls.core.dao.system.extended;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gll.ls.core.pojo.system.vo.SysModuleCustom;

/**
 * 模块 自定义 扩展Dao
 * 
 * @author XL
 * @Date 2017年4月27日 下午10:20:06
 */
public interface SysModuleMapperExtended {

	/**
	 * 用户 可以使用的模块的ID
	 * 
	 * @param userId
	 * @return
	 */
	public List<Integer> getModuleCheckedIdByUserId(@Param("userId") Integer userId);

	/**
	 * 查询 用户 所有的一级菜单 根据用户ID
	 * 
	 * @param userId
	 * @return
	 */
	public List<SysModuleCustom> getModuleCheckedOneByUserId(@Param("mIdList") List<Integer> mIdList);

	/**
	 * 查询用户的 第二层 第三城 第四层 菜单
	 * 
	 * @param mIdList
	 * @param moduleId
	 * @return
	 */
	public List<SysModuleCustom> getModuleCheckedOtherByUserId(@Param("mIdList") List<Integer> mIdList, @Param("moduleId") Integer moduleId);

	// =============================================================================================

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
