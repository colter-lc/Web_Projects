package com.lc.projects.mybatis.user.mapper;

import java.util.List;

import com.lc.projects.mybatis.user.entity.User;

public interface UserMapper {

	public User getUserById(int id);

	public User getUserByUserId(String userId);

	public List<User> getUserByUserDomain(String userDomain);

	public void addUser(User user);

	public void deleteUser(int id);

	public List<User> getAllUser();
}
