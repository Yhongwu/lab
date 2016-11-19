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
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/press.css"/>
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

						<li class="li">
							<div>
								<a href="<%=request.getContextPath() %>/publication/getpub.do">Publications</a>
							</div>
						</li>

						<li class="li current">
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
		<div class="container border-box">
			
			<c:forEach items="${presses}" var="press" varStatus="status">
			<c:if test="${(status.count)%2==0}">
			<div class="hang">
			<div>
			</c:if>
			<c:if test="${(status.count)%2==1}">
					<div class="box border-box odd">
					<div>
						<p class="title">${press.pTitle}</p>

						<img src="<%=request.getContextPath()%>/upload/${press.pUrl}">

<!-- 						<p>Chemical engineering postdoctoral scholar Ying Diao was awarded the William E. and Diane M. Spicer Young Investigator Award by SLAC. The Spicer Young Investigator Award is presented at the annual users' meeting to a new investigator who has made important technical or scientific contributions that benefit from or are beneficial to SSRL or to the lightsource community overall.</p>
 -->					
 						<c:if test="${fn:length(press.pSummary)>'100' }">
	                       <p> ${fn:substring(press.pSummary,0,100)}...  </p>
	                     </c:if>
	                     <c:if test="${fn:length(press.pSummary)<'100' }">
	                       	  <p>${press.pSummary}</p>
	                     </c:if>	
						<a href="<%=request.getContextPath()%>/press/${press.pId}/more.do">Read More</a>
					</div>
					</div>
					
					</c:if>
					
					<c:if test="${(status.count)%2==0}"> 
					<div class="box border-box even">
					<div>
						<p class="title">${press.pTitle}</p>

						<img src="<%=request.getContextPath() %>/upload/${press.pUrl}">
						<c:if test="${fn:length(press.pSummary)>'100' }">
                        <p>${fn:substring(press.pSummary,0,100)}... </p> 
                     </c:if>
                     <c:if test="${fn:length(press.pSummary)<'100' }">
                       	  <p>${press.pSummary}</p>
                     </c:if>

<!-- 						<p>Chemical engineering postdoctoral scholar Ying Diao was awarded the William E. and Diane M. Spicer Young Investigator Award by SLAC. The Spicer Young Investigator Award is presented at the annual users' meeting to a new investigator who has made important technical or scientific contributions that benefit from or are beneficial to SSRL or to the lightsource community overall.</p> -->
						<a href="<%=request.getContextPath()%>/press/${press.pId}/more.do">Read More</a>
					</div>
					</div>

					<div class="clear">
					</div>
				</c:if>
				<c:if test="${(status.count)%2==0}">
				</div>
			</div> 
			</c:if>
				</c:forEach>
						
				<c:if test="${all%2!=0}">
					<div class="clear">
					</div>
				</c:if>
				
				</div>
			</div> 


	<!-- 页脚 -->
	<%@include file="foot.jsp" %>

	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/nav.js"></script>
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
