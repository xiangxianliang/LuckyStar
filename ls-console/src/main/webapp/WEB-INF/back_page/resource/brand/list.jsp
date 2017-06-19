<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script brand="text/javascript">
	//全选
	function checkBox(name, checked) {
		//全选开始
		$("input[name='" + name + "']").attr("checked", checked);
	}

	//删除
	function del(brandId) {
		var url_v = '/product/brand/delete.do';
		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#deleteform").attr("action", url_v);
			$("#brandId").attr("name", "brandId");
			$("#brandId").val(brandId);
			jquerySubByFId('deleteform', del_callback, null, "json");
		})
	};

	// 批量删除
	var delList = function() {
		var url_v = '/product/brand/deletes.do';
		$("#deleteform").attr("action", url_v);
		$("#brandId").attr("name", "brandIds");
		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#brandlist').datagrid('getSelections');
			for (var i = 0; i < rows.length; i++) {
				ids.push(rows[i].brandId);
			}
			if (ids.length > 0) {
				$("#brandId").val(ids.join(','));
				//alert($("#brandId").val());
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
	function toEdit(brandId) {
		createmodalwindow("编辑品牌信息", 800, 500, '/product/brand/toEdit.do?brandId=' + brandId);
	}

	//到添加页面
	function toAdd() {
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("添加品牌信息", 800, 500, '/product/brand/toAdd.do?typeId=' + typeId);
	}

	//datagrid定义
	var columns_v = [ [ {
		field : 'brandId',
		title : '',
		checkbox : true
	}, {
		field : 'brandName',//对应jason中的key
		title : '品牌名称',
		width : 120,
	}, {
		field : 'img',//对应jason中的key
		title : '图片',
		align : 'center',
		width : 50,
		//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
		formatter : function(value, row, index) {
			return "<img width=\"40\" height=\"40\" src=\"" + row.allURL +"\"/>";
		},
	}, {
		field : 'brandDescription',//对应jason中的key
		title : '品牌描述',
		width : 200
	}, {
		field : 'webSite',//对应jason中的key
		title : '品牌网址',
		width : 150
	}, {
		field : 'brandRemark',//对应jason中的key
		title : '备注',
		width : 100
	}, {
		field : 'pinyinCode',//对应jason中的key
		title : '拼音码',
		width : 80
	}, {
		field : 'typeName',//对应jason中的key
		title : '类别',
		align : 'center',
		width : 120
	}, {
		field : 'sort',//对应jason中的key
		title : '显示<br/>排序',
		align : 'center',
		width : 80
	}, {
		field : 'isDisplayName',//对应jason中的key
		title : '是否<br/>可用',
		align : 'center',
		width : 40
	}, {
		field : 'opt1',//对应jason中的key
		title : '编辑',
		align : 'center',
		width : 40,
		//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
		formatter : function(value, row, index) {
			parentId = row.parentId;
			return "<a href =javascript:toEdit('" + row.brandId + "') >编辑</a>";
		},
	}, {
		field : 'opt2',//对应jason中的key
		title : '删除',
		width : 40,
		//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
		formatter : function(value, row, index) {
			parentId = row.parentId;
			return "<a href =javascript:del('" + row.brandId + "') >删除</a>";
		},
	}, ] ];

	//定义datagrid的工具栏
	var toolbar_v = [ {//工具栏
		id : 'btnadd',
		text : '添加',
		iconCls : 'icon-add',
		handler : function() {
			//alert('add');
			//打开一个窗口，用户添加页面
			toAdd();
		}
	}, {
		id : 'btndel',
		text : '批量删除',
		iconCls : 'icon-cancel',
		handler : function() {
			delList();
		}
	} ];

	function queryType(id) {
		var h3 = $("#cr").height() - 80;
		if (id == null) {
			id = typeId;
		}
		var url_v = '/product/brand/list.do?ebBrandCustom.typeId=' + id;
		$('#brandlist').datagrid({
			//title : '品牌配置',//数据列表标题
			iconCls : 'icon-search',//显示图标
			// width : 600,//数据列表的宽度
			// height : 350,//列表的高度
			height : h3,
			collapsible : false,//是否可折叠的 
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			loadMsg : '',
			fitColumns : true,
			ctrlSelect : true,
			// collapsible : true,//是否可以折叠
			url : url_v,//加载数据的连接，引连接请求过来是json数据

			//sortName: 'code',//排序字段名称
			//sortOrder: 'desc',//排序的顺序
			//remoteSort: false,//是否远程排序，如果要使用排序建议使用远程排序，对数据库中所有数据进行排序，通过远程排序datagrid将sortName和sortOrder传到后台，这时后台的代码调用service及dao进行数据库排序

			idField : 'brandId',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响获取当前选中航的方法执行

			// 	frozenColumns:[[//冻结列
			//		{field:'ck',checkbox:true},
			//		{title:'code',field:'code',width:80,sortable:true}
			// 	]],

			columns : columns_v,//datagrid定义
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			toolbar : toolbar_v,//工具栏
			pageSize : 15,
			pageList : [ 5, 15, 30, 50 ],//分页
		});
		$('#brandlist').datagrid('unselectAll');//取消所有datagrid中的选择
	}
	//查询方法
	function query() {
		//datagrid的方法要求传json数据，最终将json转成key,value传入action
		// 我们使用封装的js方法，将form表单中的数据提取出来防撞成方法
		var formdata1 = $("#brandueryform").serializeJson();
		//var formdata2 = form2Json('queryFrom');
		//alert(JSON.stringify(formdata1))
		//alert(JSON.stringify(formdata2))
		$('#brandlist').datagrid('unselectAll');
		$('#brandlist').datagrid('load', formdata1);
	}

	// 重新载入当前页
	function reload() {
		$('#brandlist').datagrid('unselectAll');
		$('#brandlist').datagrid('reload');
	}

	var typeId;
	var new_node;
	function setTypeId(typeId) {
		//this.typeId = typeId;
		$.ajax({
			url : '/product/type/getTypeJSONByTypeId.do',
			dataType : 'json',
			type : 'post',
			async : false,
			data : {
				typeId : typeId,
			},
			success : function(data) {
				new_node = data;
			},
			error : function() {
				alert("系统错误");
			}
		});
	}

	function flashZTree() {
		//loadZTreeData();
		var treeObj = $.fn.zTree.getZTreeObj("ttType");
		treeObj.reAsyncChildNodes(null, "refresh");
	}

	//定义setTimeout执行方法
	var TimeFn = null;
	// ztree 点击事件 去除 双击
	function onClick(event, treeId, treeNode, clickFlag) {
		// 用于解决双击时候会调用两次单击事件的问题
		if (treeNode.clickTimeout) {
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
	// ztree 设置
	var setting = {
		showLine : true,
		async : {
			enable : true,
			url : "/product/type/getSelectTypeZTree.do",
		//autoParam:["id", "name=n", "level=lv"],
		//otherParam:{"otherParam":"zTreeAsyncTest"},
		//dataFilter: filter
		},
		edit : {
			enable : true,
			showRemoveBtn : false,//设置是否显示删除按钮
			showRenameBtn : false,//设置是否显示编辑名称按钮。
		},
		callback : {
			//beforeClick : beforeClick,
			onClick : onClick,
		},
	};
	// 加载ztree
	function loadTypeZTree() {
		$.fn.zTree.init($("#ttType"), setting);
	}

	var bbtn1 = true;
	var bbtn2 = true;
	// 按钮事件
	function initBtn() {
		$('#btn2').linkbutton({
			iconCls : 'icon-add',
			text : '全部展开',
		});
		$('#btn3').linkbutton({
			iconCls : 'icon-reload',
			text : '重新载入',
		});
		// 按钮2
		$("#btn2").click(function() {
			var zTree = $.fn.zTree.getZTreeObj("ttType");
			//alert(1);
			if (bbtn2) {
				bbtn2 = false;
				// $("#ttType").tree("expandAll");
				zTree.expandAll(true);
				$('#btn2').linkbutton({
					iconCls : 'icon-remove',
					text : '全部收起',
				});
			} else if (!bbtn2) {
				bbtn2 = true;
				// $("#ttType").tree("collapseAll");
				zTree.expandAll(false);
				$('#btn2').linkbutton({
					iconCls : 'icon-add',
					text : '全部展开',
				});
			}
		});
		// 按钮3
		$("#btn3").click(function() {
			// 获取全部选中的数组
			//$("#ttType").tree("reload");
			flashZTree();
		});
	}

	$(function() {
		$('#cc').layout();
		// 初始化 树
		loadTypeZTree();
		// 初始按钮
		initBtn();
		var he = $("#cr").height() - 58;
		// 初始 面板
		$("#nav2").panel({
			//fit:true,
			height : he,
		//border:false,
		});
		var h2 = $("#cr").height() - 33;
		// 初始 面板
		$("#nav3").panel({
			//fit:true,
			height : h2,
			border : false,
		//border:false,
		});

	});
</script>
</head>
<body>
	<div class="box-positon">
		<div class="rpos">当前位置: 品牌管理 - 列表</div>
		<div class="clear"></div>
	</div>

	<div id="cc" class="easyui-layout" fit="true">

		<div id="cr" data-options="region:'west',title:'类别列表',split:true" style="width: 300px;">
			<a id="btn2" href="#">全部收起</a>&nbsp;&nbsp; <a id="btn3" href="#">重新载入</a>
			<div id="nav2">
				<ul id="ttType" class="ztree"></ul>
			</div>
		</div>

		<div id="cp" data-options="region:'center',title:'品牌详细信息 '" style="background: #eee;">
			<div id="nav3">
				<div class="sousuo">
					<form id="brandueryform" method="post">
						&nbsp;&nbsp; 
						<input type="hidden" id="typeId" name="ebBrandCustom.typeId" /> 
						搜索: <span>|</span> 
						<select	id="isDisplay" name="ebBrandCustom.isDisplay">
							<option value="">是否可用：</option>
							<option value="1">是</option>
							<option value="2">否</option>
						</select> 
						<span>|</span> 
						<label>属性名称：</label> 
						<input id="brandName" type="text"  name="ebBrandCustom.brandName" title="属性名称" class="text20 medium gray" /> &nbsp;&nbsp;&nbsp;&nbsp; 
						<input id="goSearch" class="query" onclick="query()" value="查询" />
					</form>
				</div>

				<div id="tabs" class="easyui-tabs" border="false" fit="true">
					<!-- 查询列表 -->
					<table id="brandlist" border="0" cellspacing="0" cellpadding="0" width="100%"></table>
				</div>
			</div>
		</div>
	</div>
	<!-- 删除from -->
	<form id="deleteform" method="post">
		<input type="hidden" id="brandId" name="brandId" />
	</form>
	<div class="body-box"></div>

</body>
</html>