$(function(){
	//解决页面内容太少，页脚放在最下面
	positionFooter();
})

function positionFooter() {
	footerHeight = $(".footer").height()+80;
	//如果页面内容高度小于屏幕高度，div.footer将绝对定位到屏幕底部，否则div.footer保留它的正常静态定位
	if ( ($(document.body).height()) > $(window).height()) {
		$(".footer").css({"position":"static"});
	}
	else{
		footerTop = ($(window).height()-footerHeight)+"px";
		$(".footer").css({ "position": "absolute"}).stop().css({'top':footerTop});
		var blank=$(window).height()-$(".frame").height()-$(".main-body").height()-64+'px';
		$(".main-body").css({'paddingBottom':blank})
	}
}