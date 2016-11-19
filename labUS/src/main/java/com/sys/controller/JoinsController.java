package com.sys.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.entity.Info;
import com.sys.entity.Joins;
import com.sys.service.InfoService;
import com.sys.service.JoinsService;
import com.sys.util.Page;

@RequestMapping("/join")
@Controller
public class JoinsController {

	@Autowired
	private JoinsService joinService;
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/admin/show.do")
	public String show(Model model){
		List<Joins> joins = joinService.getAll();
		model.addAttribute("joins", joins);
		return "/admin/list_join";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.GET)
	public String insert(){
		return "/admin/insert_join";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.POST)
	public String insert(Model model,Joins join){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		join.setjTime(date);
		int i = joinService.insert(join);
		model.addAttribute("url", "/join/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{id}/show.do")
	public String show(@PathVariable Integer id,Model model){
		Joins join = joinService.getById(id);
		model.addAttribute("join", join);
		return "/admin/show_join";
	}
	@RequestMapping(value="/admin/{id}/update.do")
	public String update(@PathVariable Integer id,Model model){
		Joins join = joinService.getById(id);
		model.addAttribute("join", join);
		return "/admin/update_join";
	}
	@RequestMapping(value="/admin/update.do")
	public String update(Joins join,Model model){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		join.setjTime(date);
		int i = joinService.update(join);
		model.addAttribute("url", "/join/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		int i = joinService.delete(id);
		model.addAttribute("url", "/join/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/dels.do")
	public String dels(String ids,Model model){
		String[] dels = ids.split(",");
		List<Integer> betchdel = new ArrayList<Integer>();
		for(int i = 0; i < dels.length;i++){
			betchdel.add( Integer.parseInt(dels[i]));
		}
		int i = joinService.delBatch(betchdel);
		model.addAttribute("url", "/join/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{pageNo}/show_page.do")
	public String getByPage(@PathVariable Integer pageNo,Model model,Integer sort,Integer po,String keywords){
		Page page = new Page(5, pageNo);
		List<Joins> joins = joinService.getByPage(page,sort,po,keywords);
		model.addAttribute("po", po);
		model.addAttribute("sort", sort);
		model.addAttribute("keywords", keywords);
		model.addAttribute("joins", joins);
		model.addAttribute("page", page);
		return "/admin/list_join";
	}
	@RequestMapping("/join_us.do")
	public String join(Model model){
		//教师
		List<Joins> tjoin = joinService.getByPo(0);
		//博士后
		List<Joins> djoin = joinService.getByPo(1);
		Info info = null;	
		info = infoService.getOne();
		model.addAttribute("info", info);
		model.addAttribute("tjoin", tjoin);
		model.addAttribute("djoin", djoin);
		return "/front/joinUs";
	}
	
	@RequestMapping("/{id}/more.do")
	public String more(@PathVariable Integer id,Model model){
		Joins join = joinService.getById(id);
		model.addAttribute("join", join);
		return "/front/joinDetail";
	}
}
