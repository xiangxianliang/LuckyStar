<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script item="text/javascript">
	//删除
	function del(itemId) {
		var url_v = '/product/item/delete.do';
		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#deleteform").attr("action", url_v);
			$("#itemId").val(itemId);
			jquerySubByFId('deleteform', del_callback, null, "json");
		})
	};

	// 批量删除
	var delList = function() {
		var url_v = '/product/item/deletes.do';
		$("#deleteform").attr("action", url_v);
		$("#itemId").attr("name", "itemIds");

		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#itemlist').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].itemId);
			}
			if(ids.length > 0) {
				$("#itemId").val(ids.join(','));
				//alert($("#itemId").val());
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
		queryItem(typeId);
	}

	// 上架下架
	function isShowFn(itemId, isS) {
		var url_v = '/product/item/isShow.do';
		_confirm('您确定要执行此操作操作吗?', null, function() {
			$("#isshowform").attr("action", url_v);
			$("#isShow_isS").val(isS);
			$("#isShow_itemId").val(itemId);
			jquerySubByFId('isshowform', del_callback, null, "json");
		})
	}

	// 批量上下架
	var isShowList = function() {
		var url_v = '/product/item/isShow.do';
		$("#isshowform").attr("action", url_v);
		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#itemlist').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].itemId);
			}
			if(ids.length > 0) {
				$("#isShow_itemId").val(ids.join(','));
				//alert($("#itemId").val());
				jquerySubByFId('isshowform', del_callback, null, "json");
			} else {
				alert_warn("请选择要操作的项目");
			}
		});
	};

	//编辑
	function toEdit(itemId) {
		createmodalwindow("编辑类型信息", 1024, 650, '/product/item/toEdit.do?itemId=' + itemId);
	}

	//到添加页面
	function toAdd() {
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("添加类型信息", 1024, 650, '/product/item/toAdd.do?typeId=' + typeId);
	}

	//datagrid定义
	var columns_v = [
		[{
				field: 'itemId',
				title: '',
				checkbox: true
			},
			{
				field: 'itemNo', //对应jason中的key
				title: '商品编号',
				width: 170,
			},
			{
				field: 'itemName', //对应jason中的key
				title: '商品名称',
				width: 230,
			},
			{
				field: 'brandName', //对应jason中的key
				title: '商品品牌',
				align: 'center',
				width: 80,
			},
			{
				field: 'typeName', //对应jason中的key
				title: '商品分类',
				align: 'center',
				width: 100,
			},
			{
				field: 'img', //对应jason中的key
				title: '图片',
				align: 'center',
				width: 60,
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					return "<img width=\"40\" height=\"40\" src=\"" + row.ebImgCustom.allUrl + "\"/>";
				},
			},
			{
				field: 'isNewName', //对应jason中的key
				title: '是否<br/>新品',
				align: 'center',
				width: 50
			},
			{
				field: 'isHotName', //对应jason中的key
				title: '是否<br/>热卖',
				align: 'center',
				width: 50
			},
			{
				field: 'isCommendName', //对应jason中的key
				title: '是否<br/>推荐',
				align: 'center',
				width: 50
			},
			{
				field: 'auditStatusName', //对应jason中的key
				title: '审核<br/>状态',
				align: 'center',
				width: 50
			},
			{
				field: 'isShowName', //对应jason中的key
				title: '上下架<br/>状态',
				align: 'center',
				width: 50
			},
			{
				field: 'opt1', //对应jason中的key
				title: '编辑',
				align: 'center',
				width: 60,
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					itemId = row.itemId;
					return "<a href =javascript:toEdit('" + row.itemId + "') >编辑</a>";
				},
			},
			{
				field: 'opt2', //对应jason中的key
				title: '删除',
				align: 'center',
				width: 60,
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					itemId = row.itemId;
					isShow = row.isShow;
					if(isShow == 0) { // 下架状态 可以删除
						return "<a href =javascript:del('" + row.itemId + "') >删除</a>";
					}
					return "无法<br/>删除";
				},
			},
			{
				field: 'opt3', //对应jason中的key
				title: '上下架',
				align: 'center',
				width: 60,
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					itemId = row.itemId;
					isShow = row.isShow;
					if(isShow == 0) { // 下架状态 可以 上架
						return "<a href =javascript:isShowFn('" + row.itemId + "','1') >上架</a>";
					} else {
						return "<a href =javascript:isShowFn('" + row.itemId + "','0') >下架</a>";
					}

				},
			},
			{
				field: 'opt4', //对应jason中的key
				title: '发布',
				align: 'center',
				width: 60,
				//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
				formatter: function(value, row, index) {
					itemId = row.itemId;
					isShow = row.isShow;
					if(isShow == 1) { // 下架状态 可以 上架
						return "<a href =javascript:publish('" + row.itemId + "') >发布</a>";
					} else {
						return "<a href =javascript:publish('" + row.itemId + "') >重新发布</a>";
					}
				},
			},
		]
	];

	//定义datagrid的工具栏
	var toolbar_isShow = [{ //工具栏
		id: 'btnadd',
		text: '添加',
		iconCls: 'icon-add',
		handler: function() {
			//alert('add');
			//打开一个窗口，用户添加页面
			toAdd();
		}
	}, '-', {
		id: 'btndel',
		text: '删除',
		iconCls: 'icon-cancel',
		handler: function() {
			delList();
		}
	}, '-', {
		id: 'btnup',
		text: '上架',
		iconCls: 'icon-ok',
		handler: function() {
			isShowList();
		}
	}, {
		id: 'btndown',
		text: '下架',
		iconCls: 'icon-remove',
		handler: function() {
			isShowList();
		}
	}];

	var toolbar_v;
	var datagrid;

	function queryItem() {
		var url_v = "/product/item/list.do";
		datagrid = $('#itemlist').datagrid({
			//title : '类型配置',//数据列表标题
			iconCls: 'icon-search', //显示图标
			// width : 600,//数据列表的宽度
			// height : 350,//列表的高度
			height: 'auto',
			fitColumns: true,
			collapsible: false, //是否可折叠的 
			nowrap: true, //单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped: true, //条纹显示效果
			loadMsg: '',
			// collapsible : true,//是否可以折叠
			url: url_v, //加载数据的连接，引连接请求过来是json数据

			//sortName: 'code',//排序字段名称
			//sortOrder: 'desc',//排序的顺序
			//remoteSort: false,//是否远程排序，如果要使用排序建议使用远程排序，对数据库中所有数据进行排序，通过远程排序datagrid将sortName和sortOrder传到后台，这时后台的代码调用service及dao进行数据库排序

			idField: 'itemId', //此字段很重要，数据结果集的唯一约束(重要)，如果写错影响获取当前选中航的方法执行

			// 	frozenColumns:[[//冻结列
			//		{field:'ck',checkbox:true},
			//		{title:'code',field:'code',width:80,sortable:true}
			// 	]],

			columns: columns_v, //datagrid定义
			pagination: true, //是否显示分页
			rownumbers: true, //是否显示行号
			toolbar: toolbar_isShow, //工具栏
			pageSize: 15,
			pageList: [5, 15, 30, 50], //分页
		});
		$('#itemlist').datagrid('unselectAll'); //取消所有datagrid中的选择
	}

	// 查询品牌
	function queryBrand(id) {
		if(id == null) {
			id = typeId;
		}
		var url_v = '/product/brand/getBrandByTypeId.do?typeId=' + id;
		$('#brand').combobox({
			url: url_v,
			valueField: 'id',
			textField: 'text'
		});
	}

	var typeId;

	//查询方法
	function query() {
		//datagrid的方法要求传json数据，最终将json转成key,value传入action
		// 我们使用封装的js方法，将form表单中的数据提取出来防撞成方法
		var formdata1 = $("#itemqueryform").serializeJson();
		//var formdata2 = form2Json('queryFrom');
		//alert(JSON.stringify(formdata1))
		//alert(JSON.stringify(formdata2))
		$('#itemlist').datagrid('unselectAll');
		$('#itemlist').datagrid('load', formdata1);
	}

	$(function() {
		$("#nav4").panel({
			fit: true,
			border: false,
		});
		queryItem();
	});
