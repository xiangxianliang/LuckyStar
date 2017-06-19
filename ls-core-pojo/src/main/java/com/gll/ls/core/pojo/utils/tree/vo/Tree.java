package com.gll.ls.core.pojo.utils.tree.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 树模型
 * 
 * @author XL
 * @Date 2017年4月12日 上午8:51:55
 * 
 *       easui中的tree_data.json数据,只能有一个root节点
 *       [{
 *       "id":1,
 *       "text":"Folder1",
 *       "iconCls":"icon-save",
 *       "children":[{
 *       "text":"File1",
 *       "checked":true
 *       }]
 *       }]
 *       提供静态方法formatTree(List<TreeJson> list) 返回结果
 *       TreeJson.formatTree(treeJsonlist) ;
 */
public class Tree implements Serializable {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	private Integer id; // 节点ID，对加载远程数据很重要。
	private String text;// 显示节点文本。
	private String state;// 节点状态，'open' 或 'closed'，默认：'open'。如果为'closed'的时候，将不自动展开该节点。
	private String checked;// 表示该节点是否被选中。
	private Attribute attributes;// 被添加到节点的自定义属性。
	private String iconCls; // 结点显示的图标

	private Integer pid;// 父节点
	private Integer sel;// 是否选中

	private List<Tree> children;// 一个节点数组声明了若干节点。

	public Tree() {
		super();
	}

	public Tree(Integer id, String text, String state, String checked, Attribute attributes, String iconCls, Integer pid,
			List<Tree> children) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
		this.checked = checked;
		this.attributes = attributes;
		this.iconCls = iconCls;
		this.pid = pid;
		this.children = children;
	}

	// ====================================================================================================

	/**
	 * 包装 tree
	 * 
	 * @param list
	 * @return
	 */
	public static List<Tree> formatTree(List<Tree> list) {
		// 包装
		List<Tree> ts = new ArrayList<Tree>();
		Tree tree = new Tree();
		tree.setId(0);
		tree.setText("系统根节点");
		tree.setChildren(list);
		ts.add(tree);
		return ts;
	}

	public static List<Tree> formatTreeNull(List<Tree> list) {
		for (Tree t : list) {
			List<Tree> children = t.getChildren();
			for (Tree t2 : children) {
				if (t2.getId() == null) {
					t.setChildren(null);
				}
			}
		}
		return list;
	}

	// ============== get * set ==============================================================

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            要设置的 id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            要设置的 text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            要设置的 state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return checked
	 */
	public String getChecked() {
		return checked;
	}

	/**
	 * @param checked
	 *            要设置的 checked
	 */
	public void setChecked(String checked) {
		this.checked = checked;
	}

	/**
	 * @return attributes
	 */
	public Attribute getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            要设置的 attributes
	 */
	public void setAttributes(Attribute attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return iconCls
	 */
	public String getIconCls() {
		return iconCls;
	}

	/**
	 * @param iconCls
	 *            要设置的 iconCls
	 */
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	/**
	 * @return pid
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * @param pid
	 *            要设置的 pid
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * @return children
	 */
	public List<Tree> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            要设置的 children
	 */
	public void setChildren(List<Tree> children) {
		this.children = children;
	}

	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return sel
	 */
	public Integer getSel() {
		return sel;
	}

	/**
	 * @param sel
	 *            要设置的 sel 大于0 被选中
	 */
	public void setSel(Integer sel) {
		this.sel = sel;
		if (sel > 0) {
			this.checked = "true";
		}
	}

}