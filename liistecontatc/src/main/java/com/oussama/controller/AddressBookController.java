package com.oussama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oussama.model.AddressBook;

@Controller
public class AddressBookController {

	@RequestMapping(value = "addressBook", method = RequestMethod.GET)
	public String showAddressBook(final Model model){
		
		AddressBook addressBook = getContactsList();
		
		model.addAttribute("addressBook", addressBook);
		
		String addressBookTitle = "My super heros contacts";
		
		// pass a address book header as String to be rendred by Thymeleaf
		
		model.addAttribute("addressBookTitle", addressBookTitle);
		
		return "addressBook";
		
	}
	
	private AddressBook getContactsList() {
		// TODO Auto-generated method stub
		
		AddressBook addressBook = new AddressBook();
		addressBook.initialize();
		
		return addressBook;
	}
}