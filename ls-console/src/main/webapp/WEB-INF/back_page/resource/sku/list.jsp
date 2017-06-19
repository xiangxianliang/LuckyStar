<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ichigo_Mashimaro-list</title>
<script type="text/javascript">
//修改
function updateSku (skuid) {
	//上市场价-可编辑
	$("#m"+skuid).removeAttr("disabled");
	//销售价格-可编辑
	$("#p"+skuid).removeAttr("disabled");
	//库 存-可编辑
	$("#i"+skuid).removeAttr("disabled");
	//购买限制-可编辑
	$("#l"+skuid).removeAttr("disabled");
	//运 费-可编辑
	$("#f"+skuid).removeAttr("disabled");
}
//保存
function addSku (skuid) {

	//上市场价-可编辑
	var m = $("#m"+skuid).val();
	//销售价格-可编辑
	var p = $("#p"+skuid).val();
	//库 存-可编辑
	var i = $("#i"+skuid).val();
	//购买限制-可编辑
	var l = $("#l"+skuid).val();
	//运 费-可编辑
	var f = $("#f"+skuid).val();

	var url = "/sku/updateSku.do";
	var params = {
		"id" : skuid,
		"marketPrice" : m,
		"skuPrice" : p,
		"stockInventory" : i,
		"skuUpperLimit" : l,
		"deliveFee" : f
		};
	//提交后台

	$.post(url,params,function(data){
		alert(data.message);
		}, 
		"json");

	//上市场价-可编辑
	$("#m"+skuid).attr("disabled","disabled");
	//销售价格-可编辑
	$("#p"+skuid).attr("disabled","disabled");
	//库 存-可编辑
	$("#i"+skuid).attr("disabled","disabled");
	//购买限制-可编辑
	$("#l"+skuid).attr("disabled","disabled");
	//运 费-可编辑
	$("#f"+skuid).attr("disabled","disabled");
}

</script>
</head>
<body>
	<div class="box-positon">
		<div class="rpos">当前位置: 库存管理 - 列表</div>
		<div class="clear"></div>
	</div>
	<div class="body-box">
		<form method="post" id="tableForm">
<table cellspacing="1" cellpadding="0" border="0" width="100%"
	class="pn-ltable">
	<thead class="pn-lthead">
		<tr>
			<th width="20">
				<input type="checkbox" onclick="Pn.checkbox('ids',this.checked)" />
			</th>
			<th>商品编号</th>
			<th>商品颜色</th>
			<th>商品尺码</th>
			<th>市场价格</th>
			<th>销售价格</th>
			<th>库 存</th>
			<th>购买限制</th>
			<th>运 费</th>
			<th>是否赠品</th>
			<th>操 作</th>
		</tr>
	</thead>
	<tbody class="pn-ltbody">
		<c:forEach items="${skuList }" var="sku">
		<tr bgcolor="#ffffff" onmouseover="this.bgColor='#eeeeee'" onmouseout="this.bgColor='#ffffff'">
			<td>
				<input type="checkbox" name="ids" value="73" />
			</td>
			<td>${sku.id } ---- ${pno }</td>
			<td align="center">${sku.color.name }</td>
			<td align="center">${sku.size }</td>
			<td align="center">
			<!-- 市场价 -->
				<input type="text" id="m${sku.id }" value="${sku.marketPrice }" disabled="disabled" size="10" />
			</td>
			<td align="center">
			<!-- 销售价格 -->
				<input type="text" id="p${sku.id }" value="${sku.skuPrice }" disabled="disabled" size="10" />
			</td>
			<td align="center">
			<!-- 库 存 -->
				<input type="text" id="i${sku.id }" value="${sku.stockInventory }"  disabled="disabled" size="10" />
			</td>
			<td align="center">
			<!-- 购买限制 -->
				<input type="text" id="l${sku.id }" value="${sku.skuUpperLimit }" disabled="disabled" size="10" />
			</td>
			<td align="center">
			<!-- 运 费 -->
				<input type="text" id="f${sku.id }" value="${sku.deliveFee }" disabled="disabled" size="10" />
			</td>
			<td align="center">
			<!-- 是否赠品 -->
				不是--${sku.skuType }
			</td>
			<td align="center">
				<a href="javascript:updateSku(${sku.id })"	class="pn-opt">修改</a> | 
				<a href="javascript:addSku(${sku.id })"	class="pn-opt">保存</a>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
		</form>
	</div>
</body>
</html>