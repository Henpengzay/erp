package com.henpengzay.erp.oa.service;

import java.util.List;
import com.henpengzay.erp.entity.TestDemo;
public interface TestDemoService {
	public List<TestDemo> queryAll(int offset,int limit);
}
