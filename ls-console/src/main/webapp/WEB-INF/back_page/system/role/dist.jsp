<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script type="text/javascript">
	var permissionId;
	var ttModule;

	// 加载树
	function loadTree() {
		//定义setTimeout执行方法
		var TimeFn = null;

		ttModule = $('#ttModule');
		ttModule.tree({
			animate: true,
			lines: true,
			//url: "/system/role/getPermissionTreeByRoleId.do?roleId=${sysRoleCustom.roleId }",
			url: "/system/role/getModulePermissionTree.do?roleId=${sysRoleCustom.roleId }",
			checkbox: true,
			onClick: function(node) {
				// 取消上次延时未执行的方法
				clearTimeout(TimeFn);
				//执行延时
				TimeFn = setTimeout(function() {
					//do function在此处写单击事件要执行的代码
					//alert(node.id);
					moduleId = node.id;

				}, 300);
			},
			onDblClick: function(node) {
				// 取消上次延时未执行的方法
				clearTimeout(TimeFn);
				$(this).tree(node.state === 'closed' ? 'expand' : 'collapse', node.target);
				node.state = node.state === 'closed' ? 'open' : 'closed';
			},
// 			onLoadSuccess: function() {
// 				ttModule.tree("collapseAll");
// 			},
		});
	}
// 按钮 事件 ===============================================================================
	var bbtn1 = true;
	var bbtn2 = true;

	// 按钮 事件
	function initBtn() {

		$('#btn1').linkbutton({
			iconCls: 'icon-ok',
			text: '全部选择',
		});
		$('#btn2').linkbutton({
			iconCls: 'icon-add',
			text: '全部展开',
		});
		$('#btn3').linkbutton({
			iconCls: 'icon-save',
		});
		$('#btn4').linkbutton({
			iconCls: 'icon-reload',
		});
		// 按钮1
		$("#btn1").click(function() {
			var node = $("#ttModule").tree("getRoot");
			if(bbtn1) {
				bbtn1 = false;
				$("#ttModule").tree("update", {
					target: node.target,
					"checked": true,
				});
				$('#btn1').linkbutton({
					iconCls: 'icon-remove',
					text: '全部取消',
				});
			} else {
				bbtn1 = true;
				$("#ttModule").tree("update", {
					target: node.target,
					"checked": false,
				});
				$('#btn1').linkbutton({
					iconCls: 'icon-add',
					text: '全部选择',
				});
			}
		});
		// 按钮2
		$("#btn2").click(function() {
			//alert(1);
			if(bbtn2) {
				bbtn2 = false;
				$("#ttModule").tree("expandAll");
				$('#btn2').linkbutton({
					iconCls: 'icon-remove',
					text: '全部收起',
				});
			} else if(!bbtn2) {
				bbtn2 = true;
				$("#ttModule").tree("collapseAll");
				$('#btn2').linkbutton({
					iconCls: 'icon-add',
					text: '全部展开',
				});
			}
		});
		// 按钮3
		$("#btn3").click(function() {
			// 获取全部选中的数组
			var nodes = $("#ttModule").tree("getChecked");
			//alert(nodes.length);
			var mids = []; //提交记录的序号
			var pids = [];

			// 遍历
			for(var i = 0; i < nodes.length; i++) {
				var node = nodes[i];
				//alert(node.id+"_"+node.attributes.pid);
				mids.push(node.id); // 自己的id 
				pids.push(node.attributes.pid); // 父ID
			}

			// 判断
			if(mids.length > 0 && mids.length == pids.length) {
				$("#mids").val(mids.join(',')); // 转json
				$("#pids").val(pids.join(','));
				// 提交表单
				jquerySubByFId('updateRoleForm', dist_callback, null);
			} else {
				alert_warn("请选择操作的权限");
			}
		});
		// 按钮4
		$("#btn4").click(function(){
			// 获取全部选中的数组
			$("#ttModule").tree("reload");
		});
	}

	// 表单 回调
	function dist_callback(data) {
		var result = getCallbackData(data);
		_alert(result);
		parent.reload();
		//yycgdmxquery();//提交完成刷新本页面
	}
	
	// 工具栏 =========================================================================
	var tools = [{
		iconCls: 'icon-add',
		handler: function() {
			$("#ttModule").tree("expandAll");
			zTree.expandAll(true);
		}
	}, {
		iconCls: 'icon-remove',
		handler: function() {
			$("#ttModule").tree("collapseAll");
			zTree.expandAll(false);
		}
	}, {
		iconCls: 'icon-reload',
		handler: function() {
			$("#ttModule").tree("reload");
		}
	}];
	
	// 页面加载 =================================================================
	// jquery
	$(function() {
		$("#nav4").panel({
			fit: true,
			border: false,
		});
		// 树
		loadTree();
		// 初始按钮
		initBtn();
		var h = $("#cp").height() - 58;
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

<div id="cr" data-options="region:'west',title:'用户信息',split:true" style="width: 300px;">
	<table cellspacing="1" cellpadding="2" width="99%" border="0" class="pn-ftable">
		<tbody>
			<tr>
				<td width="30%" class="pn-flabel pn-flabel-h">角色名称:</td>
				<td width="70%" class="pn-fcontent">${sysRoleCustom.roleName }</td>
			</tr>
			<tr>
				<td width="30%" class="pn-flabel pn-flabel-h">角色描述:</td>
				<td width="70%" class="pn-fcontent">${sysRoleCustom.roleDescription }</td>
			</tr>
			<tr>
				<td width="30%" class="pn-flabel pn-flabel-h">角色备注:</td>
				<td width="70%" class="pn-fcontent">${sysRoleCustom.roleRemark }</td>
			</tr>
			<tr>
				<td width="30%" class="pn-flabel pn-flabel-h">是否可用:</td>
				<td width="70%" class="pn-fcontent">${sysRoleCustom.isEnableName }</td>
			</tr>
		</tbody>
	</table>
</div>
<div id="cp" data-options="region:'center',title:'权限列表',tools:tools" style="padding: 1px; background: #eee;">
	<div id="nav4">
		<a id="btn1" href="#">全部选择</a>&nbsp;&nbsp;
		<a id="btn2" href="#">全部收起</a>&nbsp;&nbsp;
		<a id="btn4" href="#">刷新</a>&nbsp;&nbsp;
		<a id="btn3" href="#">提交</a>&nbsp;&nbsp;

		<div id="nav2">
			<ul id="ttModule"></ul>
		</div>
	</div>
</div>

<form id="updateRoleForm" action="/system/role/updateRoleDist.do">
	<input type="hidden" name="roleId" value="${sysRoleCustom.roleId }" />
	<input type="hidden" id="mids" name="mids" />
	<input type="hidden" id="pids" name="pids" />
</form>

</body>

</html>