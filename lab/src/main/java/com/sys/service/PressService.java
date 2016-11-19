package com.sys.service;

import java.util.List;

import com.sys.entity.Press;
import com.sys.util.Page;

public interface PressService {
	public List<Press> getAll();
	public int insert(Press press);
	public Press getById(Integer id);
	public int updatePress(Press press);
	public int deleteById(Integer id);
	public List<Press> getByPage(Page page,Integer sort,String keyWords,Integer status);
	public int delBatch(List<Integer> ids);
	public List<Press> search(String word);
	public List<Press> getByStatus();
}
