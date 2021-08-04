package com.spring.springmvc.dao;



import java.sql.Date;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.springmvc.model.Availability_T;
@Repository
public class AvailabilityDaoImpl implements AvailabilityDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Availability_T checkAvailability(int Id, Date date) {
		Session session=sessionFactory.getCurrentSession();
		try {
			System.out.println("ID: "+Id+" date:"+date);
		Query query=session.createQuery("from Availability_T where hotel_id="+Id+" and date='"+date+"'");
		return (Availability_T) query.getSingleResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in Availability Table");
			return null;
		}
	}
	public void saveAvailability(String query) {
		Session session=sessionFactory.getCurrentSession();
		Query query1=session.createQuery(query);
		query1.executeUpdate();
	}
	public void saveAvailabilityAsObj(Availability_T av) {
		Session session=sessionFactory.getCurrentSession();
		session.save(av);
	}
	

}
