/**
 * 自己写的js
 * 
 * @version 1.0
 * @Date 2017年4月24日13:03:55
 */

/**
 * ********模式窗口类*********** 编辑 添加打开的窗口 窗口对象
 */
function modalwindow(title, width, height, url) {
	this.title = title;
	this.width = width;
	this.height = height;
	this.url = url;
	var id = new Date().getMilliseconds();
	this.windowid = "win_" + id;
	this.iframeid = "iframe_" + id;

}
// 创建窗口
modalwindow.prototype.createWindow = function() {
	var active = document.createElement("div");
	active.id = "active";
	document.body.appendChild(active);
	active.innerHTML = "<div id="
			+ this.windowid
			+ " class=\"easyui-window\" modal='true' closed='true'  iconCls=\"icon-save\" ><iframe scrolling='yes' style='overflow-x:hidden;' id='"
			+ this.iframeid + "' src='" + this.url + "' frameborder='0' width='100%' height='100%'></iframe></div>";
	// 创建窗口
	$('#' + this.windowid).window({
		title : this.title,
		width : this.width,
		modal : true,
		shadow : false,
		minimizable : false,
		collapsible : false,
		closed : true,
		height : this.height
	});
	// 打开
	this.open();

};

/**
 * 窗口 打开
 */
modalwindow.prototype.open = function() {
	$('#' + this.windowid).window('open');
};

/**
 * 窗口关闭
 */
modalwindow.prototype.close = function() {
	$('#' + this.windowid).window('close');
};

/**
 * 窗口关闭
 */
modalwindow.prototype.maximize = function() {
	$('#' + this.windowid).window('maximize');
};

// ==================================================================================

// 模式窗口单一实例
var modalwindow_singleobj;

/**
 * 编辑 添加 调用此方法 创建模式窗口
 * 
 * @param {}
 *            title
 * @param {}
 *            width
 * @param {}
 *            height
 * @param {}
 *            url
 */
function createmodalwindow(title, width, height, url) {
	modalwindow_singleobj = new modalwindow(title, width, height, url);
	// 调用创建窗口
	modalwindow_singleobj.createWindow();
}
// 创建窗口 并且最大化
function createmodalwindowmax(title, width, height, url) {
	modalwindow_singleobj = new modalwindow(title, width, height, url);
	// 调用创建窗口
	modalwindow_singleobj.createWindow();
	modalwindow_singleobj.maximize();
}

/**
 * 编辑 添加 关闭调用此方法 关闭模式窗口
 */
function closemodalwindow() {
	if (modalwindow_singleobj) {
		modalwindow_singleobj.close();
	}
}

// ===================================================================================================
/**
 * form表单数据转成json
 */
(function($) {
	$.fn.serializeJson = function() {
		var serializeObj = {};
		var array = this.serializeArray();
		var str = this.serialize();
		$(array).each(function() {
			if (serializeObj[this.name]) {
				if ($.isArray(serializeObj[this.name])) {
					serializeObj[this.name].push(this.value);
				} else {
					serializeObj[this.name] = [ serializeObj[this.name], this.value ];
				}
			} else {
				serializeObj[this.name] = this.value;
			}
		});
		return serializeObj;
	};
})(jQuery);

// 将表单数据转为json
function form2Json(id) {

	var arr = $("#" + id).serializeArray()
	var jsonStr = "";

	jsonStr += '{';
	for (var i = 0; i < arr.length; i++) {
		jsonStr += '"' + arr[i].name + '":"' + arr[i].value + '",'
	}
	jsonStr = jsonStr.substring(0, (jsonStr.length - 1));
	jsonStr += '}'

	var json = JSON.parse(jsonStr)
	return json
}

// ===========================================================================================================

var fn = function() {
	parent.parent.closemodalwindow();
}

var alert_base = function(message, iconType, details) {
	// 调用 ezsyui 的 消息窗口方法
	$.messager.alert('系统提示信息', message, iconType);
};

// jqueryeasyui messager封装
var alert_success = function(message) {
	alert_base(message, "success");
};

var alert_error = function(message) {
	alert_base(message, "error");
};

var alert_info = function(message) {
	alert_base(message, "info");
};

var alert_warn = function(message) {
	alert_base(message, "warning");
};

var alert_none = function(message) {
	alert_base(message);
};

// ==============================================================================

/**
 * 系统提交统一提示窗口，采用jquery easyui的模式window实现
 */
var TYPE_RESULT_FAIL = 0;
var TYPE_RESULT_SUCCESS = 1;
var TYPE_RESULT_WARN = 2;
var TYPE_RESULT_INFO = 3;

// ==============================================================================
/**
 * 提示框 alert 有 确定 按钮；确定 直接关闭窗口；
 */
