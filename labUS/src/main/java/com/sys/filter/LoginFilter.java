package com.sys.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sys.entity.User;

public class LoginFilter implements Filter {
	private final String key = "tatatech";
	
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();
		// 获得用户请求的URI
		String path = servletRequest.getRequestURI();
		System.out.println("path====="+path);
		// 从session里取用户信息
		if(path.indexOf("/login.do") > -1) {
			  chain.doFilter(servletRequest, servletResponse);
			  return;
		 }
		//User user = (User) session.getAttribute("user");
		//if(user==null) {
		//	System.out.println("login..................");
		//	servletResponse.sendRedirect("/sys/admin/login.do");
		//}else{
		//	chain.doFilter(request, response);
		//}
		String code = (String) session.getAttribute("code");
		
		if(code.equals(key)) {
			chain.doFilter(request, response);;
		} else {
			servletResponse.sendRedirect(servletRequest.getScheme() + "://" + servletRequest.getServerName() + 
					":" + servletRequest.getServerPort() + servletRequest.getContextPath() + "sys/admin/login.do" );
		}
		
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

}
