$(".occupation").click(function(){
	$(this).parent().find(".child-box").stop(true,true);
	$(this).parent().find(".child-box").slideDown();
	$(this).parents("li").siblings().find(".child-box").slideUp();

	var id=$(this).attr("href");
	$("body").animate({'scrollTop':$(id).offset().top-50},500)
})

$(function(){
	$(".here").parent().find(".child-box").css({'display':'block'})
})