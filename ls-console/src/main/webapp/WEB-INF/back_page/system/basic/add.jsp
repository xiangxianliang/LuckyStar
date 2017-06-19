<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	var valid = {
		rules: {
			"sysBasicInfoCustom.basicInfoName": {
				required: true, // 必须输入
				rangelength: [1, 30], //输入长度必须介于 1 和 30 之间的字符串（汉字算一个字符）。
				remote: {
					url: "/system/basicInfo/checkBasicInfo.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式   
				},
			},
			"sysBasicInfoCustom.basicInfoValue": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysBasicInfoCustom.basicInfoType": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysBasicInfoCustom.basicInfoTag": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysBasicInfoCustom.basicInfoDescription": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysBasicInfoCustom.basicInfoRemark": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysBasicInfoCustom.isEnable": {
				required: true, // 必须输入
			},
		},
		messages: {
			"sysBasicInfoCustom.basicInfoName": {
				required: "基础信息名称必须输入", // 必须输入
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				remote: "存在相同的基础信息",
			},
			"sysBasicInfoCustom.basicInfoValue": {
				required: "基础信息配置值必须输入", // 必须输入
				rangelength: "基础信息URL在{0}-{1}之间",
			},
			"sysBasicInfoCustom.basicInfoType": {
				required: "基础信息名称必须输入", // 必须输入
				rangelength: "基础信息URL在{0}-{1}之间",
			},
			"sysBasicInfoCustom.basicInfoTag": {
				required: "基础信息类型必须输入", // 必须输入
				rangelength: "基础信息URL在{0}-{1}之间",
			},
			"sysBasicInfoCustom.basicInfoDescription": {
				rangelength: "基础信息描述长度在{0}-{1}之间（汉字算一个字符）",
			},
			"sysBasicInfoCustom.basicInfoRemark": {
				rangelength: "基础信息备注长度在{0}-{1}之间（汉字算一个字符）",
			},
			"sysBasicInfoCustom.isEnable": {
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

	function basicSave() {
		if($("#form111").valid()) {
			// from id, 回调函数,param 回调函数参数(如果为null,那么调用一个参数的回调函数,否则调用两个参数的回调函数)//返回的数据类型
			jquerySubByFId('form111', basicSave_callback, null, "json");
		}
	}
	// 表单 回调
	function basicSave_callback(data) {
		mcoc_message_alert(data, method_cancel, method_ok);
	}
	// 确定按钮
	function method_ok(data) {
		// 执行父窗口操作
		parentOperate(data);
		// 清空表单
		$("#form111").resetForm();
	}
	// 取消按钮
	function method_cancel() {
		// 执行父窗口操作
		parentOperate(data);
	}
	// 执行父窗口操作
	function parentOperate(data) {
		// 刷新页面 datagrid
		parent.reload();
	}
	$(function() {
		$("#form111").validate(valid);
	});
</script>
</head>

<body>
<div class="box-positon">
	<div class="rpos">当前位置: 配置 - 编辑</div>
	<div class="clear"></div>
</div>
<div class="body-box" style="float:left">

	<form id="form111" name="form111" action="/system/basic/add.do" method="post">
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>配置名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="name" name="sysBasicInfoCustom.basicInfoName" class="text state" maxlength="25" />
						<br/>
						<label for="basicInfoName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>配置值:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="value" name="sysBasicInfoCustom.basicInfoValue" class="text statelong" maxlength="200" />
						<br/>
						<label for="basicInfoValue" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>类型:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="type" name="sysBasicInfoCustom.basicInfoType" class="text state" maxlength="200" />
						<br/>
						<label for="basicInfoType" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>标签:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="tag" name="sysBasicInfoCustom.basicInfoTag" class="text state" maxlength="200" />
						<br/>
						<label for="basicInfoTag" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>描述:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="tag" name="sysBasicInfoCustom.basicInfoDescription" class="text statelong" maxlength="200" />
						<br/>
						<label for="basicInfoDescription" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>备注:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="tag" name="sysBasicInfoCustom.basicInfoRemark" class="text statelong" maxlength="200" />
						<br/>
						<label for="basicInfoRemark" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否可用:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="sysBasicInfoCustom.isEnable" value="1" checked="checked" />是 &nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="sysBasicInfoCustom.isEnable" value="0" />否
						<br/>
						<label for="sysBasicInfoCustom.isEnable" class="error" style="display: none;"></label>
					</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
					<td class="pn-fbutton" colspan="2">
						<a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href="#" onclick="basicSave()">提交</a>
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