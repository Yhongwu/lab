<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>可拉伸电子及纳米传感器研究中心</title>
	<meta charset="utf-8"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/navFooter.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/index.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/global.css"/>
	<link rel="stylesheet" href="http://vjs.zencdn.net/c/video-js.css">

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
								</ul>
							</div>
						</li>

						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/publication/getpub.do">科研成果</a>
							</div>
						</li>

						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/press/press.do">新闻/视频</a>
							</div>
						</li>

						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/join/join_us.do">加入我们</a>
							</div>
						</li>

						<li class="li ">
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

			<%@include file="front/language.jsp" %>
		</div>
		<div class="nav-blank"></div>
		<%-- <jsp:include page="front/common.jsp" flush="true"/> --%>
		<!-- logo和轮播图 -->
		<div class="container">
			<div class="logo-box">
				
				<span>可拉伸电子及纳米传感器研究中心</span>

				<div class="clear">
				</div>
			</div>

			<!-- 轮播图 -->
			<div class="slider">
				<div class="a">
					<c:forEach items="${hometopics}" var="hometopic">
					
					<div class="slider-box">
						<div class="slider-left border-box">
							<p class="title">${hometopic.hTitle}</p>
							<br />
							<p class="brief">${hometopic.hContent}</p>
							<br />
							<br />
<%-- 							<a href="<%=request.getContextPath()%>/hometopic/${hometopic.hId}/more.do">了解详情</a> --%>
						<a href="${hometopic.hSummary}">了解详情</a>
						</div>

						<div class="slider-right border-box">
							<img src="<%=request.getContextPath()%>/upload/${hometopic.hUrl}"/>
						</div>

						<div class="clear">
						</div>
					</div>

					</c:forEach>
				</div>

				<div class="choose">
					<c:forEach items="${hometopics}" var="hometopic">
					<a href="javascript:;" class="sm-picture">
						<img src="<%=request.getContextPath()%>/upload/${hometopic.hUrl}"/>
					</a>
					</c:forEach>

					<div class="clear">
					</div>
				</div>

				<div class="clear">
				</div>
			</div>
		</div>
	</div>

<!-- 视频和团队介绍 -->  
      	<div class="main-body">  
      		<div class="container">  
      			<div class="welcome-image border-box">  
      				<img src="<%=request.getContextPath()%>/upload/${homeShow.surl}">  
      			</div>  
      
  
      			<!-- 团队介绍 -->  
      			<div class="introduce border-box">  
      				<div class="welcome">  
      					<p>${homeShow.stitle}</p >  
      				</div>  
      
  
      				<div class="welcome-box">  
      					<div>  
      						<c:if test="${fn:length(homeShow.scontent)>'1' }">  
                             		<span>${fn:substring(homeShow.scontent,0,1)}</span>   
                             	</c:if>  
      						<span>${fn:substring(homeShow.scontent,1,-1)} </span>  
      					</div>  
      
  
      					<div class="clear">  
					</div>
				</div>
			</div>

			<div class="clear">
			</div>
			<div>${homeShow.moreContent}</div>
		</div>

		<div class="clear">
		</div>
	</div>
	<%@include file="front/foot.jsp" %>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/index.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/nav.js"></script>
</body>
</html>