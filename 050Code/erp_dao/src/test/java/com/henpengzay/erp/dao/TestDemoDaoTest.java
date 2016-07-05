package com.henpengzay.erp.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.henpengzay.erp.entity.TestDemo;

public class TestDemoDaoTest extends BaseTest{
	
	
	
	@Autowired
	private TestDemoDao dao;
	
	@Test
	public void testQueryAll(){
		List<TestDemo> 	list =dao.queryAll(0, 2);
		for(TestDemo t:list){
			System.out.println(t.getName());
		}
	}
}
