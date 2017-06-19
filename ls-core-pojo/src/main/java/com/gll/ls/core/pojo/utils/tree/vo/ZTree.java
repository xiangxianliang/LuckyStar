package com.gll.ls.core.pojo.utils.tree.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * ZTree.java
 * 
 * @author XL
 * @Date 2017年5月4日 上午7:35:34
 * @Version 1.0
 */
public class ZTree implements Serializable {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;// id
	private Integer pid;// 父id

	/**
	 * 节点名称。
	 * 1、如果不使用 name 属性保存节点名称，请修改 setting.data.key.name
	 * 默认值：无
	 * 节点显示的名称字符串，标准 String 即可，所有特殊字符都会被自动转义
	 */
	private String name; // 结点名字

	/**
	 * 记录 treeNode 节点的 展开 / 折叠 状态。
	 * 1、初始化节点数据时，如果设定 treeNode.open = true，则会直接展开此节点
	 * 2、叶子节点 treeNode.open = false
	 * 3、为了解决部分朋友生成 json 数据出现的兼容问题, 支持 "false","true" 字符串格式的数据
	 * 4、非异步加载模式下，无子节点的父节点设置 open=true 后，可显示为展开状态，但异步加载模式下不会生效。（v3.5.15+）
	 * 默认值：false
	 * true 表示节点为 展开 状态
	 * false 表示节点为 折叠 状态
	 */
	private Boolean open;// 是否展开 ：true 展开 ;false 关闭

	/**
	 * 节点自定义图标的 URL 路径。
	 * 1、父节点如果只设置 icon ，会导致展开、折叠时都使用同一个图标
	 * 2、父节点展开、折叠使用不同的个性化图标需要同时设置 treeNode.iconOpen / treeNode.iconClose 两个属性
	 * 3、如果想利用 className 设置个性化图标，需要设置 treeNode.iconSkin 属性
	 * 默认值：无
	 * 图标图片的 url 可以是相对路径也可以是绝对路径
	 * 设置相对路径请注意页面与图片之间的关系，确保图片能够正常加载
	 */
	private String icon;// 自定义图标 -- icon 属性

	/**
	 * 父节点自定义折叠时图标的 URL 路径。
	 * 1、此属性只针对父节点有效
	 * 2、此属性必须与 iconOpen 同时使用
	 * 3、如果想利用 className 设置个性化图标，需要设置 treeNode.iconSkin 属性
	 * 默认值：无
	 * 图标图片的 url 可以是相对路径也可以是绝对路径
	 * 设置相对路径请注意页面与图片之间的关系，确保图片能够正常加载
	 */
	private String iconClose;

	/**
	 * 父节点自定义展开时图标的 URL 路径。
	 * 1、此属性只针对父节点有效
	 * 2、此属性必须与 iconClose 同时使用
	 * 3、如果想利用 className 设置个性化图标，需要设置 treeNode.iconSkin 属性
	 * 默认值：无
	 * 图标图片的 url 可以是相对路径也可以是绝对路径
	 * 设置相对路径请注意页面与图片之间的关系，确保图片能够正常加载
	 */
	private String iconOpen;

	/**
	 * 节点自定义图标的 className
	 * 1、需要修改 css，增加相应 className 的设置
	 * 2、css 方式简单、方便，并且同时支持父节点展开、折叠状态切换图片
	 * 3、css 建议采用图片分割渲染的方式以减少反复加载图片，并且避免图片闪动
	 * 4、zTree v3.x 的 iconSkin 同样支持 IE6
	 * 5、如果想直接使用 图片的Url路径 设置节点的个性化图标，需要设置 treeNode.icon / treeNode.iconOpen / treeNode.iconClose 属性
	 * 默认值：无
	 * 设置个性图标的 className
	 */
	private String iconSkin;// 自定义图标 -- iconSkin 属性

	/**
	 * 判断 treeNode 节点是否被隐藏。
	 * 1、初始化 zTree 时，如果节点设置 isHidden = true，会被自动隐藏
	 * 2、请勿对已加载的节点修改此属性，隐藏 /显示 请使用 hideNode() / hideNodes() / showNode() / showNodes() 方法
	 * true 表示被隐藏
	 * false 表示被显示
	 */
	private Boolean isHidden;

