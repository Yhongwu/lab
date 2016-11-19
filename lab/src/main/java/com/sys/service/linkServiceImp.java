package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.RequestToViewNameTranslator;

import com.sys.entity.Links;
import com.sys.entity.LinksExample;
import com.sys.entity.LinksExample.Criteria;
import com.sys.mapper.LinksMapper;

@Service
public class linkServiceImp implements linkService {

	@Autowired
	private LinksMapper linksMapper;
	
	public int insert(Links link){
		return linksMapper.insertSelective(link);
	}
	
	public List<Links> getAll(){
		LinksExample example = new LinksExample();
		example.createCriteria();
		List<Links> links = linksMapper.selectByExample(example);
		return links;
	}
	public List<Links> getBySort(Integer sort){
		LinksExample example = new LinksExample();
		Criteria createCriteria = example.createCriteria();
		if(sort!=null){
			if(sort==0||sort==1){
				createCriteria.andStatusEqualTo(sort);
			}			
		}
		List<Links> links = linksMapper.selectByExample(example);
		return links;
	}
	public Links getById(Integer id){
		return linksMapper.selectByPrimaryKey(id);
	}
	public int update(Links link){
		return linksMapper.updateByPrimaryKeySelective(link);
	}
	public int delBatch(List<Integer> ids){
		LinksExample example = new LinksExample();
		example.createCriteria().andLIdIn(ids);
		int i = linksMapper.deleteByExample(example);
		return i;
	}
	public int deleteById(Integer id){
		return linksMapper.deleteByPrimaryKey(id);
	}
	public List<Links> getByStatus(Integer status){
		LinksExample example = new LinksExample();
		example.createCriteria().andStatusEqualTo(status);
		List<Links> links = linksMapper.selectByExample(example);
		return links;
	}
}
