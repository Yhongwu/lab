package com.sys.service;

import java.util.List;

import com.sys.entity.Publication;
import com.sys.util.Page;

public interface PublicationService {
	public List<Publication> getAll();
	public int insert(Publication publication);
	public Publication getById(Integer id);
	public int update(Publication publication);
	public int deleteById(Integer id);
	public int delBatch(List<Integer> ids);
	public List<Publication> getByPage(Page page,String year);
	public List<Publication> getByYear(String year);
	public List<String> countByYear();
	public List<Publication> search(String word);
}
