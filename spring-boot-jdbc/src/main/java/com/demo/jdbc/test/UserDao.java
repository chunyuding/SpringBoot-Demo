package com.demo.jdbc.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> getAllUsers() {
		return jdbcTemplate.query("SELECT * FROM USER", new UserRowMapper());
	}

	public List<User> getUserByName(String name) {
		return jdbcTemplate.query("SELECT * FROM USER WHERE `name`=" + name, new UserRowMapper());
	}

	public void deleteUserByName(String name) {
		jdbcTemplate.execute("DELETE	FROM USER   WHERE `name`=" + name);
	}

	public void addUser(User user) {
		jdbcTemplate.update("INSERT INTO USER (name,age,sex,height,email) VALUES (" + "'" + user.getName() + "'" + ","
				+ user.getAge() + "," + "'" + user.getSex() + "'" + "," + user.getHeight() + "," + "'" + user.getEmail()
				+ "'" + ")");
	}

	public void updateUserByName(User user) {
		jdbcTemplate.update("UPDATE USER SET `age`=" + user.getAge() + " , `sex`=" + "'" + user.getSex() + "'"
				+ ",`height`=" + user.getHeight() + ",`email`=" + "'" + user.getEmail() + "'" + " WHERE `name`=" + "'"
				+ user.getName() + "'");
	}

	class UserRowMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet res, int rowNum) throws SQLException {
			User user = new User();
			user.setId(res.getLong("id"));
			user.setName(res.getString("name"));
			user.setAge(res.getInt("age"));
			user.setHeight(res.getDouble("height"));
			user.setSex(res.getString("sex"));
			user.setEmail(res.getString("email"));
			return user;
		}
	}
}
