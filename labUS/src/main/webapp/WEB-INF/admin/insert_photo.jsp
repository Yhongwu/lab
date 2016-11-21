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
    <script type="text/javascript" src="<%=request.getContextPath()%>/editor/kindeditor-min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/editor/lang/zh_CN.js"></script>
    <script type="text/javascript">
    function ceshi(obj) { 
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
                	$("#tip").text("上传完成！");
 	                $("#tip").attr("color", "green");
                    $("#imghead").attr('style','width:600px;height:250px;display:block');
                    $("#imghead").attr("src", "<%=request.getContextPath()%>/upload/"+data); 
                    $("#pUrl").attr("value", data); 
                },  
                error: function (data, status, e)//服务器响应失败处理函数  
                {  
                    alert(e);  
                }  
            })  
    	}
        
    }  
    function validateImage(obj) {
		        var file = obj;
		        var tmpFileValue = file.value;
		         
		        //校验图片格式
		        if(/^.*?\.(gif|png|jpg|jpeg|bmp|wmv|3gp|mp4|mov|avi|flv)$/.test(tmpFileValue.toLowerCase())){
		            return true;
		        } else {
		            alert("只能上传jpg、jpeg、png、bmp、wmv、3gp、mp4、mov、avi、flv格式的文件！");
		            return false;
		        }
	}
    
    /* bkLib.onDomLoaded(function() {
        new nicEditor({ fullPanel: true }).panelInstance('pShow');
    }); */
    
    KindEditor.ready(function(k){  
        editor = k.create('#pShow',{  
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
   /*  function onlyNum(){
   		if(!((event.keyCode>=48&&event.keyCode<=57)||(event.keyCode>=96&&event.keyCode<=105)))
   			//考虑小键盘上的数字键
   			event.returnvalue=false;
   		}
    } */
    
    function checkform(){
    	if(document.getElementById("pYear").value.length<=0){
    		alert("年份不能为空");
    		return false;
    	}
    	if(document.getElementById("pYear").value.length!=4){
    		alert("年份必须为4位！");
    		return false;
    	}
    	if(document.getElementById("pUrl").value.length<=0){
    		alert("请上传图片！");
    		return false;
    	}
    	/* if(document.getElementById("pShow").value.length<=0){
    		alert("请完善图片说明信息！");
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
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span><a class="crumb-name" href="<%=request.getContextPath()%>/photo/1/show_page.do">图片管理</a><span class="crumb-step">&gt;</span><span>新增图片</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="<%=request.getContextPath() %>/photo/admin/insert.do" method="post" id="myform" name="myform" enctype="multipart/form-data" onsubmit="return checkform(this)">
              		<input type="hidden" id="pUrl" name="pUrl">
               <!--  enctype="multipart/form-data" -->
                    <table class="insert-tab" width="100%">
                        <tbody> <tr>
                            <th width="120"><i class="require-red">*</i>是否展示：</th>
                            <td>
                                <select name="pStatus" id="pStatus" class="required">
                                    <option value="1">是</option>
                                    <option value="0">否</option>
                                </select>
                            </td>
                        </tr> 
                        <tr>
                            <th width="120"><i class="require-red">*</i>类别：</th>
                            <td>
                                <select name="pLaborteam" id="pLaborteam" class="required">
                                    <option value="1">团队</option>
                                    <option value="0">实验室</option>
                                </select>
                            </td>
                        </tr> 
                            <tr>
                                <th><i class="require-red">*</i>年份：</th>
                                <td>
                                    <input onkeyup="(this.v=function(){this.value=this.value.replace(/[^0-9-]+/,'');}).call(this)" onblur="this.v();" class="common-text required" id="pYear" name="pYear" size="50" value="" type="text">
                                </td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>图片：</th>
                                <td><input name="file" id="file" type="file" onchange="ceshi(this)"><span ><font color='red' id="tip"></font></span>
                            	<!-- <img id="imghead" style="width:100px;height:120px;display:none"> --></td>
                            </tr>
                            <tr><td></td><td><img id="imghead" style="width:100px;height:120px;display:none" ></td></tr> 
                            <tr>
                                <th>内容：</th>
                                <td><textarea name="pShow" class="common-textarea" id="pShow" cols="30" style="width: 98%;" rows="10"></textarea></td>
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