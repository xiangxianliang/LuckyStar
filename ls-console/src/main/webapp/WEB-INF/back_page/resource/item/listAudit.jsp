<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Ichigo_Mashimaro-list</title>
<script type="text/javascript">

	function getTableForm() {
		return document.getElementById('tableForm');
	}
	
	function optDelete() {
		if (Pn.checkedCount('itemIds') <= 0) {
			alert("请至少选择一个!");
			return;
		}
		if (!confirm("确定删除吗?")) {
			return;
		}
		var f = getTableForm();
		f.action = "o_delete.do";
		f.submit();
	}
	
	function changePageNo() {
		$("input[name='pageNo']").val(1);
	}

	function isShow(){
		
		if (Pn.checkedCount('itemIds') <= 0) {
			alert("请至少选择一个!");
			return;
		}
// 		var ids = 
 		var s =$("input[name='itemIds']:checked").val().toString();
//  		for(var i = 0; i<s.length; i++){
//  			var r = s[i];
//  			alert(r);
//  		}

		$("#fm").attr("action",'/product/item/audits.do');
		$("#itemIds").val(s);
		$("#itemId").attr("disabled","disabled");
		$("#dlg").dialog({
			closed:false,
			title:"商品审核",
			iconCls:"icon-add",
			modal:true, // 父容器不可点
			buttons:buttons,
		});
	}


	//定义datagrid的工具栏
	var buttons = [ {//工具栏
		id : 'btnadd',
		text : '通过',
		iconCls : 'icon-add',
		handler : function() {
			$("#auditStatus_1").val(1);
			$("#fm").submit();
		}
	},{//工具栏
		id : 'btnadd',
		text : '不通过',
		iconCls : 'icon-add',
		handler : function() {
			$("#auditStatus_1").val(2);
			$("#fm").submit();
		}
	},{
		id : 'btndel',
		text : '取消',
		iconCls : 'icon-remove',
		handler : function() {
			$("#dlg").dialog({
				closed:true,
			});
		}
	} ];


	function isPass(itemId){
		
		
		$("#itemId").val(itemId);
		$("#itemIds").attr("disabled","disabled");
		
		$("#dlg").dialog({
			closed:false,
			title:"商品审核",
			iconCls:"icon-add",
			modal:true, // 父容器不可点
			buttons:buttons,
		});
		
// 		alert(1);
// 		//修改标题
// 		$("#addItemNoteH2").html("商品审核");
// 		//清空内容
// 		$("#itemNote").val("");
// 		//给表单赋值
// 		$("#itemId").val(itemId);
// 		$("#myAuditStatus").val(auditStatus);
// 		//显示
// 		tipShow("#addItemNote");
	}
	
	
	$(function(){
		var auditStatus = $("#auditStatus").val();
		if(auditStatus == '0'){
			$("#label1").attr("class","here")
		}else if(auditStatus == '2'){
			$("#label2").attr("class","here")
		}else if(auditStatus == '1'){
			$("#label3").attr("class","here")
		}else {
			$("#label4").attr("class","here")
		}


		
		
	});
</script>
</head>
<body>
<div class="box-positon">
	<div class="rpos">当前位置: 商品管理 - 列表</div>
	<div class="clear"></div>
</div>
<div class="body-box">
	
<h2 class="h2_ch_1">
	<span id="tabs" class="l">
		<a id="label4" href="/product/item/listAudit.do?ebItemCustom.isShow=0" title="全部实体商品" class="nor">全部</a> 
		<a id="label1" href="/product/item/listAudit.do?ebItemCustom.isShow=0&ebItemCustom.auditStatus=0" title="待审核实体商品" class="nor">待审核</a>
		<a id="label2" href="/product/item/listAudit.do?ebItemCustom.isShow=0&ebItemCustom.auditStatus=2" title="审核不通过实体商品" class="nor">审核不通过</a>
		<a id="label3" href="/product/item/listAudit.do?ebItemCustom.isShow=0&ebItemCustom.auditStatus=1" title="已审核实体商品" class="nor">审核通过</a>
	</span>
</h2>
<div class="sousuo" style="padding-top: 5px; padding-bottom: 5px; margin-top: 5px; margin-bottom: 5px;">

<form action="/product/item/listAudit.do" method="post" style="padding-top: 5px;">
	名称: <input type="text" value="${ebItemQueryVo.ebItemCustom.itemName }" name="ebItemCustom.itemName" /> 
	<select onchange="changePageNo()" name="ebItemCustom.brandId">
		<option value="">请选择品牌</option>
		<c:forEach items="${ebBrandList }" var="brand">
			<option value="${brand.brandId }"
			<c:if test="${brand.brandId == ebItemQueryVo.ebItemCustom.brandId }">selected="selected"</c:if>>${brand.brandName }</option>
		</c:forEach>
	</select> 
	<select id="auditStatus" name="ebItemCustom.auditStatus">
		<option value="" >全部审核状态</option>
		<option value="0"  <c:if test="${ebItemQueryVo.ebItemCustom.auditStatus == 0 }">selected</c:if>>待审核</option>
		<option value="1"  <c:if test="${ebItemQueryVo.ebItemCustom.auditStatus == 1 }">selected</c:if>>通过</option>
		<option value="2"  <c:if test="${ebItemQueryVo.ebItemCustom.auditStatus == 2 }">selected</c:if>>不通过</option>
	</select>

	<input type="submit" class="query" value="查询" />
