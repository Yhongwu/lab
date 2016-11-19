package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.Topic;
import com.sys.entity.TopicExample;
import com.sys.mapper.TopicMapper;

@Service
public class TopicServiceImp implements TopicService {
	
	
	@Autowired
	private TopicMapper topicMapper;

	public int insertTopic(Topic topic) {
		return topicMapper.insert(topic);
	}

	public List<Topic> list() {
		TopicExample topicExample = new TopicExample();
		topicExample.createCriteria();
		List<Topic> topics = topicMapper.selectByExampleWithBLOBs(topicExample);
		return topics;
	}

	public Topic getById(Integer id) {
		TopicExample example = new TopicExample();
		example.createCriteria().andTIdEqualTo(id);
		List<Topic> topic = topicMapper.selectByExampleWithBLOBs(example);
		return topic.get(0);
	}

	public int updateTopic(Topic topic) {
//		TopicExample example = new TopicExample();
//		example.createCriteria().andTIdEqualTo(topic.gettId());
		int i = topicMapper.updateByPrimaryKeySelective(topic);
		return i;
	}

	public int deleteById(Integer id) {
		int i = topicMapper.deleteByPrimaryKey(id);
		return i;
	}
	
	
	public void getByPage(){
		TopicExample example = new TopicExample();
		/*example.setPage(page);
		topicMapper.selectByExample(example);*/
	}
}
