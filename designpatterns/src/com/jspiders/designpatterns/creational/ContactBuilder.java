package com.jspiders.designpatterns.creational;

public class ContactBuilder {

	private String firstName;
	private String lastName;
	private String dob;
	private long mobile;
	private long home;
	private int landline;
	private String website;
	private String address;
	public String getFirstName() {
		return firstName;
	}
	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getLastName() {
		return lastName;
	}
	public  ContactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public String getDob() {
		return dob;
	}
	public  ContactBuilder setDob(String dob) {
		this.dob = dob;
		return this;
	}
	public long getMobile() {
		return mobile;
	}
	public  ContactBuilder setMobile(long mobile) {
		this.mobile = mobile;
		return this;
	}
	public long getHome() {
		return home;
	}
	public  ContactBuilder setHome(long home) {
		this.home = home;
		return this;
	}
	public int getLandline() {
		return landline;
	}
	public  ContactBuilder setLandline(int landline) {
		this.landline = landline;
		return this;
	}
	public String getWebsite() {
		return website;
	}
	public  ContactBuilder setWebsite(String website) {
		this.website = website;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public  ContactBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	public Contact buildContact() {
		return new Contact(firstName,lastName,dob,mobile,home,landline,address,website);
	}
	
	
	
}
