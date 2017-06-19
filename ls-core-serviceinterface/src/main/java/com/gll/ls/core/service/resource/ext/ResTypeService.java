package com.gll.ls.core.service.resource.ext;

import java.util.List;

import com.gll.ls.core.pojo.resource.vo.ResTypeCustom;
import com.gll.ls.core.pojo.resource.vo.ResTypeQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.resource.base.ResTypeServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

public interface ResTypeService extends ResTypeServiceBase {

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<ResTypeCustom> getTypeListDataGridByQueryVo(ResTypeQueryVo resTypeQueryVo, int rows, int page);

	/**
	 * 添加
	 */
	public Integer addTypeByQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据id查询
	 */
	public ResTypeCustom getTypeByKey(Integer typeId);

	/**
	 * 根据id更新
	 */
	public Integer updateTypeByKey(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteTypeByKey(Integer typeId);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteTypeByKeyList(List<Integer> typeIdList);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkType(Integer typeId, ResTypeQueryVo resTypeQueryVo);

	/**
	 * 启用树
	 * 
	 * @param typeIdList
	 *            启用的ID
	 * @return
	 */
	public Integer updateTypeEnable(List<Integer> typeIdList);

	// =======================================================================================================================

	/**
	 * 查询ZTree 全部
	 * 
	 * @return
	 */
	public ZTree getTypeZTree();

	/**
	 * 查询被选中的tree
	 * 
	 * @return
	 */
	public ZTree getEnableTypeZTree();

	/**
	 * 查询特定的 模块树
	 * 
	 * @param typeId
	 * @return
	 */
	public ZTree getModuleJSONByModuleId(Integer typeId);

	/**
	 * 得到选中的ZTree （属性管理用到）
	 * 
	 * @return
	 */
	public ZTree getSelectTypeZTree();

}
