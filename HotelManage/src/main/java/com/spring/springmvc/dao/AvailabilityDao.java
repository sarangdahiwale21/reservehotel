package com.spring.springmvc.dao;

import java.sql.Date;

import com.spring.springmvc.model.Availability_T;

public interface AvailabilityDao {

	public Availability_T checkAvailability(int Id,Date date);
	
	public void saveAvailability(String query);
	
	public void saveAvailabilityAsObj(Availability_T av);
}
