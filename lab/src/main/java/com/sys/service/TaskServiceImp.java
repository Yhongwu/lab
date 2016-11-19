package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.Task;
import com.sys.entity.TaskExample;
import com.sys.entity.TaskExample.Criteria;
import com.sys.mapper.TaskMapper;
import com.sys.util.Page;

@Service
public class TaskServiceImp implements TaskService {

	@Autowired
	private TaskMapper taskMapper;

	public int insert(Task task) {
		
		return taskMapper.insertSelective(task);
	}
	
	public List<Task> list(){
		TaskExample example = new TaskExample();
		List<Task> tasks = taskMapper.selectByExampleWithBLOBs(example);
		return tasks;
	}
	
	public Task getById(Integer tId){
		Task task = taskMapper.selectByPrimaryKey(tId);
		return task;
	}
	
	public int updateTask(Task task){
		return taskMapper.updateByPrimaryKeySelective(task);
	}
	
	public List<Task> getByPage(Page page,String keywords,Integer searchSort){
		TaskExample example = new TaskExample();
		Criteria createCriteria = example.createCriteria();
		if(keywords!=null){
			keywords = "%"+keywords+"%";
			createCriteria.andTitleLike(keywords);
		}
		if(searchSort!=null&&(searchSort==1||searchSort==0))
			createCriteria.andStatusEqualTo(searchSort);
		
		int total = taskMapper.countByExample(example);
		page.setTotal(total);
		example.setPage(page);
		List<Task> tasks = taskMapper.selectByExample(example);
		return tasks;
	}
	public int deleteById(Integer id){
		return taskMapper.deleteByPrimaryKey(id);
	}
	public List<Task> getByTask(){
//		Page page = new Page(3, 1);
		TaskExample example = new TaskExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andStatusEqualTo(1);
//		example.setPage(page);
		return taskMapper.selectByExampleWithBLOBs(example);
	}
	
	public List<Task> search(String word){
		return taskMapper.search(word);
	}

}
