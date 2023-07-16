package com.sam.profilebackend.model;

import java.security.Timestamp;

public class VistorDetails {
	
	private String ipaddress;
	private String location;
	private String timestamp;
	
	public VistorDetails(String ipaddress, String location, String timestamp) {
		super();
		this.ipaddress = ipaddress;
		this.location = location;
		this.timestamp = timestamp;
	}

	public VistorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "VistorDetails [ipaddress=" + ipaddress + ", location=" + location + ", timestamp=" + timestamp + "]";
	}
	
	
	
	
	

}
