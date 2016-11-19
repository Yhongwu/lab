$(function(){
	// team有下拉菜单
	$(".member-box ul li.team").click(function(){
		if($(this).attr("flag")=="true"){
			$(this).find("ul").stop(true,true);
			$(this).find("ul").slideDown();
			$(this).attr("flag","flase");
		}else{
			$(this).find("ul").stop(true,true);
			$(this).find("ul").slideUp();
			$(this).attr("flag","true");
		}
		
	})

	$(".member-box ul li.team ul").click(function(){
		$(".member-box ul li.team").attr("flag","true");
	})

	// 左边导航点击后的当前状态
	$(".member-box ul li a").click(function(){
		$(".member-box ul li a").removeClass("here");
		$(this).addClass("here");
	});
})