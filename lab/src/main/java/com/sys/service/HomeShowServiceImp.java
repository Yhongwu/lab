package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.HomeShow;
import com.sys.entity.HomeShowExample;
import com.sys.mapper.HomeShowMapper;
@Service
public class HomeShowServiceImp implements HomeShowService{
	
	@Autowired
	private HomeShowMapper homeShowMapper;

	@Override
	public HomeShow findShow(){
		HomeShowExample example = new HomeShowExample();
		example.createCriteria();
		List<HomeShow> shows = homeShowMapper.selectByExample(example);
		if(shows.size()>0){
			return shows.get(0);
		}
		return null;
	}

	@Override
	public HomeShow getById(Integer id) {
		
		 HomeShow homeShow = null;
		 homeShow = homeShowMapper.selectByPrimaryKey(id);
		 return homeShow;
	}

	@Override
	public int updateShow(HomeShow homeShow) {
		int i = homeShowMapper.updateByPrimaryKey(homeShow);
		return i;
	}
	
}
