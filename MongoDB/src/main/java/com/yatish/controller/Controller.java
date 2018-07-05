package com.yatish.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yatish.pojos.Human;
import com.yatish.service.StudentServiceImpl;

@RestController
public class Controller {

	@Autowired
	private StudentServiceImpl studentService;
	
	@RequestMapping("/execute")
	public String handle() {
		studentService.save(); 
		//studentService.get();
		return "Success";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/post")
	public String handlePOST(@RequestBody @Valid Human obj) {
		
		return "Success";
	}
}
