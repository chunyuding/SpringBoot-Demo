package com.demo.datajpa.test;

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
	private UserRepository user;

	@RequestMapping(value = "/getAllUser", method = RequestMethod.POST)
	public List<User> getAllUser() {
		List<User> users = user.findAll();
		return users;
	}

	@RequestMapping(value = "/findByName", method = RequestMethod.POST)
	public List<User> findByName(@RequestBody String name) {
		return user.findByName(name);
	}
}
