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
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>
    
    
   <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.simplePagination.js"></script>
   <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/simplePagination.css"/>

</head>
<script type="text/javascript">
$(function() {
	var searchSort = $("#searchSort").val();
	var keywords = $("#keywords").val();
	//alert(searchSort);
    $("#fenye").pagination({
        items: ${page.total},
        itemsOnPage: ${page.limit},
        prevText:"上一页",
        nextText:"下一页",
        hrefTextPrefix:"<%=request.getContextPath() %>/member/admin/",
        hrefTextSuffix:"/show_page.do?searchSort="+searchSort+"&keywords="+keywords,
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
	    window.location.href="<%=request.getContextPath()%>/member/admin/dels.do?ids="+chk_value;
	});
});


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
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span><span class="crumb-name">成员管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="<%=request.getContextPath() %>/member/admin/1/show_page.do" method="post">
                    <table class="search-tab">
                        <tr>
                            <th width="120">学历:</th>
                            <td>
                                <select name="searchSort" id="searchSort">
                                    <option value="7">全部</option>
                                    <option value="1" <c:if test="${searchSort==1}">selected="selected"</c:if>>教授</option>
                                    <option value="6" <c:if test="${searchSort==6}">selected="selected"</c:if>>专职研究人员</option>
                                    <option value="2" <c:if test="${searchSort==2}">selected="selected"</c:if>>博士后</option>
                                    <option value="3" <c:if test="${searchSort==3}">selected="selected"</c:if>>博士生</option>
                                    <option value="4" <c:if test="${searchSort==4}">selected="selected"</c:if>>研究生/本科生</option>
                                     <option value="5" <c:if test="${searchSort==5}">selected="selected"</c:if>>教师</option>
                                </select>
                            </td>
                            <th width="70">关键字:</th>
                            <td><input class="common-text" placeholder="关键字" name="keywords" value="${keywords}" id="keywords" type="text"></td>
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
                        <a href="<%=request.getContextPath() %>/member/admin/insert.do"><i class="icon-font"></i>新增成员</a>
                        <a id="batchDel" href="javascript:void(0)"><i class="icon-font"></i>批量删除</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                    
                        <tr>
                            <th class="tc" width="5%"><input class="allChoose" name="allChoose" id="allChoose" type="checkbox"></th>
                            <th>图片</th>
                            <th>姓名</th>
                            <th>职位</th>
                            <th>操作</th>
                        </tr>
                        <c:forEach items="${members}" var="member">
                        <tr>
                           <td class="tc"><input name="ids" id="ids" value="${member.mId}" type="checkbox"></td>
                            <td><img src="<%=request.getContextPath() %>/upload/${member.imgUrl}" style="width:30px;height:40px"/></td>
                            <td title="${member.name}"><a target="_blank" href="<%=request.getContextPath() %>/member/admin/${member.mId}/show.do" title="${member.name}">${member.name}</a>
                            </td>
                            <td>
                            	<c:if test="${member.position==1}">教授</c:if>
                            	<c:if test="${member.position==2}">博士后</c:if>
                            	<c:if test="${member.position==3}">博士生</c:if>
                            	<c:if test="${member.position==4}">研究生/本科生</c:if>
                            	<c:if test="${member.position==5}">教师</c:if>
                            	<c:if test="${member.position==6}">专职研究人员</c:if>
                            </td>
                            <td>
                                <a class="link-update" href="<%=request.getContextPath() %>/member/admin/${member.mId}/update.do">修改</a>
                                <a class="link-del" href="javascript:if(confirm('确认删除吗?'))window.location='<%=request.getContextPath() %>/member/admin/${member.mId}/delete.do'">删除</a>
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