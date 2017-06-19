<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ichigo_Mashimaro-edit</title>
<script type="text/javascript">
//上传图片
function uploadPic(){
	//定义参数
	var options = {
		url : "/upload/uploadPic.do?module=brand",
		dataType : "json",
		type :  "post",
		success : function(data){
			//回调 二个路径  
			//url
			//path
			$("#allImgUrl").attr("src",data.url);
			$("#path").val(data.path);
		}
	};
	//jquery.form使用方式
	$("#jvForm").ajaxSubmit(options);
}
function moduleSave(){
	//if($.formValidator.pageIsValid()){ // 校验
		// from id, 回调函数,param 回调函数参数(如果为null,那么调用一个参数的回调函数,否则调用两个参数的回调函数)//返回的数据类型
		//jquerySubByFId('jvForm', moduleSave_callback, null, "json");
	//}
	if(judgeWetherCanSubmit()){
		jquerySubByFId('jvForm', moduleSave_callback, null, "json");
	}

}
function moduleSave_callback(data){
	mao_message_alert(data, method_ok(data));
}
function method_ok (data){
	// 刷新页面 
	parent.reload();
}
</script>
</head>
<body>
<div class="box-positon">
	<div class="rpos">当前位置: 品牌管理 - 添加</div>
	<div class="ropt">
	</div>
	<div class="clear"></div>
</div>
<div class="body-box" style="float:left;">
	<form id="jvForm" action="/product/brand/edit.do" method="post">
	<input type="hidden" name="ebBrandCustom.brandId" value="${ebBrandCustom.brandId }" />
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>品牌名称:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" name="ebBrandCustom.brandName" value="${ebBrandCustom.brandName }" 
							class="text statelong" maxlength="100"
							reg="^[\S]{1,25}$" tip="必须是中英文或数字字符，长度1-25"
						url="/product/brand/checkBrand.do?brandId=&ebBrandCustom.typeId=${p_tc.typeId }" />
						<br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>
						上传商品图片(90x150尺寸):
					</td>
					<td width="80%" class="pn-fcontent">
						注:该尺寸图片必须为90x150。
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h"></td>
						<td width="80%" class="pn-fcontent">
						<img width="100" height="100" id="allImgUrl" src="${ebBrandCustom.allURL }"/>
						<input type="hidden" name="ebBrandCustom.imgUrl" id="path" value="${ebBrandCustom.imgUrl }" />
						<input type="file" onchange="uploadPic()" name="pic"/>
						<br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">品牌描述:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" name="ebBrandCustom.brandDescription" value="${ebBrandCustom.brandDescription}"
						 class="text statelong" maxlength="80" size="60"
						 reg="^[\S]{0,200}$" tip="可选值不能为空，单个选项长度1-200" />
						 <br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">品牌备注:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" name="ebBrandCustom.brandRemark" value="${ebBrandCustom.brandRemark }"
							class="text statelong"  maxlength="80" size="60" 
							reg="^[\S]{0,200}$" tip="可选值不能为空，单个选项长度1-200" />
						<br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">拼音码:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" name="ebBrandCustom.pinyinCode" value="${ebBrandCustom.pinyinCode }"
							class="text statelong"  maxlength="80" size="60" 
							reg="^[\S]{0,200}$" tip="可选值不能为空，单个选项长度1-200" />
						<br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">排序:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" name="ebBrandCustom.showorder" value="${ebBrandCustom.showorder }" class="text statelong" maxlength="80"
							reg="^[1-9][\d]{2,4}$" tip="必须是数字字符，大小100-99999" min="100" max="90000" requ="false" reset="false"  />
						<br/>
						<span></span>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">是否可用:</td>
					<td width="80%" class="pn-fcontent">
						<input type="radio" name="ebBrandCustom.isDisplay" value="1" 
							<c:if test="${ebBrandCustom.isDisplay == 1 }">checked="checked"</c:if> />可用
						<input type="radio" name="ebBrandCustom.isDisplay" value="0" 
							<c:if test="${ebBrandCustom.isDisplay == 0 }">checked="checked"</c:if> />不可用
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">父节点:</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="typeName" name="ebBrandCustom.typeName" value="${ebBrandCustom.typeName }"
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