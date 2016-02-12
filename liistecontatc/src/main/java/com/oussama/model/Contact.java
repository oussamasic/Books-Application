package com.oussama.model;


public class Contact {
	
	private String pictureUrl;
	private String phoneNumber;
	private String firstname;
	private String lastname;
	private String company;
	
	public Contact(){}
	
	public Contact(String firstname, String lastname, String phoneNumber, String company){
		this.phoneNumber = phoneNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.company = company;
	}
	
	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String number) {
		this.phoneNumber = number;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}