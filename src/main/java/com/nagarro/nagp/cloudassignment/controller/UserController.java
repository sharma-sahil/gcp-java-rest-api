package com.nagarro.nagp.cloudassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.cloudassignment.entity.User;
import com.nagarro.nagp.cloudassignment.service.IUserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private IUserService userService;

	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	@GetMapping()
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(this.userService.getAllUsers(), HttpStatus.OK);
	}

	/**
	 * Adds the user.
	 *
	 * @param user the user
	 * @return the response entity
	 */
	@PostMapping()
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<>(this.userService.addUser(user), HttpStatus.CREATED);
	}

	@GetMapping("/test")
	public ResponseEntity<User> getUser() {
		return new ResponseEntity<>(this.userService.getUser(), HttpStatus.CREATED);
	}

}
