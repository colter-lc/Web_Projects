package com.lc.projects.mybatis.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lc.projects.mybatis.user.entity.User;
import com.lc.projects.mybatis.user.service.UserService;
import com.lc.projects.mybatis.utils.JedisUtils;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JedisUtils jedisUtils;

	//UserService直接注入的也是UserMapper，对UserMapper进行了封装
	//	@Autowired
	//	private UserMapper userMapper;
	
	@RequestMapping(value="/getUser.do")
	@ResponseBody
	public User getUser(int id){

		User user = userService.getUserById(id);
		System.out.println(user);
		System.out.println(jedisUtils);
		System.out.println(jedisUtils.getJedis());
		return user;
	}
	
	@RequestMapping(value="/addUser.do",method={RequestMethod.POST})
	public void addUser(User user){
		System.out.println(user);
		userService.addUser(user);
	}
	
}
