<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	var valid = {
		rules: {
			"sysDictTypeCustom.typeName": {
				required: true, // 必须输入
				rangelength: [1, 30], //输入长度必须介于 1 和 30 之间的字符串（汉字算一个字符）。
				remote: {
					url: "/system/dictionary/checkDictType.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式 
					data: { //要传递的数据
						"typeId": function() {
							return $("#typeId").val();
						},
					}
				},
			},
			"sysDictTypeCustom.typeDescription": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysDictTypeCustom.typeRemark": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysDictTypeCustom.showorder": {
				digits: true, //必须输入整数。
				range: [100, 999999],
			},
			"sysDictTypeCustom.isEnable": {
				required: true, // 必须输入
			},
		},
		messages: {
			"sysDictTypeCustom.typeName": {
				required: "字典名称必须输入", // 必须输入
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				remote: "存在相同的字典",
			},
			"sysDictTypeCustom.typeDescription": {
				rangelength: "字典描述长度在{0}-{1}之间（汉字算一个字符）",
			},
			"sysDictTypeCustom.typeRemark": {
				required: "字典名称必须输入", // 必须输入
				rangelength: "字典URL在{0}-{1}之间",
				remote: "存在相同的URL",
			},
			"sysDictTypeCustom.showorder": {
				digits: "必须输入整数", //。
				range: "整数在{0}-{1}之间",
			},
			"sysDictTypeCustom.isEnable": {
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

	function dictionarySave() {
		if($("#form111").valid()) {
			jquerySubByFId('form111', dictionarySave_callback, null, "json");
		}

	}
	// 表单回调函数
	function dictionarySave_callback(data) {
		mao_message_alert(data,method_ok);
	}

	function method_ok(data) {
		// 刷新页面 
		parent.reload();
		// 父窗口 操作
		var typeId = $("#typeId").val();
		parent.edit(typeId);
	}
	
	$(function() {
		$("#form111").validate(valid);
	});
</script>
</head>

<body>
<div class="box-positon">
	<div class="rpos">当前位置: 字典类型 - 编辑</div>
	<div class="clear"></div>
</div>
<div class="body-box" style="float:left;">

	<form id="form111" name="form111" action="/system/dictionary/editType.do" method="post">
		<input type="hidden" id="typeId" name="sysDictTypeCustom.typeId" value="${sysDictTypeCustom.typeId }" />
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>类型名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeName" name="sysDictTypeCustom.typeName" class="text state" maxlength="25" value="${sysDictTypeCustom.typeName }" />
						<br/>
						<label for="typeName" class="error" style="display: none;"></label>
					</td>
				</tr>

				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>类型描述:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeDescription" name="sysDictTypeCustom.typeDescription" class="text statelong" maxlength="200" value="${sysDictTypeCustom.typeDescription }" />
						<br/>
						<label for="typeDescription" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>类型备注:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="remark" name="sysDictTypeCustom.typeRemark" class="text statelong" maxlength="200" value="${sysDictTypeCustom.typeRemark }" />
						<br/>
						<label for="typeRemark" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>显示顺序:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="showorder" name="sysDictTypeCustom.showorder" class="text state" maxlength="25" value="${sysDictTypeCustom.showorder }" />
						<br/>
						<label for="showorder" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否可用:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="sysDictTypeCustom.isEnable" value="1" <c:if test="${sysDictTypeCustom.isEnable == 1 }">checked="checked"</c:if> />是 
						&nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="sysDictTypeCustom.isEnable" value="0" <c:if test="${sysDictTypeCustom.isEnable == 0 }">checked="checked"</c:if> />否
						<br/>
						<label for="sysDictTypeCustom.isEnable" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>所属父字典类型:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="p_Name" disabled="disabled" class="text state" maxlength="25" value="系统根节点" />
						<span></span>
					</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
					<td class="pn-fbutton" colspan="2">
						<a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href="#" onclick="dictionarySave()">提交</a>
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