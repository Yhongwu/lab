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
                <li><a class="on" href="index.html">后台</a></li>
                <li><a href="<%=request.getContextPath() %>/index.do" target="_blank" target="_blank">网站首页</a></li>
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
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span><a class="crumb-name" href="<%=request.getContextPath()%>/sys/member/1/show_page.do">成员管理</a><span class="crumb-step">&gt;</span><span>查看信息</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="#" method="post" id="myform" name="myform" >
               <!--  enctype="multipart/form-data" -->
               		<input type="hidden" name="tId" id="tId" value="${topic.tId}">
                    <table class="insert-tab" width="100%">
                        <tbody><!-- <tr> -->
                            <tr>
                            	
                				<td><img alt="${member.name}" src="/sys/upload/${member.imgUrl}" style="width:100px;height:120px"></td>              
                            </tr>
                            <tr>
                                <!-- <th>作者：</th> -->
                                <td>姓名：${member.name}</td>
                            </tr>
                            <tr>
                            	<td>职位:
                            		<c:if test="${member.position==1}">教授</c:if>
                            		<c:if test="${member.position==6}">专职研究人员</c:if>
                            		<c:if test="${member.position==2}">博士后</c:if>
                            		<c:if test="${member.position==3}">博士生</c:if>
                            		<c:if test="${member.position==4}">研究生/本科生</c:if>
                            		<c:if test="${member.position==5}">教师</c:if>
                            </tr>
                              <tr>
                                <td>详细信息：${member.info}</td>
                             

                                
                            </tr>
                           <!--  <tr>
                                <td>
                                    <input id="update" class="btn btn-primary btn6 mr10" value="修改" type="button">
                                    
                                </td>
                            </tr> -->
                        </tbody></table>
                </form>
            </div>
        </div>

    </div>
    <!--/main-->
</div>
</body>
</html>