</form>

</div>

<form method="post" id="jvFrom">

<input type="hidden" value="" name="pageNo" /> 
<input type="hidden" value="" name="queryName" />
<table cellspacing="1" cellpadding="0" width="99%" border="0" class="pn-ltable">
	<thead class="pn-lthead">
		<tr>
			<th width="30">
				<input type="checkbox" onclick="Pn.checkbox('itemIds',this.checked)" />
			</th>
			<th>商品编号</th>
			<th>商品名称</th>
			<th>品牌</th>
			<th>图片</th>
			<th width="4%">新品</th>
			<th width="4%">热卖</th>
			<th width="4%">推荐</th>
			<th width="4%">上下架</th>
			<th width="6%">审核状态</th>
			<th width="15%">操作选项</th>
		</tr>
	</thead>
	<tbody class="pn-ltbody">
		<c:forEach items="${pagination.list }" var="entry">
			<tr bgcolor="#ffffff" onmouseover="this.bgColor='#eeeeee'" onmouseout="this.bgColor='#ffffff'">
				<td align="center">
					<input type="checkbox" name="itemIds" value="${entry.itemId }" />
				</td>
				<td>${entry.itemId }--${entry.itemNo }</td>
				<td align="center">${entry.itemName }</td>
				<td align="center">${entry.brandName }--${entry.brandId }</td>
				<td align="center">
					<img width="50" height="50" src="${entry.ebImgCustom.allUrl }" />
				</td>
				<td align="center">
					<c:if test="${entry.isNew == 0 }">否</c:if> 
					<c:if test="${entry.isNew == 1 }">是</c:if>
				</td>
				<td align="center">
					<c:if test="${entry.isHot == 0 }">否</c:if> 
					<c:if test="${entry.isHot == 1 }">是</c:if>
				</td>
				<td align="center">
					<c:if test="${entry.isCommend == 0 }">否</c:if>
					<c:if test="${entry.isCommend == 1 }">是</c:if>
				</td>
				<td align="center">
					<c:if test="${entry.isShow == 0 }">下架</c:if> 
					<c:if test="${entry.isShow == 1 }">上架</c:if>
				</td>
				<td align="center">
					<c:if test="${entry.auditStatus == 0 }"><span>待审核</span></c:if>
					<c:if test="${entry.auditStatus == 1 }"><span>通过</span></c:if>
					<c:if test="${entry.auditStatus == 2 }"><span>不通过</span></c:if>
				</td>
				<td align="center">
					<a href="javascript:void(0)" class="pn-opt" 
						onclick="window.location.href=''">查看</a> |
						 
					<c:if test="${entry.auditStatus == 1 }">
					<a href="javascript:void(0)" class="pn-opt" 
						onclick="window.location.href='/product/item/toEdit.do?itemId=${entry.itemId }'">修改</a> | 
					</c:if>
				
					<c:if test="${entry.auditStatus == 0 }">
					<a href="javascript:void(0);" class="pn-opt" onclick="isPass('${entry.itemId}')">审核</a> |
					</c:if>
					
					<c:if test="${entry.auditStatus == 2 }">
					<a href="javascript:void(0)" class="pn-opt" 
						onclick="if(!confirm('您确定删除吗？')) {return false;}" >删除</a> |
					</c:if>
						
					<a href="javascript:void(0)" class="pn-opt"
						onclick="window.location.href='/sku/list.do?productId=${entry.itemId }&pno=${entry.itemNo }'" >库存</a>
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
	
	<c:if test="${ebItemQueryVo.ebItemCustom.auditStatus == 0 }">
<!-- 	<input class="del-button" type="button" value="删除"	onclick="optDelete();" /> -->
		<input class="add" type="button" value="审核" onclick="isShow();" />
	</c:if>
	
</div>
</form>
</div>
	<div id="dlg" class="easyui-dialog" style="width: 350px;height: 280px;background: pink;" data-options="buttons:'#btns',closed:true" >
		<form id="fm" action="/product/item/audit.do" method="post">
			<input type="hidden" id="itemId" name="itemId" value=""/>
			<input type="hidden" id="itemIds" name="itemIds" value=""/>
			<input type="hidden" id="itemName" name="ebItemCustom.itemName" value="${ebItemQueryVo.ebItemCustom.itemName }"/>
			<input type="hidden" id="brandId" name="ebItemCustom.brandId" value="${ebItemQueryVo.ebItemCustom.brandId }"/>
			<input type="hidden" id="auditStatus_1" name="ebItemCustom.auditStatus" value=""/>

			<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tbody>
				<tr align="center">
					<td colspan="2" class="pn-flabel_1 pn-flabel-h" >商品审核</td>
				</tr>
				<tr >
					<td width="20%" class="pn-flabel pn-flabel-h_1">审核意见：</td>
					<td width="80%" class="pn-fcontent">
						<textarea rows="7" cols="35" id="note" name="ebTypeCustom.note" > </textarea> 
						<span></span>
					</td>
				</tr>
			</tbody>
		</table>
		</form>
	</div>
	
<!-- 	<div id="btns"> -->
<!-- 		<a id="saveButton" href="#"  class="easyui-linkbutton" data-options="iconCls:'icon-add'"  >保存</a> -->
<!-- 		<a id="closeButton" href="#"  class="easyui-linkbutton" data-options="iconCls:'icon-remove'" >取消</a> -->
<!-- 	</div> -->
</body>
</html>