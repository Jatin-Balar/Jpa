package com.jatin.Jpa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	UserRepo repo;
	

	public Controller(UserRepo repo) {
		this.repo = repo;
	}


	@GetMapping("/")
	public String hello() {
		return "hello world..................";
	}
	
	@GetMapping("/hello")
	public User helloWorld() {
		return repo.findById(1).get();
	}


}
