package com.sys.service;

import java.util.List;

import com.sys.entity.Task;
import com.sys.util.Page;

public interface TaskService {

	/**
	 * 添加课题
	 * @param task
	 * @return
	 */
	public int insert(Task task);
	public List<Task> list();
	public Task getById(Integer tId);
	public int updateTask(Task task);
	public List<Task> getByPage(Page page,String keywords,Integer searchSort);
	public int deleteById(Integer id);
	public List<Task> getByTask();
	public List<Task> search(String word);
}
