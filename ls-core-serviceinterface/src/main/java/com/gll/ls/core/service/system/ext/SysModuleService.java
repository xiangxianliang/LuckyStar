package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysModuleQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.system.base.SysModuleServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 系统模块 DAO
 * 
 * @author XL
 * @Date 2017年4月23日 下午12:10:46
 */
public interface SysModuleService extends SysModuleServiceBase {

	// ==================================================================================================================

	/**
	 * 分页查询
	 * 
	 * @param sysModuleQueryVo
	 *            查询条件
	 * @param rows
	 *            每页显示个数
	 * @param page
	 *            当前页码
	 * 
	 */
	public DataGridResultInfo<SysModuleCustom> getModuleListDataGridByQueryVo(SysModuleQueryVo sysModuleQueryVo, int rows, int page);

	/**
	 * 根据模块id查询父模块
	 * 
	 * @param moduleId
	 * @return
	 */
	public SysModuleCustom getModuleByKey(Integer moduleId);

	/**
	 * 增加模块 并且设置父模块
	 * 
	 * @param sysModuleQueryVo
	 */
	public Integer addModuleByQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据id更新
	 */
	public Integer updateModuleByKey(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 带子父关系的批量删除 关联删除 角色与模块 权限表
	 * 
	 * @param moduleId
	 * @return
	 */
	public Integer deleteModuleAndRelationByKey(Integer moduleId);

	/**
	 * 带子父关系的批量删除 List 关联删除 角色与模块 权限表
	 * 
	 * @param moduleIdList
	 * @return
	 */
	public Integer deleteModuleAndRelationByKeys(List<Integer> moduleIdList);

	/**
	 * 启用模块
	 * 
	 * @param moduleId
	 * @param isEnable
	 * @return
	 */
	public Integer enableModuleByKey(Integer moduleId, Integer isEnable);

	/**
	 * ajax 校验
	 * 
	 * @param moduleId
	 * @param sysModuleQueryVo
	 * @return
	 */
	public Boolean checkModule(Integer moduleId, SysModuleQueryVo sysModuleQueryVo);

	// ==================================================================================================================

	/**
	 * 查询树
	 * 
	 * @return
	 */
	@Deprecated
	public Tree getModuleTree();

	/**
	 * 查询 树 ZTree
	 * 
	 * @return
	 */

	public ZTree getModuleZTree();

	/**
	 * 查询特定 tree
	 * 
	 * @param parentId
	 */
	@Deprecated
	public Tree getModuleTreeByParentId(Integer parentId);

	/**
	 * 查询指定结点的 zTree json信息
	 * 
	 * @param moduleId
	 * @return
	 */
	public ZTree getModuleJSONByModuleId(Integer moduleId);

	// ==================================================================================================================

	/**
	 * 得到用户 树形菜单
	 * 
	 * @param userId
	 * @return
	 */
	public List<Tree> getUserModuleTreeByUserId(Integer userId);

	// ==================================================================================================================
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
