/*
 * Copyright (C) 2011 - 2020 Author: fanhongen
 */
$(document).ready(function() {
	$("[reg],[url]").blur(function() {
		var isContinue = true;
		if (typeof ($(this).attr("reg")) != "undefined") {
			isContinue = clientValidate($(this));
		}
		if (isContinue) {
			if (typeof ($(this).attr("url")) != "undefined") {
				isContinue = serverValidate($(this));
			}
		}
		if (isContinue) {
			$(this).siblings("span").html("");
		}

	});

});

/**
 * 页面校验
 */
function clientValidate(obj) {
	var requ = obj.attr("requ");
	var reg = new RegExp(obj.attr("reg"));
	var objValue = obj.attr("value");
	var min = parseFloat(obj.attr("min"));
	var max = parseFloat(obj.attr("max"));
	if (typeof (requ) != "undefined" && requ == "false") {
		if (objValue == "") {
			return true;
		} else {
			if (!reg.test(objValue)) {
				obj.siblings("span").addClass("err").html(obj.attr("tip"));
				return false;
			}
			if (min != null && min != NaN) {
				if (min > parseFloat(objValue)) {
					obj.siblings("span").addClass("err").html(obj.attr("tip"));
					return false;
				}
			}
			if (max != null && max != NaN) {
				if (max < parseFloat(objValue)) {
					obj.siblings("span").addClass("err").html(obj.attr("tip"));
					return false;
				}
			}
		}
	}
	if (!reg.test(objValue)) {
		obj.siblings("span").addClass("err").html(obj.attr("tip"));
		return false;
	}
	if (min != null && min != NaN) {
		if (min > parseFloat(objValue)) {
			obj.siblings("span").addClass("err").html(obj.attr("tip"));
			return false;
		}
	}
	if (max != null && max != NaN) {
		if (max < parseFloat(objValue)) {
			obj.siblings("span").addClass("err").html(obj.attr("tip"));
			return false;
		}
	}
	return true;
}

/**
 * ajax 校验
 * 
 * @param obj
 * @returns {Boolean}
 */
function serverValidate(obj) {
	var json;
	var url_str = obj.attr("url");
	if (url_str.indexOf("?") != -1) {
		url_str = url_str + "&" + obj.attr("name") + "=" + obj.attr("value");
	} else {
		url_str = url_str + "?" + obj.attr("name") + "=" + obj.attr("value");
	}
	url_str = encodeURI(url_str);// 不加的话中文会乱码
	$.ajax({
		url : url_str,
		type : "post",
		cache : false,
		async : false,
		dataType : "json",
		success : function(data) {
			json = data;
		},
		error : function() {
			obj.siblings("span").addClass("err").html("服务器错误！");
			return false;
		}
	});

	if (json.resultInfo.type == '1') {
		return true;
	} else {
		// alert(obj.attr("tip"));obj.after("<b>"+json.info+"</b>");
		// obj.siblings("span").html("<b>"+json.info+"</b>");
		obj.siblings("span").addClass("err").html(json.resultInfo.message);
		return false;
	}

	// var response = $.ajax({
	// url : url_str,
	// cache : false,
	// async : false
	// }).responseText;
	// response = response.replace(/(^\s*)|(\s*$)/g, "");
	// var json = eval("(" + response + ")");
	// if (json.state == 'success') {
	// return true;
	// } else {
	// // alert(obj.attr("tip"));obj.after("<b>"+json.info+"</b>");
	// // obj.siblings("span").html("<b>"+json.info+"</b>");
	// obj.siblings("span").addClass("err").html(json.info);
	// return false;
	// }
}

/**
 * 表单提交时候校验
 * 
 * @returns {Boolean}
 */
function judgeWetherCanSubmit() {
	var isSubmit = true;
	$(document).find("[reg],[url]").each(function() {
		if (typeof ($(this).attr("reg")) != "undefined") {
			if (!clientValidate($(this))) {
				// alert($(this).attr("tip"));
				isSubmit = false;
			}
			if (isSubmit) {
				if (typeof ($(this).attr("url")) != "undefined") {
					isSubmit = serverValidate($(this));
				}
			}
		}
	});
	return isSubmit;
}
