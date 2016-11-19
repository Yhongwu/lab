package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.Member;
import com.sys.entity.Press;
import com.sys.entity.PressExample;
import com.sys.entity.PressExample.Criteria;
import com.sys.mapper.PressMapper;
import com.sys.util.Page;

@Service
public class PressServiceImp implements PressService {

	@Autowired
	private PressMapper pressMapper;

	public List<Press> getAll(){
		PressExample example = new PressExample();
		example.createCriteria();
		return pressMapper.selectByExampleWithBLOBs(example);
	}
	public int insert(Press press){
		return pressMapper.insertSelective(press);
	}
	public Press getById(Integer id){
		return pressMapper.selectByPrimaryKey(id);
	}
	public int updatePress(Press press){
		return pressMapper.updateByPrimaryKeySelective(press);
	}
	public int deleteById(Integer id){
		return pressMapper.deleteByPrimaryKey(id);
	}
	public List<Press> getByPage(Page page,Integer sort,String keyWords,Integer status){
		PressExample example = new PressExample();
		Criteria createCriteria = example.createCriteria();
		if(status!=null&&(status==1||status==0)){
			createCriteria.andPStatusEqualTo(status);
		}
		if(sort!=null&&keyWords!=null){
			keyWords = "%"+keyWords+"%";
			if(sort==1||sort==2){
				if(sort==1)
				example.setOrderByClause("p_time");
				else
				example.setOrderByClause("p_time desc");
			}
			createCriteria.andPTitleLike(keyWords);
		}
		int total = pressMapper.countByExample(example);
		page.setTotal(total);
		example.setPage(page);
		List<Press> presses = pressMapper.selectByExampleWithBLOBs(example);
		return presses;
	}
	public int delBatch(List<Integer> ids){
		PressExample example = new PressExample();
		example.createCriteria().andPIdIn(ids);
		return pressMapper.deleteByExample(example);
	}
	
	public List<Press> getByStatus(){
		PressExample example = new PressExample();
		example.createCriteria().andPStatusEqualTo(1);
		example.setOrderByClause("p_time desc");
		return pressMapper.selectByExample(example);
		
	}
	
	public List<Press> search(String word){
		return pressMapper.search(word);
	}
}
