package com.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.sys.entity.User;
import com.sys.service.UserService;
import com.sys.util.MD5keyBean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/admin")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private HttpServletRequest request;
	@RequestMapping(value={"/login.do"},method=RequestMethod.GET)
	public String login(String msg,Model model){
		System.out.println(msg);
		model.addAttribute("msg", msg);
		return "/admin/login";
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
			
			//
			if(user.getuVersion().equals("US")) {
				String tatatech = "tatatech";
				return "redirect:" + request.getScheme() + "://" + request.getServerName() + 
						":" + request.getServerPort() + request.getContextPath() + "US" + "/admin/login.do?code=" + tatatech;
			}
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
