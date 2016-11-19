<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sub-menu">
                        <%-- <li><a href="<%=request.getContextPath()%>/topic/design_list.do"><i class="icon-font">&#xe008;</i>文章管理</a></li> --%>
                        <li><a href="<%=request.getContextPath()%>/hometopic/admin/1/show_page.do"><i class="icon-font">&#xe008;</i>首页管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/member/admin/1/show_page.do"><i class="icon-font">&#xe005;</i>成员管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/task/admin/1/show_page.do"><i class="icon-font">&#xe006;</i>课题管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/press/admin/1/show_page.do"><i class="icon-font">&#xe004;</i>文章管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/publication/admin/1/show_page.do"><i class="icon-font">&#xe012;</i>发布管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/link/admin/show.do"><i class="icon-font">&#xe052;</i>友情链接</a></li>
                        <li><a href="<%=request.getContextPath()%>/join/admin/1/show_page.do"><i class="icon-font">&#xe033;</i>招聘管理</a></li>
                        <li><a href="<%=request.getContextPath()%>/photo/admin/1/show_page.do"><i class="icon-font">&#xe033;</i>图片管理</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>
                    <ul class="sub-menu">
                        <!-- <li><a href="system.html"><i class="icon-font">&#xe017;</i>系统设置</a></li> -->
                        <li><a href="<%=request.getContextPath()%>/admin/update.do"><i class="icon-font">&#xe017;</i>修改密码</a></li>
                      <%--<li><a href="system.html"><i class="icon-font">&#xe037;</i>清理缓存</a></li> --%>
                        <li><a href="<%=request.getContextPath()%>/info/admin/show.do"><i class="icon-font">&#xe012;</i>联系信息</a></li>
                        <!-- <li><a href="system.html"><i class="icon-font">&#xe046;</i>数据备份</a></li>
                        <li><a href="system.html"><i class="icon-font">&#xe045;</i>数据还原</a></li> -->
                    </ul>
                </li>
            </ul>
        </div>
    </div>