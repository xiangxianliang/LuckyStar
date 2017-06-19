<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script feature="text/javascript">
	//删除
	function del(featureId) {
		var url_v = '/resource/feature/delete.do';

		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#deleteform").attr("action", url_v);
			$("#featureId").val(featureId);
			jquerySubByFId('deleteform', del_callback, null, "json");
		})
	};

	// 批量删除
	var delList = function() {

		var url_v = '/resource/feature/deletes.do';
		$("#deleteform").attr("action", url_v);
		$("#featureId").attr("name", "featureIds");

		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#featurelist').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].featureId);
			}
			if(ids.length > 0) {
				$("#featureId").val(ids.join(','));
				//alert($("#featureId").val());
				jquerySubByFId('deleteform', del_callback, null, "json");
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
	function toEdit(featureId) {
		createmodalwindow("编辑类型信息", 800, 500, '/resource/feature/toEdit.do?featureId=' + featureId);
	}

	//到添加页面
	function toAdd() {
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("添加类型信息", 800, 500, '/resource/feature/toAdd.do?typeId=' + typeId);
	}

	//datagrid定义
	var columns_v = [
		[{
			field: 'featureId',
			title: '',
			checkbox: true
		}, {
			field: 'featureName', //对应jason中的key
			title: '属性名称',
			width: 120,
		}, {
			field: 'inputTypeName', //对应jason中的key
			title: '属性类型',
			align: 'center',
			width: 70,
		}, {
			field: 'selectValue', //对应jason中的key
			title: '可选值',
			width: 200
		}, {
			field: 'featureDescription', //对应jason中的key
			title: '属性描述',
			width: 80
		}, {
			field: 'featureRemark', //对应jason中的key
			title: '属性备注',
			width: 80
		}, {
			field: 'pinyinCode', //对应jason中的key
			title: '拼音码',
			width: 80
		}, {
			field: 'typeName', //对应jason中的key
			title: '所属类型',
			width: 80
		}, {
			field: 'isSpecName', //对应jason中的key
			title: '是否<br/>规格',
			align: 'center',
			width: 40
		}, {
			field: 'isSelectName', //对应jason中的key
			title: '是否<br/>筛选',
			align: 'center',
			width: 40
		}, {
			field: 'isShowName', //对应jason中的key
			title: '是否<br/>显示',
			align: 'center',
			width: 40
		}, {
			field: 'isDisplayName', //对应jason中的key
			title: '是否<br/>可用',
			align: 'center',
			width: 40
		}, {
			field: 'featureSort', //对应jason中的key
			title: '前台<br/>排序',
			align: 'center',
			width: 40
		}, {
			field: 'opt1', //对应jason中的key
			title: '编辑',
			align: 'center',
			width: 50,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				parentId = row.parentId;
				return "<a href =javascript:toEdit('" + row.featureId + "') >编辑</a>";
			},
		}, {
			field: 'opt2', //对应jason中的key
			title: '删除',
			align: 'center',
			width: 50,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				parentId = row.parentId;
				return "<a href =javascript:del('" + row.featureId + "') >删除</a>";
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
		$("#toolbar").css("display", "");
		if(id == null) {
			id = typeId;
		}
		var url_v = '/resource/feature/list.do?resFeatureCustom.typeId=' + id;
		$('#featurelist').datagrid({
			//title : '类型配置',//数据列表标题
			iconCls: 'icon-search', //显示图标
			// width : 600,//数据列表的宽度
			// height : 350,//列表的高度
			height: 'auto',
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

			idField: 'featureId', //此字段很重要，数据结果集的唯一约束(重要)，如果写错影响获取当前选中航的方法执行

			// 	frozenColumns:[[//冻结列
			//		{field:'ck',checkbox:true},
			//		{title:'code',field:'code',width:80,sortable:true}
			// 	]],

			columns: columns_v, //datagrid定义
			pagination: true, //是否显示分页
			rownumbers: true, //是否显示行号
			toolbar: '#toolbar', //工具栏
			pageSize: 15,
			pageList: [5, 15, 30, 50], //分页
		});
		$('#featurelist').datagrid('unselectAll'); //取消所有datagrid中的选择
	}

	//查询方法
	function query() {
		//datagrid的方法要求传json数据，最终将json转成key,value传入action
		// 我们使用封装的js方法，将form表单中的数据提取出来防撞成方法
		var formdata1 = $("#featurequeryform").serializeJson();
		//var formdata2 = form2Json('queryFrom');
		//alert(JSON.stringify(formdata1))
		//alert(JSON.stringify(formdata2))
		$('#featurelist').datagrid('unselectAll');
		$('#featurelist').datagrid('load', formdata1);
	}
	// 重新载入当前页
	function reload() {
		$('#featurelist').datagrid('unselectAll');
		$('#featurelist').datagrid('reload');
	}

	// ==================================================================================

	// ztree 设置
	var setting = {
		showLine: true,
		async: {
			enable: true,
			url: "/resource/type/getSelectTypeZTree.do",
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

	function flashZTree() {
		//loadZTreeData();
		var treeObj = $.fn.zTree.getZTreeObj("ttType");
		treeObj.reAsyncChildNodes(null, "refresh");
	}

	// ==================================================================================

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
		// 按钮2
		$("#btn2").click(function() {
			var zTree = $.fn.zTree.getZTreeObj("ttType");
			//alert(1);
			if(bbtn2) {
				bbtn2 = false;
				zTree.expandAll(true);
				// $("#ttType").tree("expandAll");
				$('#btn2').linkbutton({
					iconCls: 'icon-remove',
					text: '全部收起',
				});
			} else if(!bbtn2) {
				bbtn2 = true;
				zTree.expandAll(false);
				// $("#ttType").tree("collapseAll");
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

	// ==================================================================================

	$(function() {

		$("#nav4").panel({
			fit: true,
			border: false,
		});
		// 初始化 树
		loadTypeZTree();
		// 初始按钮
		initBtn();

		var height1 = $("#cr").height() - 58;
		// 初始 面板
		$("#nav2").panel({
			//fit:true,
			height: height1,
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

<div id="cr" data-options="region:'west',title:'类型列表',split:true" style="width: 300px;">
	<div id="nav4">
		<a id="btn2" href="#">全部收起</a>&nbsp;&nbsp;
		<a id="btn3" href="#">重新载入</a>
		<div id="nav2">
			<ul id="ttType" class="ztree"></ul>
		</div>
	</div>
</div>

<div id="cp" data-options="region:'center',title:'类型详细信息 '" style="background: #eee;">
	<div id="toolbar" style="display: none;">
		<div class="sousuo" fit="true">
			<form id="queryFrom" method="post">
				<p>
					筛选:<span>|</span>
					<label>属性类型：</label>
					<select id="inputType" name="resFeatureCustom.inputType">
						<option value="">-全部-</option>
						<option value="1">select</option>
						<option value="2">单选</option>
						<option value="3">复选</option>
						<option value="4">文本框</option>
					</select>
					<label>是否规格：</label>
					<select id="isSpec" name="resFeatureCustom.isSpec">
						<option value="">-全部-</option>
						<option value="0">否</option>
						<option value="1">是</option>
					</select>
					<label>是否筛选：</label>
					<select id="isSelect" name="resFeatureCustom.isSelect">
						<option value="">-是否筛选-</option>
						<option value="0">否</option>
						<option value="1">是</option>
					</select>
					<label>是否前台显示：</label>
					<select id="isShow" name="resFeatureCustom.isShow">
						<option value="">-全部-</option>
						<option value="0">否</option>
						<option value="1">是</option>
					</select>
					<span>|</span>
					<label>用户名称：</label>
					<input type="text" id="featureName" title="属性名称" class="text20 medium gray" name="resFeatureCustom.featureName" />&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
					<input id="goSearch" class="query" onclick="query()" value="查询" />
				</p>
			</form>
		</div>
		<div>
			<a href="#" id="btnadd" class="easyui-linkbutton" data-options="iconCls:'icon-add',text: '添加',plain:true" onclick="toAdd()"></a>
			<a href="#" id="btndel" class="easyui-linkbutton" data-options="iconCls:'icon-cancel',text: '批量删除',plain:true" onclick="delList()"></a>
		</div>
	</div>
	
	<!-- 查询列表 -->
	<table id="featurelist" border="0" cellspacing="0" cellpadding="0" width="100%" fit="true"></table>

</div>

<!-- 删除from -->
<form id="deleteform" method="post">
	<input type="hidden" id="featureId" name="featureId" />
</form>
<div class="body-box"></div>

</body>

</html>