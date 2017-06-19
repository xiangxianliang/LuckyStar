<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Ichigo_Mashimaro-add</title>
<style type="">
.h2_ch a:hover, .h2_ch a.here {
	color: #FFF;
	font-weight: bold;
	background-position: 0px -32px;
}

.h2_ch a {
	float: left;
	height: 32px;
	margin-right: -1px;
	padding: 0px 16px;
	line-height: 32px;
	font-size: 14px;
	font-weight: normal;
	border: 1px solid #C5C5C5;
	background: url('/ares/png/img/admin/bg_ch.gif') repeat-x scroll 0% 0%
		transparent;
}

a {
	color: #06C;
	text-decoration: none;
}
</style>
<script type="text/javascript">
	$(function() {
		// 标签页 切换
		var tObj;
		$("#tabs a").each(function() {
			//indexOf 有没有：有 返回0；找不到 返回-1
			if ($(this).attr("class").indexOf("here") == 0) {
				tObj = $(this)
			}
			$(this).click(function() {
				// c = here nor
				var c = $(this).attr("class");
				if (c.indexOf("here") == 0) {
					return;
				}
				var ref = $(this).attr("ref");
				var ref_t = tObj.attr("ref");
				tObj.attr("class", "nor");
				$(this).attr("class", "here");
				$(ref_t).hide();
				$(ref).show();
				tObj = $(this);
				if (ref == '#tab_2') {
// 					CKEDITOR.editorConfig = function(config) {
// 						config.language = 'zh-cn';
// 						config.uiColor = '#9AB8F3';
// 						config.height = 400;
// 						config.toolbarCanCollapse = true;
	
// 					};
// 					CKEDITOR.replace( 'productdesc', {
// 					    customConfig: '/custom/ckeditor_config.js'
// 					});
					var fck = new FCKeditor("productdesc");
					fck.BasePath = "/ares/fck/fckeditor-2.6.4/";
					fck.Height = 400;
					fck.Config["ImageUploadURL"] = "/upload/uploadFck.do";
					fck.ReplaceTextarea();
					
				}
				if (ref == '#tab_4') {
					var fck = new FCKeditor("productList");
					fck.BasePath = "/ares/fck/fckeditor-2.6.4/";
					fck.Height = 400;
					fck.ToolbarSet='Basic';
					fck.Config["ImageUploadURL"] = "/upload/uploadFck.do";
					fck.ReplaceTextarea();
				}
			});
		});

		// tree 树加载
		$('#cc').combotree({
			url: "/product/type/getTypeTree.do",
			checkbox: false
//	 		   url: 'get_data.php',    
//	 		   required: true   
		});  

		var divNum = '${ebItemCustom.skuList.size() }';
		//实现页面规格的自动增加和删除
		$("#button2").click(function(){
			divNum++;
			//实现页面的自动增加和删除
			var htmlDiv = $("#sp_0").html();
			htmlDiv ="<div id ='sp_" + divNum + "'>"+htmlDiv+"</div>";
			//radio
			htmlDiv = htmlDiv.replace(/specradio1/g, "specradio"+divNum);
			htmlDiv = htmlDiv.replace(/#sp_0/g, "#sp_"+divNum);
			
			//skuType1   showStatus1   sort1     skuPrice1  marketPrice1  stockInventory1  skuUpperLimit1  sku1  location1
			htmlDiv = htmlDiv.replace(/sort1/g, "sort"+divNum);
			htmlDiv = htmlDiv.replace(/skuPrice1/g, "skuPrice"+divNum);
			htmlDiv = htmlDiv.replace(/marketPrice1/g, "marketPrice"+divNum);
			htmlDiv = htmlDiv.replace(/stockInventory1/g, "stockInventory"+divNum);
			htmlDiv = htmlDiv.replace(/skuUpperLimit1/g, "skuUpperLimit"+divNum);
			htmlDiv = htmlDiv.replace(/deliveFee1/g, "deliveFee"+divNum);
			htmlDiv = htmlDiv.replace(/skuNo1/g, "skuNo"+divNum);
			htmlDiv = htmlDiv.replace(/location1/g, "location"+divNum);
			htmlDiv = htmlDiv.replace(/showStatus1/g, "showStatus"+divNum);
			htmlDiv = htmlDiv.replace(/skuType1/g, "skuType"+divNum);
			
			htmlDiv = htmlDiv.replace(/skuId1/g, "skuId"+divNum);//skuid
			htmlDiv = htmlDiv.replace(/specId1/g, "specId"+divNum);//specId
			
			$("#divNum").val(divNum);//重新赋值
			//alert(htmlDiv);
			
			$(".page_c").before(htmlDiv);
			//alert(htmlDiv);

			$("#sp_"+divNum+" input[type=text]").val("");
			$("#sp_"+divNum+" input[type=hidden]").val("");
			$("#sp_"+divNum+" input[type=radio]").removeAttr("checked");
			//$("#sp_"+divNum+" input[type=radio]").removeAttr("disabled");
			$("#sp_"+divNum+" input[type=radio][value='']").attr("checked","checked");

		});

		
	});

	//商品规格的redio选中与取消
	$(".sp_0").find("input[type=radio]").live("dblclick", function() {
		if ($(this).attr('checked') == 'checked') {
			$(this).removeAttr('checked');
		} else {
			$(this).attr('checked', 'checked');
		}
	});

	// 表单校验
	function changePri(obj) {
		var reg0 = /^[0-9]{1,7}\.{0,1}[0-9]*$/;
		var test = obj.value;
		if (!reg0.test(test)) {
			return;
		}
		var test1 = test.indexOf(".");
		var firstSub = test.substring(0, test1);
		var lastSub = test.substring(test1 + 1, test.length);
		if (lastSub.length >= 3) {
			lastSub = lastSub.substring(0, 2);
		}
		if (lastSub.length == 1) {
			lastSub = lastSub + '0';
		}
		if (lastSub.length == 0) {
			lastSub = '00';
		}
		if (test1 == -1) {
			obj.value = test + ".00";
		} else {
			obj.value = firstSub + '.' + lastSub;
		}
	}

	//删除 商品规格
	function clickRemove(id) {
		if(id == "#sp_0"){
			alert("默认人的不能删除")
			return;
		}
		$(id).remove();
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

	
	var flag = true;
	function genggai(){
		if(flag){
			flag = false;
			$("#cc").combotree({
				disabled : false,
			});
		}else{
			flag = true;
			$("#cc").combotree({
				disabled : true,
			});
		}
	}

	
	function moduleSave(){
		//if($.formValidator.pageIsValid()){ // 校验
			// from id, 回调函数,param 回调函数参数(如果为null,那么调用一个参数的回调函数,否则调用两个参数的回调函数)//返回的数据类型
			jquerySubByFId('jvForm', moduleSave_callback, null, "json");
		//}

	}

	function moduleSave_callback(data){
		 ma_message_alert(data);
//	  	var result = getCallbackData(data);
//	  	var type = result.type;
//	  	_alert(result);
		/* if (TYPE_RESULT_SUCCESS == type) {
			ypxxedit_toback();
			ypxxquery();//重新查询数据
		}  */

		parent.query();
		
	}
</script>
</head>
<body>
<div class="box-positon">
	<div class="rpos">当前位置: 商品管理 - 添加</div>
	<div class="ropt">
	</div>
	<div class="clear"></div>
</div>
<h2 class="h2_ch">
	<span id="tabs"> 
		<a href="javascript:void(0);" ref="#tab_1" title="基本信息" class="here">基本信息</a>
		<a href="javascript:void(0);" ref="#tab_2" title="商品参数" class="nor">商品参数</a>
		<a href="javascript:void(0);" ref="#tab_3" title="商品描述" class="nor">商品描述</a>
		<a href="javascript:void(0);" ref="#tab_4" title="包装清单" class="nor">包装清单</a>
		<a href="javascript:void(0);" ref="#tab_5" title="商品规格" class="nor">商品规格</a>
	</span>
</h2>
<div class="body-box" style="float: left">

<form id="jvForm" action="/product/item/edit.do" method="post" enctype="multipart/form-data">	
<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
	<tbody id="tab_1">
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">
				<span class="pn-frequired">*</span>商品类型:
			</td>
			<td width="80%" class="pn-fcontent">
				<input id="cc" name="ebItemCustom.typeId" value="${ebTypeCustom.typeId }" disabled="disabled" />
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="checkbox" id="update" name="update" value="1" onclick="genggai()" />更改
			</td>
		</tr>
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">
				<span class="pn-frequired">*</span> 商品名称:
			</td>
			<td width="80%" class="pn-fcontent">
				<input type="text" class="text statelong" maxlength="100" size="100" 
					name="ebItemCustom.itemName" value="${ebItemCustom.itemName }"  />
			</td>
		</tr>

		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">商品品牌:</td>
			<td width="80%" class="pn-fcontent">
				<select name="ebItemCustom.brandId">
					<option value="">请选择品牌</option>
					<c:forEach items="${ebBrandList }" var="entry">
						<option value="${entry.brandId }" <c:if test="${ebItemCustom.brandId == entry.brandId }">selected="selected"</c:if> >${entry.brandName }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">商品毛重:</td>
			<td width="80%" class="pn-fcontent">
				<input type="text" class="text statelong" maxlength="10" 
					name="ebItemCustom.itemWeight" value="${ebItemCustom.itemWeight }" />KG
			</td>
		</tr>

		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">是否新品：</td>
			<td width="80%" class="pn-fcontent">
				<input name="ebItemCustom.isNew" <c:if test="${ebItemCustom.isNew == 1 }">checked="checked"</c:if> type="radio" value="1" checked="checked" />是&nbsp;&nbsp; 
				<input name="ebItemCustom.isNew" <c:if test="${ebItemCustom.isNew == 0 }">checked="checked"</c:if> type="radio" value="0" />否&nbsp;&nbsp; 
			</td>
		</tr>
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">是否推荐：</td>
			<td width="80%" class="pn-fcontent">
				<input name="ebItemCustom.isCommend" <c:if test="${ebItemCustom.isCommend == 1 }">checked="checked"</c:if> type="radio" value="1" />是&nbsp;&nbsp; 
				<input name="ebItemCustom.isCommend" <c:if test="${ebItemCustom.isCommend == 0 }">checked="checked"</c:if> type="radio" value="0" />否&nbsp;&nbsp; 
			</td>
		</tr>
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">是否热卖：</td>
			<td width="80%" class="pn-fcontent">
				<input name="ebItemCustom.isHot" <c:if test="${ebItemCustom.isHot == 1 }">checked="checked"</c:if> type="radio" value="1" />是&nbsp;&nbsp; 
				<input name="ebItemCustom.isHot" <c:if test="${ebItemCustom.isHot == 0 }">checked="checked"</c:if> type="radio" value="0" />否&nbsp;&nbsp; 
			</td>
		</tr>
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">
				<span class="pn-frequired">*</span> 上传商品图片(90x150尺寸):
			</td>
			<td width="80%" class="pn-fcontent">注:该尺寸图片必须为90x150。</td>
		</tr>
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h"></td>
			<td width="80%" class="pn-fcontent">
				<img width="100" height="100" id="allImgUrl" src="${ebItemCustom.ebImgCustom.allUrl }"/>
				<input type="hidden" id="path" name="ebItemCustom.ebImgCustom.imgUrl" value="${ebItemCustom.ebImgCustom.imgUrl }" />
				<input type="hidden" id="imgid" name="ebItemCustom.ebImgCustom.imgId" value="${ebItemCustom.ebImgCustom.imgId }" />
				<input type="file" onchange="uploadPic()" name="pic"/>
			</td>
		</tr>
		
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">页面关键词:</td>
			<td width="80%" class="pn-fcontent">
				<input type="text" class="text statelong" maxlength="100" size="100"
					name="ebItemCustom.keywords" value="${ebItemCustom.keywords }" />
			</td>
		</tr>
		
				<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">页面描述:</td>
			<td width="80%" class="pn-fcontent">
				<input type="text" class="text statelong" maxlength="100" size="100"
					name="ebItemCustom.description" value="${ebItemCustom.description }" />
			</td>
		</tr>
	</tbody>
	<tbody id="tab_2" style="display: none">
	
		<c:if test="${fn:length(commList) == 0}">
			<p>
				<label></label>无属性
			</p>
		</c:if>
		
		<c:forEach items="${commList }" var="feature">
			<!-- 页面设 值 -->
			<c:set var ="ee" value="" scope="page" />
			<c:forEach items="${ebItemCustom.paraList }" var="paraFeat">
				<c:if test="${paraFeat.featureId == feature.featureId  }">
					<c:set var="ee" value="${paraFeat.paraValue}" scope="page"></c:set>
					<c:set var="f_id" value="${paraFeat.paraId}" scope="page"></c:set>
				</c:if>
			</c:forEach>
		<tr>
			<td width="20%" class="pn-flabel pn-flabel-h">${feature.featureName }</td>
			
			<c:if test="${feature.inputType == 1 }">
			<td width="80%" class="pn-fcontent">
				<input type="hidden" name="${feature.featureId }para" value="${f_id }"/>
				<select name="${feature.featureId }">
					<option value="">请选择</option>
					<c:forEach items="${feature.selectValue }" var="para">
						<option <c:if test="${ee == para}">selected</c:if> value="${para }">${para }</option>
					</c:forEach>
				</select>
			</td>
			</c:if>
			
			<c:if test="${feature.inputType == 2 }">
			<td width="80%" class="pn-fcontent">
				<input type="hidden" name="${feature.featureId }para" value="${f_id }"/>
				<input type="radio" name="${feature.featureId }" value="" checked="checked">无&nbsp;</input>
				<c:forEach items="${feature.selectValue }" var="val">
					<input type="radio" <c:if test="${ee == val}">checked</c:if> name="${feature.featureId }" value="${val }"> ${val }&nbsp;</input>
				</c:forEach>
			</td>
			</c:if>
			
			<c:if test="${feature.inputType == 3 }">
			<td width="80%" class="pn-fcontent">
				<input type="hidden" name="${feature.featureId }para" value="${f_id }"/>
				<c:forEach items="${feature.selectValue }" var="val">
					<input type="checkbox" <c:if test="${fn:indexOf(ee,val) != -1}">checked</c:if> name="${feature.featureId }" value="${val }"> ${val }&nbsp;</input>
				</c:forEach>
			</td>
			</c:if>
			
			<c:if test="${feature.inputType == 4 }">
			<td width="80%" class="pn-fcontent">
				<input type="hidden" name="${feature.featureId }para" value="${f_id }"/>
				<input type="text" name="${feature.featureId }" value="${ee }"></input>
			</td>
			</c:if>
		</tr>
			<c:set var="ee" value="" scope="page"></c:set>
			<c:set var="f_id" value="" scope="page"></c:set>
		</c:forEach>
		
	</tbody>
	<tbody id="tab_3" style="display: none">
		<tr>
			<td>
				<textarea rows="10" cols="10" id="productdesc" name="ebItemCustom.ebItemClobCustom.itemDesc">${ebItemCustom.ebItemClobCustom.itemDesc }</textarea>
			</td>
		</tr>
	</tbody>
	<tbody id="tab_4" style="display: none">
		<tr>
			<td>
				<textarea rows="15" cols="136" id="productList" name="ebItemCustom.ebItemClobCustom.packingList">${ebItemCustom.ebItemClobCustom.packingList }</textarea>
			</td>
		</tr>
	</tbody>
	
	<tbody id="tab_5" style="display: none">
	
	<tr><td>
		<c:if test="${fn:length(ebItemCustom.skuList) == 0 }">
		<div id="sp_0" class="sp_0">
		<table cellspacing="0" summary="" class="tab3">
		<c:if test="${fn:length(specList) == 0}">
			<tr>
				<th colspan="2" class="gray b">&nbsp;&nbsp;<b>默认</b></th>
			</tr>
		</c:if>

		<c:forEach items="${specList }" var="feature" varStatus="status">
			<tr>
				<td>${feature.featureName }:</td>
				<td>
					<c:if test="${feature.inputType == 2 }">
						<input type="radio" name="${feature.featureId }specradio1" value="" class="specValue1" checked>无&nbsp;</input>
						
						<c:forEach items="${feature.selectValue}" var="para">
							<input type="radio" name="${feature.featureId }specradio1" class="specValue1" value="${para }">${para }&nbsp;</input>
						</c:forEach>
						
					</c:if>
				</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="2">
				<table cellspacing="0">
					<tr>
						<th>排序</th>
						<th>商城价</th>
						<th>市场价</th>
						<th>库存</th>
						<th>购买上限</th>
						<th>邮费</th>
						<th>货号</th>
						<th>货位</th>
						<th>上架</th>
						<th>类型</th>
						<th>操作</th>
					</tr>
					<tr>
						<!-- 排序 -->
						<td width="10%" class="nwp">
							<input type="text" reg1="^[0-9]{0,2}$" desc="2个字符以内" id="sort1" class="text20" name="sort1" maxlength="2" size="5" />
						</td>
						
						<!-- 商城价 -->
						<td width="12%" class="nwp">
							<samp class="red">*</samp> 
							<input reg1="^[0-9]{1,7}\.{0,1}[0-9]{0,2}$"	desc="保留2位小数，最多允许9位有效数字" 
								type="text" id="skuPrice1" name="skuPrice1" class="text20" size="5" onblur="changePri(this)" />
						</td>
						
						<!-- 市场价 -->
						<td width="12%" class="nwp">
							<input reg1="^[0-9]{0,7}\.{0,1}[0-9]{0,2}$" desc="保留2位小数，最多允许9位有效数字" 
								type="text" id="marketPrice1" name="marketPrice1" class="text20"  size="5" onblur="changePri(this)" />
						</td>
						
						<!-- 库存  stock_inventory -->
						<td width="12%" class="nwp">
							<samp class="red">*</samp>
							<input reg1="^(0|[1-9][0-9]{0,4})$"	desc="5个字符以内非负整数" 
								type="text" id="stockInventory1" name="stockInventory1" class="text20" size="5" />
						</td>
						
						<!-- 购买上限  sku_upper_limit-->
						<td width="12%" class="nwp">
							<samp class="red">*</samp>
							<input reg1="^(0|[1-9][0-9]{0,4})$"	desc="5个字符以内非负整数" 
								type="text" id="skuUpperLimit1" name="skuUpperLimit1" class="text20" size="5" />
						</td>
						
						<!-- 邮费 deliveFee1 -->
						<td width="12%" class="nwp">
							<input reg1="^(.{0,0}|0|[1-9][0-9]{0,4})$" desc="请输入5个字符以内非负整数或为空 " 
								type="text" id="deliveFee1" name="deliveFee1" class="text20" size="5" />
						</td>
						
						<!-- 货号 -->
						<td width="12%" class="nwp">
							<input reg1="^[a-zA-Z0-9_\u4e00-\u9fa5]{0,20}$" desc="20个字符以内" 
								type="text" id="skuNo1" name="skuNo1" class="text20"  size="5" />
						</td>
						
						<!-- 货位 -->
						<td width="12%" class="nwp" >
							<input reg1="^[a-zA-Z0-9_\u4e00-\u9fa5]{0,20}$" desc="20个字符以内" 
								type="text" id="location1" name="location1" class="text20" size="5" />
						</td>
						
						<!-- 上架 -->
						<td>
							<select id="showStatus1" name="showStatus1">
								<option value="0" selected>上架</option>
								<option value="1">下架</option>
							</select>
						</td>
						
						<!-- 类型 -->
						<td>
							<select id="skuType" name="skuType1">
								<!--  option value="0">赠品</option-->
								<option value="1" selected>普通</option>
							</select>
						</td>
						
						<!-- 操作 -->
						<td>
							<input type="button" value="删除" class="hand btn60x20" onclick="clickRemove('#sp_0')" />
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</div>
	</c:if>
	
		<c:if test="${fn:length(ebItemCustom.skuList) > 0  }">
		
		<c:forEach items="${ebItemCustom.skuList }" var="sku" varStatus="skuindex">
		
		<div id="sp_${skuindex.index }" class="sp_0">
		<input type="hidden" name="skuId${skuindex.index + 1 }" value="${sku.skuId }"/>
		<table cellspacing="0" summary="" class="tab3">
		
		<c:if test="${fn:length(specList) == 0}">
			<tr>
				<th colspan="2" class="gray b">&nbsp;&nbsp;<b>默认</b></th>
			</tr>
		</c:if>

		<c:forEach items="${specList }" var="feature" varStatus="featureindex">
			<c:forEach items="${sku.specList }" var="spec">
	            <c:if test="${spec.featureId == feature.featureId }">
	               <c:set var="eee" value="${spec.specValue }" scope="page"></c:set>
	               <c:set var="specId" value="${spec.specId }" scope="page"></c:set>
	             </c:if>
	         </c:forEach>
		
			<tr>
				<td>${feature.featureName }:</td>
				<td>
					<c:if test="${feature.inputType == 2 }">
						<input type="hidden" name="${feature.featureId }specId${skuindex.index + 1 }" value="${specId }"/>
						<input type="radio" class="specValue1" name="${feature.featureId }specradio${skuindex.index + 1 }" value="" >无&nbsp;</input>
						
						<c:forEach items="${feature.selectValue}" var="para">
							<input type="radio" class="specValue1" name="${feature.featureId }specradio${skuindex.index + 1 }"  value="${para }" 
							<c:if test="${para == eee}">checked</c:if> >${para }&nbsp;</input>
						</c:forEach>
						
					</c:if>
				</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="2">
				<table cellspacing="0">
					<tr>
						<th>排序</th>
						<th>商城价</th>
						<th>市场价</th>
						<th>库存</th>
						<th>购买上限</th>
						<th>邮费</th>
						<th>货号</th>
						<th>货位</th>
						<th>上架</th>
						<th>类型</th>
						<th>操作</th>
					</tr>
					<tr>
						<!-- 排序 -->
						<td width="10%" class="nwp">
							<input type="text" id="sort${skuindex.index + 1 }" class="text20" maxlength="2" size="5" 
								reg1="^[0-9]{0,2}$" desc="2个字符以内"  
								name="sort${skuindex.index + 1 }" value="${sku.skuSort }"  />
						</td>
						
						<!-- 商城价 -->
						<td width="12%" class="nwp">
							<samp class="red">*</samp> 
							<input type="text" id="skuPrice${skuindex.index + 1 }" class="text20" size="5" 
								reg1="^[0-9]{1,7}\.{0,1}[0-9]{0,2}$" desc="保留2位小数，最多允许9位有效数字" onblur="changePri(this)" 
								name="skuPrice${skuindex.index + 1 }" value="${sku.skuPrice }" />
						</td>
						
						<!-- 市场价 -->
						<td width="12%" class="nwp">
							<input type="text" id="marketPrice${skuindex.index + 1 }"  class="text20" size="5" 
								reg1="^[0-9]{0,7}\.{0,1}[0-9]{0,2}$" desc="保留2位小数，最多允许9位有效数字" onblur="changePri(this)" 
								name="marketPrice${skuindex.index + 1 }" value="${sku.marketPrice }" />
						</td>
						
						<!-- 库存  stock_inventory -->
						<td width="12%" class="nwp">
							<samp class="red">*</samp>
							<input type="text" id="stockInventory${skuindex.index + 1 }" class="text20" size="5" 
							reg1="^(0|[1-9][0-9]{0,4})$" desc="5个字符以内非负整数" 
							name="stockInventory${skuindex.index + 1 }" value ="${sku.stockInventory }" />
						</td>
						
						<!-- 购买上限  sku_upper_limit-->
						<td width="12%" class="nwp">
							<samp class="red">*</samp>
							<input type="text" id="skuUpperLimit${skuindex.index + 1 }" class="text20" size="5"
								reg1="^(0|[1-9][0-9]{0,4})$" desc="5个字符以内非负整数" 
								name="skuUpperLimit${skuindex.index + 1 }" value="${sku.skuUpperLimit }" />
						</td>
						
						<!-- 邮费 deliveFee1 -->
						<td width="12%" class="nwp">
							<input type="text" id="deliveFee${skuindex.index + 1 }" class="text20" size="5" 
								reg1="^(.{0,0}|0|[1-9][0-9]{0,4})$" desc="请输入5个字符以内非负整数或为空 " 
								name="deliveFee${skuindex.index + 1 }" value=${sku.deliveFee } />
						</td>
						
						<!-- 货号 -->
						<td width="12%" class="nwp">
							<input type="text" id="skuNo${skuindex.index + 1 }" class="text20"  size="5"
								reg1="^[a-zA-Z0-9_\u4e00-\u9fa5]{0,20}$" desc="20个字符以内" 
								name="skuNo${skuindex.index + 1 }" value="${sku.skuNo }" />
						</td>
						
						<!-- 货位 -->
						<td width="12%" class="nwp" >
							<input type="text" id="location${skuindex.index + 1 }" class="text20" size="5"
								reg1="^[a-zA-Z0-9_\u4e00-\u9fa5]{0,20}$" desc="20个字符以内" 
								name="location${skuindex.index + 1 }" value="${sku.location }" />
						</td>
						
						<!-- 上架 -->
						<td>
							<select id="showStatus${skuindex.index + 1 }" name="showStatus1">
								<option value="1" <c:if test="${sku.showStatus == 1}"> selected </c:if> >上架</option>
								<option value="0" <c:if test="${sku.showStatus == 0}"> selected </c:if> >下架</option>
							</select>
						</td>
						
						<!-- 类型 -->
						<td>
							<select id="skuType${skuindex.index + 1 }" name="skuType${skuindex.index + 1 }">
								<!--  option value="0">赠品</option-->
								<option value="1" <c:if test="${sku.skuType == 1}"> selected </c:if> >普通</option>
							</select>
						</td>
						
						<!-- 操作 -->
						<td>
							<input type="button" value="删除" class="hand btn60x20" onclick="clickRemove('#sp_${skuindex.index }')" />
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</div>
	</c:forEach>
	</c:if>
	
	</td></tr>
	
	<tr><td>
		<c:if test="${fn:length(specList) != 0}">
			<div class="page_c">
				<span class="r">
					<input type="button" value="增加规格" id="button2" name="button2" class="hand btn80x20" />
				</span>
			</div>
		</c:if>
	</td></tr>
	
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
<input type="hidden" id="itemId" name="ebItemCustom.itemId" value="${ebItemCustom.itemId }" />
<input type="hidden" id="divNum" name="divNum" value="${ebItemCustom.skuList.size() }" />
</form>
</div>

</body>
</html>