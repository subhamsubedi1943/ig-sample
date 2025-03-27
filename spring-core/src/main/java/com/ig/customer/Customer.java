package com.ig.customer;

public class Customer  {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String name;
	String email;
	public Customer(){
		
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}



}


