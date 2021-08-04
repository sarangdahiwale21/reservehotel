package com.spring.springmvc.services;

import java.sql.Date;

import com.spring.springmvc.model.Availability_T;

public interface AvailabilityService {
	public Availability_T checkAvailability(int Id,Date date);
	
	public void saveAvailability(String query);
	
	public void saveAvailabilityAsObj(Availability_T av);
}
