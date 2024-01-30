package com.ryanmanchester.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	private UserDaoService userService;
	
	public UserResource(UserDaoService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public List<User> retrieveUser(@PathVariable Integer id) {
		return userService.findUser(id);
	}

}
