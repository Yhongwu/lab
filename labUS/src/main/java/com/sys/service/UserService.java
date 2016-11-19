package com.sys.service;

import com.sys.entity.User;

public interface UserService {
	public User login(User user);
	public User update(User user,String psd);
}
