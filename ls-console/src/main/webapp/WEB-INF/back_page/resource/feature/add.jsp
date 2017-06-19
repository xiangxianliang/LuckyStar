<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	// 	var value_old;

	// 	var $tb_;
	// 	var $tb_1;
	// 	var $tb_2;
	// 	var $tb_3;
	// 	var $tb_4;

	$(document).ready(function() {

		$("#inputType").change(function() {

			// 			IF(VALUE_OLD == "1") {
			// 				$TB_1 = $("#TBODY");

			// 			} ELSE IF(VALUE_OLD == "2") {
			// 				$TB_2 = $("#TBODY");

			// 			} ELSE IF(VALUE_OLD == "3") {
			// 				$TB_3 = $("#TBODY");

			// 			} ELSE IF(VALUE_OLD == "4") {
			// 				$TB_4 = $("#TBODY");

			// 			} ELSE {
			// 				$TB_ = $("#TBODY");
			// 			}

			var value = $("#inputType").val();
			// 			value_old = value;

			// 			$("#table_value").empty();
			// 			$("#table_value").append($("<tbody>").attr("id", "tbody"));

			// 			if(value == 4) {
			// 				$("#a1").hide();
			// 			} else {
			// 				$("#a1").show();
			// 			}

			if(value == "") {
				$("#g1").removeAttr("disabled");
				$("#g1").removeAttr("checked");
				$("#g2").removeAttr("disabled");
				$("#g2").removeAttr("checked");
				$("#t1").removeAttr("disabled");
				$("#t1").removeAttr("checked");
				$("#t2").removeAttr("disabled");
				$("#t2").removeAttr("checked");

				$("#tbody1").hide();
				$("#tbody2").hide();
				$("#tbody3").hide();
				$("#tbody4").hide();

			}
			if(value == 1) {
				$("#g1").removeAttr("checked");
				$("#g1").attr("disabled", "disabled");
				$("#g2").removeAttr("disabled");
				$("#g2").attr("checked", "checked");
				$("#t1").removeAttr("disabled");
				$("#t1").attr("checked", "checked");
				$("#t2").removeAttr("disabled");

				$("#tbody1").show();
				$("#tbody2").hide();
				$("#tbody3").hide();
				$("#tbody4").hide();

			}
			if(value == 2) {
				$("#g1").removeAttr("disabled");
				$("#g1").attr("checked", "checked");
				$("#g2").removeAttr("disabled");
				$("#t1").attr("disabled", "disabled");
				$("#t2").removeAttr("disabled");
				$("#t2").attr("checked", "checked");

				$("#tbody1").hide();
				$("#tbody2").show();
				$("#tbody3").hide();
				$("#tbody4").hide();

			}
			if(value == 3) {
				$("#t1").removeAttr("checked");
				$("#t1").attr("disabled", "disabled");
				$("#g1").removeAttr("checked");
				$("#g1").attr("disabled", "disabled");
				$("#t2").removeAttr("disabled");
				$("#t2").attr("checked", "checked");
				$("#g2").removeAttr("disabled");
				$("#g2").attr("checked", "checked");

				$("#tbody1").hide();
				$("#tbody2").hide();
				$("#tbody3").show();
				$("#tbody4").hide();

			}
			if(value == 4) {
				$("#t1").removeAttr("checked");
				$("#t1").attr("disabled", "disabled");
				$("#g1").removeAttr("checked");
				$("#g1").attr("disabled", "disabled");
				$("#t2").removeAttr("disabled");
				$("#t2").attr("checked", "checked");
				$("#g2").removeAttr("disabled");
				$("#g2").attr("checked", "checked");

				$("#tbody1").hide();
				$("#tbody2").hide();
				$("#tbody3").hide();
				$("#tbody4").show();

			}
		});

		$("#g1").click(function() {
			var value = $("#inputType").val();
			if(value == 3 || value == 4 || value == 1) {
				return false;
			} else {
				$("#t1").attr("disabled", true);
				$("#t2").attr("checked", true);
			}
			return true;
		});

		$("#g2").click(function() {
			var value = $("#inputType").val();
			if(value == 3 || value == 4 || value == 1) {
				return false;
			} else {
				$("#g1").removeAttr("disabled");
				$("#g2").removeAttr("disabled");
				$("#t1").removeAttr("disabled");
				$("#t2").removeAttr("disabled");
			}
			return true;
		});
		$(".inputvalue").live("blur", function() {
			var val = $(this).val();
			//alert(val);
			$(this).val(val);
		});
	});

	var valid = {
		rules: {
			"resFeatureCustom.featureName": {
				required: true, // 必须输入
				rangelength: [1, 30], //输入长度必须介于 1 和 30 之间的字符串（汉字算一个字符）。
				remote: {
					url: "/system/module/checkFeature.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式   
					data: { //要传递的数据
						"resFeatureCustom.typeId": function() {
							return $("#typeId").val();
						},
					}
				},
			},
			"resFeatureCustom.inputType": {
				required: true, // 必须输入
			},
			"resFeatureCustom.selectValue": {
				required: true, // 必须输入
			},
			"resFeatureCustom.showorder": {
				digits: true, //必须输入整数。
				range: [100, 999999],
			},
			"resFeatureCustom.isSpec": {
				required: true, // 必须输入
			},
			"resFeatureCustom.isSelect": {
				required: true, // 必须输入
			},
			"resFeatureCustom.isShow": {
				required: true, // 必须输入
			},
		},
		messages: {
			"resFeatureCustom.featureName": {
				required: "必须输入项",
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				remote: "存在相同",
			},
			"resFeatureCustom.inputType": {
				required: "必须输入项",
			},
			"resFeatureCustom.selectValue": {
				required: "必须输入项",
			},
			"resFeatureCustom.showorder": {
				digits: "必须输入整数",
				range: "长度在{0}-{1}之间（汉字算一个字符）",
			},
			"resFeatureCustom.isSpec": {
				required: "必须输入项",
			},
			"resFeatureCustom.isSelect": {
				required: "必须输入项",
			},
			"resFeatureCustom.isShow": {
				required: "必须输入项",
			},
			errorElement: "label", //用来创建错误提示信息标签,validate插件默认的就是label
			success: function(label) { //验证成功后的执行的回调函数
				//label指向上面那个错误提示信息标签label
				label.text(" ") //清空错误提示消息
				//.addClass("success"); //加上自定义的success类
			}
		},
	};

	function backList(url) {
		document.location = url;
	}

	function delinput(ta) {
		//alert(1);
		$(ta).parent().parent().remove();
	}

	function add() {

		var value = $("#inputType").val();
		if(value == "") {
			alert("请选择属性类型!!!");
			return;
		}

		if(value == "1") {
			var input = ("列表项：<input class='inputvalue' name='featureValueValues' value=''/> <a class='easyui-linkbutton' href='#' onclick='delinput(this)'>删除</a>");
			//var tr = "<tr><td>"+input+"<tr/><td/>";
			var $td = $("<td/>").html(input);
			var $tr = $("<tr/>").append($td);
			$("#tbody1").append($tr);

		} else if(value == "2") {
			var input = ("单选：<input class='inputvalue' name='featureValueValues' value=''/> <a class='easyui-linkbutton' href='#' onclick='delinput(this)'>删除</a>");
			var $td = $("<td/>").html(input);
			var $tr = $("<tr/>").append($td);
			$("#tbody2").append($tr);

		} else if(value == "3") {
			var input = ("复选：<input class='inputvalue' name='featureValueValues' value=''/> <a class='easyui-linkbutton' href='#' onclick='delinput(this)'>删除</a>");
			var $td = $("<td/>").html(input);
			var $tr = $("<tr/>").append($td);
			$("#tbody3").append($tr);

		} else if(value == "4") {
			var input = ("文本名：<input class='inputvalue' name='featureValueNames' value='' /> 文本值：<input class='inputvalue' name='featureValueValues' value='' /> <a class='easyui-linkbutton' href='#' onclick='delinput(this)'>删除</a>");
			var $td = $("<td/>").html(input);
			var $tr = $("<tr/>").append($td);
			$("#tbody4").append($tr);

		} else {
			$("#tbody1").hide();
			$("#tbody2").hide();
			$("#tbody3").hide();
			$("#tbody4").hide();
		}

	}

	function save() {
		if($("#form111").valid()) {
			// from id, 回调函数,param 回调函数参数(如果为null,那么调用一个参数的回调函数,否则调用两个参数的回调函数)//返回的数据类型
			var value = $("#inputType").val();

			if(value != 1) {
				$("#tbody1").remove();
			}
			if(value != 2) {
				$("#tbody2").remove();
			}
			if(value != 3) {
				$("#tbody3").remove();
			}
			if(value != 4) {
				$("#tbody4").remove();
			}

			jquerySubByFId('form111', save_callback, null, "json");
		}

	}
	// 表单回调
	function save_callback(data) {
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
	}
