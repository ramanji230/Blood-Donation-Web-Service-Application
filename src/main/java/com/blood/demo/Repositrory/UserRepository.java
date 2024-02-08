package com.blood.demo.Repositrory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blood.demo.Entitty.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//@Query(value = "select * from entries where username=:username LIMIT 1",nativeQuery = true)
	public User findByUsername(String username);

}
