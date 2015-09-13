package com.getPrint.notes.dao;

import java.io.Serializable;

import com.getPrint.notes.beans.User;
import com.getPrint.notes.util.HibernateTemplate;


public class  UserDAOImplementaion implements UserDAO {

	@Override
	public  User getUser(Class cls, Serializable i) {
		return (User)HibernateTemplate.get(cls, i);
	}
	
}
