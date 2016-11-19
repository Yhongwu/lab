package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.HomeTopic;
import com.sys.entity.HomeTopicExample;
import com.sys.entity.HomeTopicExample.Criteria;
import com.sys.mapper.HomeTopicMapper;
import com.sys.util.Page;

@Service
public class HomeTopicServiceImp implements HomeTopicService {

	@Autowired
	HomeTopicMapper homeTopicMapper;
	
	public List<HomeTopic> getAll(){
		HomeTopicExample example = new HomeTopicExample();
		example.createCriteria();
		return homeTopicMapper.selectByExample(example);
	}
	
	public int insert(HomeTopic homeTopic){
		return homeTopicMapper.insertSelective(homeTopic);
	}
	public int update(HomeTopic homeTopic){
		return homeTopicMapper.updateByPrimaryKeySelective(homeTopic);
	}
	public HomeTopic getById(Integer id){
		return homeTopicMapper.selectByPrimaryKey(id);
	}
	public int delete(Integer id){
		return homeTopicMapper.deleteByPrimaryKey(id);
	}
	public List<HomeTopic> getByPage(Page page,Integer sort,String keywords){
		HomeTopicExample example = new HomeTopicExample();
		Criteria createCriteria = example.createCriteria();
		if(sort!=null&&keywords!=null){
			keywords = "%"+keywords+"%";
			if(sort==1||sort==0)
				createCriteria.andHStatusEqualTo(sort);
			createCriteria.andHTitleLike(keywords);
		}
		int total = homeTopicMapper.countByExample(example);
		page.setTotal(total);
		example.setPage(page);
		return homeTopicMapper.selectByExample(example);
	}
	public int delBatch(List<Integer> ids){
		HomeTopicExample example = new HomeTopicExample();
		example.createCriteria().andHIdIn(ids);
		return homeTopicMapper.deleteByExample(example);
	}
	public List<HomeTopic> home(){
		Page page = new Page(5, 1);
		HomeTopicExample example = new HomeTopicExample();
		example.createCriteria().andHStatusEqualTo(1);
		example.setPage(page);
		example.setOrderByClause("h_number");
		return homeTopicMapper.selectByExample(example);
	}
	
	public List<HomeTopic> search(String word){
//		HomeTopicExample example = new HomeTopicExample();
//		example.createCriteria().
		List<HomeTopic> topics = homeTopicMapper.search(word);
		return topics;
		
	}
}
