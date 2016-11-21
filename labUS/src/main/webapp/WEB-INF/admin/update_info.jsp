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
    function ceshi() { 
    	alert("asd");
        $.ajaxFileUpload({  
            url: "<%=request.getContextPath()%>/member/admin/uploadPic.do", //服务器端请求地址  
            secureuri: false, //是否需要安全协议，一般设置为false  
            fileElementId: 'file', //文件上传域的ID  
            //dataType: 'json', //返回值类型 一般设置为json  
            dataType:'text',
            enctype:'multipart/form-data',//注意一定要有该参数  
            success: function (data, status)  //服务器成功响应处理函数  
            {  
                alert(data);       //data是从服务器返回来的值  
                alert("上传图片成功!图片地址");  
                $("#imghead").attr('style','width:800px;height:600px;display:block');
                $("#imghead").attr("src", "<%=request.getContextPath()%>/upload/"+data); 
                $("#tUrl").attr("value", data); 
            },  
            error: function (data, status, e)//服务器响应失败处理函数  
            {  
                alert(e);  
            }  
        })  
    }  
    
    
  /*   bkLib.onDomLoaded(function() {
        new nicEditor({ fullPanel: true }).panelInstance('details');
    }); */
    KindEditor.ready(function(k){  
        editor = k.create('#details',{  
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
    
    </script>
    
</head>
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
            <div class="crumb-list"><i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span class="crumb-step">&gt;</span><a class="crumb-name" href="<%=request.getContextPath()%>/link/show.do">链接管理</a><span class="crumb-step">&gt;</span><span>更新链接</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="<%=request.getContextPath() %>/info/admin/update.do" method="post" id="myform" name="myform" enctype="multipart/form-data">
                        <input type="hidden" id="iId" name="iId" value="${info.iId}">
               <!--  enctype="multipart/form-data" -->
                    <table class="insert-tab" width="100%">
                        <tbody>
                            <tr>
                                <th><i class="require-red">*</i>联系电话：</th>
                                <td>
                                    <input class="common-text required" id="iTel" name="iTel" size="50" value="${info.iTel}" type="text">
                                </td>
                            </tr>
                            <tr>
                                <th>邮箱：</th>
                                <td><input class="common-text" name="iEmail" size="50" value="${info.iEmail}" type="text"></td>
                            </tr> 
                           <!--  <tr>
                                <th><i class="require-red">*</i>图片：</th>
                                <td><input name="file" id="file" type="file" onchange="ceshi()"><input type="button" id="upload" value="上传图片"/> </td>
                            	<img id="imghead" style="width:100px;height:120px;display:none"></td>
                            </tr> -->
                            <!-- <tr><td></td><td><img id="imghead" style="width:100px;height:120px;display:none"></td></tr>  -->
                            <%-- <tr>
                                <th>链接：</th>
                                <td> <input class="common-text required" id="lUrl" name="lUrl" size="50" value="${link.lUrl}" type="text"></td>
                            </tr> --%>
                            <tr>
                                <th>地址：</th>
                                <td><textarea name="iAddr" class="common-textarea" id="iAddr" cols="30" style="width: 98%;" rows="10">${info.iAddr}</textarea></td>
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