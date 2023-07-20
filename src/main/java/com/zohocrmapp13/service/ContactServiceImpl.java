package com.zohocrmapp13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp13.entity.Contact;
import com.zohocrmapp13.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
  @Autowired
	public ContactRepository contactRepo;
	@Override
	public void saveContactData(Contact contact) {
      
		contactRepo.save(contact);
		

	}

}
