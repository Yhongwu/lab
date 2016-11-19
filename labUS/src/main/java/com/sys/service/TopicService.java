package com.sys.service;


import java.util.List;

import com.sys.entity.Topic;

public interface TopicService {

	public int insertTopic(Topic topic);
	public List<Topic> list(); 
	public Topic getById(Integer id);
	public int updateTopic(Topic topic);
	public int deleteById(Integer id);
	
}
