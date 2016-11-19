package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.Joins;
import com.sys.entity.JoinsExample;
import com.sys.entity.JoinsExample.Criteria;
import com.sys.mapper.JoinsMapper;
import com.sys.util.Page;

@Service
public class JoinsServiceImp implements JoinsService {

	@Autowired
	private JoinsMapper joinsMapper;
	
	public int insert(Joins join){
		return joinsMapper.insertSelective(join);
	}
	public List<Joins> getAll(){
		JoinsExample example = new JoinsExample();
		example.createCriteria();
		List<Joins> joins = joinsMapper.selectByExample(example);
		return joins;
	}
	public Joins getById(Integer id){
		return joinsMapper.selectByPrimaryKey(id);
	}
	public int update(Joins join){
		return joinsMapper.updateByPrimaryKeySelective(join);
	}
	public int delete(Integer id){
		return joinsMapper.deleteByPrimaryKey(id);
	}
	public int delBatch(List<Integer> ids){
		JoinsExample example = new JoinsExample();
		example.createCriteria().andJIdIn(ids);
		return joinsMapper.deleteByExample(example);
		
	}
	public List<Joins> getByPage(Page page,Integer sort,Integer po,String keywords){
		JoinsExample example = new JoinsExample();
		Criteria createCriteria = example.createCriteria();
		if(sort!=null&&keywords!=null){
			keywords = "%"+keywords+"%";
			if(sort==1||sort==0)
				createCriteria.andStatusEqualTo(sort);
			createCriteria.andJComLike(keywords);
		}
		if(po!=null){
			if(!po.equals("6"))
				createCriteria.andJPoEqualTo(po);
		}
		int total = joinsMapper.countByExample(example);
		page.setTotal(total);
		example.setPage(page);
		List<Joins> joins = joinsMapper.selectByExample(example);
		return joins;
	}
	public List<Joins> getByPo(Integer po){
		JoinsExample example = new JoinsExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andStatusEqualTo(1);
		createCriteria.andJPoEqualTo(po);
		List<Joins> joins = joinsMapper.selectByExample(example);
		return joins;
		
	}
	public List<Joins> search(String word){
		return joinsMapper.search(word);
	}
}
