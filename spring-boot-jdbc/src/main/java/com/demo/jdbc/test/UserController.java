package com.demo.jdbc.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/getAllUsers", method = RequestMethod.POST)
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@RequestMapping(value = "/getUserByName", method = RequestMethod.POST)
	public List<User> getUserByName(@RequestBody String name) {
		return userDao.getUserByName(name);
	}

	@RequestMapping(value = "/deleteUserByName", method = RequestMethod.POST)
	public void deleteUserByName(@RequestBody String name) {
		userDao.deleteUserByName(name);
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userDao.addUser(user);
	}

	@RequestMapping(value = "/updateUserByName", method = RequestMethod.POST)
	public void updateUserByName(@RequestBody User user) {
		userDao.updateUserByName(user);
	}
}
