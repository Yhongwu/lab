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
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxfileupload.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/Eidtor/nicEdit.js"></script>
    <script type="text/javascript">
    /* bkLib.onDomLoaded(function() {
        new nicEditor({ fullPanel: true }).panelInstance('jContent');
    }); */
    KindEditor.ready(function(k){  
        editor = k.create('#jContent',{  
        	uploadJson : '<%=request.getContextPath()%>/kindeditor/upload.do',  
            fileManagerJson : '<%=request.getContextPath()%>/kindeditor/fileManager.do',  
            allowFileManager : true,  
            allowImageUpload : true,   
	        autoHeightMode : true,  
	        width : "700px",  
	        height : "300px",  
	        afterCreate : function() {this.loadPlugin('autoheight');},  
	            afterBlur : function(){ this.sync(); }  //Kindeditor下获取文本框信息   
        });  
    });  
    
    function checkform(){
    	if(document.getElementById("jCom").value.length<=0){
    		alert("公司名不能为空");
    		return false;
    	}
    	/* if(document.getElementById("jContent").value.length<=0){
    		alert("请完善招聘信息！");
    		return false;
    	} */
    	return true;
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
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span><a class="crumb-name" href="<%=request.getContextPath()%>/join/1/show_page.do">招聘管理</a><span class="crumb-step">&gt;</span><span>新增招聘</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="<%=request.getContextPath() %>/join/admin/insert.do" method="post" id="myform" name="myform" enctype="multipart/form-data">
              		<input type="hidden" id="pUrl" name="pUrl">
               <!--  enctype="multipart/form-data" -->
                    <table class="insert-tab" width="100%">
                        <tbody><tr>
                            <th width="120"><i class="require-red">*</i>是否发布：</th>
                            <td>
                                <select name="status" id="status" class="required">
                                    <option value="1">是</option>
                                    <option value="0">否</option>
                                </select>
                            </td>
                        </tr> 
                        <tr>
                            <th width="120"><i class="require-red">*</i>职位：</th>
                            <td>
                                <select name="jPo" id="jPo" class="required">
                                   <option value="1">教授</option>
                                   <option value="6">专职研究人员</option>
                                    <option value="2">博士后</option>
                                    <option value="3">博士生</option>
                                    <option value="4">研究生/本科生</option>
                                    <option value="5">教师</option>                                    
                                </select>
                            </td>
                        </tr> 
                            <tr>
                                <th><i class="require-red">*</i>公司：</th>
                                <td>
                                    <input class="common-text required" id="jCom" name="jCom" size="50" value="" type="text">
                                </td>
                            </tr>
                            <tr>
                                <th>内容：</th>
                                <td><textarea name="jContent" class="common-textarea" id="jContent" cols="30" style="width: 98%;" rows="10"></textarea></td>
                            </tr>
                            <tr>
                                <th></th>
                                <td>
                                    <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
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