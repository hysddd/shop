<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <link href="<%=path%>/resources/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="<%=path%>/resources/css/style.css" />
<link href="<%=path%>/resources/assets/css/codemirror.css"
	rel="stylesheet">
<link rel="stylesheet" href="<%=path%>/resources/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="<%=path%>/resources/font/css/font-awesome.min.css" />
<link rel="stylesheet" href="<%=path%>/resources/jedate/skin/jedate.css" />
<link rel="stylesheet" href="<%=path%>/resources/jedate/style.css" />
<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
<script src="/shop/resource/js/jquery-1.9.1.min.js"></script>
<script src="/shop/resource/jedate/jedate.min.js"></script>
<link href="/shop/resource/assets/css/bootstrap-table.min.css"
	rel="stylesheet" />
<script src="/shop/resource/assets/js/bootstrap-table.min.js"></script>
<script src="/shop/resource/assets/js/bootstrap-table-zh-CN.min.js"></script>
<script src="/shop/resource/assets/js/bootstrap.min.js"></script>
<script src="/shop/resource/assets/js/typeahead-bs2.min.js"></script>
<script src="/shop/resource/assets/js/jquery.dataTables.min.js"></script>
<script src="/shop/resource/assets/js/jquery.dataTables.bootstrap.js"></script>
  <script src="/shop/test/js/myjsp.js" type="text/javascript"></script>
  </head>
  
  <body>
   <div class="compete_list">
			<table style="width:100%"
				class="table table-striped table-bordered table-hover"
				id="sample-table">
			</table>
		</div>
  </body>
</html>
