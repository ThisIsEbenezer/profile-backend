package com.sam.profilebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.profilebackend.model.UserContact;
import com.sam.profilebackend.model.VistorDetails;
import com.sam.profilebackend.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@CrossOrigin(origins = "*")
	@PostMapping(value="profile/UserContact/", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addUserContact(@RequestBody UserContact userContact) {
		return userService.addContact(userContact);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="profile/UserContact/All/", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserContact> viewAllUserContact() {
		return userService.viewConatct();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value="profile/VistorDetails/", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addVistorDetails(@RequestBody VistorDetails vistorDetails) {
		return userService.addVistorDetails(vistorDetails);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="profile/VistorDetails/All/", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<VistorDetails> viewAllVistorDetails() {
		return userService.viewVistorDetails();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="profile/VistorDetails/Count/", produces=MediaType.APPLICATION_JSON_VALUE)
	public int viewCountVistorDetails() {
		return userService.viewCountVistorDetails();
	}
	
}
