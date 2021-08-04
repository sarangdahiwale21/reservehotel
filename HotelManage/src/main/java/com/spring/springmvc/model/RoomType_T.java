package com.spring.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomType_T {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int type_id;
	private String room_type;
	private int price;
	private int GST;
	public RoomType_T() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoomType_T(int type_id, String room_type, int price, int gST) {
		super();
		this.type_id = type_id;
		this.room_type = room_type;
		this.price = price;
		GST = gST;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getGST() {
		return GST;
	}
	public void setGST(int gST) {
		GST = gST;
	}
	
	
}
