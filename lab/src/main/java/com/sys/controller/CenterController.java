package com.sys.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.entity.HomeTopic;
import com.sys.entity.Press;
import com.sys.service.HomeTopicService;
import com.sys.service.PressService;


@Controller
public class CenterController {
	@Autowired
	private HomeTopicService homeTopicService;
	@Autowired
	private PressService pressService;
	@Autowired
	@RequestMapping("/index.do")
	public String index(){
		return "redirect:/hometopic/home.do";
	}
	
	@RequestMapping(value="/search.do",method=RequestMethod.POST)
	public String search(Model model,String word){
		//word = "AB";
		List<HomeTopic> hometopics = homeTopicService.search(word);
		System.out.println("hometopics"+hometopics.size());
		
		for(int i = 0; i<hometopics.size();i++){
			HomeTopic homeTopic = hometopics.get(i);
			homeTopic.sethTitle(homeTopic.gethTitle().replaceAll("(?i)"+word, "<font color='red'>"+word+"</font>"));
			int a = homeTopic.gethSummary().indexOf(word);
			if(a!=-1){
				if(a>15){
					homeTopic.sethSummary(homeTopic.gethSummary().substring(homeTopic.gethSummary().indexOf(word)-15).replaceAll(word, "<font color='red'>"+word+"</font>"));
				}else{
					homeTopic.sethSummary(homeTopic.gethSummary().substring(homeTopic.gethSummary().indexOf(word)).replaceAll(word, "<font color='red'>"+word+"</font>"));
				}
			}
			
			int b = homeTopic.gethContent2().indexOf(word);
			System.out.println("b:"+b);
			if(b!=-1){
				if(b>10){
					homeTopic.sethSummary(homeTopic.gethContent2().substring(homeTopic.gethContent2().indexOf(word)-10).replaceAll(word, "<font color='red'>"+word+"</font>"));
				}else{
					homeTopic.sethSummary(homeTopic.gethContent2().substring(homeTopic.gethContent2().indexOf(word)).replaceAll(word, "<font color='red'>"+word+"</font>"));
				}
			}
		}
		
		List<Press> presses = pressService.search(word);
		System.out.println("press"+presses.size());
		for(int i = 0;i<presses.size();i++){
			Press press = presses.get(i);
			press.setpTitle(press.getpTitle().replaceAll("(?i)"+word, "<font color='red'>"+word+"</font>"));
			
			int a = press.getpSummary().indexOf(word);
			if(a!=-1){
				if(a>15){
					press.setpSummary(press.getpSummary().substring(press.getpSummary().indexOf(word)-15).replaceAll("(?i)"+word, "<font color='red'>"+word+"</font>"));
				}else{
					press.setpSummary(press.getpSummary().substring(press.getpSummary().indexOf(word)).replaceAll("(?i)"+word, "<font color='red'>"+word+"</font>"));
				}
			}
			
			int b = press.getpContent2().indexOf(word);
			System.out.println("aaa:"+b);
			if(b!=-1){
				if(b>15){
					press.setpSummary(press.getpContent2().substring(press.getpContent2().indexOf(word)-15).replaceAll("(?i)"+word, "<font color='red'>"+word+"</font>"));
				}else{
					press.setpSummary(press.getpContent2().substring(press.getpContent2().indexOf(word)).replaceAll("(?i)"+word, "<font color='red'>"+word+"</font>"));
				}
				
			}
			System.out.println(press.getpContent());
			System.out.println(press.getpTitle());
		}
		
		
		int total = hometopics.size()+presses.size();
		model.addAttribute("total", total);
		model.addAttribute("hometopics", hometopics);
		model.addAttribute("presses", presses);
		return "/front/searchDetail3";
	}
	
}
