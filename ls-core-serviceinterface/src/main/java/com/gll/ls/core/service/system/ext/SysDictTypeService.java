package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysDictTypeCustom;
import com.gll.ls.core.pojo.system.vo.SysDictTypeQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.system.base.SysDictTypeServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 数据字典类型
 * 
 * @author XL
 * @Date 2017年4月29日 上午7:56:44
 */
public interface SysDictTypeService extends SysDictTypeServiceBase {

	/**
	 * 查询字典项
	 * 
	 * @return Tree
	 */
	@Deprecated
	public Tree getDictionaryTree();

	/**
	 * 查询字典项
	 * 
	 * @return
	 */
	public ZTree getDictionaryZTree();

	/**
	 * 分页查询
	 * 
	 * @param sysDictTypeQueryVo
	 * @param rows
	 * @param page
	 * @return
	 */
	public DataGridResultInfo<SysDictTypeCustom> getDictTypeDataGridByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo, int rows, int page);

	/**
	 * 删除字典 项
	 * 
	 * @param typeId
	 * @return
	 */
	public Integer updateDelDictTypeAndRelationByKey(Integer typeId);

	/**
	 * 删除字典 项 多个
	 * 
	 * @param arrayToList
	 * @return
	 */
	public Integer updateDelDictTypeAndRelationByKeys(List<Integer> typeIds);

	/**
	 * 添加
	 */
	public Integer addDictTypeByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据id更新
	 */
	public Integer updateDictTypeByKey(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteDictTypeByKey(Integer typeId);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteDictTypeByKeyList(List<Integer> typeIdList);

	/**
	 * 启用 字典项
	 * 
	 * @param typeId
	 * @param isEnable
	 * @return
	 */
	public Integer enableTypeByKey(Integer typeId, Integer isEnable);

	/**
	 * 根据 字典类型id查询 节点信息
	 * 
	 * @param typeId
	 * @return
	 */
	@Deprecated
	public Tree getDictTypeTreeBytypeId(Integer typeId);

	/**
	 * 根据 字典类型id查询 节点信息
	 * 
	 * @param typeId
	 * @return
	 */
	public ZTree getDictTypeZTreeBytypeId(Integer typeId);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkDictType(Integer typeId, SysDictTypeQueryVo sysDictTypeQueryVo);

}