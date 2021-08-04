package com.spring.springmvc.dao;

import java.util.List;

import com.spring.springmvc.model.City_T;

public interface CityDao {

	public List<City_T> getcities();
	
	public void saveCity(City_T city);
	
	public City_T getCity(int Id);
	
	public void deleteCity(int Id);
	
	public City_T getCityByName(String name);
}
