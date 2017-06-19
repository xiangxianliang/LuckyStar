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
		mcoc_message_alert(data, method_cancel, method_ok);
	}

	// 确定按钮回调函数
	function method_ok(data) {
		// 执行父窗口操作
		parentOperate(data);

		// 清空当前表单
		$("#form111").resetForm();
	}

	// 取消按钮回调函数
	function method_cancel(data) {
		// 执行父窗口操作
		parentOperate(data);
	}

	// 执行父窗口操作
	function parentOperate(data) {
		// 刷新页面 datagrid
		parent.reload();
		// 向树 添加新的节点
		var typeId = data.resultInfo.sysdata['typeId'];
		//alert(typeId);
		parent.add(typeId);

	}

	$(function() {
		$("#form111").validate(valid);
	});
</script>
</head>

<body>
<div class="body-box" style="float:left">

	<form id="form111" name="form111" action="/system/dictionary/addType.do" method="post">
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>类型名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeName" name="sysDictTypeCustom.typeName" class="text state" maxlength="25" />
						<br/>
						<label for="typeName" class="error" style="display: none;"></label>
					</td>
				</tr>

				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>类型描述:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeDescription" name="sysDictTypeCustom.typeDescription" class="text statelong" maxlength="200" />
						<br/>
						<label for="typeDescription" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>类型备注:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeRemark" name="sysDictTypeCustom.typeRemark" class="text statelong" maxlength="200" />
						<br/>
						<label for="typeRemark" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>显示顺序:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="showorder" name="sysDictTypeCustom.showorder" class="text state" maxlength="25" />
						<br/>
						<label for="showorder" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否可用:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="sysDictTypeCustom.isEnable" value="1" checked="checked" />是
						&nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="sysDictTypeCustom.isEnable" value="0" />否
						<br/>
						<label for="sysDictTypeCustom.isEnable" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>所属父字典类型:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="parentName" name="sysDictTypeCustom.parentName" disabled="disabled" class="text state" value="系统跟数据节点" />
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