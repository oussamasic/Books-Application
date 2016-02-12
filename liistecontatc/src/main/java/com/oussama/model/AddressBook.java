package com.oussama.model;


import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	
	private List<Contact> contacts = new ArrayList<Contact>();

	public void initialize(){
		
		Contact johnny = new Contact("Johnny", "English", "07 00 76 06 00" , "M5");
		johnny.setPictureUrl("/images/johnny.jpg");
		
		Contact james = new Contact("James", "Bond", "00 70 07 00 07", "M6");
		james.setPictureUrl("/images/james.jpg");
		
		Contact clark = new Contact("Clark", "Kent", "05 06 07 08 99", "Daily Mail");
		clark.setPictureUrl("/images/superman.jpg");
		
		Contact tony = new Contact("Tony", "Stark", "05 66 75 23 91", "Stark industries");
		tony.setPictureUrl("/images/ironman.jpg");
		
		Contact peter = new Contact("Peter", "Parker", "05 87 18 45 92", "Daily Bugle");
		peter.setPictureUrl("/images/spiderman.png");

		this.contacts.add(johnny);
		this.contacts.add(james);
		this.contacts.add(clark);
		this.contacts.add(tony);
		this.contacts.add(peter);
		
	}
	
	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}