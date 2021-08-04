package com.spring.springmvc.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.springmvc.model.City_T;
import com.spring.springmvc.model.Hotels_T;

@Repository
public class CityDaoImp implements CityDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<City_T> getcities() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<City_T> cq=cb.createQuery(City_T.class);
		Root<City_T> root=cq.from(City_T.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
	}

	public void saveCity(City_T city) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(city);
	}

	public City_T getCity(int Id) {
		Session currentSession=sessionFactory.getCurrentSession();
		City_T city=currentSession.get(City_T.class, Id);
		return city;
	}

	public void deleteCity(int Id) {
		Session session = sessionFactory.getCurrentSession();
		City_T city = session.byId(City_T.class).load(Id);
        session.delete(city);

	}
	
	public City_T getCityByName(String name) {
		Session session=sessionFactory.getCurrentSession();
		try {
		Query query=session.createQuery("from City_T where city_name='"+name+"'");		
		City_T city=(City_T)query.getSingleResult();
		for(Hotels_T hotel:city.getHotels())
		{
			System.out.println("Hotel Id:"+hotel.getHotel_id()+" HotelName:"+hotel.getHotel());
			
		}	
		return city;
		}
		catch(Exception e)
		{
			System.out.println("Error in City Table");
			return null;
		}
	}
}
