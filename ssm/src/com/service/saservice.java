package com.service;

import java.util.List;

import com.model.T2Entity;

public interface saservice {
	public int pagesize=5;
	public List<T2Entity> sa(int page);
	public int init();
	public int Spage();
	public T2Entity selectByid(int id);
	public void update(T2Entity record);
	public void delete(int id);
	public void insert(T2Entity record);
}
