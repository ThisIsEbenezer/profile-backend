package com.sam.profilebackend.service;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.profilebackend.dao.UserDAO;
import com.sam.profilebackend.model.UserContact;
import com.sam.profilebackend.model.VistorDetails;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;

	@Override
	public boolean addContact(UserContact userContact) {
		// TODO Auto-generated method stub
		return userDAO.addContact(userContact);
	}

	@Override
	public List<UserContact> viewConatct() {
		// TODO Auto-generated method stub
		return userDAO.viewConatct();
	}

	@Override
	public boolean addVistorDetails(VistorDetails vistorDetails) {
		// TODO Auto-generated method stub
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new java.util.Date());
		vistorDetails.setTimestamp(timeStamp.toString());
		return userDAO.addVistorDetails(vistorDetails);
	}

	@Override
	public List<VistorDetails> viewVistorDetails() {
		// TODO Auto-generated method stub
		return userDAO.viewVistorDetails();
	}

	@Override
	public int viewCountVistorDetails() {
		// TODO Auto-generated method stub
		return userDAO.viewCountVistorDetails();
	}

}
