package com.spring.springmvc.controller;

import java.sql.Date;
import java.util.Set;

import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.springmvc.model.Availability_T;
import com.spring.springmvc.model.City_T;
import com.spring.springmvc.model.Hotels_T;
import com.spring.springmvc.services.AvailabilityService;
import com.spring.springmvc.services.CityService;
import com.spring.springmvc.services.HotelService;



@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	private CityService cityService;
	@Autowired
	private HotelService hotelService;
	@Autowired
	private AvailabilityService availabilityService;
	@Autowired
	Availability_T CheckAvailable1;
	Availability_T CheckAvailable;
	Hotels_T hotel1=null;
	City_T checkcity=null;

	@RequestMapping(value = {"/","home"},method = RequestMethod.GET)
	public String getHome()
	{
		return "home";
	}
	
	@RequestMapping(value="confirm",method = RequestMethod.POST)
	public String confirmHotel()
	{
		availabilityService.saveAvailabilityAsObj(CheckAvailable1);
		return "userpage";
	}
	
	@RequestMapping(value = "welcome",method = RequestMethod.POST)
	public String showWelcome(@RequestParam("guestname") String guestname,Model model)
	{
		model.addAttribute("guestname", guestname);
		model.addAttribute("hotelname",hotel1.getHotel());
		model.addAttribute("cityname",checkcity.getCity_name());
		return "welcome";
	}
	
	@RequestMapping(value = {"checkhotel"},method = RequestMethod.POST)
	public String checkhotel(@RequestParam("city") String city,@RequestParam("hotel") String hotel
			,@RequestParam("date") Date date,Model model)
	{
		System.out.println(date);
		int index=hotelService.getLastIndex();
		int gst,total,price;
		
		checkcity=cityService.getCityByName(city);
		if(checkcity!=null)
		{
			Set<Hotels_T> hotels=checkcity.getHotels();
		
			for(Hotels_T x:hotels)
			{
				System.out.println("*******"+x.getHotel()+"=="+hotel+" "+date);
				if(x.getHotel().equals(hotel))
				{
					System.out.println("+++++++");
					hotel1=x;
					break;
				}
			}
			System.out.println(hotel1.getHotel());
			
			if(hotel1!=null)
			{
				CheckAvailable=availabilityService.checkAvailability(hotel1.getHotel_id(), date);
				if(CheckAvailable!=null)
				{
					System.out.println("---------");
					if(CheckAvailable.getStatus().equals("Available"))
					{
						
						System.out.println("Available");
						model.addAttribute("roomtype",hotel1.getRoomtype().getRoom_type());
						price=hotel1.getRoomtype().getPrice();
						model.addAttribute("price",price);
						gst=hotel1.getRoomtype().getGST();
						gst=(gst*price)/100;
						model.addAttribute("gst", gst);
						total=price+gst;
						model.addAttribute("total", total);
						return "Hotelpage";
					}
					else
					{
						System.out.println("NotAvailable");
						return "error";
					}
				}
				else
				{
					System.out.println("////////");
					index++;
					System.out.println("}}}}}}}}}}}}=index"+index);
					
					CheckAvailable1.setDate(date);
					CheckAvailable1.setStatus("NotAvailable");
					CheckAvailable1.setHotel_id(hotel1);
					//String query="insert into Availability_T values("+index+",'"+date+"','Available',"+hotel1.getHotel_id()+")";
					//availabilityService.saveAvailability(query);
					
					
					model.addAttribute("roomtype",hotel1.getRoomtype().getRoom_type());
					price=hotel1.getRoomtype().getPrice();
					model.addAttribute("price",price);
					gst=hotel1.getRoomtype().getGST();
					gst=(gst*price)/100;
					model.addAttribute("gst", gst);
					total=price+gst;
					model.addAttribute("total", total);
					return "Hotelpage";
				}
			}
		}
		System.out.println("|||||||||||||");
		return "error";
	}
	
	@RequestMapping(value = {"checkhotel"},method = RequestMethod.GET)
	public String checkhotelpage()
	{
		return "home";
	}
}
