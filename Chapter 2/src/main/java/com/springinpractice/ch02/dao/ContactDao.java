package com.springinpractice.ch02.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springinpractice.ch02.model.Contact;
import com.springinpractice.dao.Dao;

public interface ContactDao extends Dao<Contact> {
	
	List<Contact> findByEmail(String email);

}
