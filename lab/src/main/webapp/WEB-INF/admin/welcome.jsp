<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>『实验室』后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/main.css"/>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/libs/modernizr.min.js"></script>
	<script type="text/javascript">
		function myfun()
		{
        	var tip = document.getElementById("tip").value;
        	if(document.getElementById("tip")!=undefined){
				if(tip!=null&&tip!=""){
					alert(tip);
				}
        		
        	}
		}
		window.onload=myfun;
	</script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on">后台</a></li>
                <li><a href="<%=request.getContextPath() %>/index.do" target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">${user.uName}</a></li>
                <li><a href="<%=request.getContextPath()%>/admin/update.do">修改密码</a></li>
                <li><a href="<%=request.getContextPath() %>/admin/logout.do">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
<jsp:include page="menu.jsp" flush="true"/>
   	<input type="hidden" id="tip" value="${tip}">
   	<!-- <h1><font size="5" style="left:3px;text-align:center">欢迎来到后台管理</font></h1> -->
   	<div style="width:1200px;height:700px;text-align:center;line-height:600px;">
   	<font size="6">欢迎来到后台管理界面！</font>
   	</div>
    <!--/main-->
</div>
</body>
</html>