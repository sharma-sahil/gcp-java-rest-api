package com.nagarro.nagp.cloudassignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.cloudassignment.entity.User;
import com.nagarro.nagp.cloudassignment.repository.UserRepository;
import com.nagarro.nagp.cloudassignment.service.IUserService;

/**
 * The Class UserService.
 *
 * @author sahilsharma
 */
@Service
public class UserService implements IUserService {

	/** The user repo. */
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUsers() {
		return this.userRepo.findAll();
	}

	@Override
	public User addUser(User user) {
		return this.userRepo.save(user);
	}

	@Override
	public User getUser() {
		User user = new User();
		user.setFirstName("First");
		user.setLastName("Last");
		user.setCity("City");
		user.setState("State");
		user.setCountry("Country");
		return user;
	}

}
