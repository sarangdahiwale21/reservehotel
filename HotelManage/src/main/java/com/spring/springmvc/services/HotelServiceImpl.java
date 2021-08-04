package com.spring.springmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springmvc.dao.HotelsDao;
import com.spring.springmvc.model.Hotels_T;
@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelsDao hotelsDao;
	
	@Transactional
	public List<Hotels_T> gethotels() {
		
		return hotelsDao.gethotels();
	}

	@Transactional
	public void saveHotel(Hotels_T hotel) {
		hotelsDao.saveHotel(hotel);
	}
	
	@Transactional
	public Hotels_T getHotel(int Id) {

		return hotelsDao.getHotel(Id);
	}
	
	@Transactional
	public void deleteHotel(int Id) {
		hotelsDao.deleteHotel(Id);
	}
	@Transactional
	public int getLastIndex() {
		
		return hotelsDao.getLastIndex();
	}
}
