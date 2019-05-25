package com.nagarro.nagp.cloudassignment.service;

import java.util.List;

import com.nagarro.nagp.cloudassignment.entity.User;

public interface IUserService {

	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	List<User> getAllUsers();

	/**
	 * Adds the user.
	 *
	 * @return the user
	 */
	User addUser(User user);

}