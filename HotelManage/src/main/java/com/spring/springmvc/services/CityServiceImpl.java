package com.spring.springmvc.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springmvc.dao.CityDao;
import com.spring.springmvc.model.City_T;

@Service
public class CityServiceImpl implements CityService {
	@Autowired
	private CityDao citydao;
	
	@Transactional
	public List<City_T> getcities() {	
		return citydao.getcities();
	}
	
	
	@Transactional
	public void deleteCity(int Id) {
		citydao.deleteCity(Id);
	}
	
	@Transactional
	public void saveCity(City_T city) {
		// TODO Auto-generated method stub
		citydao.saveCity(city);
	}
	@Transactional
	public City_T getCity(int Id) {
		// TODO Auto-generated method stub
		return citydao.getCity(Id);
	}
	@Transactional
	public City_T getCityByName(String name) {
		// TODO Auto-generated method stub
		return citydao.getCityByName(name);
	}

}
