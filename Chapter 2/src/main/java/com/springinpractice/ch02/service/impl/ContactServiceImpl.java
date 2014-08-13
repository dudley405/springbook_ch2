/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch02.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springinpractice.ch02.dao.ContactDao;
import com.springinpractice.ch02.model.Contact;
import com.springinpractice.ch02.service.ContactService;


/**
 * Contact service bean.
 * 
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Service
@Transactional
public class ContactServiceImpl implements ContactService {
	@Inject private ContactDao contactDao;

	public void createContact(Contact contact) {
		contactDao.create(contact);
	}

	
	public List<Contact> getContacts() {
		return contactDao.getAll();
	}
	
	
	public List<Contact> getContactsByEmail(String email) {
		return contactDao.findByEmail(email);
	}

	public Contact getContact(Long id) {
		return (Contact) contactDao.get(id);
	}

	
	public void updateContact(Contact contact) {
		contactDao.update(contact);
	}

	public void deleteContact(Long id) {
		contactDao.deleteById(id);
	}	
}