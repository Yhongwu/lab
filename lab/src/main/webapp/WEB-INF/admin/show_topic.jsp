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
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span class="crumb-step">&gt;</span><a class="crumb-name" href="/jscss/admin/design/">作品管理</a><span class="crumb-step">&gt;</span><span>查看文章</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="#" method="post" id="myform" name="myform" >
               <!--  enctype="multipart/form-data" -->
               		<input type="hidden" name="tId" id="tId" value="${topic.tId}">
                    <table class="insert-tab" width="100%">
                        <tbody><!-- <tr> -->
                            <!-- <th width="120"><i class="require-red">*</i>发布：</th> -->
                            <%-- <td>
                                <select name="status" id="status" class="required">
                                    <option value="1" <c:if test="${topic.status==1}">selected="selected"</c:if>>是</option> 
                                    <option value="0" <c:if test="${topic.status==0}">selected="selected"</c:if>>否</option>
                                </select>
                            </td> --%>
                        <!-- </tr> -->
                            <tr>
                            	
                                <!-- <th><i class="require-red">*</i>标题：</th> -->
                                <%-- <td>
                               
                                    <input class="common-text required" id="title" width="100%" name="title" size="50" value="${topic.title}" type="text">
                                </td> --%>
                				<td><h2 align="center">${topic.title}</h2></td>                
                            </tr>
                            <tr>
                                <!-- <th>作者：</th> -->
                                <td>作者：${topic.author}</td>
                            </tr>
                            <tr>
                            	<td>发表时间: ${topic.createTime}</td>
                            </tr>
                            <tr>
                            	<td>更新时间: ${topic.updateTime}</td>
                            </tr>
                            <!-- <tr>
                                <th><i class="require-red">*</i>缩略图：</th>
                                <td><input name="smallimg" id="" type="file"><input type="submit" onclick="submitForm('/jscss/admin/design/upload')" value="上传图片"/></td>
                            </tr> -->
                            <tr>
                                <%-- <td><textarea name="content" class="common-textarea" id="content" cols="30" style="width: 98%;" rows="10">${topic.content}</textarea></td> --%>
                                <td>${topic.content}</td>
                             

                                
                            </tr>
                            <tr>
                                <td>
                                    <input id="update" class="btn btn-primary btn6 mr10" value="修改" type="button">
                                    
                                </td>
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