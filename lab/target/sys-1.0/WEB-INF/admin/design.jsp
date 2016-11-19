<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css"/>
    
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/jqpagination.css"/> 
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/reset.css"/> 
    
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/libs/modernizr.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.jqpagination.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/scripts.js"></script>

</head>
<script type="text/javascript">
$('.pagination').jqPagination({
    paged: function(page) {
        // do something with the page variable
        
       
    }
});



</script>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="index.html">首页</a></li>
                <li><a href="http://www.mycodes.net/" target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">管理员</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="#">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <jsp:include page="menu.jsp" flush="true"/>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="index.html">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">作品管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="#" method="post">
                    <table class="search-tab">
                        <tr>
                            <th width="120">是否发布:</th>
                            <td>
                                <select name="search-sort" id="">
                                    <option value="3">全部</option>
                                    <option value="1">是</option><option value="0">否</option>
                                </select>
                            </td>
                            <th width="70">关键字:</th>
                            <td><input class="common-text" placeholder="关键字" name="keywords" value="" id="" type="text"></td>
                            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="result-wrap">
            <form name="myform" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="../topic/insert.do"><i class="icon-font"></i>新增作品</a>
                        <a id="batchDel" href="javascript:void(0)"><i class="icon-font"></i>批量删除</a>
                        <a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i>更新排序</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                    
                        <tr>
                            <th class="tc" width="5%"><input class="allChoose" name="" type="checkbox"></th>
                            <!-- <th>排序</th> -->
                            <th>ID</th>
                            <th>ID</th>
                            <th>标题</th>
                            <!-- <th>点击</th> -->
                            <th>发布状态</th>
                            <th>作者</th>
                            <th>发表时间</th>
                            <th>更新时间</th>
                            <th>操作</th>
                        </tr>
                        <c:forEach items="${topics}" var="topic">
                        <tr>
                           <td class="tc"><input name="id[]" value="59" type="checkbox"></td>
                            <td>
                                <input name="tId" value="59" type="hidden">
                                <input class="common-input sort-input" name="ord[]" value="0" type="text">
                            </td>
                            <td>${topic.tId}</td>
                            <td title="${topic.title}"><a target="_blank" href="<%=request.getContextPath() %>/topic/${topic.tId}/show.do" title="${topic.title}">${topic.title}</a>
                            </td>
                            <td>${topic.status}</td>
                            <!-- <td>2</td> -->
                            <td>${topic.author}</td>
                            <td>${topic.createTime}</td>
                            <td>${topic.updateTime}</td>
                            <td>
                                <a class="link-update" href="<%=request.getContextPath() %>/topic/${topic.tId}/update.do">修改</a>
                                <a class="link-del" href="javascript:if(confirm('确认删除吗?'))window.location='<%=request.getContextPath() %>/topic/${topic.tId}/delete.do'">删除</a>
                            </td>
                        </tr>
                        </c:forEach>
                       <!--  <tr>
                            <td class="tc"><input name="id[]" value="58" type="checkbox"></td>
                            <td>
                                <input name="ids[]" value="58" type="hidden">
                                <input class="common-input sort-input" name="ord[]" value="0" type="text">
                            </td>
                            <td>58</td>
                            <td title="黑色经典"><a target="_blank" href="#" title="黑色经典">黑色经典</a> …
                            </td>
                            <td>0</td>
                            <td>35</td>
                            <td>admin</td>
                            <td>2013-12-30 22:34:00</td>
                            <td></td>
                            <td>
                                <a class="link-update" href="#">修改</a>
                                <a class="link-del" href="#">删除</a>
                            </td>
                        </tr> -->
                    </table>
                    <div class="list-page"> 2 条 1/1 页</div>
                    <%--  <jsp:include page="fenye.jsp" flush="true"/> --%>
                    <div class="pagination">
				    <a href="#" class="first" data-action="first">&laquo;</a>
				    <a href="#" class="previous" data-action="previous">&lsaquo;</a>
				    <input type="text" readonly="readonly" data-max-page="40" />
				    <a href="#" class="next" data-action="next">&rsaquo;</a>
				    <a href="#" class="last" data-action="last">&raquo;</a>
				</div>
                </div>
            </form>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>