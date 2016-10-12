package com.dao;

import java.util.List;

import com.model.T2Entity;

public interface T2EntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(T2Entity record);
    
    int insertT2Str(T2Entity record);

    int insertSelective(T2Entity record);

    T2Entity selectByid(Integer id);
    
    List<T2Entity> selectAll();
    
    List<T2Entity> selectSearch(String string);
    
    int getcount();

    int updateByPrimaryKeySelective(T2Entity record);

    int updateByPrimaryKey(T2Entity record);
}