package com.lc.projects.mybatis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class JedisUtils {
	@Autowired
	private JedisPool jedisPool;
	
	public synchronized Jedis getJedis(){
		System.out.println(jedisPool);
		return jedisPool.getResource();
	}
	
	
}
