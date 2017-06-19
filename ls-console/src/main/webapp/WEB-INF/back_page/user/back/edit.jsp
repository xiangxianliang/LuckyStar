<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Ichigo_Mashimaro-add</title>
<script type="text/javascript">
	var valid = {
		rules: {
			"userBackUserCustom.username": {
				required: true, // 必须输入
				rangelength: [4, 30], //输入长度必须介于 1 和 30 之间的字符串（汉字算一个字符）。
				remote: {
					url: "/user/back/checkBackUser.do", //后台处理程序
					type: "post", //数据发送方式
					dataType: "json", //接受数据格式   
				},
			},
			"userBackUserCustom.password": {
				//required: true, // 必须输入
				rangelength: [6, 25],
			},
			"userBackUserCustom.regpassword": {
				//required: true, // 必须输入
				rangelength: [6, 25],
				equalTo: "#userBackUserCustom.password",
			},
			"roles": {
				required: true, // 必须输入
			},
			"userBackUserCustom.email": {
				required: true, // 必须输入
				email: true,
			},
			"userBackUserCustom.phone": {
				required: true, // 必须输入
				digits: true, //必须输入整数。
				rangelength: [7, 11],
			},
			"userBackUserCustom.realName": {
				digits: true, //必须输入整数。
				range: [100, 999999],
			},
			"userBackUserCustom.gender": {
				required: true, // 必须输入
			},
			"userBackUserCustom.idCard": {
				required: false, // 非必须输入
				rangelength: [18, 18],
			},
			"userBackUserCustom.degree": {
				required: false, // 非必须输入
				rangelength: [0, 50],
			},
			"userBackUserCustom.school": {
				required: false, // 非必须输入
				rangelength: [0, 50],
			},
			"userBackUserCustom.isLocked": {
				required: true, // 必须输入
			},
			"userBackUserCustom.isEnable": {
				required: true, // 必须输入
			},
			"userBackUserCustom.imgUrl": {
				required: false, // 必须输入
			},
		},
		messages: {
			"userBackUserCustom.username": {
				required: "必须输入的项目",
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				remote: "已经存在相同的",
			},
			"userBackUserCustom.password": {
				required: "必须输入的项目",
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
			},
			"userBackUserCustom.regpassword": {
				required: "必须输入的项目",
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
				equalTo: "2次密码不同"
			},
			"roles": {
				required: "必须输入的项目",
			},
			"userBackUserCustom.email": {
				required: "必须输入的项目",
				email: "输入正确的邮箱",
			},
			"userBackUserCustom.phone": {
				required: "必须输入的项目",
				digits: "输入正确的手机号",
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
			},
			"userBackUserCustom.realName": {
				required: "必须输入的项目",
				range: "长度在{0}-{1}之间（汉字算一个字符）",
			},
			"userBackUserCustom.gender": {
				required: "必须输入的项目",
			},
			"userBackUserCustom.idCard": {
				//required: "非必须输入的项目",
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
			},
			"userBackUserCustom.degree": {
				//required: "非必须输入的项目",
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
			},
			"userBackUserCustom.school": {
				//required: "非必须输入的项目",
				rangelength: "长度在{0}-{1}之间（汉字算一个字符）",
			},
			"userBackUserCustom.isLocked": {
				required: "必须输入的项目",
			},
			"userBackUserCustom.isEnable": {
				required: "必须输入的项目",
			},
			"userBackUserCustom.imgUrl": {
				//required: "必须输入的项目",
			},
			errorElement: "label", //用来创建错误提示信息标签,validate插件默认的就是label
			success: function(label) { //验证成功后的执行的回调函数
				//label指向上面那个错误提示信息标签label
				label.text(" ") //清空错误提示消息
				//.addClass("success"); //加上自定义的success类
			}
		},
	};

	$(function() {
		$('#roles').combotree({
			url: '/system/role/getRoleCheckedTree.do?userId=${userBackUserCustom.userId }',
			required: true,
			multiple: true,
		});
	});

	//上传图片
	function uploadPic() {
		//定义参数
		var options = {
			url: "/upload/uploadPic.do?module=user",
			dataType: "json",
			type: "post",
			success: function(data) {
				//回调 二个路径  
				//url
				//path
				$("#allImgUrl").attr("src", data.url);
				$("#path").val(data.path);
			}
		};

		//jquery.form使用方式
		$("#jvForm").ajaxSubmit(options);
	}
</script>
</head>

<body>

