package com.rock.springmvc.entities;

import java.util.Arrays;

public class User {

	CharacterEncodingFiLter ii;
	private String userid;
	private String password;
	private String sex;
	private String age;
	private String []hobby;
	private String degree;
	@Override
	public String toString() {
		return "User [userid=" + userid + ", password=" + password + ", sex=" + sex + ", age=" + age + ", hobby="
				+ Arrays.toString(hobby) + ", degree=" + degree + "]";
	}
	public User(String userid) {
		super();
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public User(String userid, String password, String sex, String age, String[] hobby, String degree) {
		super();
		this.userid = userid;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.hobby = hobby;
		this.degree = degree;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
