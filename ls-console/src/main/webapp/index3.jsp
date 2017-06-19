<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp"%>
<html>
<head>
<title>Test-Springmvc</title>
</head>
<body>
    <p>
        Pagination on 
        <select id="p-pos" onchange="changeP()">
            <option>bottom</option>
            <option>top</option>
            <option>both</option>
        </select>
        Style
        <select id="p-style" onchange="changeP()">
            <option>manual</option>
            <option>links</option>
        </select>
    </p>
    
    <table id="tt" class="easyui-datagrid" style="width:700px;height:250px"
            url="datagrid2_getdata.php"
            title="Load Data" iconCls="icon-save"
            rownumbers="true" pagination="true">
        <thead>
            <tr>
                <th field="itemid" width="80">Item ID</th>
                <th field="productid" width="120">Product ID</th>
                <th field="listprice" width="80" align="right">List Price</th>
                <th field="unitcost" width="80" align="right">Unit Cost</th>
                <th field="attr1" width="200">Attribute</th>
                <th field="status" width="60" align="center">Stauts</th>
            </tr>
        </thead>
    </table>
    <script type="text/javascript">
        function changeP(){
            var dg = $('#tt');
            dg.datagrid('loadData',[]);
            dg.datagrid({pagePosition:$('#p-pos').val()});
            dg.datagrid('getPager').pagination({
                layout:['list','sep','first','prev','sep',$('#p-style').val(),'sep','next','last','sep','refresh']
            });
        }
    </script>
</body>
</html>
