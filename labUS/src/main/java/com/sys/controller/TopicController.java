package com.sys.controller;



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

import com.sys.entity.Topic;
import com.sys.service.TopicService;
@Controller
@RequestMapping("/admin/topic")
public class TopicController {

	@Autowired
	private TopicService topicService;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/design_list.do")
	public String topicList(Model model){
		String string = request.getSession().getServletContext().getRealPath("/");
		System.out.println(string);
		List<Topic> topics = topicService.list();
		model.addAttribute("topics", topics);
		return "/admin/design";
	}
	
	@RequestMapping(value="/insert.do",method=RequestMethod.GET)
	public String topicInsert(){
		
		return "/admin/insert";
	}
	
	@RequestMapping(value="/insert.do",method=RequestMethod.POST)
	public String topicInsert(Topic topic){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		topic.setUpdateTime(date);
		topic.setCreateTime(date);
		int i = topicService.insertTopic(topic);
		if(i==1){
		return "/admin/success";
		}else{
			return "/admin/fail";
		}
	}
	
	@RequestMapping(value="/{id}/update.do",method=RequestMethod.GET)
	public String update(@PathVariable Integer id,Model model){
		System.out.println(id);
		Topic topic = topicService.getById(id);
		model.addAttribute("topic", topic);
		System.out.println(topic.getContent());
		return  "/admin/update_topic";
	}
	
	@RequestMapping(value="/update.do",method=RequestMethod.POST)
	public String update(Topic topic,Model model){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		topic.setUpdateTime(date);
		int i = topicService.updateTopic(topic);
		if(i==1){
			return "/admin/success";
		}else{
			return "/admin/fail";
		}
	}
	
	@RequestMapping("/{id}/show.do")
	public String show(@PathVariable Integer id,Model model){
		Topic topic = topicService.getById(id);
		model.addAttribute("topic", topic);
		return "/admin/show_topic";
	}
	@RequestMapping("/{id}/delete.do")
	public String delete(@PathVariable Integer id,Model model){
		int i = topicService.deleteById(id);
		if(i!=0){
			return "/admin/success";
		}
		return "/admin/fail";
	}
	
	
}
