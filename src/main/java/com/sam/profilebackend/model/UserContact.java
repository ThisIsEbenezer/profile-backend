package com.sam.profilebackend.model;

public class UserContact {
	
	private String name;
	private String address;
	private String phone;
	private String email;
	private String message;
	
	
	public UserContact(String name, String address, String phone, String email, String message) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.message = message;
	}
	
	
	public UserContact() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "UserContact [name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ ", message=" + message + "]";
	}
	
	
	

}
