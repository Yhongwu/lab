package com.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.Info;
import com.sys.entity.InfoExample;
import com.sys.mapper.InfoMapper;

@Service
public class InfoServiceImp implements InfoService {

	@Autowired
	private InfoMapper infoMapper;
	
	public int update(Info info){
		return infoMapper.updateByPrimaryKeySelective(info);
	}
	public Info getOne(){
		InfoExample example = new InfoExample();
		example.createCriteria();
		int i = infoMapper.countByExample(example);
		if(i<=0) return null;
		return infoMapper.selectByExample(example).get(0);
	}
}
