package com.nagarro.nagp.cloudassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.nagp.cloudassignment.entity.User;

/**
 * The Interface UserRepository.
 *
 * @author sahilsharma
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
