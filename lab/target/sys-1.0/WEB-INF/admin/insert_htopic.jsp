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
    function ceshi(obj) { 
    	//alert("asd");
    	if(validateImage(obj)){
    	$("#tip").text("正在上传，请稍候..");	
        $.ajaxFileUpload({  
            url: "<%=request.getContextPath()%>/member/admin/uploadPic.do", //服务器端请求地址  
            secureuri: false, //是否需要安全协议，一般设置为false  
            fileElementId: 'file', //文件上传域的ID  
            //dataType: 'json', //返回值类型 一般设置为json  
            dataType:'text',
            enctype:'multipart/form-data',//注意一定要有该参数  
            success: function (data, status)  //服务器成功响应处理函数  
            {  
               // alert(data);       //data是从服务器返回来的值  
               $("#tip").text("上传完成！");
               $("#tip").attr("color", "green");
               // alert("上传图片成功!");  
                var a = data.split(",");
                var b = null;
                $("#imghead").attr('style','width:500px;height:300px;display:block');
                $("#imghead").attr("src", "/sys/upload/"+a[0]); 
                $("#hUrl").attr("value", a[0]);
                if(a.length==2){
	                $("#hVurl").attr("value", a[1]); 
                }else{
                	$("#hVurl").attr("value", b); 
                }
            },  
            error: function (data, status, e)//服务器响应失败处理函数  
            {  
                alert("上传失败！");  
            }  
        })  
    	}
    }  
    	 function validateImage(obj) {
    		        var file = obj;
    		        var tmpFileValue = file.value;
    		         
    		        //校验图片格式
    		        if(/^.*?\.(gif|png|jpg|jpeg|bmp|mp4)$/.test(tmpFileValue.toLowerCase())){
    		            return true;
    		        } else {
    		            alert("只能上传jpg、jpeg、png、bmp、mp4格式的文件！");
    		            return false;
    		        }
    	}
    
    
    bkLib.onDomLoaded(function() {
        new nicEditor({ fullPanel: true }).panelInstance('hContent');
    });
    
    function checkform(){
    	if(document.getElementById("hTitle").value.length<=0){
    		alert("标题不能为空！");
    		return false;
    	}
    	if(document.getElementById("hUrl").value.length<=0){
    		alert("请上传对应的图片！");
    		return false;
    	}
    	if(document.getElementById("hSummary").value.length<=0){
    		alert("摘要不能为空！");
    		return false;
    	}
    	if(document.getElementById("hSummary").value.length>=150){
    		alert("长度不能超过150！");
    		return false;
    	}
    	/* if(document.getElementById("hContent").value.length<=0){
    		alert("内容不能为空！");
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
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span><a class="crumb-name" href="<%=request.getContextPath()%>/hometopic/admin/1/show_page.do">轮播管理</a><span class="crumb-step">&gt;</span><span>新增</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="<%=request.getContextPath() %>/hometopic/admin/insert.do" method="post" id="myform" name="myform" enctype="multipart/form-data" onsubmit="return checkform(this)">
              		<input type="hidden" id="hUrl" name="hUrl">
              		<input type="hidden" id="hVurl" name="hVurl">
               <!--  enctype="multipart/form-data" -->
                    <table class="insert-tab" width="100%">
                        <tbody> <tr>
                            <th width="120"><i class="require-red">*</i>是否设为首页：</th>
                            <td>
                                <select name="hStatus" id="hStatus" class="required">
                                    <option value="1">是</option>
                                    <option value="0">否</option>
                                </select>
                            </td>
                        </tr> 
                        <tr>
                            <th width="120"><i class="require-red">*</i>排序：</th>
                            <td>
                                <select name="hNumber" id="hNumber" class="required">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                </select>
                            </td>
                        </tr> 
                            <tr>
                                <th><i class="require-red">*</i>标题：</th>
                                <td>
                                    <input class="common-text required" id="hTitle" name="hTitle" size="50" value="" type="text">
                                </td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>图片：</th>
                                <td><input name="file" id="file" type="file" onchange="ceshi(this)"><span ><font color='red' id="tip"></font></span>
                            	<!-- <img id="imghead" style="width:100px;height:120px;display:none"> --></td>
                            </tr>
                            <tr><td></td><td><img id="imghead" style="width:100px;height:120px;display:none"></td></tr> 
                            <tr>
                                <th>超链接地址：</th>
                                <td>
                                <textarea name="hSummary" class="common-textarea" id="hSummary" cols="30" style="width: 98%;" rows="5"></textarea>
                                </td>
                            </tr>
                            <tr>
                                <th>摘要：</th>
                                <td><textarea name="hContent" class="common-textarea" id="hContent" cols="30" style="width: 98%;" rows="10"></textarea></td>
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