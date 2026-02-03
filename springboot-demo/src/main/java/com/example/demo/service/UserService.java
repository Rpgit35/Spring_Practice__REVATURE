package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User(1,"Rajendra"));
		users.add(new User(2,"Kumar"));
	}
		
		public List<User> getAllUsers(){
			return users;
		}
		
		public User addUser(User user) {
			users.add(user);
			return user;
		}
	
	

}
