<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("#inputType").change(function() {
			var value = $("#inputType").val();
			if(value == 4) {
				$("#a1").hide();
			} else {
				$("#a1").show();
			}
			if(value == "") {
				$("#g1").removeAttr("disabled");
				$("#g1").removeAttr("checked");
				$("#g2").removeAttr("disabled");
				$("#g2").removeAttr("checked");
				$("#t1").removeAttr("disabled");
				$("#t1").removeAttr("checked");
				$("#t2").removeAttr("disabled");
				$("#t2").removeAttr("checked");

			}
			if(value == 2) {
				$("#g1").removeAttr("disabled");
				$("#g1").attr("checked", "checked");
				$("#g2").removeAttr("disabled");
				$("#t1").attr("disabled", "disabled");
				$("#t2").removeAttr("disabled");
				$("#t2").attr("checked", "checked");
			}
			if(value == 1) {
				$("#g1").removeAttr("checked");
				$("#g1").attr("disabled", "disabled");
				$("#g2").removeAttr("disabled");
				$("#g2").attr("checked", "checked");
				$("#t1").removeAttr("disabled");
				$("#t1").attr("checked", "checked");
				$("#t2").removeAttr("disabled");
			}
			if(value == 3 || value == 4) {
				$("#t1").removeAttr("checked");
				$("#t1").attr("disabled", "disabled");
				$("#g1").removeAttr("checked");
				$("#g1").attr("disabled", "disabled");
				$("#t2").removeAttr("disabled");
				$("#t2").attr("checked", "checked");
				$("#g2").removeAttr("disabled");
				$("#g2").attr("checked", "checked");
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

		$("#form111").submit(function() {
			var obj = $("#selectValues");
			var feature = $("#featureName");
			var featurename = feature.val();
			var inputType = $("#inputType").val(); //判断是那种类型
			var selectValues = obj.val(); //判断是那种类型
			//可选择如果有中文逗号，转换成英文逗号
			selectValues = selectValues.replace(/，/ig, ',');
			document.getElementById("selectValues").value = selectValues;
			var nameReg = new RegExp("^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$");
			if($.trim(featurename).length == 0 || $.trim(featurename).length > 25 || !nameReg.test(featurename)) {
				feature.siblings("span").addClass("err").html("必须是中英文或数字字符，长度1-25");
				return false;
			}
			var sort = $("#featureSort");
			var featureSort = sort.val();
			var sortReg = new RegExp("^[1-9][0-9]{0,2}$");

			if($.trim(featureSort).length == 0 || !sortReg.test(featureSort)) {
				sort.siblings("span").addClass("err").html("必须是1-999正整数");
				return false;
			}

			if(inputType != 4) {
				var values = selectValues.split(",");
				if($.trim(values).length == 0) {
					obj.siblings("span").addClass("err").html("可选值不能为空，单个选项长度1-20");
					return false;
				} else {
					obj.siblings("span").addClass("err").html("");
				}

				var reg = new RegExp("^(.{1,20})$");

				if(values.length > 99) {
					obj.siblings("span").addClass("err").html(
						"单选项个数最大不能大于100个");
					return false;
				}
				var errNum = 0;
				var errValue = "";
				for(var a = 0; a < values.length; a++) {
					if($.trim(values[a]).length == 0) {
						obj.siblings("span").addClass("err").html("单选项中两个英文逗号之间不能有空格");
						return false;
					}
					if(!reg.test(values[a])) {
						errNum += 1;
						errValue = values[a];
						//obj.siblings("span").addClass("err").html("可选值中存在超出限制的字符数");
						//return false;
					}
				}

				if(errNum == 1) {
					obj.siblings("span").addClass("err").html("单选项中" + errValue + "长度超出限制");
					return false;
				} else if(errNum > 1) {
					obj.siblings("span").addClass("err").html("可选值中存在超出限制的字符数");
					return false;
				}

			}
			return true;
		});

	});

	function backList(url) {
		document.location = url;
	}

	function moduleSave() {
		//if($.formValidator.pageIsValid()){ // 校验
		// from id, 回调函数,param 回调函数参数(如果为null,那么调用一个参数的回调函数,否则调用两个参数的回调函数)//返回的数据类型
		jquerySubByFId('form111', moduleSave_callback, null, "json");
		//}

	}

	function moduleSave_callback(data) {
		ma_message_alert(data);
		//  	var result = getCallbackData(data);
		//  	var type = result.type;
		//  	_alert(result);
		/* if (TYPE_RESULT_SUCCESS == type) {
			ypxxedit_toback();
			ypxxquery();//重新查询数据
		}  */

		parent.queryType('${p_tc.typeId }');

	}
</script>
</head>

<body>
<div class="body-box" style="float:left">

	<form id="form111" name="form111" action="/resourt/feature/edit.do" method="post">
		<input type="hidden" name="resFeatureCustom.featureId" value="${resFeatureCustom.featureId }" />
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>属性名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="featureName" name="resFeatureCustom.featureName" class="text state" maxlength="100" value="${resFeatureCustom.featureName }" />
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>属性类型:
					</td>
					<td width="80%" class="pn-fcontent">
						<select id="inputType" name="resFeatureCustom.inputType" class="select">
							<option value="">请选择</option>
							<option value="1" <c:if test='${resFeatureCustom.inputType==1}'>selected</c:if>>下拉列表</option>
							<option value="2" <c:if test='${resFeatureCustom.inputType==2}'>selected</c:if>>单选</option>
							<option value="3" <c:if test='${resFeatureCustom.inputType==3}'>selected</c:if>>复选</option>
							<option value="4" <c:if test='${resFeatureCustom.inputType==4}'>selected</c:if>>文本</option>
						</select>
						<span></span>
					</td>
				</tr>
				<tr id="a1" <c:if test='${resFeatureCustom.inputType==4}'> style="display:none"</c:if>>
					<td width="20%" class="pn-flabel pn-flabel-h">可选值:</td>
					<td width="80%" class="pn-fcontent">
						<table id="table_value">
							<tbody id="tbody1">
								<c:if test='${resFeatureCustom.inputType == 1}'>
									<c:forEach items="${resFeatureCustom.resFeatureValueCustomList }" var="entry">
										列表项：<input class='inputvalue' name='featureValueValues' value='${entry.featureValueValue }' />
										<a class='easyui-linkbutton' href='#' onclick='delinput(this)'>删除</a>
									</c:forEach>
								</c:if>
							</tbody>
							<tbody id="tbody2">
								<c:if test='${resFeatureCustom.inputType == 1}'>
									<c:forEach items="${resFeatureCustom.resFeatureValueCustomList }" var="entry">
										单选：<input class='inputvalue' name='featureValueValues' value='${entry.featureValueValue }' />
										<a class='easyui-linkbutton' href='#' onclick='delinput(this)'>删除</a>
									</c:forEach>
								</c:if>
							</tbody>
							<tbody id="tbody3">
								<c:if test='${resFeatureCustom.inputType == 1}'>
									<c:forEach items="${resFeatureCustom.resFeatureValueCustomList }" var="entry">
										复选：<input class='inputvalue' name='featureValueValues' value='${entry.featureValueValue }' />
										<a class='easyui-linkbutton' href='#' onclick='delinput(this)'>删除</a>
									</c:forEach>
								</c:if>
							</tbody>
							<tbody id="tbody4">
								<c:if test='${resFeatureCustom.inputType == 1}'>
									<c:forEach items="${resFeatureCustom.resFeatureValueCustomList }" var="entry">
										文本名：<input class='inputvalue' name='featureValueNames' value='${entry.featureValueName }' /> 文本值：<input class='inputvalue' name='featureValueValues' value='${entry.featureValueValue }' />
										<a class='easyui-linkbutton' href='#' onclick='delinput(this)'>删除</a>
									</c:forEach>
								</c:if>
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
						<input type="text" id="featureSort" class="text small" name="resFeatureCustom.showorder" maxlength="3" size="3" value="${resFeatureCustom.featureSort }" />
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">规格属性:</td>
					<td width="80%" class="pn-fcontent">
						<input id="g1" type="radio" name="resFeatureCustom.isSpec" value="1" <c:if test="${resFeatureCustom.isSpec == 1 }">checked="checked"</c:if> />是&nbsp;&nbsp;&nbsp;&nbsp;
						<input id="g2" type="radio" name="resFeatureCustom.isSpec" value="0" <c:if test="${resFeatureCustom.isSpec == 0 }">checked="checked"</c:if> />否
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">筛选条件:</td>
					<td width="80%" class="pn-fcontent">
						<input id="t1" type="radio" name="resFeatureCustom.isSelect" value="1" <c:if test="${resFeatureCustom.isSelect == 1 }">checked="checked"</c:if> />是 &nbsp;&nbsp;&nbsp;&nbsp;
						<input id="t2" type="radio" name="resFeatureCustom.isSelect" value="0" <c:if test="${resFeatureCustom.isSelect == 0 }">checked="checked"</c:if> />否
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否显示:</td>
					<td width="80%" class="pn-fcontent">
						<input type="radio" name="resFeatureCustom.isShow" value="1" <c:if test='${resFeatureCustom.isShow==1}'>checked="checked"</c:if> />是 &nbsp;&nbsp;&nbsp;&nbsp;
						<input type="radio" name="resFeatureCustom.isShow" value="0" <c:if test='${resFeatureCustom.isShow==0}'>checked="checked"</c:if> />否
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">父节点:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeName" name="resFeatureCustom.typeName" disabled="disabled" class="text state" maxlength="25" value="${resFeatureCustom.typeName }" />
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