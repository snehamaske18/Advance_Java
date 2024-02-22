package com.jspiders.designpatterns.creational;

public class Contact {

	private String firstName;
	private String lastName;
	private String dob;
	private long mobile;
	private long home;
	private int landline;
	private String website;
	private String address;
	public Contact(String firstName, String lastName, String dob, long mobile, long home, int landline, String website,
			String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobile = mobile;
		this.home = home;
		this.landline = landline;
		this.website = website;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", mobile=" + mobile
				+ ", home=" + home + ", landline=" + landline + ", website=" + website + ", address=" + address + "]";
	}
	
	
}