</script>
</head>

<body>
<div id="nav4">
	<div class="sousuo">
		<form id="itemqueryform" method="post">
			&nbsp;&nbsp;
			<label>筛选：</label>
			<span>|</span>
			<input type="hidden" id="showStatus" name="ebItemCustom.isShow" value="" />
			<input type="hidden" id="typeId" name="ebItemCustom.typeId" />

			<input id="brand" name="ebItemCustom.brandId" value="" />
			<span>|</span>
			<select id="auditStatus" name="ebItemCustom.auditStatus">
				<option value="">全部审核状态</option>
				<option value="0">待审核</option>
				<option value="1">通过</option>
				<option value="2">不通过</option>
			</select>
			<span>|</span>
			<label>名称：</label>
			<input type="text" value="${ebItemQueryVo.ebItemCustom.itemName }" name="ebItemCustom.itemName" /> &nbsp;&nbsp;&nbsp;&nbsp;
			<input id="goSearch" class="query" onclick="query()" value="查询" />
		</form>
	</div>
	<!-- 查询列表 -->
	<table id="itemlist" fit="true"></table>

	<!-- 删除from -->
	<form id="deleteform" method="post">
		<input type="hidden" id="itemId" name="itemId" />
	</form>

	<!-- 上架from -->
	<form id="isshowform" method="post">
		<input type="hidden" id="isShow_itemId" name="itemId" />
		<input type="hidden" id="isShow_isS" name="isS" />
	</form>
</div>

</body>

</html>