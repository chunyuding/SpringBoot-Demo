package com.demo.mybatis.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mybatis.test.bean.User;
import com.demo.mybatis.test.dao.UserDao;

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
}
