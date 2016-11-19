package com.sys.util;

import java.io.Serializable;
import java.util.List;

public class Pagination<E> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8367897865882152623L;
	
	private Integer total;
	
	private List<E> datas;
	
	private Page page;

	
	
	
	
	
	public Pagination(Integer total, Page page) {
		super();
		this.total = total;
		this.page = new Page(page.getOffset(), page.getLimit(), page.getPageNo());
	}

	
	
	
	public Pagination(Integer total, List<E> datas, Page page) {
		super();
		this.total = total;
		this.datas = datas;
		this.page = new Page(page.getOffset(), page.getLimit(), page.getPageNo());
	}




	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<E> getDatas() {
		return datas;
	}

	public void setDatas(List<E> datas) {
		this.datas = datas;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = new Page(page.getOffset(), page.getLimit(), page.getPageNo());
	}
	
	/**
	 * 获取页码总数
	 */
	public Integer getPageTotal(){
		
		return (getTotal()+this.getPage().getPageNo()-1)/this.getPage().getLimit();
	}

}
