<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>${version_name } | 系统首页</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0
}

a:focus {
	outline: none;
}

html {
	height: 100%;
	overflow: hidden;
}

body {
	height: 100%;
}

#top {
	background-color: #1d63c6;
	height: 69px;
	width: 100%;
}

.logo {
	width: 215px;
	height: 69px;
}

.topbg {
	background: url(/ares/png/img/admin/top-tbg.png) no-repeat;
	height: 38px;
}

.login-welcome {
	padding-left: 20px;
	color: #fff;
	font-size: 14px;
	background: url(/ares/png/img/admin/topbg.gif) no-repeat;
}

.data {
	color: #fff;
	font-size: 14px;
}

.login-welcome a:link, .login-welcome a:visited {
	color: #fff;
	text-decoration: none;
}

#welcome {
	color: #FFFFFF;
	padding: 0 30px 0 5px;
}

#logout {
	color: #FFFFFF;
	padding-left: 5px;
}

.nav {
	height: 31px;
	overflow: hidden;
}

.nav-menu {
	background: url(/ares/png/img/admin/bg.png) repeat-x;
	height: 31px;
	list-style: none;
	padding-left: 20px;
	font-size: 14px;
}

.nav .current {
	background: url(/ares/png/img/admin/navcurrbg.gif) no-repeat 0px 2px;
	color: #fff;
	width: 72px;
	text-align: center;
}

.nav .current a {
	color: #fff;
}

.nav-menu li {
	height: 31px;
	text-align: center;
	line-height: 31px;
	float: left;
}

.nav-menu li a {
	color: #2b2b2b;
	font-weight: bold;
}

.nav-menu li.sep {
	background: url(/ares/png/img/admin/step.png) no-repeat;
	width: 2px;
	height: 31px;
	margin: 0px 5px;
}

.nav .normal {
	width: 72px;
	text-align: center;
}

.top-bottom {
	width: 100%;
	background: url(/ares/png/img/admin/bg.png) repeat-x 0px -34px;
	height: 3px;
}

.undis {
	display: none;
}

.dis {
	display: block;
}

#img1 {
	border-radius: 50%;
}
</style>

<script type="text/javascript">

var tabOnSelect = function(title) {
	//根据标题获取tab对象
	var currTab = $('#tabs').tabs('getTab', title);
	var iframe = $(currTab.panel('options').content);//获取标签的内容

	var src = iframe.attr('src');//获取iframe的src
	//当重新选中tab时将ifram的内容重新加载一遍，目的是获取当前页面的最新内容
	if (src)
		$('#tabs').tabs('update', {
			tab : currTab,
			options : {
				content : createFrame(src)
			//ifram内容
			}
		});
};

function loadeTree(){
	
	//定义setTimeout执行方法
	var TimeFn = null;
	
 	$('#ttModule').tree({
 		animate:true,
 		lines:true,
		url: "/user/personal/usermenuTree.do",
		checkbox: false,
		//点击事件
		onClick:function(node){
			// 取消上次延时未执行的方法
			clearTimeout(TimeFn);
		    //执行延时
		    TimeFn = setTimeout(function(){
		        //do function在此处写单击事件要执行的代码
		    	//alert(node.id);
		    	moduleId = node.id;
		    	//if($("#ttModule").tree("getParent",node.target)){}
		    	if(node.attributes.isSeaf==1){
			    	// 打开所选菜单
			    	menuclick(node);
			    	// 隐藏左侧列表
			    	//$('#layoutbody').layout('collapse','west');  
			    	//collapse
			    }
		    },300);
		},
		// 双肩事件
		onDblClick: function(node) {
			// 取消上次延时未执行的方法
		    clearTimeout(TimeFn);
		    $(this).tree(node.state === 'closed' ? 'expand' : 'collapse', node.target);  
		    node.state = node.state === 'closed' ? 'open' : 'closed';
		},
		// 加载成功事件
		onLoadSuccess:function(){
			//$('#ttModule').tree("collapseAll");
		},
 	});
 	
	// 绑定方法
	// $('.easyui-accordion li').click(menuclick);
}

//菜单单击事件
var menuclick = function(node) {
	// var tabTitle = $(this).children('.nav').text();
	// 获取二级菜单的title,数据从后台的menu.json中获取
	var tabTitle = node.text
	// 获取二级菜单的url,rel是获取json数据时拼接成的html的一部分
	var url = node.attributes.url;
	var menuid = node.id;
	var icon = 'icon-add';
	// 增加新的标签页
	addTab(tabTitle, url, icon);
	//$('.easyui-accordion li div').removeClass("selected");
	//$(this).parent().addClass("selected");
};

