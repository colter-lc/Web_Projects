package com.lc.projects.mybatis.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lc.projects.mybatis.user.entity.User;
import com.lc.projects.mybatis.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	//UserService直接注入的也是UserMapper，对UserMapper进行了封装
//	@Autowired
//	private UserMapper userMapper;
	
	@RequestMapping(value="/getUser.do")
	@ResponseBody
	public User getUser(int id){
//		System.out.println("user id:"+id);
//		User user2 = userMapper.getUserById(id);
		User user = userService.getUserById(id);
		System.out.println(user);
		return user;
	}
	
	
//	public static void main(String[] args) {
//		InputStream in = UserController.class.getClassLoader().getResourceAsStream("Configuration.xml");
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//		SqlSession session = factory.openSession(true);
//		UserMapper userMapper = session.getMapper(UserMapper.class);
//		
//		User user = userMapper.selectByUserId(2);
//		System.out.println(user);
//		
//		userMapper.deleteUser(15);
//		session.close();
//		try {
//			in.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
