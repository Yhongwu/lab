<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>『实验室』后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/main.css"/>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/libs/modernizr.min.js"></script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="#">后台</a></li>
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
    <!--/sidebar-->
    <div class="main-wrap">
        <!-- <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font">&#xe06b;</i><span>欢迎使用后台管理程序</span></div>
        </div> -->
        <div class="result-wrap">
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>系统基本信息</h1>
            </div>
            <div class="result-content">
                <ul class="sys-info-list">
                    <li>
                        <label class="res-lab">电话</label><span class="res-info">${info.iTel }</span>
                    </li>
                    <li>
                        <label class="res-lab">邮箱</label><span class="res-info">${info.iEmail}</span>
                    </li>
                    <li>
                        <label class="res-lab">地址</label><span class="res-info">${info.iAddr}</span>
                    </li>
                </ul>
            </div>
        </div>
        <a href="<%=request.getContextPath() %>/info/admin/${info.iId}/update.do"><input class="btn btn-primary btn6 mr10" value="修改" type="button"></a>
    </div>
    <!--/main-->
</div>
</body>
</html>