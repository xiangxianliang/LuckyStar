<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Ichigo_Mashimaro-list</title>
<script type="text/javascript">
//全选
function checkBox(name,checked){
	//全选开始
	$("input[name='" + name + "']").attr("checked",checked);
}

//批量删除
function optDelete(status,username,realName,phone){
	//请至少选择一个
	var s =$("input[name='userIds']:checked").size();
	//alert(s);
	if(s <= 0){
		alert("请至少选择一个！");
		return;
	}
	if(!confirm("你确定删除这" + s + "个属性吗？")){
		return;
	}
	var url = '/user/front/deletes.do?ebFrontUserCustom.status=' + status + '&ebFrontUserCustom.username=' + 
		username +'&ebFrontUserCustom.realName=' + realName+'&ebFrontUserCustom.phone=' + phone;
	//删除
	$("#jvFrom").attr("action",url);
	$("#jvFrom").attr("method","post").submit();
	
}


//编辑
function toEdit(userId,status,username,realName,phone){
	window,location.href='/user/front/toEdit.do?userId=' + userId + '&ebFrontUserCustom.status=' + status + 
	'&ebFrontUserCustom.username=' + username +'&ebFrontUserCustom.realName=' + realName+'&ebFrontUserCustom.phone=' + phone;
}

//删除
function del(userId,status,username,realName,phone){
	if(!confirm('您确定删除吗？')) {
		return false;
	}
	window,location.href='/user/front/delete.do?userId=' + userId + '&ebFrontUserCustom.status=' + status + 
	'&ebFrontUserCustom.username=' + username +'&ebFrontUserCustom.realName=' + realName+'&ebFrontUserCustom.phone=' + phone;
}

$(function(){
	$('#registerTime').datebox({    
	    //required:true // 必选
	});
	
});
</script>
</head>
<body>

	<div class="box-positon">
		<div class="rpos">当前位置: 前台用户管理 - 列表</div>
		<form class="ropt">
			<input class="add" type="button" value="添加" onclick="javascript:window.location.href='/user/front/toAdd.do'" />
		</form>
		<div class="clear"></div>
	</div>
	<div class="sousuo" style="padding-top: 5px; padding-bottom: 5px; margin-top: 5px; margin-bottom: 5px;">
		<form action="/user/front/list.do" method="post" style="padding-top: 5px;">
		<p>
			&nbsp;&nbsp;搜索: <span>|</span>
			<label>状态：</label> 
			<input name="ebFrontUserCustom.status" type="radio" value="1" 
				<c:if test="${ebFrontUserQueryVo.ebFrontUserCustom.status == 1 }">checked</c:if> />激活&nbsp;&nbsp; 
			<input name="ebFrontUserCustom.status" type="radio" value="0" 
				<c:if test="${ebFrontUserQueryVo.ebFrontUserCustom.status == 0 }">checked</c:if> />未激活&nbsp;&nbsp; 
			
			<span>|</span>
			<label>用户名：</label> 
			<input type="text" id="searchText" title="用户名称" class="text20 medium gray"
				value="${ebFrontUserQueryVo.ebFrontUserCustom.username }" name="ebFrontUserCustom.username" />&nbsp;&nbsp;
			
			<span>|</span>
			<label>注册时间：</label> 
			<input type="text" id="registerTime" title="注册时间" class="text20 medium gray"
				value="${ebFrontUserQueryVo.ebFrontUserCustom.registerTime }" name="ebFrontUserCustom.registerTime" />&nbsp;&nbsp;
			
			<span>|</span>
			<label>手机号：</label> 
			<input type="text" id="searchText" title="手机号" class="text20 medium gray" 
				value="${ebFrontUserQueryVo.ebFrontUserCustom.phone }" name="ebFrontUserCustom.phone" />	
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" id="goSearch" class="query" value="查询" />
		</p>
		</form>
	</div>
	<div class="body-box">
		<form method="post" id="jvFrom">
<!-- 			<input type="hidden" value="" name="pageNo" />  -->
<!-- 			<input type="hidden" value="" name="queryName" /> -->
			<table d="sortTable" cellspacing="1" cellpadding="0" width="100%" border="0" class="pn-ltable">
				<thead class="pn-lthead">
					<tr>
						<th width="30">
							<input type="checkbox" onclick="Pn.checkbox('userIds',this.checked)" />
						</th>
						<th width="6%">用户ID</th>
						<th width="6%">用户名</th>
						<th>昵称</th>
						<th width="50">头像</th>
						<th width="150">邮箱</th>
						<th width="150">注册时间</th>
						<th width="150">最后登录时间</th>
						<th width="120">最后登录的IP</th>
						<th width="60">登录次数</th>
						<th width="60">状态</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody class="pn-ltbody">
					<c:forEach items="${pagination.list }" var="entry">
						<tr bgcolor="#ffffff" onmouseover="this.bgColor='#eeeeee'" onmouseout="this.bgColor='#ffffff'">
							<td align="center" >
								<input type="checkbox" name="userIds" value="${entry.userId }" />
							</td>
							<td align="center">&nbsp;${entry.userId }</td>
							<td align="center">&nbsp;${entry.username }</td>
							<td align="center">&nbsp;${entry.nickname }</td>
							<td align="center">
								<img width="40" height="40" src="${entry.allUserImgUrl }"/>
							</td>
							<td align="center">&nbsp;${entry.email }</td>
							<td align="center">&nbsp;${entry.registerTimeStr }</td>
							<td align="center">&nbsp;${entry.loginTimeStr }</td>
							<td align="center">&nbsp;${entry.lastLoginIp }</td>
							<td align="center">&nbsp;${entry.loginCount }</td>
							<td align="center">
								<c:if test="${entry.status == 1 }">
									激活
								</c:if>
								<c:if test="${entry.status == 0 }">
									未激活
								</c:if>
							</td>
							<td align="center">
								<a class="pn-opt" href="javascript:void(0)" onclick="toEdit('${entry.userId }','${ebFrontUserQueryVo.ebFrontUserCustom.status }',
									'${ebFrontUserQueryVo.ebFrontUserCustom.username }','${ebFrontUserQueryVo.ebFrontUserCustom.realName }','${ebFrontUserQueryVo.ebFrontUserCustom.phone }')">编辑</a> 
								<span>&nbsp;|&nbsp;</span>
								<a class="pn-opt" href="javascript:void(0)" 
									onclick="del('${entry.userId }','${ebFrontUserQueryVo.ebFrontUserCustom.status }','${ebFrontUserQueryVo.ebFrontUserCustom.username }',
									'${ebFrontUserQueryVo.ebFrontUserCustom.realName }','${ebFrontUserQueryVo.ebFrontUserCustom.phone }')">删除</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="page pb15">
				<span class="r inb_a page_b"> 
					<c:forEach 	items="${pagination.pageView }" var="page">
						${page }
					</c:forEach>
				</span>
			</div>
			<div style="margin-top: 15px;">
				<input class="del-button" type="button" value="删除"	onclick="optDelete('${ebFrontUserQueryVo.ebFrontUserCustom.status }','${ebFrontUserQueryVo.ebFrontUserCustom.username }',
					'${ebFrontUserQueryVo.ebFrontUserCustom.realName }','${ebFrontUserQueryVo.ebFrontUserCustom.phone }');" />
			</div>
		</form>
	</div>
</body>
</html>