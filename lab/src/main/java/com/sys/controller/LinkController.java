package com.sys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.entity.Links;
import com.sys.service.linkService;
@RequestMapping("/link")
@Controller
public class LinkController {

	@Autowired
	private linkService linkService;
	@RequestMapping("/admin/show.do")
	public String show(Model model,Integer sort){
		List<Links> links = linkService.getBySort(sort);
		model.addAttribute("searchSort", sort);
		model.addAttribute("links", links);
		return "/admin/list_links";
	}
	@RequestMapping(value="/admin/{id}/update.do",method=RequestMethod.GET)
	public String update(@PathVariable Integer id,Model model){
		Links link = linkService.getById(id);
		model.addAttribute("link", link);
		return "/admin/update_link";
	}
	@RequestMapping(value="/admin/update.do",method=RequestMethod.POST)
	public String update(Links link,Model model){
		int i = linkService.update(link);
		model.addAttribute("url", "/link/admin/show.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.GET)
	public String insert(){
		return "/admin/insert_link";
	}
	
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.POST)
	public String insert(Links link,Model model){
		System.out.println("akakakakaka");
		int i = linkService.insert(link);
		model.addAttribute("url", "/link/admin/show.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/dels")
	public String dels(String ids,Model model){
		String[] dels = ids.split(",");
		List<Integer> betchdel = new ArrayList<Integer>();
		for(int i = 0; i < dels.length;i++){
			betchdel.add( Integer.parseInt(dels[i]));
		}
		int i = linkService.delBatch(betchdel);
		model.addAttribute("url", "/link/admin/show.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		int i = linkService.deleteById(id);
		model.addAttribute("url", "/link/admin/show.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/link.do")
	public String link(Model model){
		//合作小组
		List<Links> grouplink = linkService.getByStatus(0);
		//相关网站
		List<Links> netlink = linkService.getByStatus(1);
		model.addAttribute("grouplink", grouplink);
		model.addAttribute("netlink", netlink);
		return "/front/links";
		
	}
}
