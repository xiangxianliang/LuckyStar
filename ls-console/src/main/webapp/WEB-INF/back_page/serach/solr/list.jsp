<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>baba-list</title>
<script type="text/javascript">
	function initBtn() {
		$('#btn5').linkbutton({
			iconCls : 'icon-add',
		});
		$("#btn5").click(function() {
			_confirm('您确定要添加到索引库吗?', null, function() {
				jquerySubByFId('importForm', import_callback, null, "json");
			});
		});
	}

	// 删除回调
	function import_callback(data) {
		d_alert(data, null);
	}

	$(function() {

		$("#nav4").panel({
			fit : true,
			border : false,
		});

		initBtn();
	})
</script>
</head>

<body>
	<div id="nav4">
		<a id="btn5" href="#">一键导入到索引库</a>&nbsp;&nbsp;
	</div>
	<form id="importForm" action="/serach/solr/importSolr.do" method="post"></form>
</body>

</html>