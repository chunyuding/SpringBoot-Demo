package com.demo.datajpa.test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * 
	 * @ToDo DataJPA还有很多用法，不再赘述，仅满足测试！
	 * @Author dingchunyu
	 * @param name
	 * @return
	 * @Return List<User>
	 */
	public List<User> findByName(String name);
}
