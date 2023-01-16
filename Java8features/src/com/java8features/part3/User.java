package com.java8features.part3;

import java.util.List;

public class User {
	String id;
	String phoneno;
	List<String> email;
	
	
	public User(String id, String phoneno, List<String> email) {
		super();
		this.id = id;
		this.phoneno = phoneno;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", phoneno=" + phoneno + ", email=" + email + "]";
	}

	


}
