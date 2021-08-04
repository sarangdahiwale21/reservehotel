package com.spring.springmvc.dao;

import java.util.List;

import com.spring.springmvc.model.Hotels_T;

public interface HotelsDao {

	public List<Hotels_T> gethotels();
	
	public void saveHotel(Hotels_T hotel);
	
	public Hotels_T getHotel(int Id);
	
	public void deleteHotel(int Id);
	
	public int getLastIndex();
}
