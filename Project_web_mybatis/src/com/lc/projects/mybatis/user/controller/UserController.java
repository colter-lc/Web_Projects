package com.lc.projects.mybatis.user.controller;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lc.projects.mybatis.user.entity.User;
import com.lc.projects.mybatis.user.mapper.UserMapper;

public class UserController {
	public static void main(String[] args) {
		InputStream in = UserController.class.getClassLoader().getResourceAsStream("Configuration.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = factory.openSession(true);
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		User user = userMapper.selectByUserId(2);
		System.out.println(user);
		
		userMapper.deleteUser(15);
		session.close();
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
