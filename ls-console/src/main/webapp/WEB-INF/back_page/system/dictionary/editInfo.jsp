<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	var valid = {
		rules: {
			"sysDictInfoCustom.infoDescription": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysDictInfoCustom.infoRemark": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysDictInfoCustom.infoValue": {
				required: true, // 必须输入
				rangelength: [1, 30], //输入长度必须介于 1 和 30 之间的字符串（汉字算一个字符）。
				remote: {
					url: "/system/dictionary/checkDictInfo.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式 
					data: { //要传递的数据
						"sysDictInfoCustom.typeId": function() {
							return $("#typeId").val();
						},
						"infoId": function() {
							return $("#infoId").val();
						},
						
					}
				},
			},
			"sysDictInfoCustom.valueType": {
				required: true, // 必须输入
			},
			"sysDictInfoCustom.showorder": {
				digits: true, //必须输入整数。
				range: [100, 999999],
			},
			"sysDictInfoCustom.isEnable": {
				required: true, // 必须输入
			},
		},
		messages: {
			"sysDictInfoCustom.infoDescription": {
				rangelength: "字典描述长度在{0}-{1}之间（汉字算一个字符）",
			},
			"sysDictInfoCustom.infoRemark": {
				required: "字典备注必须输入", // 必须输入
				rangelength: "字典备注在{0}-{1}之间",
			},
			"sysDictInfoCustom.infoValue": {
				required: "字典字典值必须输入", // 必须输入
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				remote: "存在相同的字典值",
			},
			"sysDictInfoCustom.valueType": {
				required: "必须选择项", //
			},
			"sysDictInfoCustom.showorder": {
				digits: "必须输入整数", //。
				range: "整数在{0}-{1}之间",
			},
			"sysDictInfoCustom.isEnable": {
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
		// from id, 回调函数,param 回调函数参数(如果为null,那么调用一个参数的回调函数,否则调用两个参数的回调函数)//返回的数据类型
			jquerySubByFId('form111', dictionarySave_callback, null, "json");
		}
	}
	function dictionarySave_callback(data) {
		mao_message_alert(data,method_ok);
	}
	function method_ok(data) {
		// 刷新页面 
		parent.reload();
	}

	$(function() {
		$("#form111").validate(valid);
	});
</script>
</head>

<body>
<div class="box-positon">
	<div class="rpos">当前位置: 字典信息 - 编辑</div>
	<div class="clear"></div>
</div>
<div class="body-box" style="float:left;">

	<form id="form111" name="form111" action="/system/dictionary/editInfo.do" method="post">
		<input type="hidden" id="typeId" name="sysDictInfoCustom.typeId" value="${sysDictInfoCustom.typeId }" />
		<input type="hidden" id="infoId" name="sysDictInfoCustom.infoId" value="${sysDictInfoCustom.infoId }" />
		
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>描述:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="infoDescription" name="sysDictInfoCustom.infoDescription" class="text statelong" maxlength="200" value="${sysDictInfoCustom.infoDescription }" />
						<br/>
						<label for="infoDescription" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>备注:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="infoRemark" name="sysDictInfoCustom.infoRemark" class="text statelong" maxlength="200" value="${sysDictInfoCustom.infoRemark }" />
						<br/>
						<label for="infoRemark" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>字典值:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="valueType" name="sysDictInfoCustom.infoValue" class="text state" maxlength="25" value="${sysDictInfoCustom.infoValue }" />
						<br/>
						<label for="infoValue" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">值类型:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="sysDictInfoCustom.valueType" value="1" <c:if test="${sysDictInfoCustom.valueType == 1 }">checked="checked"</c:if> />业务字段 
						&nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="sysDictInfoCustom.valueType" value="0" <c:if test="${sysDictInfoCustom.valueType == 0 }">checked="checked"</c:if> />字典字段
						<br/>
						<label for="valueType" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>显示顺序:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="showorder" name="sysDictInfoCustom.showorder" class="text state" maxlength="25" value="${sysDictInfoCustom.showorder }" />
						<br/>
						<label for="showorder" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否可用:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="sysDictInfoCustom.isEnable" value="1" <c:if test="${sysDictInfoCustom.isEnable == 1 }">checked="checked"</c:if> />是 
						&nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="sysDictInfoCustom.isEnable" value="0" <c:if test="${sysDictInfoCustom.isEnable == 0 }">checked="checked"</c:if> />否
						<br/>
						<label for="sysDictInfoCustom.isEnable" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>所属父字典信息:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeName" disabled="disabled" class="text state" maxlength="25" value="${sysDictTypeCustom.typeName }" />
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