function ma_message_alert(data) {
	// 从返回的json数据中获取结果信息
	var data_v = data.resultInfo;

	// 提交结果类型
	var type = data_v.type;
	// 结果提示信息
	var message = data_v.message;
	// alert(message);
	switch (type) {
	case TYPE_RESULT_FAIL:
		// 如果type等于0表示失败，调用 jquery easyui的信息提示组件
		$.messager.alert('提示信息', message, 'error');

		break
	case TYPE_RESULT_SUCCESS:
		$.messager.alert('提示信息', message, 'success', function() {
			// alert(3);
			parent.closemodalwindow();
		});

		break
	case TYPE_RESULT_WARN:
		$.messager.alert('提示信息', message, 'warning');

		break
	case TYPE_RESULT_INFO:
		$.messager.alert('提示信息', message, 'info');

		break
	}
}

/**
 * 提示框 alert 有 确定 按钮；确定有 回调函数(并且关闭窗口)；
 */
function mao_message_alert(data, method_ok) {
	// 从返回的json数据中获取结果信息
	var data_v = data.resultInfo;
	// 提交结果类型
	var type = data_v.type;
	// 结果提示信息
	var message = data_v.message;
	// alert(message);

	switch (type) {
	case TYPE_RESULT_FAIL:
		// 如果type等于0表示失败，调用 jquery easyui的信息提示组件
		$.messager.alert('提示信息', message, 'error');

		break
	case TYPE_RESULT_SUCCESS:
		$.messager.alert('提示信息', message, 'success', function() {
			// 执行确定操作
			if (method_ok) {
				method_ok(data);
			}
			parent.closemodalwindow();
		});

		break
	case TYPE_RESULT_WARN:
		$.messager.alert('提示信息', message, 'warning');

		break
	case TYPE_RESULT_INFO:
		$.messager.alert('提示信息', message, 'info');

		break
	}
}

/**
 * 提示框 confirm 有 确定&取消 按钮；确定有 回调函数；取消有 回调函数(并且关闭窗口)
 */
function mcoc_message_alert(data, method_cancel, method_ok) {
	// 从返回的json数据中获取结果信息
	var data_v = data.resultInfo;

	// 提交结果类型
	var type = data_v.type;
	// 结果提示信息
	var message = data_v.message;
	// alert(message);
	switch (type) {
	case TYPE_RESULT_FAIL:
		// 如果type等于0表示失败，调用 jquery easyui的信息提示组件
		$.messager.alert('提示信息', message, 'error');

		break
	case TYPE_RESULT_SUCCESS:
		message += "<br/><br/>继续添加新的记录吗？"
		$.messager.confirm('系统提示', message, function(r) {
			if (r) {
				// 执行确定操作
				if (method_ok) {
					method_ok(data);
				}
			} else {
				// 点击取消 判断有 取消方法吗 有的话先执行 取消方法， 执行完成后 关闭页面
				if (method_cancel) {
					method_cancel(data);
					// 关闭窗口
					parent.closemodalwindow();
				} else {
					// 关闭窗口
					parent.closemodalwindow();
				}
			}
		});

		break
	case TYPE_RESULT_WARN:
		$.messager.alert('提示信息', message, 'warning');

		break
	case TYPE_RESULT_INFO:
		$.messager.alert('提示信息', message, 'info');

		break
	}
}

// ====================================================================================

/**
 * 获取返回结果信息对象
 * 
 * @param {}
 *            data 返回数据
 * @return {}
 */
function getCallbackData(data) {
	return data.resultInfo;
}

/**
 * 显示多条信息 将失败明细信息展示
 * 
 * @param {}
 *            resultInfo
 */
var _alert = function(resultInfo) {
	var type = resultInfo.type;

	switch (type) {
	case TYPE_RESULT_FAIL:
		submit_alert_error(resultInfo);

		break;
	case TYPE_RESULT_SUCCESS:
		submit_alert_success(resultInfo);

		break;
	case TYPE_RESULT_WARN:
		submit_alert_warn(resultInfo);

		break;
	case TYPE_RESULT_INFO:
		submit_alert_info(resultInfo);

		break;
	default:
		submit_alert_info(resultInfo);
	}
	// 取消加载框，某些情况自动取消不了这里需要再次调用
	// $("#load").remove();
};

/**
 * 显示多条信息 将失败明细信息展示(成功时有回调函数)
 */
var d_alert = function(data, method_ok) {
	var resultInfo = data.resultInfo;
	var type = resultInfo.type;
	
	switch (type) {
	case TYPE_RESULT_FAIL:
		submit_alert_error(resultInfo);

		break;
	case TYPE_RESULT_SUCCESS:
		submit_alert_success(resultInfo);
		// 调用回调 成功时 的回调函数
		if (method_ok) {
			method_ok(data);
		}

		break;
	case TYPE_RESULT_WARN:
		submit_alert_warn(resultInfo);

		break;
	case TYPE_RESULT_INFO:
		submit_alert_info(resultInfo);

		break;
	default:
		submit_alert_info(resultInfo);
	}
	// 取消加载框，某些情况自动取消不了这里需要再次调用
	$("#load").remove();
};

var submit_alert_base = function(resultInfo, iconType) {

	// 提示代码
	var messageCode = resultInfo.messageCode;
	// 提示信息
	var message = resultInfo.message;
	// 提示信息明细
	var details = resultInfo.details;
	// 窗口内信息加载
	submit_alert_show(iconType, messageCode, message, details, 350, 250);
};

