package com.lc.android.login.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setUserName("xiaoming");
		user.setPassword("123");
		user.setStatus("OK");
		user.setMessage("Login Success.");
		
		
		User user2 = new User();
		user2.setId(2);
		user2.setUserName("xiaoming2");
		user2.setPassword("1232");
		user2.setStatus("OK2");
		user2.setMessage("Login Success2.");
		
		
		User user3 = new User();
		user3.setId(3);
		user3.setUserName("xiaoming3");
		user3.setPassword("1233");
		user3.setStatus("OK3");
		user3.setMessage("Login Success3.");
		
		
		String result = user.toJson();
		System.out.println(result);
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(JSONArray.fromObject(list));
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("a2");
		list2.add("b2");
		list2.add("c2");
		
		List<String> list3 = new ArrayList<String>();
		list3.add("a3");
		list3.add("b3");
		list3.add("c3");
		
		List<List<String>> all = new ArrayList<List<String>>();
		all.add(list);
		all.add(list2);
		all.add(list3);
		
		System.out.println(JSONArray.fromObject(all));
		
		List<User> luser = new ArrayList<User>();
		luser.add(user);
		luser.add(user2);
		luser.add(user3);
		
		System.out.println(JSONArray.fromObject(luser));
		
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("a", "a1");
		map.put("b", "b1");
		map.put("c", "c1");
		
		System.out.println(JSONObject.fromObject(map));
		
	}
}
