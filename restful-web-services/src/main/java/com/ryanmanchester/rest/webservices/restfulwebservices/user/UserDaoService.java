package com.ryanmanchester.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
	
	
	public User saveUser(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public User findUser(int id) {
		return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
	}
	
	public void deleteById(int id) {
		User userToDelete = users.stream().filter(user -> user.getId() == id).findFirst().get();
		users.remove(userToDelete); 
	}

}
