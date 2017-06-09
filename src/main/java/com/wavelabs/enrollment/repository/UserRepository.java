package com.wavelabs.enrollment.repository;

import org.springframework.data.repository.CrudRepository;

import com.wavelabs.enrollment.entity.LoginType;
import com.wavelabs.enrollment.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByFirstName(String FirstName);

	/**
	 * For checking the user validation with the email and password.
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	User findByEmailAndPassword(String email, String password);

	public User findByEmail(String InputEmail);

	User findByLoginType(LoginType logintype);

}
