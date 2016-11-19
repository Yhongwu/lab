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
	var sort = $("#sort").val();
    $("#fenye").pagination({
        items: ${page.total},
        itemsOnPage: ${page.limit},
        prevText:"上一页",
        nextText:"下一页",
        hrefTextPrefix:"<%=request.getContextPath() %>/publication/admin/",
        hrefTextSuffix:"/show_page.do?sort="+sort,
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
	    window.location.href="<%=request.getContextPath()%>/publication/admin/dels.do?ids="+chk_value;
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
            <div class="crumb-list"><i class="icon-font"></i>后台<span class="crumb-step">&gt;</span><span class="crumb-name">发布管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="<%=request.getContextPath() %>/publication/admin/1/show_page.do" method="post">
                    <table class="search-tab">
                        <tr>
                           <th width="120">分类:</th>
                            <td>
                                <select name="sort" id="sort">
                                    <option value="0">全部</option>
                                    	<c:forEach var="year" items="${year}">
                                    		<option value="${year}" <c:if test="${year==sort}" >selected="selected"</c:if>>${year}</option>
                                    	</c:forEach>
                                   <%--  <option value="0" <c:if test="${searchSort==0}">selected="selected"</c:if>>合作小组</option>
                                    <option value="1" <c:if test="${searchSort==1}">selected="selected"</c:if>>相关网站</option> --%>
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
                        <a href="<%=request.getContextPath() %>/publication/admin/insert.do"><i class="icon-font"></i>发布主题</a>
                        <a id="batchDel" href="javascript:void(0)"><i class="icon-font"></i>批量删除</a>
                        <!-- <a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i>更新排序</a> -->
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                    
                        <tr>
                            <th class="tc" width="5%"><input class="allChoose" name="allChoose" id="allChoose" type="checkbox"></th>
                            <!-- <th>排序</th> -->
                            <th width="5%">年份</th>
                            <th width="11%">更新时间</th>
                            <th>内容</th>
                            <!-- <th>点击</th> -->
                            <!-- <th>职位</th> -->
                            <!-- <th>图片</th> -->
                            <!-- <th>发表时间</th>
                            <th>更新时间</th> -->
                            <th width="5%">操作</th>
                        </tr>
                        <c:forEach items="${publications}" var="publication">
                        <tr>
                            <td class="tc"><input name="ids" id="ids" value="${publication.pId}" type="checkbox"></td>
                            <%-- <td>
                            	<c:if test="${link.status==0}">合作小组</c:if>
                            	<c:if test="${link.status==1}">相关网站</c:if>
                            </td> --%>
                            <td width="5%">${publication.pYear}</td>
                            <td width="15%" >${publication.uTime}</td>
                            <td>${publication.pContent}</td>
                            <%-- <td title="${link.lName}"><a target="_blank" href="http://${link.lUrl}" title="${link.lUrl}">${link.lUrl}</a> --%>
                            </td>
                            <%-- <td>
                            	<c:if test="${member.position==1}">教师</c:if>
                            	<c:if test="${member.position==2}">博士后</c:if>
                            	<c:if test="${member.position==3}">博士生</c:if>
                            	<c:if test="${member.position==4}">研究生/本科生</c:if>
                            </td> --%>
                            <!-- <td>2</td> -->
                            <%-- <td>${topic.imgUrl}</td> --%>
                            <%-- <td>${topic.createTime}</td>
                            <td>${topic.updateTime}</td> --%>
                            <td>
                                <a class="link-update" href="<%=request.getContextPath() %>/publication/admin/${publication.pId}/update.do">修改</a>
                                <a class="link-del" href="javascript:if(confirm('确认删除吗?'))window.location='<%=request.getContextPath() %>/publication/admin/${publication.pId}/delete.do'">删除</a>
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