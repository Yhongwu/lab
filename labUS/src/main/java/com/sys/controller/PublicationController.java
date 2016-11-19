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

import com.sys.entity.Publication;
import com.sys.service.PublicationService;
import com.sys.util.Page;

@RequestMapping("/publication")
@Controller
public class PublicationController {

	@Autowired
	private PublicationService publicationService;
	@RequestMapping("/admin/show.do")
	public String show(Model model){
		List<Publication> publications = publicationService.getAll();
		for(Publication p:publications){
			p.setuTime(p.getuTime().substring(5));
		}
		model.addAttribute("publications", publications);
		return "/admin/list_publication";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.GET)
	public String insert(){
		return "/admin/insert_publication";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.POST)
	public String insert(Publication publication,Model model){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		publication.setpTime(date);
		publication.setuTime(date);
		int i = publicationService.insert(publication);
		model.addAttribute("url", "/publication/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping(value="/admin/{id}/update.do",method=RequestMethod.GET)
	public String update(@PathVariable Integer id,Model model){
		Publication publication = publicationService.getById(id);
		model.addAttribute("publication", publication);
		return "/admin/update_publication";
	}
	@RequestMapping(value="/admin/update.do",method=RequestMethod.POST)
	public String update(Publication publication,Model model){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		publication.setuTime(date);
		int i = publicationService.update(publication);
		model.addAttribute("url", "/publication/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		int i = publicationService.deleteById(id);
		model.addAttribute("url", "/publication/admin/1/show_page.do");
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
		int i = publicationService.delBatch(betchdel);
		model.addAttribute("url", "/publication/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{pageNo}/show_page.do")
	public String getByPage(@PathVariable Integer pageNo,Model model,String sort){
		System.out.println("==="+sort);
		Page page = new Page(5, pageNo);
		List<Publication> publications = publicationService.getByPage(page,sort);
		List<String> years = publicationService.countByYear();
//		System.out.println(years.size());
//		System.out.println(years.get(0));
		for(Publication p:publications){
			p.setuTime(p.getuTime().substring(5));
		}
		model.addAttribute("sort", sort);
		model.addAttribute("year", years);
		model.addAttribute("page", page);
		model.addAttribute("publications", publications);
		return "/admin/list_publication";
	}
	@SuppressWarnings("deprecation")
	@RequestMapping("/{year}/getpub.do")
	public String getpub(Model model,@PathVariable String year){
		/*List<String> list = publicationService.countByYear();
		List<List<Publication>> list2 = new ArrayList<List<Publication>>();
		System.out.println(list.size());
		if(list.size()>0){
			for(int i = 0;i<list.size();i++){
				System.out.println("---------1");
				List<Publication> p = publicationService.getByYear(list.get(i));
				list2.add(p);
			}
			
		}
		System.out.println("---------2");
		String t = null;
		if(list2.size()>0){
			String time =list2.get(0).get(0).getuTime();
			t = time.substring(0, 10);			
		}
		model.addAttribute("time", t);
		model.addAttribute("list2", list2);
		model.addAttribute("list", list);
		*/
		
		System.out.println("//////////"+year);
		List<String> temp = new ArrayList<>();
		List<String> list = new ArrayList<>();
		List<Publication> list2 = new ArrayList<Publication>();
		list2 = publicationService.getAll();
		String time_update = list2.get(0).getuTime();
		model.addAttribute("uTime", time_update);
 		for(int i = 0;i<list2.size();i++){
 			temp.add(list2.get(i).getpYear());
		}
 		for(String i:temp){  
 	        if(!list.contains(i)){  
 	        	list.add(i);  
 	        }  
 	    }  
 		if(null!=year&&!"".equals(year)&&!"0".equals(year)){
 			list2 = publicationService.getByYear(year);
 			model.addAttribute("time",year);
 		}else{
 			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 			year = sf.format(new Date()).substring(0, 4);
// 			System.out.println("----"+year);
 			list2 = publicationService.getByYear(year);
 			model.addAttribute("time",year);
 		}
 		
// 		System.out.println("=========="+list2.size());
		
			
		
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		return "/front/publication";
	}
	@RequestMapping("/{id}/more.do")
	public String more(@PathVariable Integer id,Model model){
		Publication publication = publicationService.getById(id);
		model.addAttribute("publication", publication);
		return "/front/publicationDetail";
	}
}
