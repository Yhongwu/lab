<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css"/>
    <script type="text/javascript" src="../js/libs/modernizr.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxfileupload.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/Eidtor/nicEdit.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/editor/kindeditor-min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/editor/lang/zh_CN.js"></script>
    <script type="text/javascript">
    
   /* function check(){
	   var repPass =/^[a-zA-Z0-9]+$/;    //检查密码 
	   var pw1 = document.getElementById("nPsd").value;
	   if(!repPass.test(pw1.value) || (pw1.value == null)){
		   document.getElementById("msg").innerHTML="<font color='red'>密码必须为数字或者字母</font>";
           document.getElementById("submit").disabled = true;
	   }else if(repPass.test(pw1.value)){
		   document.getElementById("msg").innerHTML="<font color='red'>密码格式正确</font>";
           document.getElementById("submit").disabled = false;
	   }
	   
	   
    }  */
    function validate() {
        var pw1 = document.getElementById("nPsd").value;
        var pw2 = document.getElementById("nPsd2").value;
        if(pw1 == pw2) {
            document.getElementById("tishi").innerHTML="<font color='green'>两次密码一致</font>";
            document.getElementById("submit").disabled = false;
        }
        else {
            document.getElementById("tishi").innerHTML="<font color='red'>两次密码不相同</font>";
            document.getElementById("submit").disabled = true;
        }
    }
    </script>
    
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

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span>密码管理</div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="<%=request.getContextPath() %>/admin/update.do" method="post" id="myform" name="myform" enctype="multipart/form-data">
                        <input type="hidden" id="lId" name="lId" value="${link.lId}">
               <!--  enctype="multipart/form-data" -->
                    <table class="insert-tab" width="100%">
                            <tr>
                                <th>原密码：</th>
                                <td> <input class="common-text required" id="oPsd" name="oPsd" size="50" type="password"><span id="tip"><font color="red">${tip}</font></span></td>
                            </tr>
                            <tr>
                                <th>新密码：</th>
                                <td> <input class="common-text required" id="nPsd" name="nPsd" size="50"  type="password" onkeyup="check()"><span id="msg"></span></td>
                            </tr>
                            <tr>
                                <th>确认密码：</th>
                                <td> <input class="common-text required" id="nPsd2" name="nPsd2" size="50"  type="password" onkeyup="validate()"><span id="tishi"></span></td>
                            </tr>
                            <tr>
                            <td>
                            </td>
                            </tr>
                            <tr>
                                <th></th>
                                <td>
                                    <input class="btn btn-primary btn6 mr10" value="提交" id="submit" type="submit">
                                    <input class="btn btn6" onclick="history.go(-1)" value="返回" type="button">
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