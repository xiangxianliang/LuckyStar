<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ichigo_Mashimaro-edit</title>
<script type="text/javascript">
function moduleSave(){
	if(judgeWetherCanSubmit()){
		jquerySubByFId('form111', moduleSave_callback, null, "json");
	}
}

function moduleSave_callback(data){
	mao_message_alert(data, method_ok(data));
}
function method_ok (data){
	// 刷新页面 
	parent.reload();
	parent.setTypeId("${ebTypeCustom.typeId }");
	parent.edit("${ebTypeCustom.typeId }");
}

</script>
</head>
<body>
<div class="box-positon">
	<div class="rpos">当前位置: 类型管理 - 编辑</div>
	<div class="ropt">
	</div>
	<div class="clear"></div>
</div>
<div class="body-box" style="float:left;">

	<form id="form111" name="form111" action="/product/type/edit.do" method="post">
		<input type="hidden" name="ebTypeCustom.typeId" value="${ebTypeCustom.typeId }"/>
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>类型名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeName" name="ebTypeCustom.typeName" value="${ebTypeCustom.typeName }" 
							class="text state" maxlength="100"
							reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25"
							url="/product/type/checkType.do?typeId=${ebTypeCustom.typeId }&parentId=${ebTypeCustom.parentId }" />
						<br/>
						<span></span>
					</td>
				</tr>
				<tr >
					<td width="20%" class="pn-flabel pn-flabel-h">类型描述：</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeDescription" name="ebTypeCustom.typeDescription" value="${ebTypeCustom.typeDescription }"
							class="text statelong" maxlength="200" size="60"
							reg="^[\S]{0,200}$" tip="可选值不能为空，单个选项长度1-20" />
						<br/>
						<span></span>
					</td>
				</tr>
				<tr >
					<td width="20%" class="pn-flabel pn-flabel-h">类型备注:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeRemark" name="ebTypeCustom.typeRemark" value="${ebTypeCustom.typeRemark }"
							class="text statelong" maxlength="200" size="60"
							reg="^[\S]{0,200}$" tip="可选值不能为空，单个选项长度1-200" /> 
						<br/>
						<span></span>
					</td>
				</tr>
				<tr >
					<td width="20%" class="pn-flabel pn-flabel-h">类型拼音码:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="pinyinCode" name="ebTypeCustom.pinyinCode" value="${ebTypeCustom.pinyinCode }"
							class="text statelong" maxlength="200" size="60"
							reg="^[\S]{0,200}$" tip="可选值不能为空，单个选项长度1-200" /> 
						<br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">类型图片:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="moduleIcon" name="ebTypeCustom.typeIcon" value="${ebTypeCustom.typeIcon }"
							class="text state" maxlength="25"
							reg="^[\w-]{0,25}$" tip="必须是中英文或数字字符，长度1-25" />
						<br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">类型顺序:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="showorder" name="ebTypeCustom.showorder" value="${ebTypeCustom.showorder }"
							class="text state" maxlength="25"
							reg="^[1-9][\d]{2,4}$" tip="必须是数字字符，大小100-99999" min="100" max="90000" requ="false" />
						<br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否可用:</td>
					<td width="80%" class="pn-fcontent">
						<input id="t1" type="radio" name="ebTypeCustom.isDisplay" value="1" 
							<c:if test="${ebTypeCustom.isDisplay == 1 }">checked="checked"</c:if> />是
						&nbsp;&nbsp;&nbsp;&nbsp;
						<input id="t2" type="radio" name="ebTypeCustom.isDisplay" value="0"
							<c:if test="${ebTypeCustom.isDisplay == 0 }">checked="checked"</c:if> />否
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">父节点:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="parentName" name="ebTypeCustom.parentName"  value="${ebTypeCustom.parentName }"
							disabled="disabled" class="text state" maxlength="25" />
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