package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysBasicInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoQueryVo;
import com.gll.ls.core.service.system.base.SysBasicInfoServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 基础信息
 * 
 * @author XL
 * @Date 2017年4月29日 上午7:55:54
 */
public interface SysBasicInfoService extends SysBasicInfoServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysBasicInfoQueryVo
	 * @param rows
	 * @param page
	 * @return
	 */
	public DataGridResultInfo<SysBasicInfoCustom> getBasicInfoDataGridByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo, Integer rows, Integer page);

	/**
	 * 添加
	 */
	public Integer addBasicInfoByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据id更新
	 */
	public Integer updateBasicInfoByKey(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteBasicInfoByKey(Integer basicInfoId);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteBasicInfoByKeyList(List<Integer> basicInfoIdList);

	/**
	 * 启用 禁用
	 * 
	 * @param basicInfoId
	 * @param isEnable
	 * @return
	 */
	public Integer enableBasicInfoByKey(Integer basicInfoId, Integer isEnable);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkBasicInfo(Integer basicInfoId, SysBasicInfoQueryVo sysBasicInfoQueryVo);

}