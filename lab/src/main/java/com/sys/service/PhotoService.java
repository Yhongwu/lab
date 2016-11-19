package com.sys.service;

import java.util.List;

import com.sys.entity.Photo;
import com.sys.util.Page;

public interface PhotoService {
	public int insert(Photo photo);
	public List<Photo> getAll();
	public int update(Photo photo);
	public Photo getById(Integer id);
	public List<Photo> getByPage(Page page);
	public List<Photo> getByPage(Page page,Integer show,Integer leibie);
	public int delete(Integer id);
	public int delBatch(List<Integer> ids);
	public List<String> countByYear();
	public List<Photo> getPhtotos(String year,Integer liebie);
	public List<Photo> search(String word);
}
