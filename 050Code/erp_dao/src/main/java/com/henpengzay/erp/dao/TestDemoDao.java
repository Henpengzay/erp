package com.henpengzay.erp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henpengzay.erp.entity.TestDemo;

public interface TestDemoDao {
	public List<TestDemo> queryAll(@Param("offset")int offset,@Param("limit")int limit);
}
