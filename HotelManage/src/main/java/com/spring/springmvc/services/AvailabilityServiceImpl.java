package com.spring.springmvc.services;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springmvc.dao.AvailabilityDao;
import com.spring.springmvc.model.Availability_T;
@Service
public class AvailabilityServiceImpl implements AvailabilityService {
	@Autowired
	AvailabilityDao availabilityDao;
	@Transactional
	public Availability_T checkAvailability(int Id, Date date) {
		
		return availabilityDao.checkAvailability(Id, date);
	}
	@Transactional
	public void saveAvailability(String query) {
		availabilityDao.saveAvailability(query);
	}
	@Transactional
	public void saveAvailabilityAsObj(Availability_T av) {
		
		availabilityDao.saveAvailabilityAsObj(av);
	}
}
