package com.henpengzay.erp.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henpengzay.erp.dao.TestDemoDao;
import com.henpengzay.erp.entity.TestDemo;
import com.henpengzay.erp.oa.service.TestDemoService;

@Service
public class TestDemoServiceImpl implements TestDemoService {

	@Autowired
	private TestDemoDao dao;
	
	public List<TestDemo> queryAll(int offset, int limit) {
		return dao.queryAll(offset, limit);
	}

}
