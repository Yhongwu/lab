package com.sys.service;

import java.util.List;

import com.sys.entity.Links;

public interface linkService {
	public int insert(Links link);
	public List<Links> getAll();
	public List<Links> getBySort(Integer sort);
	public Links getById(Integer id);
	public int update(Links link);
	public int delBatch(List<Integer> ids);
	public int deleteById(Integer id);
	public List<Links> getByStatus(Integer status);
}
