<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ichigo mashimaro-add</title>
<style type="">
.pics ul li{
	float: left;
	padding-right: 5px;
}
</style>
<script type="text/javascript">
	function loadFCK() {

		var fck1 = new FCKeditor("productdesc");
		fck1.BasePath = "/ares/fck/fckeditor-2.6.4/";
		fck1.Height = 500;
		fck1.Config["ImageUploadURL"] = "/upload/uploadFck.do";
		fck1.ReplaceTextarea();

		var fck2 = new FCKeditor("productList");
		fck2.BasePath = "/ares/fck/fckeditor-2.6.4/";
		fck2.Height = 500;
		fck2.ToolbarSet = 'Basic';
		fck2.Config["ImageUploadURL"] = "/upload/uploadFck.do";
		fck2.ReplaceTextarea();
	}

	function shangpinguige() {
		var divNum = 1;
		//实现页面规格的自动增加和删除
		$("#button2").click(function() {
			divNum++;
			//实现页面的自动增加和删除
			var htmlDiv = $("#sp_0").html();
			htmlDiv = "<div id ='sp_" + divNum + "'>" + htmlDiv + "</div>";
			//radio
			htmlDiv = htmlDiv.replace(/specradio1/g, "specradio" + divNum);
			htmlDiv = htmlDiv.replace(/#sp_0/g, "#sp_" + divNum);

			//skuType1   showStatus1   sort1     skuPrice1  marketPrice1  stockInventory1  skuUpperLimit1  sku1  location1
			htmlDiv = htmlDiv.replace(/sort1/g, "sort" + divNum);
			htmlDiv = htmlDiv.replace(/skuPrice1/g, "skuPrice" + divNum);
			htmlDiv = htmlDiv.replace(/marketPrice1/g, "marketPrice" + divNum);
			htmlDiv = htmlDiv.replace(/stockInventory1/g, "stockInventory" + divNum);
			htmlDiv = htmlDiv.replace(/skuUpperLimit1/g, "skuUpperLimit" + divNum);
			htmlDiv = htmlDiv.replace(/deliveFee1/g, "deliveFee" + divNum);
			htmlDiv = htmlDiv.replace(/skuNo1/g, "skuNo" + divNum);
			htmlDiv = htmlDiv.replace(/location1/g, "location" + divNum);
			htmlDiv = htmlDiv.replace(/showStatus1/g, "showStatus" + divNum);
			htmlDiv = htmlDiv.replace(/skuType1/g, "skuType" + divNum);
			$("#divNum").val(divNum); //重新赋值
			//alert(htmlDiv);

			$(".page_c").before(htmlDiv);
			//alert(htmlDiv);

		});
	}

	//商品规格的redio选中与取消
	$("#tab1").find("input[type=radio]").live("dblclick", function() {
		if($(this).attr('checked') == 'checked') {
			$(this).removeAttr('checked');
		} else {
			$(this).attr('checked', 'checked');
		}
	});

	//删除 商品规格
	function clickRemove(id) {
		if(id == "#sp_0") {
			alert("默认人的不能删除")
			return;
		}
		$(id).remove();
	}

	//上传图片
	function uploadPic() {
		//定义参数
		var options = {
			url: "/upload/uploadPic.do",
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

	function moduleSave() {
		//if($.formValidator.pageIsValid()){ // 校验
		// from id, 回调函数,param 回调函数参数(如果为null,那么调用一个参数的回调函数,否则调用两个参数的回调函数)//返回的数据类型
		jquerySubByFId('jvForm', moduleSave_callback, null, "json");
		//}
	}

	function moduleSave_callback(data) {
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

	// 编辑器参数
	var kingEditorParams = {
		// 指定上传文件参数名称
		filePostName: "pic",
		// 指定上传文件请求的url。
		uploadJson: '/upload/uploadPicK.do',
		// 上传类型，分别为image、flash、media、file
		dir: "image"
	};

	function kindEditorUpload() {
		var _ele = $("#picFileUpload");
		_ele.siblings("div.pics").remove();
		_ele.after('<div id="picsid" class="pics"><ul></ul></div>');
		
		// 给“上传图片按钮”绑定click事件
		$("#picFileUpload").click(function() {
			var form = $(this).parentsUntil("form").parent("form");
			//var form = $("#jvForm");
			// 打开图片上传窗口
			KindEditor.editor(kingEditorParams).loadPlugin('multiimage', function() {
				var editor = this;
				editor.plugin.multiImageDialog({
					clickFn: function(urlList) {
						var imgArray = [];
						KindEditor.each(urlList, function(i, data) {
							imgArray.push(data.path);
							form.find(".pics ul").append("<li><a href='" + data.url + "' target='_blank'><img src='" + data.url + "' width='60' height='60' /></a></li>");
						});
						$("#image").val(imgArray.join(","));
						editor.hideDialog();
					}
				});
			});
		});

	}
	var editor;
	function kindEditorText(){
		editor = KindEditor.create("#productdesc", kingEditorParams);
	}

	$(function() {

		$("#nav4").panel({
			fit: true,
			border: false,
		});

		var h = $("#nav4").height() - 38;
		// 初始 面板
		$("#nav2").panel({
			//fit : true,
			//doSize :true,
			height: h,
			border: false,
			//border:false,
		});

		$("#tabs").tabs({
			fit: true,
			border: false,

		});

		$("#nav4").panel({
			onResize: function(w, h) {
				w = w - 5;
				h = h - 40;
				$("#nav2").panel("resize", {
					width: w,
					height: h,
				});
			},
		});

		loadFCK();

		shangpinguige();
		
		kindEditorUpload();
		
		//kindEditorText();
	});
</script>
</head>

<body>
<!-- <div class="box-positon"> -->
<!-- 	<div class="rpos">当前位置: 商品管理 - 添加</div> -->
<!-- 	<div class="ropt"> -->
<!-- 	</div> -->
<!-- 	<div class="clear"></div> -->
<!-- </div> -->
<div id="nav4">
	<form id="jvForm" action="/product/item/add.do" method="post" enctype="multipart/form-data">

		<div id="nav2">
			<div id="tabs">
				<div id="tab1" title="基本信息" style="fit:true;display:none;">
					<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 商品类型:
							</td>
							<td width="80%" class="pn-fcontent">
								<input name="ebItemCustom.typeName" value="${ebTypeCustom.typeName }" disabled="disabled" />
								<input id="cc" type="hidden" name="ebItemCustom.typeId" value="${ebTypeCustom.typeId }" />
							</td>
						</tr>
						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 商品名称:
							</td>
							<td width="80%" class="pn-fcontent">
								<input type="text" class="text statelong" maxlength="100" size="100" name="ebItemCustom.itemName" />
							</td>
						</tr>

						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 商品品牌:
							</td>
							<td width="80%" class="pn-fcontent">
								<select name="ebItemCustom.brandId">
									<option value="">请选择品牌</option>
									<c:forEach items="${ebBrandList }" var="entry">
										<option value="${entry.brandId }">${entry.brandName }</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 商品毛重:
							</td>
							<td width="80%" class="pn-fcontent">
								<input type="text" value="0.6" class="text statelong" maxlength="10" name="ebItemCustom.itemWeight" />KG
							</td>
						</tr>

						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 是否新品：
							</td>
							<td width="80%" class="pn-fcontent">
								<input name="ebItemCustom.isNew" type="radio" value="1" checked="checked" />是&nbsp;&nbsp;
								<input name="ebItemCustom.isNew" type="radio" value="0" />否&nbsp;&nbsp;
							</td>
						</tr>
						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 是否推荐：
							</td>
							<td width="80%" class="pn-fcontent">
								<input name="ebItemCustom.isCommend" type="radio" value="1" />是&nbsp;&nbsp;
								<input name="ebItemCustom.isCommend" type="radio" value="0" checked="checked" />否&nbsp;&nbsp;
							</td>
						</tr>
						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 是否热卖：
							</td>
							<td width="80%" class="pn-fcontent">
								<input name="ebItemCustom.isHot" type="radio" value="1" />是&nbsp;&nbsp;
								<input name="ebItemCustom.isHot" type="radio" value="0" checked="checked" />否&nbsp;&nbsp;
							</td>
						</tr>
						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 上传商品图片(90x150尺寸):
							</td>
							<td width="80%" class="pn-fcontent">
								<a href="javascript:void(0)" id="picFileUpload" class="easyui-linkbutton">上传图片</a>
								<input type="hidden" id="image" name="ebItemCustom.ebImgCustom.imgUrl" />
							</td>
						</tr>
						<!-- 	<tr> -->
						<!-- 		<td width="20%" class="pn-flabel pn-flabel-h"></td> -->
						<!-- 		<td width="80%" class="pn-fcontent"> -->
						<!-- 			<img width="100" height="100" id="allImgUrl" src="/res/img/pic/ppp0.jpg"/> -->
						<!-- 			<input type="hidden" name="ebItemCustom.ebImgCustom.imgUrl" id="path"/> -->
						<!-- 			<input type="file" onchange="uploadPic()" name="pic"/> -->
						<!-- 		</td> -->
						<!-- 	</tr> -->
						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 页面关键词:
							</td>
							<td width="80%" class="pn-fcontent">
								<input type="text" class="text statelong" maxlength="100" size="100" name="ebItemCustom.keywords" />
							</td>
						</tr>
						<tr>
							<td width="20%" class="pn-flabel pn-flabel-h">
								<span class="pn-frequired">*</span> 页面描述:
							</td>
							<td width="80%" class="pn-fcontent">
								<input type="text" class="text statelong" maxlength="100" size="100" name="ebItemCustom.description" />
							</td>
						</tr>

					</table>
				</div>

				<div id="tab2" title="商品参数" style="fit:true;display:none;">
					<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">

						<c:forEach items="${commList }" var="feature">
							<tr>
								<td width="20%" class="pn-flabel pn-flabel-h">${feature.featureName }</td>

								<c:if test="${feature.inputType == 1 }">
									<td width="80%" class="pn-fcontent">
										<select name="${feature.featureId }">
											<option value="">请选择</option>
											<c:forEach items="${feature.selectValue }" var="para">
												<option value="${para }">${para }</option>
											</c:forEach>
										</select>
									</td>
								</c:if>

								<c:if test="${feature.inputType == 2 }">
									<td width="80%" class="pn-fcontent">
										<input type="radio" name="${feature.featureId }" value="" checked="checked" />无&nbsp;
										<c:forEach items="${feature.selectValue }" var="val">
											<input type="radio" name="${feature.featureId }" value="${val }" /> ${val }&nbsp;
										</c:forEach>
									</td>
								</c:if>

								<c:if test="${feature.inputType == 3 }">
									<td width="80%" class="pn-fcontent">
										<c:forEach items="${feature.selectValue }" var="val" varStatus="sta">
											<input type="checkbox" name="${feature.featureId }" value="${val }" /> ${val }&nbsp;
											<c:if test="${(sta.index+1)%4==0 }"><br/></c:if>
										</c:forEach>
									</td>
								</c:if>

								<c:if test="${feature.inputType == 4 }">
									<td width="80%" class="pn-fcontent">
										<input type="text" name="${feature.featureId }" value="" />
									</td>
								</c:if>
							</tr>
						</c:forEach>

					</table>
				</div>

				<div id="tab3" title="商品描述" style="fit:true;display:none;">
					<textarea id="productdesc" name="ebItemCustom.ebItemClobCustom.itemDesc"></textarea>
				</div>

				<div id="tab4" title="包装清单" style="fit:true;display:none;">
					<textarea id="productList" name="ebItemCustom.ebItemClobCustom.packingList"></textarea>
				</div>

				<div id="tab5" title="商品规格" style="fit:true;display:none;">

					<div id="sp_0" class="sp_0">
						<table cellspacing="1" cellpadding="2" width="100%" border="0" class="tab3">
							<c:if test="${fn:length(specList) == 0}">
								<tr>
									<th colspan="2" class="gray b">&nbsp;&nbsp;<b>默认</b></th>
								</tr>
							</c:if>

							<c:forEach items="${specList }" var="feature">
								<tr>
									<td>${feature.featureName }:</td>
									<td>
										<c:if test="${feature.inputType == 2 }">
											<input type="radio" name="${feature.featureId }specradio1" value="" class="specValue1" checked />无&nbsp;
											<c:forEach items="${feature.selectValue}" var="para">
												<input type="radio" name="${feature.featureId }specradio1" class="specValue1" value="${para }" />${para }&nbsp;
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
												<input id="sort1" reg1="^[0-9]{0,2}$" desc="2个字符以内" type="text" class="text20" name="sort1" maxlength="2" size="5" />
											</td>

											<!-- 商城价 -->
											<td width="12%" class="nwp">
												<samp class="red">*</samp>
												<input id="skuPrice1" reg1="^[0-9]{1,7}\.{0,1}[0-9]{0,2}$" desc="保留2位小数，最多允许9位有效数字" type="text" name="skuPrice1" class="text20" size="5" onblur="changePri(this)" />
											</td>

											<!-- 市场价 -->
											<td width="12%" class="nwp">
												<input id="marketPrice1" reg1="^[0-9]{0,7}\.{0,1}[0-9]{0,2}$" desc="保留2位小数，最多允许9位有效数字" type="text" name="marketPrice1" class="text20" size="5" onblur="changePri(this)" />
											</td>

											<!-- 库存  stock_inventory -->
											<td width="12%" class="nwp">
												<samp class="red">*</samp>
												<input id="stockInventory1" reg1="^(0|[1-9][0-9]{0,4})$" desc="5个字符以内非负整数" type="text" name="stockInventory1" class="text20" size="5" />
											</td>

											<!-- 购买上限  sku_upper_limit-->
											<td width="12%" class="nwp">
												<samp class="red">*</samp>
												<input id="skuUpperLimit1" reg1="^(0|[1-9][0-9]{0,4})$" desc="5个字符以内非负整数" type="text" name="skuUpperLimit1" class="text20" size="5" />
											</td>

											<!-- 邮费 deliveFee1 -->
											<td width="12%" class="nwp">
												<input id="deliveFee1" reg1="^(.{0,0}|0|[1-9][0-9]{0,4})$" desc="请输入5个字符以内非负整数或为空 " type="text" name="deliveFee1" class="text20" size="5" />
											</td>

											<!-- 货号 -->
											<td width="12%" class="nwp">
												<input id="skuNo1" reg1="^[a-zA-Z0-9_\u4e00-\u9fa5]{0,20}$" desc="20个字符以内" type="text" name="skuNo1" class="text20" size="5" />
											</td>

											<!-- 货位 -->
											<td width="12%" class="nwp">
												<input id="location1" reg1="^[a-zA-Z0-9_\u4e00-\u9fa5]{0,20}$" desc="20个字符以内" type="text" name="location1" class="text20" size="5" />
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

					<c:if test="${fn:length(specList) != 0}">
						<div class="page_c">
							<span class="r">
								<input type="button" value="增加规格" id="button2" name="button2" class="hand btn60x20" />
							</span>
						</div>
					</c:if>

				</div>

			</div>
		</div>

		<table cellspacing="1" cellpadding="2" width="100%" border="0" class="pn-ftable">
			<tr>
				<td class="pn-fbutton" colspan="2">
					<a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href="#" onclick="moduleSave()">提交</a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a id="closebtn" class="easyui-linkbutton" iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">关闭</a>
				</td>
			</tr>
		</table>
		<input type="hidden" id="divNum" name="divNum" value="1" />
	</form>
</div>
</body>

</html>