package com.ryanmanchester.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static int userCount = 0;
	
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(++userCount, "Ryan", LocalDate.now().minusYears(38)));
		users.add(new User(++userCount, "Cameron", LocalDate.now().minusYears(34)));
		users.add(new User(++userCount, "Madison", LocalDate.now().minusYears(36)));
	}
	
	
	public List<User> findAll() {
		return users;
	}
	
	public User findUser(int id) {
		return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
	}
	
	public User saveUser(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}

}
