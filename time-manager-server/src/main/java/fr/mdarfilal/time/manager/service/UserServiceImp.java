package fr.mdarfilal.time.manager.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mdarfilal.time.manager.dao.IUserDao;
import fr.mdarfilal.time.manager.model.User;

@Service
public class UserServiceImp implements IUserService {

	Logger LOGGER = LoggerFactory.getLogger(UserServiceImp.class);

	@Autowired
	IUserDao userDao;

	@Override
	public User getUser(String userName) {
		return userDao.findByUserName(userName);
	}

	@Override
	public void createUser(User user) {
		if (user != null) {
			LOGGER.info("Creation a new user");
			userDao.save(user);
		}
	}

	@Override
	public void deleteUser(String userName) {
		User user = getUser(userName);
		if (user != null) {
			LOGGER.info("Deleting user");
			userDao.delete(user);
		} else {
			LOGGER.info("User doesn't exist !!");
		}
	}
}
