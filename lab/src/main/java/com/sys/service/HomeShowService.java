package com.sys.service;

import com.sys.entity.HomeShow;

public interface HomeShowService {
	
	public HomeShow findShow();
	public HomeShow getById(Integer id);
	public int updateShow(HomeShow homeShow);
}
