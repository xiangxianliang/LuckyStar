<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script type="text/javascript">
	//删除
	function del(basicInfoId) {
		var url_v = '/user/back/delete.do';
		$("#deleteform").attr("action", url_v);
		$("#basicInfoId").val(basicInfoId);

		_confirm('您确定要执行删除操作吗?', null, function() {
			jquerySubByFId('deleteform', del_callback, null, "json");
		})
	};

	// 批量删除
	var delList = function() {
		var url_v = '/user/back/deletes.do';
		$("#deleteform").attr("action", url_v);
		$("#basicInfoId").attr("name", "basicInfoIds");

		_confirm('您确定要执行删除操作吗?', null, function() {
			var ids = [];
			var rows = $('#basicList').datagrid('getSelections');
			for(var i = 0; i < rows.length; i++) {
				ids.push(rows[i].basicInfoId);
			}
			if(ids.length > 0) {
				$("#basicInfoId").val(ids.join(','));
				//alert($("#basicInfoId").val());
				jquerySubByFId('deleteform', del_callback, null, "json");
			} else {
				alert_warn("请选择要删除的项目");
			}
		});
	};
	// 删除回调
	function del_callback(data) {
		d_alert(data, method_ok_module);
	}
	// 删除 成功的回调函数
	function method_ok_module(data) {
		// 重新加载 数据表格
		reload();
	}

	//编辑
	function toEdit(userId) {
		createmodalwindow("编辑用户信息", 800, 500, '/user/back/toEdit.do?userId=' + userId);
	}
	
	//到添加页面
	function toAdd() {
		//参数：窗口的title、宽、高、url地址
		createmodalwindowmax("添加用户信息", 800, 500, '/user/back/toAdd.do');
	}
	
	function isEnable(userId, isEnable) {
		// 表单属性设置
		var url_v = '/user/back/enableUser.do';
		$("#enableform").attr("action", url_v);
		$("#enableId").attr("value", userId);
		$("#isEnable").attr("value", isEnable);
		// 提交表单
		jquerySubByFId('enableform', enable_callback, null, "json");
	}
	// enable回调
	function enable_callback(data) {
		d_alert(data, enable_method_ok);
	}
	// enable 成功的回调函数
	function enable_method_ok(data) {
		// 重新加载 数据表格
		reload();
	}

	//datagrid定义
	var columns_v = [
		[{
			field: 'userId',
			title: '',
			checkbox: true
		}, {
			field: 'username', //对应jason中的key
			title: '用户名',
			width: 100,
		}, {
			field: 'realName', //对应jason中的key
			title: '真实名字',
			width: 100,
		}, {
			field: 'gender', //对应jason中的key
			title: '性别',
			width: 100,
		}, {
			field: 'allUrl', //对应jason中的key
			title: '照片',
			width: 50,
			align : 'center',
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter : function(value, row, index) {
				return "<img width=\"40\" height=\"40\" src=\"" + row.allUrl +"\"/>";
			},
		}, {
			field: 'email', //对应jason中的key
			title: '邮箱',
			width: 120
		}, {
			field: 'phone', //对应jason中的key
			title: '手机',
			width: 120
		}, {
			field: 'registerTimeStr', //对应jason中的key
			title: '注册时间',
			width: 120
		}, {
			field: 'lastLoginTimeStr', //对应jason中的key
			title: '最近登录时间',
			width: 120
		}, {
			field: 'lastLoginIp', //对应jason中的key
			title: '最近登录的IP',
			width: 120
		}, {
			field: 'loginCount', //对应jason中的key
			title: '登录<br/>次数',
			align: 'center',
			width: 50
		}, {
			field: 'isLockedName', //对应jason中的key
			title: '锁定<br/>状态',
			align: 'center',
			width: 50
		}, {
			field: 'isActivationName', //对应jason中的key
			title: '激活<br/>状态',
			align: 'center',
			width: 50
		}, {
			field: 'isEnableName', //对应jason中的key
			title: '启用<br/>状态',
			align: 'center',
			width: 50
		}, {
			field: 'opt3', //对应jason中的key
			title: '启用<br/>禁用',
			align: 'center',
			width: 50,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				if(row.isEnable == 0) {
					return "<a href =javascript:isEnable('" + row.userId + "','1') >启用</a>";
				} else {
					return "<a href =javascript:isEnable('" + row.userId + "','0') >禁用</a>";
				}
			},
		}, {
			field: 'opt1', //对应jason中的key
			title: '编辑',
			align: 'center',
			width: 50,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				return "<a href =javascript:toEdit(" + row.userId + ") >编辑</a>";
			},
		}, {
			field: 'opt2', //对应jason中的key
			title: '删除',
			align: 'center',
			width: 50,
			//通脱此方法格式化心事的内容，value 表示从json取出的值，row表示这一行的数据，是一个对象；index行的序号
			formatter: function(value, row, index) {
				return "<a href =javascript:del() >删除</a>";
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

	function queryParameter() {
		dataGrid_obj.datagrid({
			// title : '基础配置',//数据列表标题
			iconCls: 'icon-search', //显示图标
			// width : 600,//数据列表的宽度
			// height : 350,//列表的高度
			fitColumns: true,
			ctrlSelect: true,
			collapsible: false, //是否可折叠的 
			nowrap: true, //单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped: true, //条纹显示效果
			loadMsg: '',
			// collapsible : true,//是否可以折叠
			url: '/user/back/list.do', //加载数据的连接，引连接请求过来是json数据

			//sortName: 'code',//排序字段名称
			//sortOrder: 'desc',//排序的顺序
			//remoteSort: false,//是否远程排序，如果要使用排序建议使用远程排序，对数据库中所有数据进行排序，通过远程排序datagrid将sortName和sortOrder传到后台，这时后台的代码调用service及dao进行数据库排序

			idField: 'userId', //此字段很重要，数据结果集的唯一约束(重要)，如果写错影响获取当前选中航的方法执行

			// 	frozenColumns:[[//冻结列
			//		{field:'ck',checkbox:true},
			//		{title:'code',field:'code',width:80,sortable:true}
			// 	]],

			columns: columns_v, //datagrid定义
			pagination: true, //是否显示分页
			pagePosition: 'bottom',
			rownumbers: true, //是否显示行号
			toolbar: '#toolbar', //工具栏
			pageSize: 15,
			pageList: [5, 15, 30, 50], //分页
		});

		dataGrid_obj.datagrid('unselectAll'); //取消所有datagrid中的选择
	}
	
	// 重新载入当前页
	function reload() {
		dataGrid_obj.datagrid('unselectAll');
		dataGrid_obj.datagrid('reload');
	}

	// 查询方法
	function query() {
		//datagrid的方法要求传json数据，最终将json转成key,value传入action
		// 我们使用封装的js方法，将form表单中的数据提取出来防撞成方法
		var formdata1 = $("#queryFrom").serializeJson();
		//var formdata2 = form2Json('queryFrom');
		//alert(JSON.stringify(formdata1))
		//alert(JSON.stringify(formdata2))
		dataGrid_obj.datagrid('unselectAll');
		dataGrid_obj.datagrid('load', formdata1);
	}

	$(function() {
		dataGrid_obj = $('#basicList');

		// 数据表格
		queryParameter();

	});
</script>
</head>

<body>
<div id="toolbar">
	<div class="sousuo" fit="true">
		<form id="queryFrom" method="post">
			<p>
				筛选:<span>|</span>
				<label>锁定状态：</label>
				<select name="userBackUserCustom.isLocked">
					<option value="">所有</option>
					<option value="1">是</option>
					<option value="0">否</option>
				</select>
				<label>激活状态：</label>
				<select name="userBackUserCustom.isAvailable">
					<option value="">所有</option>
					<option value="1">是</option>
					<option value="0">否</option>
				</select>
				<label>启用状态：</label>
				<select name="userBackUserCustom.isEnable">
					<option value="">所有</option>
					<option value="1">是</option>
					<option value="0">否</option>
				</select>
				<br/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>|</span>
				<label>用户名称：</label> 
				<input type="text" id="searchText" title="用户名称" class="text20 medium gray" name="userBackUserCustom.username" />&nbsp;&nbsp;
				<span>|</span>
				<label>真实名称：</label> 
				<input type="text" id="searchText" title="真实名称" class="text20 medium gray" name="userBackUserCustom.realName" />&nbsp;&nbsp;
				<span>|</span>
				<label>手机号：</label> 
				<input type="text" id="searchText" title="手机号" class="text20 medium gray"  name="userBackUserCustom.phone" />	
				<span>|</span>
				<label>邮箱：</label> 
				<input type="text" id="searchText" title="手机号" class="text20 medium gray"  name="userBackUserCustom.email" />	
				&nbsp;&nbsp;&nbsp;&nbsp;
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
<table border="0" cellspacing="0" cellpadding="0" width="100%" id="basicList" fit="true"></table>

<!-- 删除from -->
<form id="deleteform" method="post">
	<input type="hidden" id="userId" name="userId" />
</form>
<!-- Enable from -->
<form id="enableform" method="post">
	<input type="hidden" id="enableId" name="userId" />
	<input type="hidden" id="isEnable" name="isEnable" />
</form>
</body>

</html>