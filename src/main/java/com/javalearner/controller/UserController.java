package com.javalearner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalearner.model.User;
import com.javalearner.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
	//saving user 
	@PostMapping()
	public User create(@RequestBody User user) {
		return userService.create(user);
	}
	
	//getting all users
	@GetMapping()
	public List<User> getUsers(){
		return this.userService.getUsers();
	}
	
	//getting user by it's id.
	@GetMapping({"/{username}"})
	public User getUserById(@PathVariable String username) {
		return this.userService.getUserById(username);
	}
	
	//updating user by it's id
	//if id is present, it will update that record otherwise create a new record.
	@PutMapping()
	public User updateUser(@RequestBody User user) {
		return this.userService.upadateUser(user);
	}
	
	@DeleteMapping("/{username}")
	public void deleteUserById(@PathVariable String username) {
		this.userService.deleteUserById(username);
	}
	

}
