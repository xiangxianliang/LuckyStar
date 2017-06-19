<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	var valid = {
		rules: {
			"sysModuleCustom.moduleName": {
				required: true, // 必须输入
				rangelength: [1, 30], //输入长度必须介于 1 和 30 之间的字符串（汉字算一个字符）。
				remote: {
					url: "/system/module/checkModule.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式   
					data: { //要传递的数据
						"sysModuleCustom.parentId": function() {
							return $("#parentId").val();
						},
					}
				},
			},
			"sysModuleCustom.moduleDescription": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysModuleCustom.moduleUrl": {
				required: true, // 必须输入
				rangelength: [0, 200],
				remote: {
					url: "/system/module/checkModule.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式   
					data: { //要传递的数据
						"sysModuleCustom.parentId": function() {
							return $("#parentId").val();
						},
					}
				},
			},
			"sysModuleCustom.moduleIcon": {
				required: false, // 必须输入
				rangelength: [0, 200],
			},
			"sysModuleCustom.showorder": {
				digits: true, //必须输入整数。
				range: [100, 999999],
			},
			"sysModuleCustom.isAvailable": {
				required: true, // 必须输入
			},
		},
		messages: {
			"sysModuleCustom.moduleName": {
				required: "模块名称必须输入", // 必须输入
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				remote: "存在相同的模块",
			},
			"sysModuleCustom.moduleDescription": {
				rangelength: "模块描述长度在{0}-{1}之间（汉字算一个字符）",
			},
			"sysModuleCustom.moduleUrl": {
				required: "模块名称必须输入", // 必须输入
				rangelength: "模块URL在{0}-{1}之间",
				remote: "存在相同的URL",
			},
			"sysModuleCustom.moduleIcon": {
				rangelength: "模块图标在{0}-{1}之间",
			},
			"sysModuleCustom.showorder": {
				digits: "必须输入整数", //。
				range: "整数在{0}-{1}之间",
			},
			"sysModuleCustom.isEnable": {
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
			jquerySubByFId('form111', moduleSave_callback, null, "json");
		}
	}
	// 表单回调
	function moduleSave_callback(data) {
		mcoc_message_alert(data, method_cancel, method_ok);
	}
	// 确定
	function method_ok(data) {
		// 执行父窗口操作
		parentOperate(data);
		// 保存 排序字段
		var showorder = parseInt($("#showorder").val());
		// 清空表单
		$("#form111").resetForm();
		// 设置会 排序字段
		$("#showorder").val(showorder + 100);
	}
	// 取消
	function method_cancel(data) {
		// 执行父窗口操作
		parentOperate(data);
	}

	// 执行父窗口操作
	function parentOperate(data) {
		// 刷新页面 datagrid
		parent.reload();
		// 向树 添加新的节点
		var moduleId = data.resultInfo.sysdata['moduleId'];
		//alert(typeId);
		parent.add(moduleId);
	}

	$(function() {
		$("#form111").validate(valid);
	});
</script>
</head>

<body>
<div class="body-box" style="float:left">

	<form id="form111" name="form111" action="/system/module/add.do" method="post">
		<input type="hidden" id="parentId" name="sysModuleCustom.parentId" value="${p_ms.moduleId }" />
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>模块名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="moduleName" name="sysModuleCustom.moduleName" class="text state" maxlength="25" />
						<br/>
						<label for="moduleName" class="error" style="display: none;"></label>
					</td>
				</tr>

				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						模块描述:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="moduleDescription" name="sysModuleCustom.moduleDescription" class="text statelong" maxlength="200" />
						<br/>
						<label for="moduleDescription" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>模块URL:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="moduleUrl" name="sysModuleCustom.moduleUrl" class="text statelong" maxlength="200" />
						<br/>
						<label for="moduleUrl" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						模块图片:
					</td>
					<td width="80%" class="pn-fcontent">
						<select id="moduleIcon" name="sysModuleCustom.moduleIcon">
							<c:forEach items="${sysDictInfoCustomList }" var="entry">
								<option><span class="tabs-icon ${entry.infoValue }"></span> ${entry.infoValue }</option>
							</c:forEach>
						</select>
						<br/>
						<label for="moduleIcon" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>显示顺序:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="showorder" name="sysModuleCustom.showorder" class="text state" maxlength="25" />
						<br/>
						<label for="showorder" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>是否可用:
					</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="sysModuleCustom.isEnable" value="1" checked="checked" />是 &nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="sysModuleCustom.isEnable" value="0" />否
						<br/>
						<label for="sysModuleCustom.isEnable" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>所属父模块:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="parentName" name="sysModuleCustom.parentName" disabled="disabled" class="text state" value="${p_ms.moduleName }" />
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