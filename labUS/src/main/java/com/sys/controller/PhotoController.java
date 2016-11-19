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

import com.sys.entity.Photo;
import com.sys.service.PhotoService;
import com.sys.util.Page;

@RequestMapping("/photo")
@Controller
public class PhotoController {

	@Autowired
	private PhotoService photoService;
	@Autowired
	private HttpServletRequest request;
	@RequestMapping("/admin/list.do")
	public String list(Model model){
		List<Photo> photos = photoService.getAll();
		model.addAttribute("photos", photos);
		return "/admin/list_photo";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.GET)
	public String insert(){
		return "/admin/insert_photo";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.POST)
	public String insert(Photo photo,Model model){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		photo.setpTime(date);
		int i = photoService.insert(photo);
		model.addAttribute("url", "/photo/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping(value="/admin/{id}/update.do",method=RequestMethod.GET)
	public String update(@PathVariable Integer id,Model model){
		Photo photo = photoService.getById(id);
		model.addAttribute("photo", photo);
		return "/admin/update_photo";
	}
	@RequestMapping(value="/admin/update.do",method=RequestMethod.POST)
	public String update(Photo photo,Model model,String oldImage){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		photo.setpTime(date);
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		if(!oldImage.equals(photo.getpUrl())){
			String oldfile = path+oldImage;
			System.out.println(oldfile);
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
			}
		}
		int i = photoService.update(photo);
		model.addAttribute("url", "/photo/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/admin/{id}/show.do")
	public String show(@PathVariable Integer id,Model model){
		Photo photo = photoService.getById(id);
		model.addAttribute("photo", photo);
		return "/admin/show_photo";
	}
	@RequestMapping("/admin/{pageNo}/show_page.do")
	public String getByPage(@PathVariable Integer pageNo,Integer searchSort,Integer leibie,Model model){
		Page page = new Page(5, pageNo);
		List<Photo> photos = photoService.getByPage(page,searchSort,leibie);
		model.addAttribute("searchSort", searchSort);
		model.addAttribute("leibie", leibie);
		model.addAttribute("page", page);
		model.addAttribute("photos", photos);
		return "/admin/list_photo";
	}
	@RequestMapping("/admin/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		Photo photo = photoService.getById(id);
		String oldfile = path+photo.getpUrl();
		File oldFile = new File(oldfile);
		if(oldFile.exists()&&oldFile.isFile()){
			oldFile.delete();
		}
		int i = photoService.delete(id);
		model.addAttribute("url", "/photo/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
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
			Photo photo = photoService.getById(betchdel.get(i));
			String oldfile = path+photo.getpUrl();
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
			}
		}
		int i = photoService.delBatch(betchdel);
		model.addAttribute("url", "/photo/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	
	@RequestMapping("/{id}/more.do")
	public String more(@PathVariable Integer id,Model model){
		Photo photo = photoService.getById(id);
		model.addAttribute("photo", photo);
		return "/front/photoDetail";
	}
}
