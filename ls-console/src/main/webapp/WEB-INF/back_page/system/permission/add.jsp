<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	var valid = {
		rules: {
			"sysPermissionCustom.permissionName": {
				required: true, // 必须输入
				rangelength: [1, 30], //输入长度必须介于 1 和 30 之间的字符串（汉字算一个字符）。
				remote: {
					url: "/system/permission/checkPermission.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式   
					data: { //要传递的数据
						"sysPermissionCustom.parentModuleId": function() {
							return $("#parentModuleId").val();
						},
					}
				},
			},
			"sysPermissionCustom.permissionDescription": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysPermissionCustom.permissionMethod": {
				required: true, // 必须输入
				rangelength: [0, 200],
				remote: {
					url: "/system/permission/checkPermission.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式   
					data: { //要传递的数据
						"sysPermissionCustom.parentModuleId": function() {
							return $("#parentModuleId").val();
						},
					}
				},
			},
			"sysPermissionCustom.permissionIcon": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysPermissionCustom.showorder": {
				digits: true, //必须输入整数。
				range: [100, 999999],
			},
			"sysPermissionCustom.isEnable": {
				required: true, // 必须输入
			},
		},
		messages: {
			"sysPermissionCustom.permissionName": {
				required: "模块名称必须输入", // 必须输入
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				remote: "存在相同的模块",
			},
			"sysPermissionCustom.permissionDescription": {
				rangelength: "模块描述长度在{0}-{1}之间（汉字算一个字符）",
			},
			"sysPermissionCustom.permissionMethod": {
				required: "模块名称必须输入", // 必须输入
				rangelength: "模块URL在{0}-{1}之间",
				remote: "存在相同的URL",
			},
			"sysPermissionCustom.permissionIcon": {
				rangelength: "模块图标在{0}-{1}之间",
			},
			"sysPermissionCustom.showorder": {
				digits: "必须输入整数", //。
				range: "整数在{0}-{1}之间",
			},
			"sysPermissionCustom.isEnable": {
				required: "必须选择项", //
			},
			errorElement: "label", //用来创建错误提示信息标签,validate插件默认的就是label
			success: function(label) { //验证成功后的执行的回调函数
				//label指向上面那个错误提示信息标签label
				label.text(" ") //清空错误提示消息
				//.addClass("success"); //加上自定义的success类
			}
		},
	};

	function moduleSave() {
		if($("#form111").valid()) {
			jquerySubByFId('form111', permissionSave_callback, null, "json");
		}
	}

	function permissionSave_callback(data) {
		mcoc_message_alert(data, method_cancel(data), method_ok(data));
	}

	function method_ok(data) {
		// 刷新页面 
		parent.reload();
		// 保存 排序字段
		var showorder = parseInt($("#showorder").val());
		// 清空当前表单
		$("#form111").clearForm();
		// 设置会 排序字段
		$("#showorder").val(showorder + 100);
	}

	function method_cancel() {
		parent.reload();
	}

	$(function() {
		$("#form111").validate(valid);
	});
</script>
</head>

<body>
<div class="box-positon">
	<div class="rpos">当前位置: 权限 - 添加</div>
	<div class="clear"></div>
</div>
<div class="body-box" style="float:left">

	<form id="form111" name="form111" action="/system/permission/add.do" method="post">
		<input type="hidden" id="parentModuleId" name="sysPermissionCustom.parentModuleId" value="${p_ms.moduleId }" />
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>权限名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="permissionName" name="sysPermissionCustom.permissionName" class="text state" maxlength="25" />
						<br/>
						<label for="permissionName" class="error" style="display: none;"></label>
					</td>
				</tr>

				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>权限描述:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="permissionDescription" name="sysPermissionCustom.permissionDescription" class="text statelong" maxlength="200" />
						<br/>
						<label for="permissionDescription" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>权限方法:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="permissionMethod" name="sysPermissionCustom.permissionMethod" class="text statelong" maxlength="200" />
						<br/>
						<label for="permissionMethod" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>权限图标:
					</td>
					<td width="80%" class="pn-fcontent">

						<select id="permissionIcon" name="sysPermissionCustom.permissionIcon">
							<c:forEach items="${sysDictInfoCustomList }" var="entry">
								<option><span class="tabs-icon ${entry.infoValue }"></span> ${entry.infoValue }</option>
							</c:forEach>
						</select>
						<br/>
						<label for="permissionIcon" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>显示顺序:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="showorder" name="sysPermissionCustom.showorder" class="text state" maxlength="25" />
						<br/>
						<label for="showorder" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否可用:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="sysPermissionCustom.isEnable" value="1" checked="checked" />是 &nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="sysPermissionCustom.isEnable" value="0" />否
						<br/>
						<label for="sysPermissionCustom.isEnable" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>所属父权限:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="parentModuleName" name="sysPermissionCustom.parentModuleName" value="${p_ms.moduleName }" disabled="disabled" class="text state" maxlength="25" />
					</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
					<td class="pn-fbutton" colspan="2">
						<a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href="#" onclick="moduleSave()">提交</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a id="closebtn" class="easyui-linkbutton" iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">关闭</a>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</div>
</body>

</html>