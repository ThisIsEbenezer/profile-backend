package com.sam.profilebackend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sam.profilebackend.model.UserContact;
import com.sam.profilebackend.model.VistorDetails;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired //by type
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean addContact(UserContact userContact) {
		// TODO Auto-generated method stub
		int result = jdbcTemplate.update("insert into usercontact values(?,?,?,?,?)",userContact.getName(),userContact.getEmail(),userContact.getPhone(),userContact.getAddress(),userContact.getMessage());
		if(result > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<UserContact> viewConatct() {
		// TODO Auto-generated method stub
		List<UserContact> epList = null;
		
		epList = jdbcTemplate.query("select name, email, phone,address,message from usercontact", 
				new RowMapper<UserContact>() {
					@Override
					public UserContact mapRow(ResultSet rs, int arg1) throws SQLException {
						UserContact e = new UserContact();
						e.setName(rs.getString(1));
						e.setEmail(rs.getString(2));
						e.setPhone(rs.getString(3));
						e.setAddress(rs.getString(4));
						e.setMessage(rs.getString(5));
											
						return e;				
					}					
				});
		
		return epList;
	}

	@Override
	public boolean addVistorDetails(VistorDetails vistorDetails) {
		// TODO Auto-generated method stub
				int result = jdbcTemplate.update("insert into vistor values(?,?,?)",vistorDetails.getIpaddress(),vistorDetails.getLocation(),vistorDetails.getTimestamp());
				if(result > 0) {
					return true;
				} else {
					return false;
				}
	}

	@Override
	public List<VistorDetails> viewVistorDetails() {
		// TODO Auto-generated method stub
		List<VistorDetails> epList = null;
		
		epList = jdbcTemplate.query("select ipaddress, location, timestamp from vistor", 
				new RowMapper<VistorDetails>() {
					@Override
					public VistorDetails mapRow(ResultSet rs, int arg1) throws SQLException {
						VistorDetails e = new VistorDetails();
						e.setIpaddress(rs.getString(1));
						e.setLocation(rs.getString(2));
						e.setTimestamp(rs.getString(3));
											
						return e;				
					}					
				});
		
		return epList;
	}

	@Override
	public int viewCountVistorDetails() {
		// TODO Auto-generated method stub		
		List<VistorDetails> epList = null;
		
		epList = jdbcTemplate.query("select ipaddress, location, timestamp from vistor", 
				new RowMapper<VistorDetails>() {
					@Override
					public VistorDetails mapRow(ResultSet rs, int arg1) throws SQLException {
						VistorDetails e = new VistorDetails();
						e.setIpaddress(rs.getString(1));
						e.setLocation(rs.getString(2));
						e.setTimestamp(rs.getString(3));
											
						return e;				
					}					
				});
		
		return epList.size();
	}

}