/**
 * 
 * @param subtitle
 *            标题
 * @param url
 *            访问地址
 * @param icon
 *            图标
 */
function addTab(subtitle, url, icon) {
	// 如果指定标题的tab不存则添加一个新的
	// exists which 表明指定的面板是否存在，'which'参数可以是选项卡面板的标题或索引。 
	if (!$('#tabs').tabs('exists', subtitle)) {
		$('#tabs').tabs('add', {
			title : subtitle,
			// 选项卡面板的内容。
			content : createFrame(url),
			// 在设置为true的时候，选项卡面板将显示一个关闭按钮，在点击的时候会关闭选项卡面板。
			closable : true,
			icon : icon,
			// 工具栏 按钮
		    tools:[{    
		        //iconCls:'icon-mini-refresh',    
		        iconCls:'icon-reload',
		        handler:function(){
		        	var tab = $('#tabs').tabs('getSelected');  // 获取选择的面板
		        	var iframe = $(tab.panel('options').content);//获取标签的内容
		        	var src = iframe.attr('src');//获取iframe的src
		        	//alert(src);
		        	//tab.panel('refresh', src);

		        	$("#tabs").tabs('update', {
		    			tab : tab,
		    			options : {
		    				content : createFrame(src)
		    			//ifram内容
		    			}
		    		});
		            // alert('refresh');
// 		        	$('#tabs').tabs({
// 		     			//当重新选中tab时将ifram的内容重新加载一遍 // 用户在选择一个选项卡面板的时候触发。
// 		     			onSelect : tabOnSelect
// 		     		});
		        }    
		    }],
		});
	} else {
		// 如果tabs已创建则选中
		$('#tabs').tabs('select', subtitle);
	}
}

var _menus;
// 初始化 菜单 风琴模式
function menu(){
	//通过ajax请求菜单
	$.ajax({
		url : '/user/personal/usermenu.do',
		//url : '/menu.json',
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			_menus = data;
			initMenu(_menus);//解析json数据，将菜单生成
		},
		error : function(msg) {
			alert('菜单加载异常!');
		}
	});
}

// 按钮添加
function buttion (){
	//修改密码
	//$('#modifypwd').click(menuclick);
}


//删除Tabs
function closeTab(menu, type) {
	
	var allTabs = $("#tabs").tabs('tabs');
	var allTabtitle = [];
	$.each(allTabs, function(i, n) {
		var opt = $(n).panel('options');
		if (opt.closable)
			allTabtitle.push(opt.title);
	});
	var curTabTitle = $(menu).data("tabTitle");
	var curTabIndex = $("#tabs").tabs("getTabIndex",$("#tabs").tabs("getTab", curTabTitle));
	//alert(curTabTitle);
	//alert(curTabIndex);
	switch (type) {
	case 1://关闭当前
		$("#tabs").tabs("close", curTabIndex);
		return false;
		break;
	case 2://全部关闭
		for (var i = 0; i < allTabtitle.length; i++) {
			$('#tabs').tabs('close', allTabtitle[i]);
		}
		break;
	case 3://除此之外全部关闭
		for (var i = 0; i < allTabtitle.length; i++) {
			if (curTabTitle != allTabtitle[i])
				$('#tabs').tabs('close', allTabtitle[i]);
		}
		$('#tabs').tabs('select', curTabTitle);
		break;
	case 4://当前侧面右边
		for (var i = curTabIndex; i < allTabtitle.length; i++) {
			$('#tabs').tabs('close', allTabtitle[i]);
		}
		$('#tabs').tabs('select', curTabTitle);
		break;
	case 5: //当前侧面左边
		for (var i = 0; i < curTabIndex - 1; i++) {
			$('#tabs').tabs('close', allTabtitle[i]);
		}
		$('#tabs').tabs('select', curTabTitle);
		break;
	case 6: //刷新
		var panel = $("#tabs").tabs("getTab", curTabTitle); //.panel("refresh");
    	var iframe = $(panel.panel('options').content);//获取标签的内容
    	var src = iframe.attr('src');//获取iframe的src
    	//panel.panel('refresh', src);// 旧的方法 有bug
    	$("#tabs").tabs('update', {
			tab : panel,
			options : {
				content : createFrame(src)
			//ifram内容
			}
		});
		break;
	}
}

	$(function() {//预加载方法
		// 加载树 菜单
		loadeTree();

		//tabClose();
		//tabCloseEven();

		//加载欢迎页面
		$('#tabs').tabs('add', {
			title : '欢迎使用',
			content : createFrame('/control/welcome.do')
		});
// 		.tabs({
// 			// 当重新选中tab时将ifram的内容重新加载一遍 // 用户在选择一个选项卡面板的时候触发。
// 			onSelect : tabOnSelect
// 			// onSelect : function(title,index){};
// 		});

		var h = $("#west").height() - 10;

		// 初始 面板
		$("#nav2").panel({
			//fit:true,
			height : h,
		//border:false,
		});

		//右键菜单click
		$("#mm").menu({
			onClick : function(item) {
				closeTab(this, item.name);
			}
		});
		
		// 添加右键 监听事件
		$('#tabs').tabs({
			onContextMenu : function(e, title, index) {
				e.preventDefault();
				if (index > 0) {
					$('#mm').menu('show', {
						left : e.pageX,
						top : e.pageY
					}).data("tabTitle", title);
				}
			}
		});

	});

	// 打开标签
	function createFrame(url) {
		var s = '<iframe scrolling="auto" frameborder="0" src="' + url
				+ '" style="width:100%;height:100%;"></iframe>';
		return s;
	}

	function logout() {
		if (!confirm('您确定退出吗?')) {
			return;
		}
		window.location.href = '/sso/login/logout.do';
	}
