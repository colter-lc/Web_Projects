package com.lc.projects.mybatis.user.entity;

import com.lc.projects.mybatis.base.BaseObject;

public class User extends BaseObject {
	private static final long serialVersionUID = 5364862350671061653L;
	
	private Integer id;
	private String userId;
	private String userDomain;
	private String email;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserDomain() {
		return userDomain;
	}

	public void setUserDomain(String userDomain) {
		this.userDomain = userDomain;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", userDomain="
				+ userDomain + ", email=" + email + ", age=" + age + "]";
	}

}
