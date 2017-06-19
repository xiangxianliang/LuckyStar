<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	var valid = {
		rules: {
			"sysRoleCustom.roleName": {
				required: true, // 必须输入
				rangelength: [1, 30], //输入长度必须介于 1 和 30 之间的字符串（汉字算一个字符）。
				remote: {
					url: "/system/role/checkRole.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式   
					"roleId": function() {
						return $("#roleId").val();
					},
				},
			},
			"sysRoleCustom.moduleDescription": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysRoleCustom.roleRemark": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysRoleCustom.isEnable": {
				required: true, // 必须输入
			},
		},
		messages: {
			"sysRoleCustom.moduleName": {
				required: "角色名称必须输入", // 必须输入
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				remote: "存在相同的角色",
			},
			"sysRoleCustom.moduleDescription": {
				rangelength: "角色描述长度在{0}-{1}之间（汉字算一个字符）",
			},
			"sysRoleCustom.roleRemark": {
				rangelength: "角色备注长度在{0}-{1}之间（汉字算一个字符）",
			},
			"sysRoleCustom.isEnable": {
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

	function roleSave() {
		if($("#form111").valid()) {
			jquerySubByFId('form111', roleSave_callback, null, "json");
		}
	}

	function roleSave_callback(data) {
		mao_message_alert(data, method_ok);
	}

	function method_ok(data) {
		// 刷新页面 
		parent.reload();
	}
</script>
</head>

<body>
<div class="box-positon">
	<div class="rpos">当前位置: 角色 - 编辑</div>
	<div class="clear"></div>
</div>
<div class="body-box" style="float:left">
	<form id="form111" name="form111" action="/system/role/edit.do" method="post">
		<input type="hidden" id="roleId" name="sysRoleCustom.roleId" value="${sysRoleCustom.roleId }" />
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>角色名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="roleName" name="sysRoleCustom.roleName" value="${sysRoleCustom.roleName }" />
						<br/>
						<label for="roleName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>角色描述:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="roleDescription" name="sysRoleCustom.roleDescription" value="${sysRoleCustom.roleDescription }" class="text statelong" maxlength="200" />
						<br/>
						<label for="roleDescription" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>角色备注:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="roleRemark" name="sysRoleCustom.roleRemark" value="${sysRoleCustom.roleRemark }" class="text statelong" maxlength="200" />
						<br/>
						<label for="roleRemark" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否可用:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="sysRoleCustom.isEnable" value="1" <c:if test="${sysRoleCustom.isEnable == 1 }">checked="checked"</c:if> />是
						 &nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="sysRoleCustom.isEnable" value="0" <c:if test="${sysRoleCustom.isEnable == 0 }">checked="checked"</c:if> />否
						<br/>
						<label for="sysRoleCustom.isEnable" class="error" style="display: none;"></label>
					</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
					<td class="pn-fbutton" colspan="2">
						<a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href="#" onclick="roleSave()">提交</a>
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