package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysDictInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysDictInfoQueryVo;
import com.gll.ls.core.service.system.base.SysDictInfoServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 数据字典 信息
 * 
 * @author XL
 * @Date 2017年4月29日 上午7:56:28
 */
public interface SysDictInfoService extends SysDictInfoServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysDictInfoQueryVo
	 * @param rows
	 * @param page
	 * @return
	 */
	public DataGridResultInfo<SysDictInfoCustom> getDictInfoDataGridByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo, int rows, int page);

	/**
	 * 删除字典 信息
	 * 
	 * @param infoId
	 * @return
	 */
	public Integer updateDelDictInfoAndRelationByKey(Integer infoId);

	/**
	 * 删除字典 信息 多个
	 * 
	 * @param arrayToList
	 * @return
	 */
	public Integer updateDelDictInfoAndRelationByKeys(List<Integer> infoIds);

	/**
	 * 删除 字典 信息 根据 字典项 ID
	 * 
	 * @param typeId
	 * @return
	 */
	public Integer updateDelDictInfoByTypeId(Integer typeId);

	/**
	 * 添加
	 */
	public Integer addDictInfoByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据id更新
	 */
	public Integer updateDictInfoByKey(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteDictInfoByKey(Integer infoId);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteDictInfoByKeyList(List<Integer> infoIdList);

	/**
	 * 启用字典 内容
	 * 
	 * @param infoId
	 * @param isEnable
	 * @return
	 */
	public Integer enableInfoByKey(Integer infoId, Integer isEnable);

	/**
	 * 根据TypeId查询 数据字典
	 * 
	 * @param typeid
	 * @return
	 */
	public List<SysDictInfoCustom> getSysDictInfoCustomByTypeId(Integer typeid);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkDictInfo(Integer infoId, SysDictInfoQueryVo sysDictInfoQueryVo);

}