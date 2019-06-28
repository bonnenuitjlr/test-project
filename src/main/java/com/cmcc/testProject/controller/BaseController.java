package com.cmcc.testProject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmcc.testProject.entity.Man;


@RestController
@RequestMapping("/base")
public class BaseController {
	
	@GetMapping(value = "/get/{name}")
	public String get(@PathVariable String name) {
		return "Hi " + name + "!";
	}
	
	@PostMapping(value = "/post")
	public String post(@RequestBody Man man) {
		return man.getName() + " : " + man.getAge();
	}
	
	@DeleteMapping(value = "/delete/{name}")
	public String delete(@PathVariable String name) {
		return "准备删除的人的名字: " + name;
	}
	
}
