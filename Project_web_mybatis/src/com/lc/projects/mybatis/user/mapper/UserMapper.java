package com.lc.projects.mybatis.user.mapper;

import java.util.List;

import com.lc.projects.mybatis.user.entity.User;

public interface UserMapper {
	
	public User selectByUserId(int id);
	
	public User selectByUserDomain(String userDomain);
	
	public void addUser(User user);
	
	public void deleteUser(int id);
	
	public List<User> getAllUser();
}
