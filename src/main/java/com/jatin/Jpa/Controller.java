package com.jatin.Jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	UserDao userDao;

	@GetMapping("/")
	public String hello() {
		return "hello world..................";
	}
	@GetMapping("/hello")
	public User helloWorld() {
		return userDao.findById(1).get();
	}

}
