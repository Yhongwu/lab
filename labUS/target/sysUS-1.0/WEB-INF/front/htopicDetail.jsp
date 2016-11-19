<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>Center for Stretchable Electronics and NanoSensors</title>
	<meta charset="utf-8"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/navFooter.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/pressDetail.css"/>
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
						<li class="li current">
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
									<li><a href="#"><div class="circle border-box"></div>Photos</a></li>
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

						<li class="li">
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
				<!-- <img src="<%=request.getContextPath() %>/images/logo.png"> -->
				<span>Center for Stretchable Electronics and Wearable Sensors</span>

				<div class="clear">
				</div>
			</div>
		</div>
	</div>

	<div class="main-body">
		<div class="container">
			<div class="title-box">
				<p class="title">${hometopic.hTitle }</p>
			</div>

			<div class="content">
				<!-- 前言/简介 -->
				<p>${hometopic.hSummary }</p>

				<!-- 正文 -->
				<%-- <c:if test="${!empty hometopic.hVurl}">
				<a href="/sys/hometopic/${hometopic.hId}/video.do">
				<img class="border-box" src="<%=request.getContextPath() %>/upload/${hometopic.hUrl}">
				</a>
				</c:if>
				<c:if test="${empty hometopic.hVurl}">
				<img class="border-box" src="<%=request.getContextPath() %>/upload/${hometopic.hUrl}">
				</c:if> --%>
				<c:if test="${!empty hometopic.hVurl}">
	   				<video width="602px" height="345px" controls="controls"> 
					<source src="<%=request.getContextPath() %>/upload/${url}" type="video/mp4"></source> 
					<source src="<%=request.getContextPath() %>/upload/${url2}" type="video/ogg"></source> 
					your browser does not support the video tag 
					</video>
 				</c:if>
     			<c:if test="${empty hometopic.hVurl}">
     				<img alt="${hometopic.hTitle}" src="/sys/upload/${hometopic.hUrl}" style="width:500px;height:300px">
     			</c:if>
				${hometopic.hContent}
				<!-- <p><span>F</span><span>eatured on Stanford News, Science, Nature Energy News, Chemical & Engineering News, Engadget, NPR: All Tech Considered, Gizmodo, National Geographic, IEEE Spectrum, CNET, IGN, ABC 7 News, The Christian Science Monitor, The Stanford Precourt Institute for Energy, EurekAlert!, UPI, The Science Times, Science Recorder, R&D Magazine, ComputerWorld, and Modern Readers</span></p>

				<p>Featured on Stanford News, Science, Nature Energy News, Chemical & Engineering News, Engadget, NPR: All Tech Considered, Gizmodo, National Geographic, IEEE Spectrum, CNET, IGN, ABC 7 News, The Christian Science Monitor, The Stanford Precourt Institute for Energy, EurekAlert!, UPI, The Science Times, Science Recorder, R&D Magazine, ComputerWorld, and Modern Readers</p>

				<p>Featured on Stanford News, Science, Nature Energy News, Chemical & Engineering News, Engadget, NPR: All Tech Considered, Gizmodo, National Geographic, IEEE Spectrum, CNET, IGN, ABC 7 News, The Christian Science Monitor, The Stanford Precourt Institute for Energy, EurekAlert!, UPI, The Science Times, Science Recorder, R&D Magazine, ComputerWorld, and Modern ReadersFeatured on Stanford News, Science, Nature Energy News, Chemical & Engineering News, Engadget, NPR: All Tech Considered, Gizmodo, National Geographic, IEEE Spectrum, CNET, IGN, ABC 7 News, The Christian Science Monitor, The Stanford Precourt Institute for Energy, EurekAlert!, UPI, The Science Times, Science Recorder, R&D Magazine, ComputerWorld, and Modern ReadersFeatured on Stanford News, Science, Nature Energy News, Chemical & Engineering News, Engadget, NPR: All Tech Considered, Gizmodo, National Geographic, IEEE Spectrum, CNET, IGN, ABC 7 News, The Christian Science Monitor, The Stanford Precourt Institute for Energy, EurekAlert!, UPI, The Science Times, Science Recorder, R&D Magazine, ComputerWorld, and Modern Readers</p> -->
			<div class="clear">
			</div>
			</div>
		</div>
	</div>

	<!-- 页脚 -->
	<%@ include file="foot.jsp"%>

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
