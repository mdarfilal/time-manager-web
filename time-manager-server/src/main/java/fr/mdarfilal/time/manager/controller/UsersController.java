package fr.mdarfilal.time.manager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.mdarfilal.time.manager.model.User;
import fr.mdarfilal.time.manager.service.IUserService;

@RestController
@RequestMapping("/users")
public class UsersController {

	Logger LOGGER = LoggerFactory.getLogger(UsersController.class);

	@Autowired
	IUserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/{userName}")
	public User getUser(@PathVariable String userName) {
		LOGGER.info("GET user");
		return userService.getUser(userName);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createUser(@RequestBody User user) {
		LOGGER.info("POST createUser");
		userService.createUser(user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{userName}")
	public void deleteUser(@PathVariable String userName) {
		LOGGER.info("DELETE deleteUser");
		userService.deleteUser(userName);
	}

}
