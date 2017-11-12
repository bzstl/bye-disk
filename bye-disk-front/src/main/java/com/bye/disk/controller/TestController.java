package com.bye.disk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bye.common.pojo.Result;
import com.bye.disk.service.TestServiceImpl;

@Controller
public class TestController {
	@Autowired
	TestServiceImpl testServiceImpl;
	@RequestMapping("/testhttp")
	public @ResponseBody Result getName() {
		
		return Result.ok(testServiceImpl.find());
	}
}
