package com.bye.disk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bye.disk.mapper.TestMapper;
import com.bye.disk.pojo.Test;
import com.bye.disk.pojo.TestExample;
@Service
public class TestServiceImpl {
	@Autowired
	TestMapper testMapper;
	
	public String find() {
		Test result = testMapper.selectByPrimaryKey("1");
		return result.getName();
	}
}
