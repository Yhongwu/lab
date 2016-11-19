$(function(){
	// 下拉菜单
	for(var i=0;i<$(".nav-down").length;i++){
		var he=$(".nav-down").eq(i).find("ul").height()+20;
		$(".downbox").eq(i).css({'height':he});
		$(".downbox").eq(i).find("ul").css({'top':-he});
	}
	for(var i=0;i<$(".nav-box .li").length;i++){
		$(".nav-box .li").eq(i).attr("num",i);
	}
	navDown();
	// 背景滑块初始位置
	var num=$(".nav-box li.current").attr("num");
	$(".nav-bg").css({'left':num*120});

	// 语言切换的位置
	languagePosition();
})

// 下拉菜单，背景滑块移动
function navDown(){
	$(".li").hover(function(){
		$(this).find("ul").stop(true,true);
		$(this).find("ul").animate({'top':0},200);
		$(this).find(".downbox").css({'visibility':'visible'})
		$(this).find(".downbox").fadeIn(200);

		var num=$(this).attr('num');
		$(".nav-bg").stop(true,true);
		$(".nav-bg").animate({'left':num*120},100);
	},function(){
		var btHeight=-$(this).find("ul").height()-14+'px';
		$(this).find("ul").stop(true,true);
		$(this).find("ul").animate({'top':btHeight},200);
		$(this).find(".downbox").fadeOut(200);
	});
	$(".nav-box").mouseleave(function(){
		var num=$(".nav-box li.current").attr("num");
		$(".nav-bg").delay(200).animate({'left':num*120},100);
	})
}
8
function languagePosition(){
	$(window).bind('resize',function(){
		if($(window).width()-1060<2*$(".language").width()){
			$(".language").css({"display":"none"});
		}else{
			$(".language").css({"display":"block"});
		}
	})
}

// 点击搜索
$(".nav .search input").focus(function(){
	$(this).css({'backgroundColor':'#fff'});
	$(".nav .search button").css({'backgroundColor':'#fff'});
});

$(".nav .search input").blur(function(){
	$(this).css({'backgroundColor':'#f1f2f2'});
	$(".nav .search button").css({'backgroundColor':'#f1f2f2'});
})