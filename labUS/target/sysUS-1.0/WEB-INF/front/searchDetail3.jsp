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

						<li class="li nav-down">
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
								<a href="<%=request.getContextPath() %>/publication/getpub.do">Publication<img src="<%=request.getContextPath() %>/images/triangle.png"/></a>
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
				<span>Center for Stretchable Electronics and NanoSensors</span>

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
				<div>
					<div>
						<!-- <p>Contact us for reprints on any of the following publications ( <a href="#">jbtok@stanford.edu</a>).</p> -->
						<p>${total} results</p>
					</div>
				</div>
				<div class="time" id="#">
					<%-- <p><span>${list[i]}Publications:</span></p> --%>
					<!-- <br /> -->
					<ol>
						<c:forEach items="${hometopics}" var="topic">
						<li><a href="<%=request.getContextPath()%>/hometopic/${topic.hId}/more.do">${topic.hTitle}</a></li>
                            	<c:if test="${fn:length(topic.hSummary)>'100' }">
                            		${fn:substring(topic.hSummary,0,100)}...  
                            	</c:if>
                            	<c:if test="${fn:length(topic.hSummary)<'100' }">
                            		  ${topic.hSummary}...
                            	</c:if>
                            	<%-- ${press.pSummary} --%>
                            
						</c:forEach>
						<%-- <c:forEach items="${joins}" var="join">
							<li><a href="<%=request.getContextPath()%>/join/${join.jId}/more.do">${join.jCom}</a></li>
						</c:forEach>
						<c:forEach items="${members}" var="member">
							<li><a href="<%=request.getContextPath()%>/member/${member.mId}/more.do">${member.name}</a></li>
						</c:forEach>
						<c:forEach items="${photos}" var="photo">
							<li><a href="<%=request.getContextPath()%>/photo/${photo.pId}/more.do">${photo.pShow}</a></li>
						</c:forEach> --%>
						<c:forEach items="${presses}" var="press">
							<li><a href="<%=request.getContextPath()%>/press/${press.pId}/more.do">${press.pTitle}</a></li>
							<td>
                            	<c:if test="${fn:length(press.pSummary)>'100' }">
                            		${fn:substring(press.pSummary,0,100)}...  
                            	</c:if>
                            	<c:if test="${fn:length(press.pSummary)<'100' }">
                            		  ${press.pSummary}...
                            	</c:if>
                            	<%-- ${press.pSummary} --%>
                            </td>
						</c:forEach>
						<%-- <c:forEach items="${publications}" var="publication">
							<li><a href="<%=request.getContextPath()%>/publication/${publication.pId}/more.do">${publication.pContent}</a></li>
						</c:forEach>
						<c:forEach items="${tasks}" var="task">
							<li><a href="<%=request.getContextPath()%>/task/${task.tId}/more.do">${task.title}</a></li>
						</c:forEach> --%>
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
