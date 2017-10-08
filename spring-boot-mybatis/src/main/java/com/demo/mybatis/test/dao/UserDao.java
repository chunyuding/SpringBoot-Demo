package com.demo.mybatis.test.dao;

import java.util.List;

import com.demo.mybatis.test.bean.User;

public interface UserDao {

	public List<User> getAllUsers();

	public List<User> getUserByName(String name);
}
