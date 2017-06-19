<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script type="text/javascript">
	//删除
	function del(permissionId) {
		var url_v = '/system/permission/delete.do';
		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#deleteform").attr("action", url_v);
			$("#permissionId").val(permissionId);
			jquerySubByFId('deleteform', del_callback, null, "json");
		})
	};

	// 批量删除
	var delList = function() {
		var url_v = '/system/permission/deletes.do';
		$("#deleteform").attr("action", url_v);
		$("#permissionId").attr("name", "permissionIds");
		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#permissionlist').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].permissionId);
			}
			if(ids.length > 0) {
				$("#permissionId").val(ids.join(','));
				//alert($("#permissionId").val());
				jquerySubByFId('deleteform', del_callback, null, "json");
			} else {
				alert_warn("请选择要删除的项目");
			}
		});
	};
	// 删除回调
	function del_callback(data) {
		d_alert(data, method_ok);
	}
	// 删除 成功的回调函数
	function method_ok(data) {
		// 重新加载 数据表格
		reload();
	}

	//编辑
	function toEdit(permissionId) {
		createmodalwindow("编辑权限信息", 800, 500, '/system/permission/toEdit.do?permissionId=' + permissionId);
	}

	//到添加页面
	function toAdd() {
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("添加权限信息", 800, 500, '/system/permission/toAdd.do?moduleId=' + moduleId);
	}
	
	function isEnablePermissio(permissionId, isEnable){
		// 表单属性设置
		var url_v = '/system/permission/enablePermission.do';
		$("#enableform").attr("action", url_v);
		$("#enableId").attr("value", permissionId);
		$("#isEnable").attr("value", isEnable);
		// 提交表单
		jquerySubByFId('enableform', enablePermission_callback, null, "json");
	}
	// enable回调
	function enablePermission_callback(data) {
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
			field: 'permissionId',
			title: '',
			checkbox: true
		}, {
			field: 'permissionName', //对应jason中的key
			title: '权限名称',
			width: 130,
		}, {
			field: 'permissionCode', //对应jason中的key
			title: '权限代码',
			width: 150,
		}, {
			field: 'permissionMethod', //对应jason中的key
			title: '权限方法',
			width: 150,
		}, {
			field: 'permissionDescription', //对应jason中的key
			title: '权限描述',
			width: 150
		}, {
			field: 'permissionIcon', //对应jason中的key
			title: '权限图标',
			width: 80
		}, {
			field: 'parentModuleName', //对应jason中的key
			title: '所属父权限',
			width: 100
		}, {
			field: 'isEnableName', //对应jason中的key
			title: '是否<br/>可用',
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
					return "<a href=javascript:isEnablePermissio('" + row.permissionId + "','0') >启用</a>";
				}else {
					return "<a href=javascript:isEnablePermissio('" + row.permissionId + "','0') >禁用</a>";
				}
			},
		}, {
			field: 'opt1', //对应jason中的key
			title: '编辑',
			align: 'center',
			width: 40,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				return "<a href=javascript:toEdit('" + row.permissionId + "') >编辑</a>";
			},
		}, {
			field: 'opt2', //对应jason中的key
			title: '删除',
			align: 'center',
			width: 40,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				return "<a href=javascript:del('" + row.permissionId + "') >删除</a>";
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

	function queryParameter(id) {
		if(id == null) {
			id = moduleId;
		}
		var url_v = '/system/permission/list.do?sysPermissionCustom.parentModuleId=' + id;
		$('#permissionlist').datagrid({
			//title : '权限配置',//数据列表标题
			iconCls: 'icon-search', //显示图标
			// width : 600,//数据列表的宽度
			// height : 350,//列表的高度
			height: 'auto',
			fitColumns: true,
			collapsible: false, //是否可折叠的 
			nowrap: true, //单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped: true, //条纹显示效果
			ctrlSelect: true,
			loadMsg: '',
			// collapsible : true,//是否可以折叠
			url: url_v, //加载数据的连接，引连接请求过来是json数据

			//sortName: 'code',//排序字段名称
			//sortOrder: 'desc',//排序的顺序
			//remoteSort: false,//是否远程排序，如果要使用排序建议使用远程排序，对数据库中所有数据进行排序，通过远程排序datagrid将sortName和sortOrder传到后台，这时后台的代码调用service及dao进行数据库排序

			idField: 'permissionId', //此字段很重要，数据结果集的唯一约束(重要)，如果写错影响获取当前选中航的方法执行

			// 	frozenColumns:[[//冻结列
			//		{field:'ck',checkbox:true},
			//		{title:'code',field:'code',width:80,sortable:true}
			// 	]],

			columns: columns_v, //datagrid定义
			rownumbers: true, //是否显示行号
			toolbar: toolbar_v, //工具栏
			pagination: true, //是否显示分页
			pageSize: 15,
			pageList: [5, 15, 30, 50], //分页
		});

		$('#permissionlist').datagrid('unselectAll'); //取消所有datagrid中的选择
	}

	// 重新载入当前页
	function reload() {
		//datagrid的方法要求传json数据，最终将json转成key,value传入action
		// 我们使用封装的js方法，将form表单中的数据提取出来防撞成方法
		//var formdata1 = $("#permissionqueryform").serializeJson();
		//alert(JSON.stringify(formdata1))
		$('#permissionlist').datagrid('unselectAll');
		$('#permissionlist').datagrid('reload');
	}

	// 按钮事件=========================================================================
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
	
	// 页面加载事件=========================================================================
	var moduleId;
	
	// 树 点击事件
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
	// 树 点击事件
	function zTreeOnClick(event, treeId, treeNode, clickFlag) {
		moduleId = treeNode.id;
		queryParameter(treeNode.id);
	}
	
	// 树 刷新事件
	function flashZTree() {
		//loadZTreeData();
		var treeObj = $.fn.zTree.getZTreeObj("ttModule");
		treeObj.reAsyncChildNodes(null, "refresh");
	}
	
	// 树 设置
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
			onClick: onClick,
		},

	};
	
	// 初始化树
	function loadModuleZTree() {
		$.fn.zTree.init($("#ttModule"), setting);
	}
	// 页面加载事件=========================================================================
		
	$(function() {
		$("#nav4").panel({
			fit: true,
			border: false,
		});
		// 数据表格
		loadModuleZTree();
		// 初始按钮
		initBtn();
		
		var h = $("#cr").height() - 58;
		// 初始 面板
		$("#nav2").panel({
			//fit:true,
			height: h,
			border: false,
			//border:false,
		});
		// 初始  大小改变
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

<div id="cr" data-options="region:'west',title:'模块列表',split:true" style="width: 240px;">
	<div id="nav4">
		<a id="btn2" href="#">全部收起</a>&nbsp;&nbsp;
		<a id="btn3" href="#">重新载入</a>
		<div id="nav2">
			<ul id="ttModule" class="ztree"></ul>
		</div>
	</div>
</div>

<div id="cp" data-options="region:'center',title:'权限信息 '" style="padding: 1px; background: #eee;">
	<!-- 查询列表 -->
	<table border=0 cellspacing=0 cellpadding=0 width="100%" id="permissionlist" fit="true"></table>
</div>

<!-- 删除from -->
<form id="deleteform" method="post">
	<input type="hidden" id="permissionId" name="permissionId" />
</form>
<!-- Enable from -->
<form id="enableform" method="post">
	<input type="hidden" id="enableId" name="permissionId" />
	<input type="hidden" id="isEnable" name="isEnable" />
</form>

</body>

</html>