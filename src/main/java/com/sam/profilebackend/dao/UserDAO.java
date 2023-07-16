package com.sam.profilebackend.dao;

import java.util.List;

import com.sam.profilebackend.model.UserContact;
import com.sam.profilebackend.model.VistorDetails;

public interface UserDAO {
	
	public boolean addContact(UserContact userContact);
	public List<UserContact> viewConatct();
	
	public boolean addVistorDetails(VistorDetails vistorDetails);
	public List<VistorDetails> viewVistorDetails();
	public int viewCountVistorDetails();

}
