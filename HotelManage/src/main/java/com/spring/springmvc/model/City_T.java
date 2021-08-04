package com.spring.springmvc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class City_T {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int city_id;
	private String city_name;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "city_id")
	private Set<Hotels_T> hotels;
	public City_T() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City_T(int city_id, String city_name, Set<Hotels_T> hotels) {
		super();
		this.city_id = city_id;
		this.city_name = city_name;
		this.hotels = hotels;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public Set<Hotels_T> getHotels() {
		return hotels;
	}
	public void setHotels(Set<Hotels_T> hotels) {
		this.hotels = hotels;
	}

	
}
