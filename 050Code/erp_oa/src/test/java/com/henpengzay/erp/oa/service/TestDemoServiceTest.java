package com.henpengzay.erp.oa.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.henpengzay.erp.entity.TestDemo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:spring/spring-dao.xml","classpath:spring/spring-service.xml" })
public class TestDemoServiceTest {
	
	@Autowired
	private TestDemoService service;
	@Test
	public void testQueryAll(){
		List<TestDemo> list = service.queryAll(0, 2);
		for(TestDemo t : list){
			System.out.println(t.getName());
		}
	}
}