var submit_alert_success = function(resultInfo) {
	submit_alert_base(resultInfo, "success");
};

var submit_alert_error = function(resultInfo) {
	submit_alert_base(resultInfo, "error");
};

var submit_alert_info = function(resultInfo) {
	submit_alert_base(resultInfo, "info");
};

var submit_alert_warn = function(resultInfo) {
	submit_alert_base(resultInfo, "warning");
};

// ====================================================================================================

// 模式窗口单一实例
var messagewindow_singleobj;

// 系统提交提示窗口显示
function submit_alert_show(iconType, messageCode, message, messagelist, width, height) {

	var html = '<div style="width: 93%; height: auto;padding:10px" title="" >';
	// icon
	html += '<div class="messager-icon messager-' + iconType + '"></div>';
	// 系统代码
	html += '<div>提示代码：' + messageCode + '</div>';
	html += '<div>提示信息：' + message + '</div>';
	html += '<div style="clear:both;"></div>';
	// 详细信息
	var deltail = '';

	if (messagelist) {
		for (var index = 0; index < messagelist.length; index++) {
			deltail += '<div style="width: 100%;">';
			if (messagelist[index].index) {
				deltail += '序号：' + messagelist[index].index + ' ';
			}
			deltail += messagelist[index].message + '</div>';
		}
	}

	html += deltail;

	// // 按钮
	// html += '<div style="width: 100%;">';
	//	
	// var queding = '<span class="l-btn-left"><span
	// class="l-btn-text">确定</span></span>';
	//	
	// var aa = '<a href="javascript:closemessagewindow()" class="l-btn">' +
	// queding +'</a>';
	//	
	// html += '<br/><br/><div class="dialog-button"
	// style="text-align:center;">' + aa + '</div>';
	// // 结束
	// html += '</div>';

	/*
	 * var html='<div style="width: 93%; height: auto;padding:10px" title="" >' +'<div
	 * class="messager-icon messager-success"></div>' +'<div>系统代码：907，操作成功0条，失败2条</div><div
	 * style="clear:both;"></div>' //+'<div style="width: 100%;">ffsdsfdsfds</div>'
	 * //+'<div style="width: 100%;">ffsdsfdsfds</div>' //+'<div
	 * style="width: 100%;">ffsdsfdsfds</div>' //+'<div style="width:
	 * 100%;">ffsdsfdsfds</div>' +'<div style="width: 100%;"><div
	 * class="dialog-button" style="text-align:center;"><a
	 * href="javascript:closemessagewindow()" class="l-btn"><span
	 * class="l-btn-left"><span class="l-btn-text">确定</span></span></a></div></div>'; +'</div>';
	 */

	messagewindow_singleobj = new messagewindow("系统提示", width, height, html);
	// 对象 调用方法创建窗口
	messagewindow_singleobj.createWindow();

}

/**
 * 关闭模式窗口
 */
function closemessagewindow() {
	if (messagewindow_singleobj) {
		messagewindow_singleobj.close();
	}
}

// ====================================================================================================

/**
 * 明细窗口对象 明细提示窗口
 * 
 * @param {}
 *            title
 * @param {}
 *            width
 * @param {}
 *            height
 * @param {}
 *            html
 */
function messagewindow(title, width, height, html) {

	this.title = title;
	this.width = width;
	this.height = height;
	this.html = html;
	var id = new Date().getMilliseconds();
	this.windowid = "message_win_" + id;
}

// 定义datagrid的工具栏
var buttons = [ {// 工具栏
	id : 'btnadd',
	text : '确定',
	// iconCls : 'l-btn',
	handler : function() {
		closemessagewindow();
	}
} ];

/**
 * 创建窗口
 */
messagewindow.prototype.createWindow = function() {

	var active = document.createElement("div");
	active.id = "active";
	document.body.appendChild(active);
	active.innerHTML = "<div id=" + this.windowid + " class=\"easyui-window\" modal='true' closed='true'  iconCls=\"icon-save\" >"
			+ this.html + "</div>";
	// dialog
	$('#' + this.windowid).dialog({
		title : this.title,
		width : this.width,
		modal : true, // 父容器不可点
		shadow : false,
		minimizable : false,
		collapsible : false,
		closed : true,
		buttons : buttons,
		height : this.height
	});

	this.open();
};

/**
 * 打开窗口
 */
messagewindow.prototype.open = function() {
	$('#' + this.windowid).dialog('open');
};

/**
 * 关闭窗口
 */
messagewindow.prototype.close = function() {
	$('#' + this.windowid).dialog('close');
};

// ======================================================================================================

/**
 * 删除提示
 * 
 * @param {}
 *            question 消息
 * @param {}
 *            method_cancel
 * @param {}
 *            method_ok
 */
var _confirm = function(question, method_cancel, method_ok) {
	$.messager.confirm('系统提示', question, function(r) {
		if (r) {
			if (method_ok) {
				method_ok();
			}
		} else {
			if (method_cancel) {
				method_cancel();
			}
		}
	});

};

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */