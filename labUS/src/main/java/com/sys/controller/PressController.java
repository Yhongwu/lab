package com.sys.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.entity.Press;
import com.sys.service.PressService;
import com.sys.util.HtmlUtil;
import com.sys.util.Page;

@RequestMapping("/press")
@Controller
public class PressController {

	@Autowired
	private PressService pressService;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/admin/show.do")
	public String show(Model model){
		List<Press> presses = pressService.getAll();
		model.addAttribute("presses", presses);
		return "/admin/list_press";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.GET)
	public String insert(){
		return "/admin/insert_press";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.POST)
	public String insert(Press press,Model model){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		press.setpTime(date);
		press.setpContent2(HtmlUtil.getTextFromHtml(press.getpContent()));
		int i = pressService.insert(press);
		model.addAttribute("url", "/press/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{id}/show.do")
	public String show(@PathVariable Integer id,Model model){
		Press press = pressService.getById(id);
		if(press.getpVurl()!=null&&!press.getpVurl().equals("")){
			String s = press.getpVurl().substring(0,press.getpVurl().lastIndexOf("."))+".ogg";
			model.addAttribute("url", press.getpVurl());
			model.addAttribute("url2", s);
		}
		model.addAttribute("press", press);
		return "/admin/show_press";
	}
	@RequestMapping(value="/admin/{id}/update.do",method=RequestMethod.GET)
	public String update(@PathVariable Integer id,Model model){
		Press press = pressService.getById(id);
		model.addAttribute("press", press);
		return "/admin/update_press";
	}
	@RequestMapping(value="/admin/update.do",method=RequestMethod.POST)
	public String update(Press press,Model model,String oldImage,String oldvurl){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		if(!oldImage.equals(press.getpUrl())){
			System.out.println("---------++"+path);
			String oldfile = path+oldImage;
			System.out.println(oldfile);
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
				System.out.println("okokok!!!!");
			}
		}
		if(oldvurl!=null&&(!oldvurl.equals(press.getpVurl()))){
			String oldfile = path+oldvurl;
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
				System.out.println("okokok2222!!!!");
			}
		}
		System.out.println("vurl：：："+press.getpVurl());
//		if(press!=null&&press.getpVurl().equals("")){
//			System.out.println("==-==--==-");
//			press.setpVurl(null);
//		}
		press.setpContent2(HtmlUtil.getTextFromHtml(press.getpContent()));
		int i = pressService.updatePress(press);
		model.addAttribute("url", "/press/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		Press press = pressService.getById(id);
		String oldfile = path+press.getpUrl();
		String oldfile2 = path+press.getpVurl();
		File oldFile = new File(oldfile);
		File oldFile2 = new File(oldfile2);
		if(oldFile.exists()&&oldFile.isFile()){
			oldFile.delete();
			System.out.println("okokok1111!!!!");
		}
		if(oldFile2.exists()&&oldFile2.isFile()){
			oldFile2.delete();
			System.out.println("okokok2222!!!!");
		}
		
		int i = pressService.deleteById(id);
		model.addAttribute("url", "/press/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{pageNo}/show_page.do")
	public String getByPage(@PathVariable Integer pageNo,
			Model model,
			Integer searchSort,
			String keywords,
			Integer status){
		Page page = new Page(5, pageNo);
		List<Press> presses = pressService.getByPage(page, searchSort, keywords,status);
		model.addAttribute("status", status);
		model.addAttribute("searchSort", searchSort);
		model.addAttribute("keywords", keywords);
		model.addAttribute("page", page);
		model.addAttribute("presses", presses);
		return "/admin/list_press";
	}
	@RequestMapping("/admin/dels.do")
	public String dels(String ids,Model model){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		String[] dels = ids.split(",");
		List<Integer> betchdel = new ArrayList<Integer>();
		for(int i = 0; i < dels.length;i++){
			betchdel.add( Integer.parseInt(dels[i]));
		}
		for(int i = 0;i<betchdel.size();i++){
			Press press = pressService.getById(betchdel.get(i));
			String oldfile = path+press.getpUrl();
			String oldfile2 = path+press.getpVurl();
			File oldFile = new File(oldfile);
			File oldFile2 = new File(oldfile2);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
			}
			if(oldFile2.exists()&&oldFile2.isFile()){
				oldFile2.delete();
			}
		}
		int i = pressService.delBatch(betchdel);
		model.addAttribute("url", "/press/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/press.do")
	public String press(Model model){
//		List<Press> presses = pressService.getAll();
		List<Press> presses = pressService.getByStatus();
//		System.out.println(presses.get(0).getpUrl());
		model.addAttribute("presses", presses);
		model.addAttribute("all", presses.size());
		return "/front/press";
	}
	@RequestMapping("/{id}/more.do")
	public String more(@PathVariable Integer id,Model model){
		Press press = pressService.getById(id);
		if(press.getpVurl()!=null&&!press.getpVurl().equals("")){
			String s = press.getpUrl().substring(0,press.getpVurl().lastIndexOf("."))+".ogg";
			System.out.println(s);
			model.addAttribute("url", press.getpVurl());
			model.addAttribute("url2", s);
		}
		model.addAttribute("press", press);
		return "/front/pressDetail";
	}
	
	@RequestMapping("/{id}/video.do")
	public String video(@PathVariable Integer id,Model model){
		Press press = pressService.getById(id);
		String s = press.getpUrl().substring(0,press.getpVurl().lastIndexOf("."))+".ogg";
		System.out.println(s);
		model.addAttribute("url", press.getpVurl());
		model.addAttribute("url2", s);
		return "/front/video";
	}
	
}
