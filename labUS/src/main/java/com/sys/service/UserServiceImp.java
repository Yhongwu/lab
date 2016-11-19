package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.User;
import com.sys.entity.UserExample;
import com.sys.mapper.UserMapper;
import com.sys.util.MD5keyBean;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper userMapper;
	public User login(User user){
		User u = getByName(user.getuName());
		if(u==null) return null;
		MD5keyBean m = new MD5keyBean();
		if(!(u.getuPassword().equals(m.getkeyBeanofStr(user.getuPassword()))))
//		if(!u.getuPassword().equals(user.getuPassword()))
			return null;
		else return u;
	}
	public User getByName(String name){
		UserExample example = new UserExample();
		example.createCriteria().andUNameEqualTo(name);
		List<User> user = userMapper.selectByExample(example);
		if(user.size()==0) return null;
		return user.get(0);
	}
	public User update(User user,String psd){
		User user2 = userMapper.selectByPrimaryKey(user.getuId());
		user2.setuPassword(psd);
		int i = userMapper.updateByPrimaryKey(user2);
		if(i!=0)
			return user2;
		else return null;
	}
}
