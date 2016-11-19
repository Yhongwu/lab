package com.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sys.entity.Info;
import com.sys.service.InfoService;

@RequestMapping("/info")
@Controller
public class InfoController {

	@Autowired
	private InfoService infoService;
	@RequestMapping(value="/admin/{id}/update.do")
	public String update(Model model){
		Info info = infoService.getOne();
		model.addAttribute("info", info);
		return "/admin/update_info";
	}
	@RequestMapping(value="/admin/update.do")
	public String update(Info info,Model model){
		int i = infoService.update(info);
		model.addAttribute("url", "/info/admin/show.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/show.do")
	public String show(Model model){
		Info info = infoService.getOne();
		model.addAttribute("info", info);
		return "/admin/list_info";
	}
}
