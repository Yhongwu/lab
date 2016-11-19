var timer=null;
var timer2=null;
$(function(){
	// 轮播图
	onSlider();
	slideMove();
	for(var i=0;i<$(".slider-box").length;i++){
		$(".slider-box").eq(i).attr("index",i);
		$(".sm-picture").eq(i).attr("smnum",i);
	}
	choose();

	
	// 刷新页面轮播图向下展开
	$(".slider .a").delay(300).animate({"height":"210px","opacity":"1"},1000);


})

function onSlider(){
	// 在容器slider内各处可见鼠标动态
	$(".slider").hover(function(){
		clearInterval(timer);
	},function(){
		var now=$(this).find(".active").attr("index");
		sliderChange(now);
	})
}

function slideMove(){
	$(".slider-box").eq(0).addClass("active");
	$(".sm-picture").eq(0).addClass("on");

	var index=0;
	clearInterval(timer);
	sliderChange(index)
}

function choose(){
	$(".sm-picture").click(function(){
		var a=$(this).attr("smnum");
		clearInterval(timer);
		sliderPlay(a);
	})
}

function sliderPlay(curindex){
	$(".slider-box").eq(curindex).addClass("active").siblings().removeClass("active");
	$(".slider-box").eq(curindex).fadeIn(500).siblings().fadeOut(500);
	$(".sm-picture").eq(curindex).addClass("on");
	$(".sm-picture").eq(curindex).siblings().removeClass("on");
}

function sliderChange(index){
	if(index<$(".slider-box").length-1){
		sliderPlay(index);
		index++;
	}else{
		index=0;
	}
	
	timer=setInterval(function(){
		sliderPlay(index);
		if(index<$(".slider-box").length-1){
			index++;
		}else{
			index=0;
		}
		
	},6000);
}
