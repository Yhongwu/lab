package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.Photo;
import com.sys.entity.PhotoExample;
import com.sys.entity.PhotoExample.Criteria;
import com.sys.mapper.PhotoMapper;
import com.sys.util.Page;

@Service
public class PhotoServiceImp implements PhotoService {

	@Autowired
	private PhotoMapper photoMapper;
	
	public int insert(Photo photo){
		return photoMapper.insertSelective(photo);
	}
	public List<Photo> getAll(){
		PhotoExample example = new PhotoExample();
		example.createCriteria();
		List<Photo> photos = photoMapper.selectByExample(example);
		return photos;
	}
	public int update(Photo photo){
		return photoMapper.updateByPrimaryKey(photo);
	}
	public Photo getById(Integer id){
		return photoMapper.selectByPrimaryKey(id);
	}
	public List<Photo> getByPage(Page page){
		PhotoExample example = new PhotoExample();
		example.createCriteria();
		int total = photoMapper.countByExample(example);
		page.setTotal(total);
		example.setPage(page);
		return photoMapper.selectByExample(example);
	}
	public List<Photo> getByPage(Page page,Integer show,Integer leibie){
		PhotoExample example = new PhotoExample();
		Criteria createCriteria = example.createCriteria();
		if(show!=null&&(show==1||show==0)){
			createCriteria.andPStatusEqualTo(show);
		}
		if(leibie!=null&&(leibie==1||leibie==0)){
			createCriteria.andPLaborteamEqualTo(leibie);
		}
		int total = photoMapper.countByExample(example);
		page.setTotal(total);
		example.setPage(page);
		return photoMapper.selectByExample(example);
	}
	public int delete(Integer id){
		return photoMapper.deleteByPrimaryKey(id);
	}
	public int delBatch(List<Integer> ids){
		PhotoExample example = new PhotoExample();
		example.createCriteria().andPIdIn(ids);
		return photoMapper.deleteByExample(example);
	}
	public List<Photo> getPhtotos(String year,Integer liebie){
		PhotoExample example = new PhotoExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andPStatusEqualTo(1);
		if(year!=null&&!"".equals(year)){
			createCriteria.andPYearEqualTo(year);
		}
		createCriteria.andPLaborteamEqualTo(liebie);
		return photoMapper.selectByExample(example);
	}
	
	public List<String> countByYear(){
		return photoMapper.countByYear();
	}
	
	public List<Photo> search(String word){
		return photoMapper.search(word);
	}
}
