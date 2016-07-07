package com.henpengzay.erp.oa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.henpengzay.erp.entity.TestDemo;
import com.henpengzay.erp.oa.service.TestDemoService;

@Controller // @Service @Componet
@RequestMapping("/testDemo") // url:/模块/资源/{id}/细分 /testDemo/list
public class TestDemoController {
	
	@Autowired
	private TestDemoService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model){
		List<TestDemo> list = service.queryAll(0, 2);
		model.addAttribute("list", list);
		return "list";
	}
}
