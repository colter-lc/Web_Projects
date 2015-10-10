package com.lc.projects.mybatis.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.projects.mybatis.user.entity.User;
import com.lc.projects.mybatis.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

	@Override
	public User getUserByUserId(String userId) {
		return null;
	}

	@Override
	public List<User> getUserByUserDomain(String userDomain) {
		return null;
	}

	@Override
	public void addUser(User user) {

	}

	@Override
	public void deleteUser(int id) {

	}

	@Override
	public List<User> getAllUser() {
		return null;
	}

}
