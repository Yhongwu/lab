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
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/joinUs.css"/>
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

						<li class="li current">
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

			<%@include file="language.jsp" %>
		</div>
		<div class="nav-blank"></div>
		<!-- logo和轮播图 -->
		<div class="container">
			<div class="logo-box">
				<!-- <img src="<%=request.getContextPath() %>/images/logo.png"> -->
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
					<p><span>加入</span>我们</p>

					<ul>
						<li><a href="#teacher">招聘教师</a></li>
						<li><a href="#post-doc">招聘博士后</a></li>
					</ul>
				</div>

			</div>

			<div class="details border-box">
				<div class="contact">
					<span>联系我们</span>
					<div>
						<label><span>电话:</span>${info.iTel }</label>
						<label><span>邮箱:</span>${info.iEmail}</label>
						<label class="address"><span>地址:</span>${info.iAddr}</label>
						<div class="clear">
						</div>
					</div>
				</div>

				<div id="teacher">
					<c:forEach items="${tjoin }" var="join">
					<div>
						<p class="title">${join.jCom }</p>
						<p>${join.jContent}</p>
						<!-- <p>深圳大学光电工程学院拥有光学工程一级学科博士点和博士后流动站。光电工程学院先进纳米器件研究中心学术带头人彭争春是国家“千人计划”青年专家入选者、深圳大学特聘教授。研究中心核心成员包括深圳大学特聘副教授韩素婷（获香港杰出青年科学家奖</p>
						
						<p>PhD institution and major: Zhejiang University; Supramolecular Chemistry Adviser: Prof. Feihe Huang and Prof. Peter J. Stang </p>

						<p>Research interests: Non-covalent Bond-Assisted Design of Organic and Polymeric Semiconductors for Flexible Electronics </p>

						<p>advertiseContentadvertiseContentadvertiseContentadvertiseContent</p>
						<p>PhD institution and major: Zhejiang University; Supramolecular Chemistry Adviser: Prof. Feihe Huang and Prof. Peter J. Stang </p>

						<p>Research interests: Non-covalent Bond-Assisted Design of Organic and Polymeric Semiconductors for Flexible Electronics </p> -->
					</div>
					</c:forEach>
				</div>

				<div id="post-doc">
					<c:forEach items="${djoin}" var="join">
					<div>
						<p class="title">${join.jCom}</p>
						<p>${join.jContent}</p>
						<!-- <p> 深圳大学光电工程学院拥有光学工程一级学科博士点和博士后流动站。光电工程学院先进纳米器件研究中心学术带头人彭争春是国家“千人计划”青年专家入选者、深圳大学特聘教授。研究中心核心成员包括深圳大学特聘副教授韩素婷（获香港杰出青年科学家奖 ）及多名tenure-track助理教授（均从美国引进）。团队具有从事最前沿纳米器件研究的丰富经历，目前的科研重心聚焦在基于纳米功能材料的光电子器件、柔性电子及生物传感器等。研究中心根据科研工作需要招聘博士后研究人员数名。</p>

						<div class="box ">
							<p>应聘条件：</p>

							<ol>
								<li>具有或即将获得电子工程、材料科学或相关专业博士学位；</li>
								<li>具有纳米材料、弹性体材料、微电子、光电子器件及微纳传感器等相关方向的研究经验；具有较强的科研创新能力和团队协作精神； </li>
								<li>在本领域的前沿期刊上以第一作者发表过SCI论文2篇以上；</li>
								<li>年龄35周岁以下，特别优秀者可适当放宽。</li>
							</ol>-->
						</div> 
						</c:forEach>
						<!-- <div class="box">
							<p>聘期待遇（博士后年收入超过25万元/年）：</p>

							<ol>
								<li>深圳大学博士后工资5万元/年；</li>
								<li>深圳市政府每年发放12万元的博士后津贴（免税）；</li>
								<li>课题组视工作业绩给予科研津贴（不少于2000元/月）和论文奖励；</li>
								<li>深圳大学按讲师标准提供住房补贴（2240元/月）或安排周转房和社会保险金；每月200元误餐补贴，每年发放10个月；</li>
								
							</ol>
							<p class="text-indent ali">此外，博士后人员进站，可自愿选择落户深圳市。选择落户深圳市的，其配偶及未成年子女可办理随迁入户。博士后子女入托、入学等按深圳市相关条例执行。出站后留深圳工作可申请10万元科研启动经费；若符合深圳市后备级人才条件（获国家青年基金、中国博士后基金、或者留深工作5年等条件之一），可申请政府住房补贴80万元。</p>
						</div>

						<div class="box">
							<p>应聘程序：</p>
							<p>有意者请将个人简历、代表论文和拟开展工作设想等相关附件发至以下联系方式：</p>
							<p>深圳市南山区南海大道3688号</p>
							<p class="recieve">
								深圳大学光电工程学院338室  彭争春 教授（收）
								<br />
								Email: zcpeng@szu.edu.cn
								<br />
								电话： 0755-26538560
							</p>
						</div> -->

						<!-- <div class="box">
							<p>其他须知</p>
							<p>深圳大学流动站自主招收博士后招收指南（试行）请见以下链接</p>
							<a href="http://szuhr.szu.edu.cn/postDrRead.asp?nID=286" target="_blank">http://szuhr.szu.edu.cn/postDrRead.asp?nID=286</a>
						</div> -->
					</div>

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

	<script type="text/javascript" src="../js/jquery.min.js"></script>
	<script type="text/javascript" src="../js/nav.js"></script>
	<script type="text/javascript" src="../js/left-nav.js"></script>
	<script type="text/javascript" src="../js/fixedLeft.js"></script>
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