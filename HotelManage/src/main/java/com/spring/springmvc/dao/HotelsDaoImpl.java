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

import com.spring.springmvc.model.Hotels_T;
@Repository
public class HotelsDaoImpl implements HotelsDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Hotels_T> gethotels() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Hotels_T> cq=cb.createQuery(Hotels_T.class);
		Root<Hotels_T> root=cq.from(Hotels_T.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
	}

	public void saveHotel(Hotels_T hotel) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(hotel);
	}

	public Hotels_T getHotel(int Id) {
		Session session=sessionFactory.getCurrentSession();
		Hotels_T hotel=session.get(Hotels_T.class, Id);
		return hotel;
	}

	public void deleteHotel(int Id) {
		Session session=sessionFactory.getCurrentSession();
		Hotels_T hotel=session.byId(Hotels_T.class).load(Id);
		session.delete(hotel);
	}
	public int getLastIndex() {
		Session session=sessionFactory.getCurrentSession();
		int result=0;
		try {
		Query query=session.createQuery("select max(hotel_id) from Hotels_T");
		result=(Integer) query.getSingleResult();
		System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error or LAst Index---------->");
			e.printStackTrace();
		}
		return result;
	}

}
