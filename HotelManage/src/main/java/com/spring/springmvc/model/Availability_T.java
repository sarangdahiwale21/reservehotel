package com.spring.springmvc.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Availability_T {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int A_id;
	@Temporal(TemporalType.DATE )
	private Date date;
	private String status;
	@ManyToOne
	private Hotels_T hotel_id;
	
	public Hotels_T getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(Hotels_T hotel_id) {
		this.hotel_id = hotel_id;
	}
	public Availability_T() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Availability_T(int a_id, Date date, String status, Hotels_T hotel_id) {
		super();
		A_id = a_id;
		this.date = date;
		this.status = status;
		this.hotel_id = hotel_id;
	}
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date2) {
		this.date = date2;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
