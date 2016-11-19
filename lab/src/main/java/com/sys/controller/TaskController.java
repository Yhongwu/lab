package com.sys.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.entity.Task;
import com.sys.service.TaskService;
import com.sys.util.Page;

@RequestMapping("/task")
@Controller
public class TaskController {

	@Autowired
	private TaskService taskService;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/admin/list.do")
	public String list(Model model){
		List<Task> tasks = taskService.list();
		model.addAttribute("tasks", tasks);
		return "/admin/list_task";
	}
	
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.GET)
	public String insert(Model model){
		return "/admin/insert_task";
	}
	@RequestMapping(value="/admin/insert.do",method=RequestMethod.POST)
	public String insert(Model model,Task task){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		task.setuTime(date);
		int i = taskService.insert(task);
		model.addAttribute("url", "/task/admin/1/show_page.do");
		if(i!=0){
			return "/admin/success";
		}else{
			return "/admin/fail";
		}
	}
	
	@RequestMapping("/admin/{id}/show.do")
	public String show(@PathVariable Integer id,Model model){
		
		Task task = taskService.getById(id);
		model.addAttribute("task", task);
		return "/admin/show_task";
	}
	
	@RequestMapping(value="/admin/{id}/update.do",method=RequestMethod.GET)
	public String update(@PathVariable Integer id,Model model){
		Task task = taskService.getById(id);
		model.addAttribute("task", task);
		return "/admin/update_task";
	}
	
	@RequestMapping(value="/admin/update.do",method=RequestMethod.POST)
	public String update(Task task,Model model,String oldImage){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		task.setuTime(date);
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		if(!oldImage.equals(task.gettUrl())){
			String oldfile = path+oldImage;
			File oldFile = new File(oldfile);
			if(oldFile.exists()&&oldFile.isFile()){
				oldFile.delete();
			}
		}
		int i = taskService.updateTask(task);
		model.addAttribute("url", "/task/admin/1/show_page.do");
		if(i!=0){
			return "/admin/success";
		}else{
			return "/admin/fail";
		}
	}
	@RequestMapping("/admin/{pageNo}/show_page.do")
	public String getByPage(@PathVariable Integer pageNo,Model model,String keywords,Integer searchSort){
		Page page = new Page(5, pageNo);
		List<Task> tasks = taskService.getByPage(page,keywords,searchSort);
		model.addAttribute("searchSort", searchSort);
		model.addAttribute("keywords", keywords);
		model.addAttribute("page", page);
		model.addAttribute("tasks", tasks);
		return "/admin/list_task";
	}
	@RequestMapping("/admin/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		String path = request.getSession().getServletContext().getRealPath("/upload/");
		Task task = taskService.getById(id);
		String oldfile = path+task.gettUrl();
		File oldFile = new File(oldfile);
		if(oldFile.exists()&&oldFile.isFile()){
			oldFile.delete();
		}
		int i = taskService.deleteById(id);
		model.addAttribute("url", "/task/admin/1/show_page.do");
		if(i!=0) return "/admin/success";
		else return "/admin/fail";
	}
	@RequestMapping("/research.do")
	public String task(Model model){
		List<Task> task = taskService.getByTask();
		model.addAttribute("task", task);
		return "/front/research";
		
	}
	@RequestMapping("/{id}/more.do")
	public String more(@PathVariable Integer id,Model model){
		Task task = taskService.getById(id);
		model.addAttribute("task", task);
		return "/front/researchDetail";
	}
}
