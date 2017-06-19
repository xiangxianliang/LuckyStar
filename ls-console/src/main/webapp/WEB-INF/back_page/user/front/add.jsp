<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">

	$(function(){
		var url = "/user/addr/loadProvince.do";
		$.post(url, null, function(data){
			$("#province").empty();
			$("#city").empty();
			$("#town").empty();
			$opprovince=$('<option value="" selected >省/直辖市</option>');
			$opcity=$('<option value="" selected >城市</option>');
			$optown=$('<option value="" selected>县/区</option>');
			$("#province").append($opprovince);
			$("#city").append($opcity);
			$("#town").append($optown);
			
			for(var i = 0; i < data.length; i++  ){
				var province = data[i];
				$op = $('<option id="p' + province.code + '" value="' + province.provinceId + '" code="' + province.code + '" >' + province.name + '</option>');
				$("#province").append($op);
			}
			
		},"json");
	});


	//改变省
	function changeProvince(){

		var code = $("#province :selected").attr("code");
		//var code = $("#province").find("option:selected").code
		//alert(code)
		
		//通过省的的code 加载城市
		var url = "/user/addr/loadCity.do";
		var params = {'code' : code};
		$.post(url, params, function(data){
			//var ebCityList = data.ebCityList;
			$("#city").empty();
			$("#town").empty();
			$opcity=$('<option value="" selected >城市</option>');
			$optown=$('<option value="" selected>县/区</option>');
			$("#city").append($opcity);
			$("#town").append($optown);
			for(var i = 0; i < data.length; i++  ){
				var city = data[i];
				$op = $('<option id="p' + city.code + '" value="' + city.cityId + '" code="' + city.code + '" >' + city.name + '</option>');
				$("#city").append($op);
			}
		},"json");
	}

	//改变城市
	function changeCity(){
		var code = $("#city :selected").attr("code");
		//通过省的的code 加载城市
		var url = "/user/addr/loadTown.do";
		var params = {'code' : code};
		
		$.post(url, params, function(data){
			var ebTownList = data.ebTownList;
			
			$("#town").empty();
			$optown=$('<option value="" selected>县/区</option>');
			$("#town").append($optown);
			
			for(var i = 0; i < data.length; i++  ){
				var town = data[i];
				$op = $('<option id="t' + town.code + '" value="' + town.townId + '" code="' + town.code + '" >' + town.name + '</option>');
				$("#town").append($op);
			}
		},"json");
	}

	//上传图片
	function uploadPic(){

		//alert(1);

		//定义参数
		var options = {
			url : "/upload/uploadPic.do",
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
</script>
</head>
<body>
<div class="box-positon">
	<div class="rpos">当前位置: 后台用户管理 - 添加</div>
	<form class="ropt">
		<input type="submit" onclick="this.form.action='v_list.shtml';" value="返回列表" class="return-button"/>
	</form>
	<div class="clear"></div>
</div>
<div class="body-box" style="float:right">

<form id="jvForm" name="form111" action="/user/front/add.do" method="post" enctype="multipart/form-data">
<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
<tbody>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>用户名:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="username" name="ebFrontUserCustom.username" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.username }" />
			<span></span>
		</td>
	</tr>
	
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>密码:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="password" name="ebFrontUserCustom.password" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.password }" />
			<span></span>
		</td>
	</tr>
	
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>确认密码:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="regpassword" name="ebFrontUserCustom.regpassword" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.regpassword }" />
			<span></span>
		</td>
	</tr>
	
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>昵称:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="nickname" name="ebFrontUserCustom.nickname" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.nickname }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>性别:
		</td>
		<td width="80%" class="pn-fcontent">
			<input name="ebFrontUserCustom.gender" type="radio" value="MAN" checked="checked" 
				<c:if test="${ebFrontUserQueryVo.ebFrontUserCustom.gender == 'MAN' }">checked="checked"</c:if> />是&nbsp;&nbsp; 
			<input name="ebFrontUserCustom.gender" type="radio" value="WOMAN"
				<c:if test="${ebFrontUserQueryVo.ebFrontUserCustom.gender == 'WOMAN' }">checked="checked"</c:if> />否&nbsp;&nbsp; 
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>真实名字:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="realName" name="ebFrontUserCustom.realName" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.realName }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>身份证号:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="idCard" name="ebFrontUserCustom.idCard" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.idCard }" />
			<span></span>
		</td>
	</tr>
		<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>出生日期:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="birthday" name="ebFrontUserCustom.birthday" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.birthday }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>email:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="email" name="ebFrontUserCustom.email" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.email }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>省市县:
		</td>
		<td width="80%" class="pn-fcontent">
			<span class="word">
				<select name="ebFrontUserCustom.provinceId" id="province" onchange="changeProvince()">
					<option value="" selected>省/直辖市</option>
					<c:forEach items="${provinceList }" var="province">
						<option id="p${province.code }" value="${province.provinceId }" code="${province.code }"
							<c:if test="${buyer.province == province.code }">selected="selected"</c:if> >${province.name }</option>
					</c:forEach>
					
				</select> 
				
				<select name="ebFrontUserCustom.cityId" id="city" onchange="changeCity()" >
					<option value="" selected>城市</option>
					<c:forEach items="${cityList }" var="city">
						<option id="c${city.code }" value="${city.cityId }" code="${city.code }"
							<c:if test="${buyer.city == city.code }">selected="selected"</c:if> >${city.name }</option>
					</c:forEach>
				</select>
				
				<select name="ebFrontUserCustom.townId" id="town" onchange="changeTown()" >
					<option value="" selected>县/区</option>
					<c:forEach items="${townList }" var="town">
						<option id="t${town.code }" value="${town.townId }" code="${town.code }"
							<c:if test="${buyer.town == town.code }">selected="selected"</c:if> >${town.name }</option>
					</c:forEach>
				</select>
			</span>
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>地址:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="addr" name="ebFrontUserCustom.addr" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.addr }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>邮编:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="zipCode" name="ebFrontUserCustom.zipCode" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.zipCode }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>电话:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="phone" name="ebFrontUserCustom.phone" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.phone }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>手机:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="cellphone" name="ebFrontUserCustom.cellphone" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.cellphone }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>QQ:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="qqNum" name="ebFrontUserCustom.qqNum" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.qqNum }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>微信:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="wxNum" name="ebFrontUserCustom.wxNum" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.wxNum }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>个人介绍:
		</td>
		<td width="80%" class="pn-fcontent">
			<input type="text" id="introInfo" name="ebFrontUserCustom.introInfo" class="text state" maxlength="100"
				reg="^[a-zA-Z0-9\u4e00-\u9fa5]{1,25}$" tip="必须是中英文或数字字符，长度1-25" value="${ebFrontUserQueryVo.ebFrontUserCustom.introInfo }" />
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span>状态:
		</td>
		<td width="80%" class="pn-fcontent">
			<input name="ebFrontUserCustom.status" type="radio" value="1" checked="checked" 
				<c:if test="${ebFrontUserQueryVo.ebFrontUserCustom.status == 1 }">checked="checked"</c:if> />是&nbsp;&nbsp; 
			<input name="ebFrontUserCustom.status" type="radio" value="0"
				<c:if test="${ebFrontUserQueryVo.ebFrontUserCustom.status == 0 }">checked="checked"</c:if> />否&nbsp;&nbsp; 
			<span></span>
		</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h">
			<span class="pn-frequired">*</span> 上传用户头像(90x150尺寸):
		</td>
		<td width="80%" class="pn-fcontent">注:该尺寸图片必须为90x150。</td>
	</tr>
	<tr>
		<td width="20%" class="pn-flabel pn-flabel-h"></td>
		<td width="80%" class="pn-fcontent">
			<img width="100" height="100" id="allImgUrl" src="${ebFrontUserCustom.allUserImgUrl eq ''? ebFrontUserCustom.allUserImgUrl : '/res/img/pic/ppp0.jpg'  }"/>
			<input type="hidden" id="path" name="ebFrontUserCustom.userImg" value="${ebFrontUserQueryVo.ebFrontUserCustom.userImg }" />
			<input type="file" onchange="uploadPic()" name="pic"/>
		</td>
	</tr>


</tbody>
<tbody>
	<tr>
		<td class="pn-fbutton" colspan="2">
			<input type="submit" class="submit" value="提交"/> &nbsp;&nbsp;&nbsp;&nbsp; 
			<input type="button" onclick="javascript:;history.back();" value="取消" class="reset" />
		</td>
	</tr>
</tbody>
</table>
</form>
</div>
</body>
</html>