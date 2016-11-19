<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>可拉伸电子及纳米传感器研究中心</title>
	<meta charset="utf-8"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/navFooter.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/links.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/global.css"/>
</head>

<body>
		<div class="frame">
		<!-- 导航栏 -->
		<div class="nav">
			<div class="padding border-box container">
				<div>					
					<ul class="nav-box">
						<div class="nav-bg"></div>
						<li class="li ">
							<div>
								<a href="<%=request.getContextPath() %>/hometopic/home.do"><span>首页</span></a>
							</div>
						</li>

						<li class="li nav-down">
							<div>
								<a href="<%=request.getContextPath() %>/member/people.do">师资队伍<img src="<%=request.getContextPath() %>/images/triangle.png"/></a>				
							</div>

							<div class="downbox">
								<ul>
									<li><a href="<%=request.getContextPath() %>/member/people.do#teacher"><div class="circle border-box"></div>成员</a></li>
									<li><a href="<%=request.getContextPath() %>/member/people.do#lab"><div class="circle border-box"></div>照片</a></li>
								</ul>
							</div>
						</li>

						<li class="li nav-down ">
							<div>
								<a href="<%=request.getContextPath() %>/task/research.do">研究方向<img src="<%=request.getContextPath() %>/images/triangle.png"/></a>
							</div>

							<div class="downbox">
								<ul>
									<li><a href="<%=request.getContextPath() %>/task/research.do"><div class="circle border-box"></div>研究主题</a></li>
									<li><a href="#"><div class="circle border-box"></div>Lab Wiki</a></li>
								</ul>
							</div>
						</li>

						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/publication/0/getpub.do">科研成果</a>
							</div>
						</li>

						<li class="li ">
							<div>
								<a href="<%=request.getContextPath() %>/press/press.do">新闻/视频</a>
							</div>
						</li>

						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/join/join_us.do">加入我们</a>
							</div>
						</li>

						<li class="li current">
							<div>
								<a href="<%=request.getContextPath() %>/link/link.do">相关链接</a>
							</div>
						</li>

						<div class="clear">
						</div>
					</ul>

					<div class="search">
						<form action="<%=request.getContextPath()%>/search.do" method="post">
							<input placeholder="搜索" type="text" name="word" id="word"/>
							<button><img src="<%=request.getContextPath() %>/images/search.png"></button>
							<div class="clear">
							</div>
						</form>
					</div>

					<div class="clear">
					</div>
					
				</div>
			</div>

			<%@include file="language.jsp" %>
		</div>
		<div class="nav-blank"></div>
		<!-- logo和轮播图 -->
		<div class="container">
			<div class="logo-box">
<%-- 				<img src="<%=request.getContextPath() %>/images/logo.png"> --%>
				<span>可拉伸电子及纳米传感器研究中心</span>

				<div class="clear">
				</div>
			</div>
		</div>
	</div>

	<div class="main-body">
		<div class="container">
			<div class="box">
				<span>相关链接</span>
				<div class="left border-box">
					<div class="group">
						<p class="head-title"><span>合作小组</span></p>
						<c:forEach items="${grouplink}" var="link">
						<a href="http://${link.lUrl}">${link.lName}</a>
						<br />	
						</c:forEach>
						
						<!-- <a href="#">深圳市二维材料孔雀创新团队</a>
						<br />	
						<a href="#">深圳市二维材料孔雀创新团队</a> -->
					</div>
							
				</div>

				<div class="right border-box">
					<div class="network">
						<p class="head-title"><span>相关网站</span></p>
						<c:forEach items="${netlink}" var="link">
						<a href="http://${link.lUrl }" target="_blank">${link.lName}</a>
						<br />
						</c:forEach>
						<!-- <a href="http://www.baidu.com" target="_blank"><span>百度</span>www.baidu.com</a>
						<br />
						<a href="http://www.baidu.com" target="_blank"><span>百度</span>www.baidu.com</a>
						<br />
						<a href="http://www.baidu.com" target="_blank"><span>百度</span>www.baidu.com</a> -->
					</div>
				</div>

				<div class="clear">
				</div>
			</div>
		</div>
	</div>

	<!-- 页脚 -->
	<%@include file="foot.jsp" %>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/nav.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/footer.js"></script>
	<script type="text/javascript">
		function valid(){
			var word = $("#word")[0].value;
			if(word.length<=0){
				alert("请输入关键字！");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>