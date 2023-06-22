package com.javalearner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalearner.dao.UserDao;
import com.javalearner.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User create(User user) {
		return userDao.save(user);
	}

	public List<User> getUsers() {
		return this.userDao.findAll();
	}

	public User getUserById(String username) {
		return this.userDao.findById(username).get();
	}

	public User upadateUser(User user) {
		return this.userDao.save(user);
	}
	
	public void deleteUserById(String username) {
		this.userDao.deleteById(username);
	}

	
		
		
		
		
}
