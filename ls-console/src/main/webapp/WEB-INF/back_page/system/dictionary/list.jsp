<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script type="text/javascript">
	//全选
	function checkBox(name, checked) {
		//全选开始
		$("input[name='" + name + "']").attr("checked", checked);
	}

	//删除
	function delType(typeId) {
		var url_v = '/system/dictionary/deleteType.do';

		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#deleteform").attr("action", url_v);
			$("#delId").attr("name", "typeId");
			$("#delId").val(typeId);

			jquerySubByFId('deleteform', delType_callback, null, "json");
		});
	};
	// 删除回调
	function delType_callback(data) {
		d_alert(data, method_ok);
	}
	// 删除 成功的回调函数
	function method_ok(data) {
		// 重新加载 数据表格
		reload();
		// 将列表树种的数据删除
		var typeId = data.resultInfo.sysdata['typeId'];
		remove(typeId);
	}

	// 批量删除
	var delTypeList = function() {
		var url_v = '/system/dictionary/deletesType.do';
		$("#deleteform").attr("action", url_v);
		$("#delId").attr("name", "typeIds");

		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#dictionarylist').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].typeId);
			}
			if(ids.length > 0) {
				$("#delId").val(ids.join(','));
				//alert($("#delId").val());
				jquerySubByFId('deleteform', delsType_callback, null, "json");
			} else {
				alert_warn("请选择要删除的项目");
			}
		});
	};
	// 删除回调
	function delsType_callback(data) {
		d_alert(data, method_oks);
	}
	// 删除 成功的回调函数
	function method_oks(data) {
		// 重新加载 数据表格
		reload();
		// 将列表树种的数据删除
		var typeIds = data.resultInfo.sysdata['typeIds'];
		for(var i = 0; i < typeIds.length; i++) {
			remove(typeIds[i]);
		}
	}

	//删除
	function delInfo(infoId) {
		var url_v = '/system/dictionary/deleteInfo.do';
		$("#delId").attr("name", "infoId");
		$("#delId").val(infoId);

		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#deleteform").attr("action", url_v);
			jquerySubByFId('deleteform', delInfo_callbackInfo, null, "json");
		})
	};

	// 批量删除
	var delInfoList = function() {
		var url_v = '/system/dictionary/deletesInfo.do';
		$("#deleteform").attr("action", url_v);
		$("#delId").attr("name", "infoIds");

		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#dictionarylist').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].infoId);
			}
			if(ids.length > 0) {
				$("#delId").val(ids.join(','));
				//alert($("#delId").val());
				jquerySubByFId('deleteform', delInfo_callback, null, "json");
			} else {
				alert_warn("请选择要删除的项目");
			}
		});
	};

	// 删除回调
	function delInfo_callback(data) {
		d_alert(data, method_ok_info);
	}
	// 删除 成功的回调函数
	function method_ok_info(data) {
		// 重新加载 数据表格
		reload();
	}

	//编辑
	function toEditType(id) {
		createmodalwindow("编辑字典信息", 800, 500, '/system/dictionary/toEditType.do?typeId=' + id);
	}

	//编辑
	function toEditInfo(id) {
		createmodalwindow("编辑字典信息", 800, 500, '/system/dictionary/toEditInfo.do?infoId=' + id);
	}

	//到添加页面
	function toAdd() {
		if(typeId == null || typeId == 0) {
			//参数：窗口的title、宽、高、url地址
			createmodalwindow("添加字典信息", 800, 500, '/system/dictionary/toAddType.do');
		} else {
			createmodalwindow("添加字典信息", 800, 500, '/system/dictionary/toAddInfo.do?typeId=' + typeId);
		}
	}
	
	// 启用字典项
	function isEnableType(typeId, isEnable) {
		var url_v = '/system/dictionary/enableType.do';
		$("#enableform").attr("action", url_v);
		$("#enableId").attr("name", "typeId");
		$("#enableId").attr("value", typeId);
		$("#isEnable").attr("value", isEnable);

		jquerySubByFId('enableform', enableType_callback, null, "json");
	}
	
	// 启用 字典内容
	function isEnableInfo(infoId, isEnable) {
		var url_v = '/system/dictionary/enableInfo.do';
		$("#enableform").attr("action", url_v);
		$("#enableId").attr("name", "infoId");
		$("#enableId").attr("value", infoId);
		$("#isEnable").attr("value", isEnable);

		jquerySubByFId('enableform', enableType_callback, null, "json");
	}

	// enable回调
	function enableType_callback(data) {
		d_alert(data, method_ok_enable);
	}
	// 删除 成功的回调函数
	function method_ok_enable(data) {
		// 重新加载 数据表格
		reload();
	}

	//datagrid定义
	var columns_v1 = [
		[{
				field: 'typeId',
				title: '',
				checkbox: true
			},
			{
				field: 'typeName', //对应jason中的key
				title: '字典名称',
				width: 150,
			},
			{
				field: 'typeDescription', //对应jason中的key
				title: '字典描述',
				width: 200
			},
			{
				field: 'typeRemark', //对应jason中的key
				title: '字典备注',
				width: 200
			},
			{
				field: 'showorder', //对应jason中的key
				title: '显示排序',
				align: 'center',
				width: 80
			},
			{
				field: 'isEnableName', //对应jason中的key
				title: '是否可用',
				align: 'center',
				width: 80
			},
			{
				field: 'opt3', //对应jason中的key
				title: '启用禁用',
				width: 60,
				align: 'center',
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					if(row.isEnable == 0) {
						return "<a href=javascript:isEnableType('" + row.typeId + "','1') >启用</a>";
					} else {
						return "<a href=javascript:isEnableType('" + row.typeId + "','0') >禁用</a>";
					}
				},
			},
			{
				field: 'opt1', //对应jason中的key
				title: '编辑',
				width: 60,
				align: 'center',
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					return "<a href=javascript:toEditType('" + row.typeId + "') >编辑</a>";
				},
			},
			{
				field: 'opt2', //对应jason中的key
				title: '删除',
				width: 60,
				align: 'center',
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					return "<a href=javascript:delType('" + row.typeId + "') >删除</a>";
				},
			},
		]
	];

	//datagrid定义
	var columns_v2 = [
		[{
				field: 'infoId',
				title: '',
				checkbox: true
			},
			{
				field: 'infoDescription', //对应jason中的key
				title: '描述',
				width: 180
			},
			{
				field: 'infoRemark', //对应jason中的key
				title: '备注',
				width: 180
			},
			{
				field: 'infoValue', //对应jason中的key
				title: '字典值',
				width: 150
			},
			{
				field: 'valueTypeName', //对应jason中的key
				title: '值类型',
				width: 80
			},
			{
				field: 'showorder', //对应jason中的key
				title: '显示排序',
				align: 'center',
				width: 80
			},
			{
				field: 'isEnableName', //对应jason中的key
				title: '是否可用',
				align: 'center',
				width: 80
			},
			{
				field: 'opt3', //对应jason中的key
				title: '启用禁用',
				width: 60,
				align: 'center',
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					if(row.isEnable == 0) {
						return "<a href =javascript:isEnableInfo('" + row.infoId + "','1') >启用</a>";
					} else {
						return "<a href =javascript:isEnableInfo('" + row.infoId + "','0') >禁用</a>";
					}
				},
			},
			{
				field: 'opt1', //对应jason中的key
				title: '编辑',
				width: 60,
				align: 'center',
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					//parentId = row.parentId;
					return "<a href =javascript:toEditInfo('" + row.infoId + "') >编辑</a>";
				},
			},
			{
				field: 'opt2', //对应jason中的key
				title: '删除',
				width: 60,
				align: 'center',
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					//parentId = row.parentId;
					return "<a href =javascript:delInfo('" + row.infoId + "') >删除</a>";
				},
			},
		]
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
			if(typeId == null || typeId == 0) {
				delTypeList();
			} else {
				delInfoList();
			}
		}
	}];

	function queryDictionary(id,isSeafed) {
		// alert(id);
		var columns_v;
		var url_v;
		var idField;
		if(isSeafed == 0) {
			url_v = '/system/dictionary/listType.do?sysDictTypeCustom.parentId=' + id;
			columns_v = columns_v1;
			idField = 'typeId';
			
		} else {
			url_v = '/system/dictionary/listInfo.do?sysDictInfoCustom.typeId=' + id;
			columns_v = columns_v2
			idField = 'infoId';
		}

		$('#dictionarylist').datagrid({
			//title : '字典配置',//数据列表标题
			iconCls: 'icon-search', //显示图标
			// width : 600,//数据列表的宽度
			// height : 350,//列表的高度
			height: 'auto',
			collapsible: false, //是否可折叠的 
			nowrap: true, //单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped: true, //条纹显示效果
			fitColumns: true,
			ctrlSelect: true,
			loadMsg: '',
			// collapsible : true,//是否可以折叠
			url: url_v, //加载数据的连接，引连接请求过来是json数据

			//sortName: 'code',//排序字段名称
			//sortOrder: 'desc',//排序的顺序
			//remoteSort: false,//是否远程排序，如果要使用排序建议使用远程排序，对数据库中所有数据进行排序，通过远程排序datagrid将sortName和sortOrder传到后台，这时后台的代码调用service及dao进行数据库排序

			idField: idField, //此字段很重要，数据结果集的唯一约束(重要)，如果写错影响获取当前选中航的方法执行

			// 	frozenColumns:[[//冻结列
			//		{field:'ck',checkbox:true},
			//		{title:'code',field:'code',width:80,sortable:true}
			// 	]],

			columns: columns_v, //datagrid定义
			pagination: true, //是否显示分页
			rownumbers: true, //是否显示行号
			toolbar: toolbar_v, //工具栏
			pageSize : 15,
			pageList: [5, 15, 30, 50], //分页
		});
		//取消所有datagrid中的选择
		$('#dictionarylist').datagrid('unselectAll');
	}

	// 重新载入当前页
	function reload() {
		$('#dictionarylist').datagrid('unselectAll');
		$('#dictionarylist').datagrid('reload');
	}

	// 按钮 ==================================================================================
	var bbtn1 = true;
	var bbtn2 = false;
	// 俺就事件
	function initBtn() {

		$('#btn2').linkbutton({
			iconCls: 'icon-remove',
			text: '全部收起',
		});
		$('#btn3').linkbutton({
			iconCls: 'icon-reload',
			text: '重新载入',
		});

		// 按钮2
		$("#btn2").click(function() {
			var zTree = $.fn.zTree.getZTreeObj("ttDictionary");
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
	
	// 工具栏=====================================================================
	var tools = [{
		iconCls: 'icon-add',
		handler: function() {
			var zTree = $.fn.zTree.getZTreeObj("ttDictionary");
			zTree.expandAll(true);
		}
	}, {
		iconCls: 'icon-remove',
		handler: function() {
			var zTree = $.fn.zTree.getZTreeObj("ttDictionary");
			zTree.expandAll(false);
		}
	}, {
		iconCls: 'icon-reload',
		handler: function() {
			flashZTree();
		}
	}];
	
	// ZTree =================================================================================
	// ZTree 设置
	var setting = {
		showLine: true,
		async: {
			enable: true,
			url: "/system/dictionary/getDictionaryZTree.do",
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
			onClick: onClick, // Ztree 单击事件
		},

	};

	//定义setTimeout执行方法
	var TimeFn = null;

	// 点击事件 
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
	
	var typeId = 0;
	
	// 真正 调用的 单击事件
	function zTreeOnClick(event, treeId, treeNode, clickFlag) {
		typeId = treeNode.id;
		isSeafed = treeNode.isSeafed;
		queryDictionary(treeNode.id,isSeafed);
	}

	// ZTree 初始化
	function loadZTree() {
		$.fn.zTree.init($("#ttDictionary"), setting);
	}

	// 添加完成后向 树种添加一个新节点 
	function getDictTypeTreeBytypeId(typeId) {
		var new_node;
		$.ajax({
			url: '/system/dictionary/getDictTypeZTreeBytypeId.do',
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
		return new_node;
	}

	// 添加节点 
	function add(typeId) {
		// 加载数据
		var new_node = getDictTypeTreeBytypeId(typeId);
		// Ztree 添加
		var zTree = $.fn.zTree.getZTreeObj("ttDictionary");
		//isParent = eee.data.isParent,
		nodes = zTree.getSelectedNodes();
		treeNode = nodes[0];
		if(treeNode) {
			treeNode = zTree.addNodes(treeNode, new_node);
		}
	}

	// 编辑
	function edit(typeId) {
		// 加载数据
		var new_node = getDictTypeTreeBytypeId(typeId);
		// Ztree 编辑
		var zTree = $.fn.zTree.getZTreeObj("ttDictionary");
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
		var zTree = $.fn.zTree.getZTreeObj("ttDictionary");
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

	// 刷新
	function flashZTree() {
		//loadZTreeData();
		var treeObj = $.fn.zTree.getZTreeObj("ttDictionary");
		treeObj.reAsyncChildNodes(null, "refresh");
	}

	// 页面加载 ===============================================================================

	$(function() {
		//$('#cc').layout();

		// loade();
		loadZTree(); // 加载ZTree

		// 初始按钮
		initBtn();

		$("#nav4").panel({
			fit: true,
			border: false,
		});

		var h = $("#cr").height() - 58;

		// 初始 面板
		$("#nav2").panel({
			//fit:true,
			height: h,
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

<div id="cr" data-options="region:'west',title:'字典列表',split:true,tools:tools" style="width:300px;">
	<div id="nav4">
		<a id="btn2" href="#">全部收起</a>&nbsp;&nbsp;
		<a id="btn3" href="#">重新载入</a>
		<div id="nav2">
			<ul id="ttDictionary" class="ztree"></ul>
		</div>
	</div>
</div>

<div id="cp" data-options="region:'center',title:'字典详细信息 '" style="padding:0px;background:#eee;">
	<form id="dictionaryqueryform">
		<input type="hidden" id="mid" name="id" />
		<input type="hidden" id="pid" name="pid" />
		<!-- 查询列表 -->
	</form>
	<table id="dictionarylist" fit="true"></table>
</div>

<!-- 删除from -->
<form id="deleteform" method="post">
	<input type="hidden" id="delId" name="delId" />
</form>
<!-- Enable from -->
<form id="enableform" method="post">
	<input type="hidden" id="enableId" />
	<input type="hidden" id="isEnable" name="isEnable" />
</form>

</body>
</html>