<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script item="text/javascript">
	var bbtn1 = true;
	var bbtn2 = true;
	// 按钮事件
	function initBtn() {
		$('#btn2').linkbutton({
			iconCls: 'icon-add',
			text: '全部展开',
		});
		$('#btn3').linkbutton({
			iconCls: 'icon-reload',
			text: '重新载入',
		});
		$('#btn5').linkbutton({
			iconCls: 'icon-add',
			disabled: true,
		});
		// 按钮2
		$("#btn2").click(function() {
			var zTree = $.fn.zTree.getZTreeObj("ttType");
			//alert(1);
			if(bbtn2) {
				bbtn2 = false;
				zTree.expandAll(true);
				//$("#ttType").tree("expandAll");
				$('#btn2').linkbutton({
					iconCls: 'icon-remove',
					text: '全部收起',
				});
			} else if(!bbtn2) {
				bbtn2 = true;
				zTree.expandAll(false);
				//$("#ttType").tree("collapseAll");
				$('#btn2').linkbutton({
					iconCls: 'icon-add',
					text: '全部展开',
				});
			}
		});
		// 按钮3
		$("#btn3").click(function() {
			// 获取全部选中的数组
			// $("#ttType").tree("reload");
			flashZTree();
		});

	}
	
	//到添加页面
	function toAdd(){
		//参数：窗口的title、宽、高、url地址
		createmodalwindowmax("添加商品信息", 1024, 650, '/product/item/toAdd.do?typeId=' + typeId);
	}

	var typeId;

	//定义setTimeout执行方法
	var TimeFn = null;
	// ztree 点击事件 去除 双击
	function onClick(event, treeId, treeNode, clickFlag) {
		// 用于解决双击时候会调用两次单击事件的问题
		if(treeNode.clickTimeout) {
			clearTimeout(treeNode.clickTimeout);
			treeNode.clickTimeout = null;
		} else {
			treeNode.clickTimeout = setTimeout(function() {
				zTreeOnClick(event, treeId, treeNode, clickFlag);
				treeNode.clickTimeout = null;
			}, 250);
		}
	}
	// 真正的点击事件点击
	function zTreeOnClick(event, treeId, treeNode, clickFlag) {
		typeId = treeNode.id;
		// queryType(treeNode.id);
		var name = getWZ(treeNode);
		$("#weizhi").text("当前位置: " + name);
		// 添加商品
		if(treeNode.isSelected == 1) {
			$("#btn5").linkbutton('enable');
			//添加商品
			$("#btn5").click(function() {
				//打开一个窗口，用户添加页面
				toAdd();
			});
		} else {
			$("#btn5").linkbutton('disable');
			//添加商品
			$("#btn5").unbind("click");
		}
	}

	function getWZ(treeNode) {
		var name = treeNode.name;
		if(0 != treeNode.pid) {
			var zTree = $.fn.zTree.getZTreeObj("ttType");
			nodes = zTree.getNodesByParam("id", treeNode.pid, null);
			treeNode = nodes[0];
			return getWZ(treeNode) + " > " + name;

		} else {
			return "系统根结点" + " > " + name;
		}
	}
	
	// 刷新
	function flashZTree() {
		//loadZTreeData();
		var treeObj = $.fn.zTree.getZTreeObj("ttType");
		treeObj.reAsyncChildNodes(null, "refresh");
	}

	// ztree 设置
	var setting = {
		showLine: true,
		async: {
			enable: true,
			url: "/product/type/getEnableTypeZTree.do",
			//autoParam:["id", "name=n", "level=lv"],
			//otherParam:{"otherParam":"zTreeAsyncTest"},
			//dataFilter: filter
		},
		// 		check: {
		// 			enable: true
		// 		},
		edit: {
			enable: true,
			showRemoveBtn: false, //设置是否显示删除按钮
			showRenameBtn: false, //设置是否显示编辑名称按钮。
		},
		callback: {
			//beforeClick : beforeClick,
			onClick: onClick,
		},

	};

	// 加载ztree
	function loadTypeZTree() {
		$.fn.zTree.init($("#ttType"), setting);
	}

	var tools = [{
		iconCls: 'icon-add',
		handler: function() {
			var zTree = $.fn.zTree.getZTreeObj("ttType");
			zTree.expandAll(true);
		}
	}, {
		iconCls: 'icon-remove',
		handler: function() {
			var zTree = $.fn.zTree.getZTreeObj("ttType");
			zTree.expandAll(false);
		}
	}, {
		iconCls: 'icon-reload',
		handler: function() {
			flashZTree();
		}
	}];

	$(function() {
		$('#cc').layout();
		// 初始化 树
		loadTypeZTree();
		// 初始按钮
		initBtn();
		// panel
		$("#nav4").panel({
			fit: true,
			border: false,
		});

		var he = $("#cr").height() - 58;
		// 初始 面板
		$("#nav2").panel({
			//fit:true,
			height: he,
			border: false,
		});
		var h2 = $("#cr").height() - 33;
		// 初始 面板
		$("#nav3").panel({
			fit: true,
			//height: h2,
			border: false,
		});
		$("#nav4").panel({
			onResize: function(w, h) {
				w = w - 1;
				h = h - 30;
				$("#nav2").panel("resize", {
					width: w,
					height: h,
				});
			},
		});
	});
</script>
</head>

<body id="cc" class="easyui-layout" fit="true">

<div id="cr" data-options="region:'west',title:'类型列表',split:true,tools:tools" style="width:500px;">
	<div id="nav4">
		<a id="btn2" href="#">全部收起</a>&nbsp;&nbsp;
		<a id="btn3" href="#">重新载入</a>
		<div id="nav2">
			<ul id="ttType" class="ztree"></ul>
		</div>
	</div>
</div>

<div id="cp" data-options="region:'center',title:'类型详细信息 '" style="padding:1px;background:#eee;">
	<div id="nav3">

		<div class="box-positon">
			<div id="weizhi" class="rpos">当前位置:</div>
			<div class="clear"></div>
		</div>

		<div id="nav5">
			阅读协议
		</div>

		<div id="nav6">
			<a id="btn5" href="#">同意协议并且添加商品</a>&nbsp;&nbsp;
		</div>
	</div>
</div>

</body>

</html>