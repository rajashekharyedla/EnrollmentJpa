package com.wavelabs.enrollment.service;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.wavelabs.enrollment.entity.User;


@Component
public class LoginValidation {

	private LoginValidation() {

	}
/*
	public User userValidation(String email, String password) {
		Logger log = Logger.getLogger(LoginValidation.class);
		User user = null;
		try {
////			Criteria criteria = session.createCriteria(User.class);
//			criteria.add(Restrictions.eq("email", email));
//			criteria.add(Restrictions.eq("password", password));
//			user = (User) criteria.uniqueResult();
//			user.getAddress().setUser(null);

		} catch (Exception e) {
			log.info(e);
		} finally {
		}
		return user;*/
//	}
}
