package com.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.entity.Member;
import com.sys.entity.MemberExample;
import com.sys.entity.MemberExample.Criteria;
import com.sys.mapper.MemberMapper;
import com.sys.util.Page;
@Service
public class MemberServiceImp implements MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	public int insertMember(Member member){
		return memberMapper.insertSelective(member);
	}
	
	public List<Member> showMember(){
		MemberExample example = new MemberExample();
		List<Member> members = memberMapper.selectByExampleWithBLOBs(example);
		return members;
	}
	
	public Member getById(Integer id){
		Member member = memberMapper.selectByPrimaryKey(id);
		return member;
	}
	
	public int deleteById(Integer id){
		
		return memberMapper.deleteByPrimaryKey(id);
	}
	public int updateMember(Member member){
		int i = memberMapper.updateByPrimaryKeySelective(member);
		return i;
	}
	
	public List<Member> getByPage(Page page,Integer sort,String keyWords){
		MemberExample example = new MemberExample();
		Criteria createCriteria = example.createCriteria();
		if(sort!=null&&keyWords!=null){
			keyWords = "%"+keyWords+"%";
			if(sort==1||sort==2||sort==3||sort==4)
				createCriteria.andPositionEqualTo(sort);
			createCriteria.andNameLike(keyWords);
		}
		int total = memberMapper.countByExample(example);
		page.setTotal(total);
		
		example.setPage(page);
		List<Member> members = memberMapper.selectByExample(example);
		return members;
		
	}
	public int delBatch(List<Integer> ids){
		MemberExample example = new MemberExample();
		example.createCriteria().andMIdIn(ids);
		return memberMapper.deleteByExample(example);
	}
	public List<Member> getByPo(Integer i){
		MemberExample example = new MemberExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andPositionEqualTo(i);
		List<Member> members = memberMapper.selectByExampleWithBLOBs(example);
		return members;
		
	}
	public List<Member> search(String word){
		return memberMapper.search(word);
	}

}
