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

import com.sys.entity.HomeShow;
import com.sys.entity.HomeTopic;
import com.sys.service.HomeShowService;
import com.sys.service.HomeTopicService;
import com.sys.util.HtmlUtil;
import com.sys.util.Page;

@RequestMapping("/hometopic")
@Controller
public class HomeTopicController {

	@Autowired
	private HomeTopicService homeTopicService;
	@Autowired
	private HomeShowService homeShowService;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/admin/show.do")
	public String getAll(Model model){
		List<HomeTopic> homeTopics = homeTopicService.getAll();
		model.addAttribute("hometopics", homeTopics);
		return "/admin/list_htopic";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.GET)
	public String insert(){
		return "/admin/insert_htopic";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.POST)
	public String insert(HomeTopic homeTopic,Model model){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		homeTopic.sethTime(date);
		homeTopic.sethContent2(HtmlUtil.getTextFromHtml(homeTopic.gethContent()));
		int i = homeTopicService.insert(homeTopic);
		model.addAttribute("url", "/hometopic/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping(value="/admin/{id}/update.do",method=RequestMethod.GET)
	public String update(@PathVariable Integer id,Model model){
		HomeTopic hometopic = homeTopicService.getById(id);
		model.addAttribute("hometopic", hometopic);
		return "/admin/update_htopic";
	}
	@RequestMapping(value="/admin/update.do",method=RequestMethod.POST)
	public String update(HomeTopic homeTopic,Model model,String oldImage,String oldvurl){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		homeTopic.sethTime(date);
		String t = HtmlUtil.getTextFromHtml(homeTopic.gethContent());
		homeTopic.sethContent2(t);
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		if(!oldImage.equals(homeTopic.gethUrl())){
			String oldfile = path+oldImage;
			System.out.println(oldfile);
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
				//System.out.println("okokok!!!!");
			}
		}
		if(oldvurl!=null&&(!oldvurl.equals(homeTopic.gethVurl()))){
			String oldfile = path+oldvurl;
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
				//System.out.println("okokok2222!!!!");
			}
		}
		
		homeTopic.sethContent2(HtmlUtil.getTextFromHtml(homeTopic.gethContent()));
		int i = homeTopicService.update(homeTopic);
		model.addAttribute("url", "/hometopic/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping(value="/admin/{id}/show.do")
	public String show(@PathVariable Integer id,Model model){
		HomeTopic hometopic = homeTopicService.getById(id);
		if(hometopic.gethVurl()!=null&&!hometopic.gethVurl().equals("")){
			String s = hometopic.gethVurl().substring(0,hometopic.gethVurl().lastIndexOf("."))+".ogg";
			model.addAttribute("url", hometopic.gethVurl());
			model.addAttribute("url2", s);
		}
		model.addAttribute("hometopic", hometopic);
		return "/admin/show_htopic";
	}
	@RequestMapping("/admin/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		HomeTopic htopic = homeTopicService.getById(id);
		String oldfile = path+htopic.gethUrl();
		String oldfile2 = path+htopic.gethVurl();
		File oldFile = new File(oldfile);
		File oldFile2 = new File(oldfile2);
		if(oldFile.exists()&&oldFile.isFile()){
			oldFile.delete();
		}
		if(oldFile2.exists()&&oldFile2.isFile()){
			oldFile2.delete();
		}
		int i = homeTopicService.delete(id);
		model.addAttribute("url", "/hometopic/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{pageNo}/show_page.do")
	public String getByPage(@PathVariable Integer pageNo,Model model,Integer searchSort,String keywords){
		Page page = new Page(5, pageNo);
		List<HomeTopic> hometopics = homeTopicService.getByPage(page,searchSort,keywords);
		HomeShow homeShow = null;
		homeShow = homeShowService.findShow();
		model.addAttribute("homeShow", homeShow);
		model.addAttribute("searchSort", searchSort);
		model.addAttribute("keywords", keywords);
		model.addAttribute("hometopics", hometopics);
		model.addAttribute("page", page);
		return "/admin/list_htopic";
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
			HomeTopic htopic = homeTopicService.getById(betchdel.get(i));
			String oldfile = path+htopic.gethUrl();
			String oldfile2 = path+htopic.gethVurl();
			File oldFile = new File(oldfile);
			File oldFile2 = new File(oldfile2);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
			}
			if(oldFile2.exists()&&oldFile2.isFile()){
				oldFile2.delete();
			}
		}
		int i = homeTopicService.delBatch(betchdel);
		model.addAttribute("url", "/hometopic/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/home.do")
	public String home(Model model){
		List<HomeTopic> hometopics = homeTopicService.home();
		HomeShow homeShow = null;
		homeShow = homeShowService.findShow();
//		System.out.println("_____________"+hometopics.size());
//		System.out.println(hometopics.get(0).gethUrl());
		model.addAttribute("hometopics", hometopics);
		model.addAttribute("homeShow", homeShow);
		return "/index";
	}
	@RequestMapping("/{id}/more.do")
	public String more(@PathVariable Integer id,Model model){
		HomeTopic homeTopic = homeTopicService.getById(id);
		if(homeTopic.gethVurl()!=null&&!homeTopic.gethVurl().equals("")){
			String s = homeTopic.gethVurl().substring(0,homeTopic.gethVurl().lastIndexOf("."))+".ogg";
			model.addAttribute("url", homeTopic.gethVurl());
			model.addAttribute("url2", s);
		}
		model.addAttribute("hometopic", homeTopic);
		return "/front/htopicDetail";
	}
	
	@RequestMapping("/{id}/video.do")
	public String video(@PathVariable Integer id,Model model){
		HomeTopic htopic = homeTopicService.getById(id);
		String s = htopic.gethVurl().substring(0,htopic.gethVurl().lastIndexOf("."))+".ogg";
		model.addAttribute("url", htopic.gethVurl());
		model.addAttribute("url2", s);
		return "/front/video";
	}
	
	@RequestMapping(value="/admin/{id}/updateshow.do",method=RequestMethod.GET)
	public String updateHShow(Model model,@PathVariable Integer id){
		
		HomeShow homeShow = homeShowService.getById(id);
		model.addAttribute("homeShow", homeShow);
		
		return "/admin/update_hshow";
	}
	@RequestMapping(value="/admin/updateshow.do",method=RequestMethod.POST)
	public String updateHShow(Model model,HomeShow homeShow,String oldImage){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		if(!oldImage.equals(homeShow.getSurl())){
			String oldfile = path+oldImage;
			System.out.println(oldfile);
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
				//System.out.println("okokok!!!!");
			}
		}
		int i = 1;
		i = homeShowService.updateShow(homeShow);
		model.addAttribute("url", "/hometopic/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";	
		
	}
	@RequestMapping("/admin/{id}/hshow.do")
	public String getHShow(Model model,@PathVariable Integer id){
		HomeShow homeShow = homeShowService.getById(id);
		model.addAttribute("homeShow", homeShow);
		return "/admin/show_hshow";
	}
}
