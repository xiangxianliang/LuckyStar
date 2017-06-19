package com.gll.ls.core.dao.resource.extended;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 类型表
 * 
 * @author XL
 * @Date 2017年4月10日 下午5:37:12
 */
public interface ResTypeMapperExtended {

	/**
	 * 设置被启动的端点
	 * 
	 * @param isSelect
	 *            启用
	 * @param typeIdList
	 *            启用的端点
	 * @return
	 */
	public Integer updateTypeEnable(@Param("isEnable") Integer isEnable, @Param("typeIdList") List<Integer> typeIdList);

	public Integer updateTypeEnable0();

}
