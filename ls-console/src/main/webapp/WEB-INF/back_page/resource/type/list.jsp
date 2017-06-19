<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script type="text/javascript">
	//删除
	function del(typeId) {
		var url_v = '/resource/type/delete.do';

		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#deleteform").attr("action", url_v);
			$("#typeId").val(typeId);
			remove(typeId);
			jquerySubByFId('deleteform', del_callback, null, "json");
		})
	};

	// 批量删除
	var delList = function() {
		var url_v = '/resource/type/deletes.do';
		$("#deleteform").attr("action", url_v);
		$("#typeId").attr("name", "typeIds");

		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#typelist').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].typeId);
			}
			if(ids.length > 0) {
				$("#typeId").val(ids.join(','));
				//alert($("#typeId").val());
				jquerySubByFId('deleteform', del_callback, null, "json");
				// 删除
				for(var i = 0; i < ids.length; i++) {
					remove(ids[i]);
				}
			} else {
				alert_warn("请选择要删除的项目");
			}
		});
	};

	// 删除回调
	function del_callback(data) {
		var result = getCallbackData(data);
		_alert(result);
		reload();
	}

	//编辑
	function toEdit(typeId) {
		typeId = typeId;
		createmodalwindow("编辑类型信息", 800, 500, '/resource/type/toEdit.do?typeId=' + typeId);
	}

	//到添加页面
	function toAdd() {
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("添加类型信息", 800, 500, '/resource/type/toAdd.do?typeId=' + typeId);
	}

	//datagrid定义
	var columns_v = [
		[{
			field: 'typeId',
			title: '',
			checkbox: true
		}, {
			field: 'typeName', //对应jason中的key
			title: '类型名称',
			width: 150,
		}, {
			field: 'typeDescription', //对应jason中的key
			title: '类型描述',
			width: 150
		}, {
			field: 'typeRemark', //对应jason中的key
			title: '类型备注',
			width: 150
		}, {
			field: 'pinyinCode', //对应jason中的key
			title: '拼音码',
			width: 80
		}, {
			field: 'parentName', //对应jason中的key
			title: '所属父类型',
			width: 150
		}, {
			field: 'typeIcon', //对应jason中的key
			title: '类型图标',
			align: 'center',
			width: 80
		}, {
			field: 'showorder', //对应jason中的key
			title: '显示<br/>排序',
			align: 'center',
			width: 80
		}, {
			field: 'isSeafName', //对应jason中的key
			title: '目录/叶子',
			align: 'center',
			width: 80
		}, {
			field: 'isDisplayName', //对应jason中的key
			title: '是否<br/>可用',
			align: 'center',
			width: 40
		}, {
			field: 'opt1', //对应jason中的key
			title: '编辑',
			align: 'center',
			width: 40,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				parentId = row.parentId;
				return "<a href =javascript:toEdit('" + row.typeId + "') >编辑</a>";
			},
		}, {
			field: 'opt2', //对应jason中的key
			title: '删除',
			align: 'center',
			width: 40,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				parentId = row.parentId;
				return "<a href =javascript:del('" + row.typeId + "') >删除</a>";
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

	function queryType(id) {
		if(id == null) {
			id = typeId;
		}
		var url_v = '/resource/type/list.do?ebTypeCustom.parentId=' + id;

		$('#typelist').datagrid({
			//title : '类型配置',//数据列表标题
			iconCls: 'icon-search', //显示图标
			// width : 600,//数据列表的宽度
			// height : 350,//列表的高度
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

			idField: 'typeId', //此字段很重要，数据结果集的唯一约束(重要)，如果写错影响获取当前选中航的方法执行

			// 	frozenColumns:[[//冻结列
			//		{field:'ck',checkbox:true},
			//		{title:'code',field:'code',width:80,sortable:true}
			// 	]],

			columns: columns_v, //datagrid定义
			pagination: true, //是否显示分页
			rownumbers: true, //是否显示行号
			toolbar: toolbar_v, //工具栏
			pageSize: 15,
			pageList: [5, 15, 30, 50], //分页
		});
		$('#typelist').datagrid('unselectAll'); //取消所有datagrid中的选择
	}

	// 重新载入当前页
	function reload() {
		$('#typelist').datagrid('unselectAll');
		$('#typelist').datagrid('reload');
	}

	// =======================================================================================

	// ztree 设置
	var setting = {
		
		showLine: true,//设置 zTree 是否显示节点之间的连线。
		
		async: { //异步加载
			enable: true,
			url: "/resource/type/getTypeZTree.do",
			//autoParam:["id", "name=n", "level=lv"],
			//otherParam:{"otherParam":"zTreeAsyncTest"},
			//dataFilter: filter
		},
		check: {
			enable: true
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
	// 加载ztree
	function loadTypeZTree() {
		$.fn.zTree.init($("#ttType"), setting);
	}

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
	// 点击
	function zTreeOnClick(event, treeId, treeNode, clickFlag) {
		typeId = treeNode.id;
		queryType(treeNode.id);
	}

	var typeId;
	var new_node;

	function setTypeId(typeId) {
		//this.typeId = typeId;
		$.ajax({
			url: '/resource/type/getTypeJSONByTypeId.do',
			dataType: 'json',
			type: 'post',
			async: false,
			data: {
				typeId: typeId,
			},
			success: function(data) {
				new_node = data;
			},
			error: function() {
				alert("系统错误");
			}
		});
	}
	// 增加
	function add() {
		var zTree = $.fn.zTree.getZTreeObj("ttType");
		//isParent = eee.data.isParent,
		nodes = zTree.getSelectedNodes();
		treeNode = nodes[0];
		if(treeNode) {
			treeNode = zTree.addNodes(treeNode, new_node);
		} else {
			nodes = zTree.getNodesByParam("id", typeId, null);
			treeNode = nodes[0];
			treeNode = zTree.addNodes(treeNode, new_node);
		}
	}
	// 编辑
	function edit(typeId) {
		var zTree = $.fn.zTree.getZTreeObj("ttType");
		nodes = zTree.getNodesByParam("id", typeId, null);
		treeNode = nodes[0];
		if(nodes.length == 0) {
			alert("请先选择一个节点");
			return;
		}
		treeNode.name = new_node.name;
		zTree.updateNode(treeNode);
		//alert(newname);
	}
	// 删除
	function remove(typeId) {
		var zTree = $.fn.zTree.getZTreeObj("ttType");
		// nodes = zTree.getSelectedNodes(),
		nodes = zTree.getNodesByParam("id", typeId, null);
		treeNode = nodes[0];
		if(nodes.length == 0) {
			alert("请先选择一个节点");
			return;
		}
		//var callbackFlag = $("#callbackTrigger").attr("checked");
		zTree.removeNode(treeNode);
	};

	function flashZTree() {
		//loadZTreeData();
		var treeObj = $.fn.zTree.getZTreeObj("ttType");
		treeObj.reAsyncChildNodes(null, "refresh");
	}

	// ===================================================================================

	var bbtn1 = true;
	var bbtn2 = true;

	// 俺就事件
	function initBtn() {
		$('#btn2').linkbutton({
			iconCls: 'icon-add',
			text: '全部展开',
		});
		$('#btn3').linkbutton({
			iconCls: 'icon-reload',
			text: '重新载入',
		});
		$('#btn4').linkbutton({
			iconCls: 'icon-save',
			text: 'Enable',
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

		// 按钮4
		$("#btn4").click(function() {
			var zTree = $.fn.zTree.getZTreeObj("ttType");
			var check = zTree.getCheckedNodes();
			var typeIds = []; //提交记录的序号
			alert(check.length);
			// 遍历
			for(var i = 0; i < check.length; i++) {
				var node = check[i];
				//alert(node.id+"_"+node.attributes.pid);
				typeIds.push(node.id); // 自己的id 
			}
			// 判断
			if(typeIds.length > 0) {
				$("#typeIds").val(typeIds.join(',')); // 转json
				// 提交表单
				jquerySubByFId('updateTypeEnableForm', dist_callback, null);
			} else {
				alert_warn("没有被选中的");
			}

		});
	}

	// enable 表单回调
	function dist_callback(data) {
		var result = getCallbackData(data);
		_alert(result);
		//parent.reload();
		//yycgdmxquery();//提交完成刷新本页面
	}

	// ==================================================================================================
	
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
	
	// ==============================================================

	// 初始化树
	$(function() {
		//$('#cc').layout();

		loadTypeZTree();
		initBtn(); // 初始按钮
		$("#nav4").panel({
			fit: true,
			border: false,
		});
		var he = $("#cr").height() - 58;
		// 初始 面板
		$("#nav2").panel({
			//fit:true,
			height: he,
			border:false,
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

<div id="cr" data-options="region:'west',title:'类型列表',split:true,tools:tools" style="width: 300px;">
	<div id="nav4">
		<a id="btn2" href="#">全部收起</a>&nbsp;&nbsp;
		<a id="btn3" href="#">重新载入</a>&nbsp;&nbsp;
		<a id="btn4" href="#">Enable</a>
		<div id="nav2">
			<ul id="ttType" class="ztree"></ul>
		</div>
	</div>
</div>

<div id="cp" data-options="region:'center',title:'类型详细信息 '" style="padding: 1px; background: #eee;">

	<form id="typequeryform">
		<input type="hidden" id="mid" name="id" /> <input type="hidden" id="pid" name="pid" />
	</form>

	<!-- 查询列表 -->
	<table id="typelist" border=0 cellspacing=0 cellpadding=0 width="100%" fit="true"></table>

</div>

<!-- 删除from -->
<form id="deleteform" method="post">
	<input type="hidden" id="typeId" name="typeId" />
</form>

<form id="updateTypeEnableForm" action="/resource/type/updateTypeEnable.do" method="post">
	<input type="hidden" id="typeIds" name="typeIds" />
</form>

</body>

</html>