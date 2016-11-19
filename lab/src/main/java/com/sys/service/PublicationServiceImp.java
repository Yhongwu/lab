package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.Photo;
import com.sys.entity.PhotoExample;
import com.sys.entity.Publication;
import com.sys.entity.PublicationExample;
import com.sys.entity.PublicationExample.Criteria;
import com.sys.mapper.PublicationMapper;
import com.sys.util.Page;

@Service
public class PublicationServiceImp implements PublicationService{

	@Autowired
	private PublicationMapper publicationMapper;
	
	public int insert(Publication publication){
		
		return publicationMapper.insert(publication);
	}
	public List<Publication> getAll(){
		PublicationExample example = new PublicationExample();
		example.createCriteria();
		List<Publication> publications = publicationMapper.selectByExample(example);
		return publications;
	}
	public Publication getById(Integer id){
		return publicationMapper.selectByPrimaryKey(id);
	}
	public int update(Publication publication){
		return publicationMapper.updateByPrimaryKeySelective(publication);
		
	}
	public int deleteById(Integer id){
		return publicationMapper.deleteByPrimaryKey(id);
		
	}
	public int delBatch(List<Integer> ids){
		PublicationExample example = new PublicationExample();
		example.createCriteria().andPIdIn(ids);
		int i = publicationMapper.deleteByExample(example);
		return i;
	}
	public List<Publication> getByPage(Page page,String year){
		PublicationExample example = new PublicationExample();
		Criteria createCriteria = example.createCriteria();
		if(year!=null&&!"".equals(year)&&!year.equals("0")){
			System.out.println("aa");
			createCriteria.andPYearEqualTo(year);
		}
		int total = publicationMapper.countByExample(example);
		page.setTotal(total);
		example.setPage(page);
		example.setOrderByClause("u_time desc");
		List<Publication> publications = publicationMapper.selectByExample(example);
		return publications;
	}
	public List<Publication> getByYear(String year){
		PublicationExample example = new PublicationExample();
		Criteria createCriteria = example.createCriteria();
		if(year!=null&&!"".equals(year)&&!year.equals("0")){
			System.out.println("aba");
			createCriteria.andPYearEqualTo(year);
		}
		int total = publicationMapper.countByExample(example);
		example.setOrderByClause("u_time desc");
		List<Publication> publications = publicationMapper.selectByExample(example);
		return publications;
	}
	public List<String> countByYear(){
		return publicationMapper.countByYear();
	}
	
	public List<Publication> search(String word){
		return publicationMapper.search(word);
	}
	
	public List<Publication> getPub(String year){
		PublicationExample example = new PublicationExample();
		Criteria createCriteria = example.createCriteria();
		if(year!=null&&!"".equals(year)){
			createCriteria.andPYearEqualTo(year);
		}
		return publicationMapper.selectByExample(example);
	}
}