<div class="body-box" style="float:left">
	<form id="form111" name="form111" action="/user/back/add.do" method="post" enctype="multipart/form-data">
		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>用户名:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="username" name="userBackUserCustom.username" class="text state" maxlength="25" value="${userBackUserCustom.username }" />
						<br/>
						<label for="username" class="error" style="display: none;"></label>
					</td>
				</tr>

				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>密码:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="password" name="userBackUserCustom.password" class="text state" maxlength="25" />
						<br/>
						<label for="password" class="error" style="display: none;"></label>
					</td>
				</tr>

				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>确认密码:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="regpassword" name="userBackUserCustom.regpassword" class="text state" maxlength="25" />
						<br/>
						<label for="regpassword" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>角色选择:
					</td>
					<td width="80%" class="pn-fcontent">
						<input id="roles" name="roles" value="" class="text state" />
						<br/>
						<label for="roles" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>email:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="email" name="userBackUserCustom.email" class="text state" maxlength="100" value="${userBackUserCustom.email }"/>
						<br/>
						<label for="email" class="error" style="display: none;"></label>
					</td>
				</tr>

				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>手机:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="phone" name="userBackUserCustom.phone" class="text state" maxlength="100" value="${userBackUserCustom.phone }" />
						<br/>
						<label for="phone" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>姓名:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="realName" name="userBackUserCustom.realName" class="text state" maxlength="100" value="${userBackUserCustom.phone }" />
						<br/>
						<label for="realName" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>性别:
					</td>
					<td width="80%" class="pn-fcontent">
						<input name="userBackUserCustom.gender" type="radio" value="MAN" <c:if test="${userBackUserCustom.gender == 'MAN' }">checked="checked"</c:if> />男 &nbsp;&nbsp;
						<input name="userBackUserCustom.gender" type="radio" value="WOMAN" <c:if test="${userBackUserCustom.gender == 'WOMAN' }">checked="checked"</c:if> />女
						<br/>
						<label for="userBackUserCustom.gender" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						身份证号:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="idCard" name="userBackUserCustom.idCard" class="text state" maxlength="100" value="${userBackUserCustom.idCard }"  />
						<br/>
						<label for="idCard" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						学历:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="degree" name="userBackUserCustom.degree" class="text state" maxlength="100" value="${userBackUserCustom.degree }"  />
						<br/>
						<label for="degree" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						毕业学校:
					</td>
					<td width="80%" class="pn-fcontent">
						<input type="text" id="school" name="userBackUserCustom.school" class="text state" maxlength="100" value="${userBackUserCustom.school }"  />
						<br/>
						<label for="school" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>账号锁定:
					</td>
					<td width="80%" class="pn-fcontent">
						<input name="userBackUserCustom.isLocked" type="radio" value="0" <c:if test="${userBackUserCustom.isLocked == '0' }">checked="checked"</c:if> />锁定&nbsp;&nbsp;
						<input name="userBackUserCustom.isLocked" type="radio" value="1" <c:if test="${userBackUserCustom.isLocked == '1' }">checked="checked"</c:if> />解锁&nbsp;&nbsp;
						<br/>
						<label for="userBackUserCustom.isLocked" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span>启用状态:
					</td>
					<td width="80%" class="pn-fcontent">
						<input name="userBackUserCustom.isEnable" type="radio" value="1" <c:if test="${userBackUserCustom.isEnable == '1' }">checked="checked"</c:if> />是&nbsp;&nbsp;
						<input name="userBackUserCustom.isEnable" type="radio" value="0" <c:if test="${userBackUserCustom.isEnable == '0' }">checked="checked"</c:if> />否&nbsp;&nbsp;
						<br/>
						<label for="userBackUserCustom.isEnable" class="error" style="display: none;"></label>
					</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h">
						<span class="pn-frequired">*</span> 上传用户图片(90x150尺寸):
					</td>
					<td width="80%" class="pn-fcontent">注:该尺寸图片必须为90x150。</td>
				</tr>
				<tr>
					<td width="20%" class="pn-flabel pn-flabel-h"></td>
					<td width="80%" class="pn-fcontent">
						<img width="100" height="100" id="allImgUrl" src="${userBackUserCustom.allUrl eq null ? '/ares/png/img/pic/ppp0.jpg' : userBackUserCustom.allUrl }" />
						<input type="hidden" id="path" name="userBackUserCustom.imgUrl" value="${userBackUserCustom.imgUrl }" />
						<input type="file" onchange="uploadPic()" name="pic" />
						<br/>
						<label for="userBackUserCustom.imgUrl" class="error" style="display: none;"></label>
					</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
					<td class="pn-fbutton" colspan="2">
						<a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href="#" onclick="save()">提交</a>
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