	/**
	 * 记录 treeNode 节点是否为父节点。
	 * 1、初始化节点数据时，根据 treeNode.children 属性判断，有子节点则设置为 true，否则为 false
	 * 2、初始化节点数据时，如果设定 treeNode.isParent = true，即使无子节点数据，也会设置为父节点
	 * 3、为了解决部分朋友生成 json 数据出现的兼容问题, 支持 "false","true" 字符串格式的数据
	 * true 表示是父节点
	 * false 表示不是父节点
	 */
	private Boolean isParent;// 是否是父节点

	/**
	 * 1、设置节点是否隐藏 checkbox / radio [setting.check.enable = true 时有效]
	 * 2、为了解决部分朋友生成 json 数据出现的兼容问题, 支持 "false","true" 字符串格式的数据
	 * 默认值：false
	 * true 表示此节点不显示 checkbox / radio，不影响勾选的关联关系，不影响父节点的半选状态。
	 * false 表示节点具有正常的勾选功能
	 */
	private Boolean nocheck;

	/**
	 * 设置点击节点后在何处打开 url。[treeNode.url 存在时有效]
	 * 默认值：无
	 * 同超链接 target 属性: "_blank", "_self" 或 其他指定窗口名称
	 * 省略此属性，则默认为 "_blank"
	 */
	private String target;

	/**
	 * 节点链接的目标 URL
	 * 1、编辑模式 (setting.edit.enable = true) 下此属性功能失效，如果必须使用类似功能，请利用 onClick 事件回调函数自行控制。
	 * 2、如果需要在 onClick 事件回调函数中进行跳转控制，那么请将 URL 地址保存在其他自定义的属性内，请勿使用 url
	 * 默认值：无
	 * 同超链接 href 属性
	 */
	private String url;// 节点链接的目标 URL

	/**
	 * 节点的 checkBox / radio 的 勾选状态。
	 * [setting.check.enable = true & treeNode.nocheck = false 时有效]
	 * 1、如果不使用 checked 属性设置勾选状态，请修改 setting.data.key.checked
	 * 2、建立 treeNode 数据时设置 treeNode.checked = true 可以让节点的输入框默认为勾选状态
	 * 3、修改节点勾选状态，可以使用 treeObj.checkNode / checkAllNodes / updateNode
	 * 方法，具体使用哪种请根据自己的需求而定
	 * 4、为了解决部分朋友生成 json 数据出现的兼容问题, 支持 "false","true" 字符串格式的数据
	 * 默认值：false
	 * 
	 */
	private Boolean checked;

	/**
	 * 1、设置节点的 checkbox / radio 是否禁用
	 * [setting.check.enable = true 时有效]
	 * 2、为了解决部分朋友生成 json 数据出现的兼容问题, 支持 "false","true" 字符串格式的数据
	 * 3、请勿对已加载的节点修改此属性，禁止 或 取消禁止 请使用 setChkDisabled() 方法
	 * 4、初始化时，如果需要子孙节点继承父节点的 chkDisabled 属性，请设置 setting.check.chkDisabledInherit属性
	 * 默认值：false
	 * true 表示此节点的 checkbox / radio 被禁用。
	 * false 表示此节点的 checkbox / radio 可以使用。
	 */
	private Boolean chkDisabled;

	/**
	 * 最简单的 click 事件操作。相当于 onclick="..." 的内容。 如果操作较复杂，请使用 onClick 事件回调函数。
	 * 由于 IE 对于 onclick 和 click事件共存时的处理与其他浏览器不同，所以请不要利用此参数控制是否允许跳转的操作
	 * （例如：treeNode.click = "return false;"）。如有类似需求，请不要使用 url 属性设置网址，同时利用 onClick 回调函数控制跳转。
	 * 默认值：无
	 * 标准 javascript 语法， 例如：alert("test"); 等
	 */
	private String click;

	/**
	 * 强制节点的 checkBox / radio 的 半勾选状态。
	 * [setting.check.enable = true & treeNode.nocheck = false 时有效]
	 * 1、强制为半勾选状态后，不再进行自动计算半勾选状态
	 * 2、设置 treeNode.halfCheck = false 或 null 才能恢复自动计算半勾选状态
	 * 3、为了解决部分朋友生成 json 数据出现的兼容问题, 支持 "false","true" 字符串格式的数据
	 * 默认值：false
	 * true 表示节点的输入框 强行设置为半勾选
	 * false 表示节点的输入框 根据 zTree 的规则自动计算半勾选状态
	 */

