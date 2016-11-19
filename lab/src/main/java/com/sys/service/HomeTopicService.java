package com.sys.service;

import java.util.List;

import com.sys.entity.HomeTopic;
import com.sys.util.Page;

public interface HomeTopicService {
	public List<HomeTopic> getAll();
	public int insert(HomeTopic homeTopic);
	public int update(HomeTopic homeTopic);
	public HomeTopic getById(Integer id);
	public int delete(Integer id);
	public List<HomeTopic> getByPage(Page page,Integer sort,String keywords);
	public int delBatch(List<Integer> ids);
	public List<HomeTopic> home();
	public List<HomeTopic> search(String word);
}
