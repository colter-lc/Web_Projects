package com.lc.projects.mybatis.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.projects.mybatis.utils.JedisUtils;


@Controller
@RequestMapping(value="/web")
public class WebController {
	
	@Autowired
	private JedisUtils jedisUtils;
	
	@RequestMapping(value="/getWeb.do")
	public void getWeb(){
		System.out.println(jedisUtils);
		System.out.println(jedisUtils.getJedis());
	}
}
