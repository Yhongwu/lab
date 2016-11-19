package com.sys.service;

import java.util.List;

import com.sys.entity.Member;
import com.sys.util.Page;

public interface MemberService {
	public int insertMember(Member member);
	public List<Member> showMember();
	public Member getById(Integer id);
	public int deleteById(Integer id);
	public int updateMember(Member member);
	public List<Member> getByPage(Page page,Integer sort,String keyWords);
	public int delBatch(List<Integer> ids);
	public List<Member> getByPo(Integer i);
	public List<Member> search(String word);	
}
