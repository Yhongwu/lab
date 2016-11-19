<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/main.css"/>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/libs/modernizr.min.js"></script>
</head>
<Meta http-equiv="Refresh" Content="5; Url=<%=request.getContextPath() %>${url}"> 
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="index.html">首页</a></li>
                <li><a href="#" target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="http://www.mycodes.net">管理员</a></li>
                <li><a href="http://www.mycodes.net">修改密码</a></li>
                <li><a href="http://www.mycodes.net">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <jsp:include page="menu.jsp" flush="true"/>  
    
    <!-- <h2 align="center">操作成功！</h2> -->
    <div style="width:1200px;height:700px;text-align:center;line-height:600px;">
    	<font size="4">操作成功！5秒后自动返回</font>
    	<font size="4"><a href="<%=request.getContextPath() %>${url}">点击返回</a></font>
    </div>
    
</div>

</body>
</html>