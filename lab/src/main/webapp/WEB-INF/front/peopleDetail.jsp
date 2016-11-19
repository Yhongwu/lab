<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
	<title>实验室</title>
	<meta charset="utf-8"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/navFooter.css"/>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/people.css"/>
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
								<a href="<%=request.getContextPath() %>/hometopic/home.do"><span>首页</span></a>
							</div>
						</li>

						<li class="li nav-down current">
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

						<li class="li nav-down">
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
								<a href="<%=request.getContextPath() %>/publication/0/getpub.do">科研成果</a>
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

			<div class="language">
				<a href="#" title="切换中文">English</a>
				<span>|</span>
				<span><i>中文</i></span>
			</div>
		</div>
		<div class="nav-blank">
		</div>

		<!-- logo和轮播图 -->
		<div class="container">
			<div class="logo-box">
				<img src="<%=request.getContextPath() %>/images/logo.png">
				<span>可拉伸电子及纳米传感器研究中心</span>

				<div class="clear">
				</div>
			</div>
		</div>
	</div>

	<div class="main-body">
		<div class="container">
			<div class="member border-box">
				<div class="member-box">
					<p><span>师资</span>队伍</p>

					<ul>
						<li>
							<a href="#professors" class="here occupation">教授</a>
							<div class="child-box">
								<c:forEach items="${members1}" var="member" >
									<a href="<%=request.getContextPath() %>/member/${member.mId}/more.do"><img alt="${member.name}" src="/sys/upload/${member.imgUrl}" style="width:30px;height:45px">${member.name }</a>
								</c:forEach>
								<!-- <a href="#"><img src="../images/people/member-1.jpg">Gao Nansha</a>
								<a href="#"><img src="../images/people/member-1.jpg">Gao Nansha</a> -->
							</div>
						</li>

						<li>
							<a href="#teacher" class="occupation">专职研究人员</a>
							<div class="child-box">
								<c:forEach items="${members6}" var="member">
									<a href="<%=request.getContextPath() %>/member/${member.mId}/more.do"><img alt="${member.name}" src="/sys/upload/${member.imgUrl}" style="width:30px;height:45px">${member.name }</a>
								</c:forEach>
								<!-- <a href="#"><img src="../images/people/member-1.jpg">Gao Nansha</a>
								<a href="#"><img src="../images/people/member-1.jpg">Gao Nansha</a> -->
							</div>
						</li>

						<li>
							<a href="#full" class="occupation">博士后</a>
							<div class="child-box">
								<c:forEach items="${members2}" var="member">
									<a href="<%=request.getContextPath() %>/member/${member.mId}/more.do"><img alt="${member.name}" src="/sys/upload/${member.imgUrl}" style="width:30px;height:45px">${member.name }</a>
								</c:forEach>
							</div>
						</li>

						<li>
							<a href="#postdoctor" class="occupation">博士生</a>
							<div class="child-box">
								<c:forEach items="${members3}" var="member">
									<a href="<%=request.getContextPath() %>/member/${member.mId}/more.do"><img alt="${member.name}" src="/sys/upload/${member.imgUrl}" style="width:30px;height:45px">${member.name }</a>
								</c:forEach>
							</div>
						</li>

						<li>
							<a href="#phd" class="occupation">本科生/研究生</a>
							<div class="child-box">
								<c:forEach items="${members4}" var="member">
									<a href="<%=request.getContextPath() %>/member/${member.mId}/more.do"><img alt="${member.name}" src="/sys/upload/${member.imgUrl}" style="width:30px;height:45px">${member.name }</a>
								</c:forEach>
							</div>
						</li>

						<li>
							<a href="#master" class="occupation">教师</a>
							<div class="child-box">
								<c:forEach items="${members5}" var="member">
									<a href="<%=request.getContextPath() %>/member/${member.mId}/more.do"><img alt="${member.name}" src="/sys/upload/${member.imgUrl}" style="width:30px;height:45px">${member.name }</a>
								</c:forEach>
							</div>
						</li>
					</ul>
				</div>

				<!-- <div class="member-box">
					<p>Photos</p>

					<ul>
						<li><a href="#lab">In the Lab</a></li>
						<li class="team" flag="true">
						<div>
							<a href="#team">Team</a>
						</div>

							<ul>
								<li><a href="#team">2016</a></li>
								<li><a href="#2015">2015</a></li>
								<li><a href="#">2014</a></li>
								<li><a href="#">2013</a></li>
							</ul>
						</li>
					</ul>
				</div> -->
			</div>

			<div class="member-detail">
				<h1>${member.name }</h1>
				<div class="main-detail">
					<!-- <img src="../images/people/member-1.jpg">
					<p>Postdoctoral Fellow</p>
					<table> -->
						<!-- <tr>
							<td>Office:</td>	
							<td>278 PTB Building</td>
						</tr>
						<tr>
							<td>Fax:</td>
							<td>404-894-9140</td>
						</tr>
						<tr>
							<td>Email:</td>
							<td>yi-cheng.wang@mse.gatech.edu</td>
						</tr>
						<tr>
							<td>Mailing Address:</td>
							<td>
								PTB building 280
								<br/>
								Georgia Institute of Technology
								<br/>
								500 10th street N.W.
								<br/>
								Atlanta, GA 30318-5794
							</td>
						</tr> -->
						${member.info }
						
					<!-- </table> -->
					<div class="clear">
					</div>
				</div>

				<!-- <div class="box">
					<h2><span>Biosketch</span></h2>
					<ul>
						<li>Ph.D. in Biological Systems Engineering, University of Wisconsin-Madison, 2016</li>
						<li>M.S. in Chemistry, University of Wisconsin-Madison, 2012</li>
					</ul>

					<h2><span>Research Area</span></h2>
					<ul>
						<li>Triboelectric nanogenerators</li>
						<li>Synthesis and characterization of nanomaterials</li>
					</ul>
				</div> -->
			</div>
		
			<div class="clear">
			</div>
		</div>
	</div>

	<!-- 页脚 -->
	<%@include file="foot.jsp" %>

	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/nav.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/people.js"></script>
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