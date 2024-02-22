package com.jspiders.serializationdeserialization.object;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String name;
	private long mobile;
	private String email;
	public User(int id, String name, long mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}
	

}
