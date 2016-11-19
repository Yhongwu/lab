package com.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sys.entity.User;
import com.sys.service.UserService;
import com.sys.util.MD5keyBean;

@RequestMapping("/admin")
@Controller
public class UserController {
	private final String key = "tatatech";
	@Autowired
	private UserService userService;
	@Autowired
	private HttpServletRequest request;
	@RequestMapping(value={"/login.do"},method=RequestMethod.GET)	
	public String login(String msg,Model model, @RequestParam("code") String code){		
		if(! code.equals(key) ) {
			System.out.println("invalid request");
			return "invalid request";
		} else {
			System.out.println(msg);
			model.addAttribute("msg", msg);
			request.getSession().setAttribute("code", code);
			return "/admin/welcome";
		}		
	}
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(User user,Model model){
		User u = userService.login(user);
		if(u==null){
			model.addAttribute("msg", "用户名或密码错误");
			return "redirect:/admin/login.do";
		}
		else{
			request.getSession().setAttribute("user", u);
			model.addAttribute("user", u);
//			return "redirect:/admin/info/show.do";
			return "/admin/welcome";
		}
	}
	@RequestMapping(value="/update.do",method=RequestMethod.GET)
	public String update(Model model,String tip){
		System.out.println(tip);
//		User user =(User) request.getSession().getAttribute("user");
		model.addAttribute("tip", tip);
		return "/admin/update_user";
	}
	@RequestMapping(value="/update.do",method=RequestMethod.POST)
	public String update(String oPsd,String nPsd,String npsd2,Model model){
		User user =(User) request.getSession().getAttribute("user");
		MD5keyBean m = new MD5keyBean();
		System.out.println(user.getuPassword());
		if(!(m.getkeyBeanofStr(oPsd).equals(user.getuPassword()))){
			String tip = "密码错误!";
			model.addAttribute("tip", tip);
			return "redirect:/admin/update.do";
			
		}else {
			String s = m.getkeyBeanofStr(nPsd);
			User user2 = userService.update(user, s);
			request.getSession().setAttribute("user", user2);
			model.addAttribute("tip", "修改成功");
			return "/admin/welcome";
		}
	}
	@RequestMapping("/logout.do")
	public String loginOut(){
		request.getSession().removeAttribute("user");
		return "redirect:/admin/login.do";
	}
	
}
