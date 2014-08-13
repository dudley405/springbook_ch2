package com.springinpractice.ch02.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springinpractice.ch02.dao.ContactDao;
import com.springinpractice.ch02.model.Contact;

@Repository
public class HbnContactDao extends AbstractHbnDao<Contact>
		implements ContactDao {
	
	@SuppressWarnings("unchecked")
	public List<Contact> findByEmail(String email) {
		return  getSession()
				.getNamedQuery("findContactsByEmail")
				.setString("email", "%" + email + "%")
				.list();
	}

}
