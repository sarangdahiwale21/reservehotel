package com.spring.springmvc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Hotels_T {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotel_id;
	private String hotel;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "hotel_id")
	private Set<Availability_T> availability;
	
	@ManyToOne
	private City_T city_id;
	
	@OneToOne
	private RoomType_T roomtype;
	public RoomType_T getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(RoomType_T roomtype) {
		this.roomtype = roomtype;
	}

	public Hotels_T() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public City_T getCity() {
		return city_id;
	}

	public void setCity(City_T city_id) {
		this.city_id = city_id;
	}

	

	public Hotels_T(int hotel_id, String hotel, Set<Availability_T> availability, City_T city_id, RoomType_T roomtype) {
		super();
		this.hotel_id = hotel_id;
		this.hotel = hotel;
		this.availability = availability;
		this.city_id = city_id;
		this.roomtype = roomtype;
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public Set<Availability_T> getAvailability() {
		return availability;
	}

	public void setAvailability(Set<Availability_T> availability) {
		this.availability = availability;
	}
	
	
}
