package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.T2EntityMapper;
import com.github.pagehelper.PageHelper;
import com.model.T2Entity;
import com.service.saservice;

@Service("t2Service") 
public class saserviceimpl implements saservice{
	@Resource 
	private T2EntityMapper T2mapper;
	@Override
	public List<T2Entity> sa(int page){
		System.out.println("sa");
		PageHelper.startPage(page, pagesize);
		return this.T2mapper.selectAll();
	}
	public int init(){
		return this.T2mapper.getcount();
	}
	public int Spage(){
		int apage;
		int it=init();
		apage=it/pagesize;
		if(it%pagesize!=0)
			apage+=1;
		return apage;
	}
	@Override
	public T2Entity selectByid(int id) {
		return this.T2mapper.selectByid(id);
	}
	@Override
	public void update(T2Entity record) {
		this.T2mapper.updateByPrimaryKey(record);
	}
	@Override
	public void delete(int id) {
		this.T2mapper.deleteByPrimaryKey(id);
	}
	@Override
	public void insert(T2Entity record) {
		this.T2mapper.insertSelective(record);
	}
	
}
