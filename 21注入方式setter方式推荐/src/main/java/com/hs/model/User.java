package com.hs.model;

import java.util.*;

//@Component//(value = "hsUser")  //相当于<bean class="com.hs.model.User" id="user"/> (value = "hsUser")就是id=hsUser
public class User {

	private String user_name;
	private Integer user_id;
	private String[] hobbyArray;
	private List<String> hobbyList;
	private Set<String> hobbySet;
	private Map<String, Object> map;
	private Properties properties;  //Map<string,string>

	private Role hsRole;    //这是自定义类型

	private ITest hsTest;   //定义接口变量

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String[] getHobbyArray() {
		return hobbyArray;
	}

	public void setHobbyArray(String[] hobbyArray) {
		this.hobbyArray = hobbyArray;
	}

	public List<String> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}

	public Set<String> getHobbySet() {
		return hobbySet;
	}

	public void setHobbySet(Set<String> hobbySet) {
		this.hobbySet = hobbySet;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Role getHsRole() {
		return hsRole;
	}

	public void setHsRole(Role hsRole) {
		this.hsRole = hsRole;
	}

	public ITest getHsTest() {
		return hsTest;
	}

	public void setHsTest(ITest hsTest) {
		this.hsTest = hsTest;
	}

	@Override
	public String toString() {
		return "User{" +
				"user_name='" + user_name + '\'' +
				", user_id=" + user_id +
				", hobbyArray=" + Arrays.toString(hobbyArray) +
				", hobbyList=" + hobbyList +
				", hobbySet=" + hobbySet +
				", map=" + map +
				", properties=" + properties +
				", hsRole=" + hsRole +
				", hsTest=" + hsTest +
				'}';
	}
}
