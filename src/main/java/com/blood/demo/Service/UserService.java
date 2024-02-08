package com.blood.demo.Service;

import java.util.List;

import com.blood.demo.Entitty.User;

public interface UserService {

	public User saveUser(User user);
	public User updateUser(User user);
	public void deleteUser(User user);
	public User findById(long id);
	public List<User> findAll();
	public User findByUsername(String username);
	
}
