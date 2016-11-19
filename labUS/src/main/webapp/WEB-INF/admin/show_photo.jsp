<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/libs/modernizr.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.1.1.min.js"></script>
</head>
<script type="text/javascript">
	$("#update").click(function(){
		alert("asdaf");
	})
</script>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="#">后台</a></li>
                <li><a href="#" target="_blank">网站首页</a></li>
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
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span><a class="crumb-name" href="<%=request.getContextPath()%>/photo/1/show_page.do">图片管理</a><span class="crumb-step">&gt;</span><span>查看图片</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="#" method="post" id="myform" name="myform" >
               <!--  enctype="multipart/form-data" -->
                    <table class="insert-tab" width="100%">
                        <tbody><!-- <tr> -->
                            <tr>
                            	
                				<td><img alt="${photo.pUrl}" src="<%=request.getContextPath()%>/upload/${photo.pUrl}" style="width:600px;height:250px"></td>              
                            </tr>
                            <tr>
                            	<td>是否展示：
                            		<c:if test="${photo.pStatus==1}">是</c:if>
                            		<c:if test="${photo.pStatus==0}">否</c:if>
                            	</td>
                            </tr>
                            <tr>
                            	<td>类别：
                            		<c:if test="${photo.pLaborteam==1}">团队</c:if>
                            		<c:if test="${photo.pLaborteam==0}">实验室</c:if>
                            	</td>
                            </tr>
                            <tr>
                            	<td>年份: ${photo.pYear}</td>
                            </tr> 
                                <td>说明：<br>
                                ${photo.pShow}</td>
                            </tr>
                        </tbody></table>
                </form>
            </div>
        </div>

    </div>
    <!--/main-->
</div>
</body>
</html>