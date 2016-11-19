$(function(){
	// 左边导航固定
	var topoffsettop=$(".member").offset().top;
	fixedLeft($(".member"),topoffsettop);
})

function fixedLeft(box,topofScroll){
	$(window).scroll(function(){
		var scroll=$(window).scrollTop();
		if(scroll>=topofScroll){
			if(parseInt($(window).width())>=982){
				box.css({"position":"fixed","top":0,"left":($(document.body).width()-982)/2});
			}else{
				box.css({"position":"fixed","top":0,"left":-982+$(document.body).width()});
			}
		}else{
			box.css({"position":"static","top":"auto","left":"auto"});
		}
	})
	
}