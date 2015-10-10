package com.lc.projects.mybatis.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lc.projects.mybatis.user.entity.User;

public interface UserService {
	
	public User getUserById(int id);

	public User getUserByUserId(String userId);

	public List<User> getUserByUserDomain(String userDomain);

	public void addUser(User user);

	public void deleteUser(int id);

	public List<User> getAllUser();
}
