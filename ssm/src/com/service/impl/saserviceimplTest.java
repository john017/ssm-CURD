package com.service.impl;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.T2EntityMapper;
import com.service.saservice;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class saserviceimplTest {

	@Resource(name="t2Service")
	  private saservice t2Service;
	@Resource
	  private T2EntityMapper T2EntityMapper;
	@Test
	public void testSa() {
		System.out.println(t2Service.sa(1).size());
	}
	

}
