<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>Center for Stretchable Electronics and NanoSensors</title>
	<meta charset="utf-8"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/navFooter.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/publication.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/left-nav.css"/>
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
						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/hometopic/home.do"><span>Home</span></a>
							</div>
						</li>

						<li class="li nav-down">
							<div>
								<a href="<%=request.getContextPath() %>/member/people.do">People<img src="<%=request.getContextPath() %>/images/triangle.png"/></a>				
							</div>

							<div class="downbox">
								<ul>
									<li><a href="<%=request.getContextPath() %>/member/people.do#teacher"><div class="circle border-box"></div>Current</a></li>
									<li><a href="<%=request.getContextPath() %>/member/people.do#lab"><div class="circle border-box"></div>Photos</a></li>
								</ul>
							</div>
						</li>

						<li class="li nav-down ">
							<div>
								<a href="<%=request.getContextPath() %>/task/research.do">Research<img src="<%=request.getContextPath() %>/images/triangle.png"/></a>
							</div>

							<div class="downbox">
								<ul>
									<li><a href="<%=request.getContextPath() %>/task/research.do"><div class="circle border-box"></div>Research Topics</a></li>
								</ul>
							</div>
						</li>

						<li class="li current">
							<div>
								<a href="<%=request.getContextPath() %>/publication/getpub.do">Publications</a>
							</div>
						</li>

						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/press/press.do">News</a>
							</div>
						</li>

						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/join/join_us.do">Join Us</a>
							</div>
						</li>

						<li class="li ">
							<div>
								<a href="<%=request.getContextPath() %>/link/link.do">Links</a>
							</div>
						</li>

						<div class="clear">
						</div>
					</ul>

					<div class="search">
						<form action="<%=request.getContextPath()%>/search.do" method="post">
							<input placeholder="Search" type="text" name="word" id="word"/>
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
				<span>Center for Stretchable Electronics and Wearable Sensors</span>

				<div class="clear">
				</div>
			</div>
		</div>
	</div>

	<div class="main-body">
		<div class="container">
			<%-- <div class="member border-box">
				<div class="member-box">
					<p>Publications</p>

					<ul>
					<c:forEach items="${list}" var="list">
						<li><a href="#${list}">${list}</a></li>
					</c:forEach>
					</ul>
				</div>

			</div> --%>

			<div class="details border-box">
				<%-- <div>
					<div>
						<p>Contact us for reprints on any of the following publications ( <a href="#">jbtok@stanford.edu</a>).</p>
						<p>Last updated ${time}</p>
					</div>
				</div> --%>
				<div class="time" id="publication">
					<%-- <p><span>${list[i]}Publications:</span></p> --%>
					<br />
					<ol>
						<li>${publication.pContent}</li>
					</ol>
				</div>
			</div>

			<div class="clear">
			</div>
		</div>
		<div class="clear">
		</div>
	</div>

	<!-- 页脚 -->
	<%@include file="foot.jsp" %>

	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/nav.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/left-nav.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/fixedLeft.js"></script>
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
