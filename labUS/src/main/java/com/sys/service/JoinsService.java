package com.sys.service;

import java.util.List;

import com.sys.entity.Joins;
import com.sys.util.Page;


public interface JoinsService {
	public int insert(Joins join);
	public List<Joins> getAll();
	public Joins getById(Integer id);
	public int update(Joins join);
	public int delete(Integer id);
	public int delBatch(List<Integer> ids);
	public List<Joins> getByPage(Page page,Integer sort,Integer po,String keywords);
	public List<Joins> getByPo(Integer po);
	public List<Joins> search(String word);
}
