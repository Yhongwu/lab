<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css"/>
    
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/libs/modernizr.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>
    
    
   <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.simplePagination.js"></script>
   <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/simplePagination.css"/>

</head>
<script type="text/javascript">
$(function() {
	var searchSort = $("#searchSort").val();
	var keywords = $("#leibie").val();
	//alert(searchSort);
    $("#fenye").pagination({
        items: ${page.total},
        itemsOnPage: ${page.limit},
        prevText:"上一页",
        nextText:"下一页",
        hrefTextPrefix:"<%=request.getContextPath() %>/photo/admin/",
        hrefTextSuffix:"/show_page.do?searchSort="+searchSort+"&leibie="+keywords,
        cssStyle: 'light-theme',
        selectOnClick:true,
        currentPage:${page.pageNo}
	    
    });
});

$(document).ready(function(){
	
	$("#allChoose").click(function(){
		//alert("123");
		if ($(this).attr("checked")) {  
	        $('input[name="ids"]').each(function() {  
	            $(this).attr("checked", true);  
	        });  
	    } else {  
	        $('input[name="ids"]').each(function() {  
	            $(this).attr("checked", false);  
	        });  
	    }  
	});

	
	
	$("#batchDel").click(function (){
	    var chk_value =[]; 
	    $('input[name="ids"]:checked').each(function(){ 
	    chk_value.push($(this).val()); 
	    }); 
	    if(chk_value.length==0){ 
		    alert('你还没有选择任何内容！'); 
	    	return;
	    }
	    window.location.href="<%=request.getContextPath()%>/photo/admin/dels.do?ids="+chk_value;
	});
});


</script>
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
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span><span class="crumb-name">图片管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="<%=request.getContextPath() %>/photo/admin/1/show_page.do" method="post">
                    <table class="search-tab">
                        <tr>
                            <th width="120">是否展示:</th>
                            <td>
                                <select name="searchSort" id="searchSort">
                                    <option value="2">全部</option> 
                                    <option value="1" <c:if test="${searchSort==1}">selected="selected"</c:if>>是</option>
                                    <option value="0" <c:if test="${searchSort==0}">selected="selected"</c:if>>否</option>
                                    
                                </select>
                            </td>
                            <th width="120">类别:</th>
                            <td>
                                <select name="leibie" id="leibie">
                                    <option value="2">全部</option> 
                                    <option value="1" <c:if test="${leibie==1}">selected="selected"</c:if>>团队</option>
                                    <option value="0" <c:if test="${leibie==0}">selected="selected"</c:if>>实验室</option>
                                    
                                </select>
                            </td>
                            <%-- <th width="70">关键字:</th>
                            <td><input class="common-text" placeholder="关键字" name="keywords" value="${keywords}" id="keywords" type="text"></td> --%>
                            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="result-wrap">
            <form name="myform" id="myform" method="post">
               <input type="hidden" value="${searchSort}" name="searchSort" id="searchSort">
               <input type="hidden" value="${keywords}" name="keywords" id="keywords">
                <div class="result-title">
                    <div class="result-list">
                        <a href="<%=request.getContextPath() %>/photo/admin/insert.do"><i class="icon-font"></i>新增</a>
                        <a id="batchDel" href="javascript:void(0)"><i class="icon-font"></i>批量删除</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                    
                        <tr>
                            <th class="tc" width="5%"><input class="allChoose" name="allChoose" id="allChoose" type="checkbox"></th>
                            <th>图片</th>
                            <th>类别</th>
                            <th>年份</th>
                            <th>是否展示</th>
                            <th>操作</th>
                        </tr>
                        <c:forEach items="${photos}" var="photo">
                        <tr>
                           <td class="tc"><input name="ids" id="ids" value="${photo.pId}" type="checkbox"></td>
                            <td>
                            <a href="<%=request.getContextPath() %>/photo/admin/${photo.pId}/show.do">
                            <img src="<%=request.getContextPath() %>/upload/${photo.pUrl}" style="width:100px;height:50px" />
                            </a>
                            </td>
                            <td>
                            	<c:if test="${photo.pLaborteam==1 }">团队</c:if>
                            	<c:if test="${photo.pLaborteam==0 }">实验室</c:if>
                            </td>
                            <!-- <td>2</td> -->
                            <%-- <td>${topic.imgUrl}</td> --%>
                            <%-- <td>${topic.createTime}</td> --%>
                            <td>${photo.pYear}</td>
                            <td>
                            	<c:if test="${photo.pStatus==1 }">是</c:if>
                            	<c:if test="${photo.pStatus==0 }">否</c:if>
                            </td>
                            <td>
                                <a class="link-update" href="<%=request.getContextPath() %>/photo/admin/${photo.pId}/update.do">修改</a>
                                <a class="link-del" href="javascript:if(confirm('确认删除吗?'))window.location='<%=request.getContextPath() %>/photo/admin/${photo.pId}/delete.do'">删除</a>
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
                    <div class="list-page"> ${page.total} 条 ${page.pageNo}/${page.pageCount} 页</div>
				 
				<div id="fenye"></div>
                </div>
            </form>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>