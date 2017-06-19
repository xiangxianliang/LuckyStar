<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script type="text/javascript">
	//删除
	function del(moduleId) {
		_confirm('您确定要执行删除操作吗?', null, function() {
			// from 表单设置
			var url_v = '/system/module/delete.do';
			$("#deleteform").attr("action", url_v);
			$("#moduleId").attr("name", "moduleId");
			$("#moduleId").val(moduleId);
			// 提交表单
			jquerySubByFId('deleteform', delModule_callback, null, "json");
		})
	};
	// 删除回调
	function delModule_callback(data) {
		d_alert(data, method_ok_module);
	}
	// 删除 成功的回调函数
	function method_ok_module(data) {
		// 重新加载 数据表格
		reload();
		// 将列表树种的数据删除
		var typeId = data.resultInfo.sysdata['moduleId'];
		remove(moduleId);
	}

	// 批量删除
	var delList = function() {
		// 提示框
		_confirm('您确定要执行删除操作吗?', null, function() {
			// from 表单设置
			var url_v = '/system/module/deletes.do';
			$("#deleteform").attr("action", url_v);
			$("#moduleId").attr("name", "moduleIds");

			var ids = [];
			var rows = $('#modulelist').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].moduleId);
			}
			if(ids.length > 0) {
				$("#moduleId").val(ids.join(','));
				//alert($("#moduleId").val());
				// 提交表单
				jquerySubByFId('deleteform', delsModule_callback, null, "json");
			} else {
				alert_warn("请选择要删除的项目");
			}
		});
	};
	// 删除回调
	function delsModule_callback(data) {
		d_alert(data, method_oks_module);
	}
	// 删除 成功的回调函数
	function method_oks_module(data) {
		// 重新加载 数据表格
		reload();
		// 将列表树种的数据删除
		var moduleIds = data.resultInfo.sysdata['moduleIds'];
		for(var i = 0; i < moduleIds.length; i++) {
			remove(moduleIds[i]);
		}
	}

	//编辑
	function toEdit(moduleId) {
		createmodalwindow("编辑模块信息", 800, 500, '/system/module/toEdit.do?moduleId=' + moduleId);
	}

	//到添加页面
	function toAdd() {
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("添加模块信息", 800, 500, '/system/module/toAdd.do?moduleId=' + parentId);
	}

	function isEnableModule(moduleId, isEnable) {
		// 表单属性设置
		var url_v = '/system/module/enableModule.do';
		$("#enableform").attr("action", url_v);
		$("#enableId").attr("value", moduleId);
		$("#isEnable").attr("value", isEnable);
		// 提交表单
		jquerySubByFId('enableform', enableModule_callback, null, "json");
	}

	// enable回调
	function enableModule_callback(data) {
		d_alert(data, method_ok_enable);
	}
	// enable 成功的回调函数
	function method_ok_enable(data) {
		// 重新加载 数据表格
		reload();
	}

	//datagrid定义
	var columns_v = [
		[{
			field: 'moduleId',
			title: '',
			checkbox: true
		}, {
			field: 'moduleName', //对应jason中的key
			title: '模块名称',
			width: 130,
		}, {
			field: 'moduleDescription', //对应jason中的key
			title: '模块描述',
			width: 150
		}, {
			field: 'moduleUrl', //对应jason中的key
			title: '模块URL',
			width: 180
		}, {
			field: 'moduleIcon', //对应jason中的key
			title: '模块图标',
			width: 80
		}, {
			field: 'isSeafName', //对应jason中的key
			title: '目录/叶子',
			width: 60
		}, {
			field: 'parentName', //对应jason中的key
			title: '所属父模块',
			align: 'center',
			width: 100
		}, {
			field: 'showorder', //对应jason中的key
			title: '显示<br/>排序',
			align: 'center',
			width: 40
		}, {
			field: 'isEnableName', //对应jason中的key
			title: '是否<br/>启用',
			align: 'center',
			width: 40
		}, {
			field: 'opt3', //对应jason中的key
			title: '禁用<br/>启用',
			align: 'center',
			width: 40,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				if(row.isEnable == 0) {
					return "<a href =javascript:isEnableModule('" + row.moduleId + "','1') >启用</a>";
				} else {
					return "<a href =javascript:isEnableModule('" + row.moduleId + "','0') >禁用</a>";
				}
			},
		}, {
			field: 'opt1', //对应jason中的key
			title: '编辑',
			align: 'center',
			width: 40,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				parentId = row.parentId;
				return "<a href =javascript:toEdit('" + row.moduleId + "') >编辑</a>";
			},
		}, {
			field: 'opt2', //对应jason中的key
			title: '删除',
			align: 'center',
			width: 40,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				parentId = row.parentId;
				return "<a href =javascript:del('" + row.moduleId + "') >删除</a>";
			},
		}, ]
	];

	//定义datagrid的工具栏
	var toolbar_v = [{ //工具栏
		id: 'btnadd',
		text: '添加',
		iconCls: 'icon-add',
		handler: function() {
			//alert('add');
			//打开一个窗口，用户添加页面
			toAdd();
		}
	}, {
		id: 'btndel',
		text: '批量删除',
		iconCls: 'icon-cancel',
		handler: function() {
			delList();
		}
	}];

	var parentId = 0;

	function queryModule(id) {
		if(id == null) {
			id = parentId;
		}
		var url_v = '/system/module/list.do?sysModuleCustom.parentId=' + id;
		$('#modulelist').datagrid({
			//title : '模块配置',//数据列表标题
			iconCls: 'icon-search', //显示图标
			// width : 600,//数据列表的宽度
			// height : 250,//列表的高度
			//height : 'auto',
			collapsible: false, //是否可折叠的 
			nowrap: true, //单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped: true, //条纹显示效果
			loadMsg: '',
			fitColumns: true,
			ctrlSelect: true,
			// collapsible : true,//是否可以折叠
			url: url_v, //加载数据的连接，引连接请求过来是json数据

			//sortName: 'code',//排序字段名称
			//sortOrder: 'desc',//排序的顺序
			//remoteSort: false,//是否远程排序，如果要使用排序建议使用远程排序，对数据库中所有数据进行排序，通过远程排序datagrid将sortName和sortOrder传到后台，这时后台的代码调用service及dao进行数据库排序

			idField: 'moduleId', //此字段很重要，数据结果集的唯一约束(重要)，如果写错影响获取当前选中航的方法执行

			// 	frozenColumns:[[//冻结列
			//		{field:'ck',checkbox:true},
			//		{title:'code',field:'code',width:80,sortable:true}
			// 	]],

			columns: columns_v, //datagrid定义
			toolbar: toolbar_v, //工具栏
			rownumbers: true, //是否显示行号
			pagination: true, //是否显示分页
			pageSize: 15,
			pageList: [5, 15, 30, 50], //分页
		});
		$('#modulelist').datagrid('unselectAll'); //取消所有datagrid中的选择
	}

	// 重新载入当前页
	function reload() {
		$('#modulelist').datagrid('unselectAll');
		$('#modulelist').datagrid('reload');
	}

	// 按钮 =========================================================================
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
		// 按钮2
		$("#btn2").click(function() {
			var zTree = $.fn.zTree.getZTreeObj("ttModule");
			//alert(1);
			if(bbtn2) {
				// $("#ttModule").tree("expandAll");
				zTree.expandAll(true);
				bbtn2 = false;
				$('#btn2').linkbutton({
					iconCls: 'icon-remove',
					text: '全部收起',
				});
			} else if(!bbtn2) {
				// $("#ttModule").tree("collapseAll");
				zTree.expandAll(false);
				bbtn2 = true;
				$('#btn2').linkbutton({
					iconCls: 'icon-add',
					text: '全部展开',
				});
			}
		});
		// 按钮3
		$("#btn3").click(function() {
			// 获取全部选中的数组
			//$("#ttModule").tree("reload");
			flashZTree();
		});
	}
	// 工具栏 =========================================================================
	var tools = [{
		iconCls: 'icon-add',
		handler: function() {
			var zTree = $.fn.zTree.getZTreeObj("ttModule");
			zTree.expandAll(true);
		}
	}, {
		iconCls: 'icon-remove',
		handler: function() {
			var zTree = $.fn.zTree.getZTreeObj("ttModule");
			zTree.expandAll(false);
		}
	}, {
		iconCls: 'icon-reload',
		handler: function() {
			flashZTree();
		}
	}];

	// Ztree =========================================================================
	// Ztree 设置
	var setting = {
		showLine: true,
		async: {
			enable: true,
			url: "/system/module/getModuleZTree.do",
			//autoParam:["id", "name=n", "level=lv"],
			//otherParam:{"otherParam":"zTreeAsyncTest"},
			//dataFilter: filter
		},
		edit: {
			enable: true,
			showRemoveBtn: false, //设置是否显示删除按钮
			showRenameBtn: false, //设置是否显示编辑名称按钮。
		},
		callback: {
			//beforeClick : beforeClick,
			onClick: onClick, // 单击事件
		},
	};

	//定义setTimeout执行方法
	var TimeFn = null;
	// zTree单击事件
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
	// zTree 真正的点击事件
	function zTreeOnClick(event, treeId, treeNode, clickFlag) {
		parentId = treeNode.id;
		queryModule(treeNode.id);
	}

	// 初始化 ztree
	function loadModuleZTree() {
		$.fn.zTree.init($("#ttModule"), setting);
	}

	var moduleId;

	function getModuleJSONByModuleId(moduleId) {
		var new_node;
		//this.moduleId = moduleId;
		$.ajax({
			url: '/system/module/getModuleJSONByModuleId.do',
			dataType: 'json',
			type: 'post',
			async: false,
			data: {
				moduleId: moduleId,
			},
			success: function(data) {
				new_node = data;
			},
			error: function() {
				alert("系统错误");
			}
		});

		return new_node
	}

	function add(moduleId) {
		// 加载 数据
		var new_node = getModuleJSONByModuleId(moduleId);
		// ztree 编辑
		var zTree = $.fn.zTree.getZTreeObj("ttModule");
		//isParent = eee.data.isParent,
		nodes = zTree.getSelectedNodes();
		treeNode = nodes[0];
		if(treeNode) {
			treeNode = zTree.addNodes(treeNode, new_node);
		}
	}

	// 编辑
	function edit(moduleId) {
		// 加载 数据
		var new_node = getModuleJSONByModuleId(moduleId);
		// Ztree 编辑
		var zTree = $.fn.zTree.getZTreeObj("ttModule");
		nodes = zTree.getNodesByParam("id", moduleId, null);
		treeNode = nodes[0];
		if(nodes.length == 0) {
			alert("请先选择一个节点");
			return;
		}
		treeNode.name = new_node.name;
		zTree.updateNode(treeNode);
		//alert(newname);
	}

	// ztree 编辑
	function remove(moduleId) {
		var zTree = $.fn.zTree.getZTreeObj("ttModule");
		// nodes = zTree.getSelectedNodes(),
		nodes = zTree.getNodesByParam("id", moduleId, null);
		treeNode = nodes[0];
		if(nodes.length == 0) {
			alert("请先选择一个节点");
			return;
		}
		//var callbackFlag = $("#callbackTrigger").attr("checked");
		zTree.removeNode(treeNode);
	};

	// 刷新 Ztree
	function flashZTree() {
		//loadZTreeData();
		var treeObj = $.fn.zTree.getZTreeObj("ttModule");
		treeObj.reAsyncChildNodes(null, "refresh");
	}

	// 页面加载事件=========================================================================
	$(function() {
		//$('#cc').layout();
		
		$("#nav4").panel({
			fit: true,
			border: false,
		});

		// 初始化 树
		// loadModuleTree();
		loadModuleZTree();
		// 初始按钮
		initBtn();


		var h = $("#cr").height() - 58;
		// 初始 面板
		$("#nav2").panel({
			//fit : true,
			//doSize :true,
			height: h,
			border: false,
			//border:false,
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

<div id="cr" data-options="region:'west',title:'模块列表',split:true,tools:tools" style="width: 240px;">

	<div id="nav4">
		<a id="btn2" href="#">全部收起</a>&nbsp;&nbsp;
		<a id="btn3" href="#">重新载入</a>
		<div id="nav2">
			<ul id="ttModule" class="ztree"></ul>
		</div>
	</div>
</div>

<div id="cp" data-options="region:'center',title:'模块详细信息 '" style="padding: 0px; background: #eee;">

	<form id="modulequeryform">
		<input type="hidden" id="mid" name="id" /> <input type="hidden" id="pid" name="pid" />
	</form>

	<table border=0 cellspacing=0 cellpadding=0 width="100%" id="modulelist" fit="true"></table>

</div>

<!-- 删除from -->
<form id="deleteform" method="post">
	<input type="hidden" id="moduleId" name="moduleId" />
</form>
<!-- Enable from -->
<form id="enableform" method="post">
	<input type="hidden" id="enableId" name="moduleId" />
	<input type="hidden" id="isEnable" name="isEnable" />
</form>

</body>

</html>