</script>
</head>

<body>
<div class="body-box" style="float:left">

	<form id="form111" name="form111" action="/resource/feature/add.do" method="post">
		<input id="typeId" type="hidden" name="resFeatureCustom.typeId" value="${p_tc.typeId }" />
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>属性名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="featureName" name="resFeatureCustom.featureName" class="text state" maxlength="100" />
						<br/>
						<label for="moduleName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>属性类型:
					</td>
					<td width="80%" class="pn-fcontent">
						<select id="inputType" name="resFeatureCustom.inputType" class="select">
							<option value="">-请选择-</option>
							<option value="1">下拉列表</option>
							<option value="2">单选</option>
							<option value="3">复选</option>
							<option value="4">文本</option>
						</select>
						<br/>
						<label for="moduleName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr id="a1">
					<td width="20%" class="pn-flabel pn-flabel-h">可选值:</td>
					<td width="80%" class="pn-fcontent">

						<table id="table_value">
							<tbody id="tbody1">
							</tbody>
							<tbody id="tbody2">
							</tbody>
							<tbody id="tbody3">
							</tbody>
							<tbody id="tbody4">
							</tbody>
						</table>

						<a id="submitbtn" class="easyui-linkbutton" href="#" onclick="add()">新建</a>
						<br/>
						<label for="moduleName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">排序:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="featureSort" class="text small" name="resFeatureCustom.showorder" maxlength="3" size="3" value="" />
						<br/>
						<label for="moduleName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">规格属性:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="resFeatureCustom.isSpec" value="1" />是&nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="resFeatureCustom.isSpec" value="0" />否
						<br/>
						<label for="moduleName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">筛选条件:</td>
					<td width="80%" class="pn-fcontent">
						<input id="t1" type="radio" name="resFeatureCustom.isSelect" value="1" />是&nbsp;&nbsp;&nbsp;&nbsp;
						<input id="t2" type="radio" name="resFeatureCustom.isSelect" value="0" />否
						<br/>
						<label for="moduleName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否显示:</td>
					<td width="80%" class="pn-fcontent">
						<input type="radio" name="resFeatureCustom.isShow" value="1" />是&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="radio" name="resFeatureCustom.isShow" value="0" />否
						<br/>
						<label for="moduleName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">父节点:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeName" name="resFeatureCustom.typeName" disabled="disabled" class="text state" maxlength="25" value="${p_tc.typeName }" />
					</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
					<td class="pn-fbutton" colspan="2">
						<a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href="#" onclick=save() ">提交</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a id="closebtn " class="easyui-linkbutton " iconCls="icon-cancel " href="# " onclick="parent.closemodalwindow() ">关闭</a>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</div>
</body>

</html>