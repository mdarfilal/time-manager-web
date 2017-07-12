package fr.mdarfilal.time.manager.service;

import fr.mdarfilal.time.manager.model.User;

public interface IUserService {

	/**
	 * Find user by id
	 * 
	 * @param userName
	 * @return
	 */
	User getUser(String userName);

	/**
	 * Create a new user
	 * 
	 * @param user
	 */
	void createUser(User user);

	/**
	 * Delete user
	 * 
	 * @param userName
	 */
	void deleteUser(String userName);

}