	private Boolean halfCheck;//

	/**
	 * // 节点的子节点数据集合。
	 * // 1、如果不使用 children 属性保存子节点数据，请修改 setting.data.key.children
	 * // 2、异步加载时，对于设置了 isParent = true 的节点，在展开时将进行异步加载
	 */
	private List<ZTree> children;

	private Attribute attr;

	// 自定义的属性
	private Integer isSelected;
	private Integer isSeafed;

	// ============= 方法 ============================================

	// ============= get * set =============================================

	/**
	 * @return attr
	 */
	public Attribute getAttr() {
		return attr;
	}

	/**
	 * @param attr
	 *            要设置的 attr
	 */
	public void setAttr(Attribute attr) {
		this.attr = attr;
	}

	/**
	 * @return iconClose
	 */
	public String getIconClose() {
		return iconClose;
	}

	/**
	 * @param iconClose
	 *            要设置的 iconClose
	 */
	public void setIconClose(String iconClose) {
		this.iconClose = iconClose;
	}

	/**
	 * @return iconOpen
	 */
	public String getIconOpen() {
		return iconOpen;
	}

	/**
	 * @param iconOpen
	 *            要设置的 iconOpen
	 */
	public void setIconOpen(String iconOpen) {
		this.iconOpen = iconOpen;
	}

	/**
	 * @return isHidden
	 */
	public Boolean getIsHidden() {
		return isHidden;
	}

	/**
	 * @param isHidden
	 *            要设置的 isHidden
	 */
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * @return target
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @param target
	 *            要设置的 target
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	/**
	 * @return chkDisabled
	 */
	public Boolean getChkDisabled() {
		return chkDisabled;
	}

	/**
	 * @param chkDisabled
	 *            要设置的 chkDisabled
	 */
	public void setChkDisabled(Boolean chkDisabled) {
		this.chkDisabled = chkDisabled;
	}

	/**
	 * @return click
	 */
	public String getClick() {
		return click;
	}

	/**
	 * @param click
	 *            要设置的 click
	 */
	public void setClick(String click) {
		this.click = click;
	}

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            要设置的 url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param id
	 *            要设置的 id
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return open
	 */
	public Boolean getOpen() {
		return open;
	}

	/**
	 * @param open
	 *            要设置的 open
	 */
	public void setOpen(Boolean open) {
		this.open = open;
	}

	/**
	 * @return icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            要设置的 icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return iconSkin
	 */
	public String getIconSkin() {
		return iconSkin;
	}

	/**
	 * @param iconSkin
	 *            要设置的 iconSkin
	 */
	public void setIconSkin(String iconSkin) {
		this.iconSkin = iconSkin;
	}

	/**
	 * @return nocheck
	 */
	public Boolean getNocheck() {
		return nocheck;
	}

	/**
	 * @param nocheck
	 *            要设置的 nocheck
	 */
	public void setNocheck(Boolean nocheck) {
		this.nocheck = nocheck;
	}

	/**
	 * @return checked
	 */
	public Boolean getChecked() {
		return checked;
	}

	/**
	 * @param checked
	 *            要设置的 checked
	 */
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	/**
	 * @return isParent
	 */
	public Boolean getIsParent() {
		return isParent;
	}

	/**
	 * @param isParent
	 *            要设置的 isParent
	 */
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	/**
	 * @return halfCheck
	 */
	public Boolean getHalfCheck() {
		return halfCheck;
	}

	/**
	 * @param halfCheck
	 *            要设置的 halfCheck
	 */
	public void setHalfCheck(Boolean halfCheck) {
		this.halfCheck = halfCheck;
	}

	/**
	 * @return children
	 */
	public List<ZTree> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            要设置的 children
	 */
	public void setChildren(List<ZTree> children) {
		this.children = children;
	}

	/**
	 * @return isSelected
	 */
	public Integer getIsSelected() {
		return isSelected;
	}

	/**
	 * @param isSelected
	 *            要设置的 isSelected
	 */
	public void setIsSelected(Integer isSelected) {
		this.isSelected = isSelected;
	}

	/**
	 * @return isSeafed
	 */
	public Integer getIsSeafed() {
		return isSeafed;
	}

	/**
	 * @param isSeafed
	 *            要设置的 isSeafed
	 */
	public void setIsSeafed(Integer isSeafed) {
		this.isSeafed = isSeafed;
	}

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
