package com.getPrint.notes.util;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

public class HibernateTemplate {

	public static Object add(Object obj ) {
		Object id =null;
		try {
		SessionFactory sessionFactory =Util.getFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		id=session.save(obj);
		transaction.commit();
		session.close();

		} catch (Exception e) {
			e.printStackTrace();;
		}
		
		return id;
		
	}
	public static void update(Object obj) {
		try {
		SessionFactory sessionFactory =Util.getFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(obj);
		transaction.commit();
		session.close();

		} catch (Exception e) {
			e.getMessage();
		}
		
		
	}
	public static void delete(Object obj) {
		try {
		SessionFactory sessionFactory =Util.getFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(obj);
		session.update(obj);
		transaction.commit();
		session.close();

		} catch (Exception e) {
			e.getMessage();
		}
		
		
	}
	public static List<Object> get(Class cls,Serializable i) {
		List list=null;
		try {
		SessionFactory sessionFactory =Util.getFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Query q=session.createQuery("from notes where noteId="+i);
		list=q.list();
		transaction.commit();
		session.close();

		} catch (Exception e) {
			e.getMessage();
		}
		
		return list;
		
	}
	
}