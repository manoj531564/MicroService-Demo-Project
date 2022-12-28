package com.in28minutes.rest.webservice.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService daoService;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return daoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User findUser(@PathVariable int id){
		return daoService.findOne(id) ;
		
	}
}