package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value="/hello1",method=RequestMethod.GET)
	@ResponseBody
    public String test(HttpServletRequest req,HttpServletResponse res){
    	req.getSession().setAttribute("hello", "ssssssss");
    	return "hello";
    }
	
	
	@RequestMapping(value="/hello2",method=RequestMethod.GET)
	@ResponseBody
    public String test2(HttpServletRequest req,HttpServletResponse res){
    	
    	return (String) req.getSession().getAttribute("hello");
    }
}
