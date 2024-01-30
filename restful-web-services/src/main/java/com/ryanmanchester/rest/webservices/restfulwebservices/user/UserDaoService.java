package com.ryanmanchester.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1, "Ryan", LocalDate.now().minusYears(38)));
		users.add(new User(2, "Cameron", LocalDate.now().minusYears(34)));
		users.add(new User(3, "Madison", LocalDate.now().minusYears(36)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public List<User> findUser(Integer id) {
		return users.stream().filter(user -> user.getId() == id).toList();
	}

}