</script>

</head>
<body id="layoutbody" style="overflow-y: hidden;" class="easyui-layout" scroll="no" >

<div region="north" style="height: 71px;"><!-- layout 上 -->
<div id="top" class="top">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		<td width="215">
				<div class="logo">
					<img src="/ares/png/img/admin/logo.jpg" width="215" height="69" />
				</div>
		</td>
		<td valign="top">
			<div class="topbg">
				<div class="login-welcome">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="40" height="38">
								<img src="${BUYER_SESSION.allUrl }" id="img1" width="40px" height="40px" /> 
							</td>
							<td width="200" align="left">
								<span id="welcome">您好:&nbsp;${BUYER_SESSION.username }!</span> 
								&nbsp;&nbsp;
								<img src="/ares/png/img/admin/loginout-icon.png" />
								<a href="javascript:void(0)" target="_top" id="logout" onclick="logout()">退出</a>  
								&nbsp;&nbsp;
								<img src="/ares/png/img/admin/message-unread.png" />&nbsp;
								<a href="message/v_list.do" target="rightFrame">你有<span id="countDiv">0</span>条信息未读</a>
							</td>
							<td width="300">
								<div class="data">
								<%@ include file="/WEB-INF/back_page/date.jsp" %> 
								</div>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</td>
		</tr>
	</table>
</div>
</div>


<div style="width: 200px;" id="west" title="导航菜单" split="true" region="west" hide="true">
	<div id="nav"  border="false" class="easyui-accordion" fit="true"  ><!-- class="easyui-accordion"   -->
		<!--  导航内容 -->
		<div id="nav2">
			<ul id="ttModule"></ul>
		</div>
	</div>
</div>

<div style="background: rgb(238, 238, 238); overflow-y: hidden;" id="mainpanle" region="center">
	<div id="tabs" class="easyui-tabs" border="false" fit="true"></div>
</div>

<!--  底边 蓝 -->
<div style="background: rgb(210, 224, 242); height: 30px;" split="false" region="south">
	<div class="footer">系统代号：${version_name}&nbsp;&nbsp;&nbsp;系统版本号：${version_number}&nbsp;&nbsp;&nbsp;发布日期：${version_date}</div>
</div>

<div id="mm" class="easyui-menu" style="width:170px;">
    <div id="mm-tabclosrefresh" data-options="iconCls:'icon-reload',name:6">刷新</div>
    <div id="mm-tabclose" data-options="iconCls:'icon-remove',name:1">关闭</div>
    <div id="mm-tabcloseall" data-options="iconCls:'icon-no',name:2">全部关闭</div>
    <div id="mm-tabcloseother" data-options="iconCls:'icon-no',name:3">除此之外全部关闭</div>
    <div class="menu-sep"></div>
    <div id="mm-tabcloseright" data-options="iconCls:'icon-redo',name:4">当前页右侧全部关闭</div>
    <div id="mm-tabcloseleft" data-options="iconCls:'icon-undo',name:5">当前页左侧全部关闭</div>
</div>
</body>	
</html>
