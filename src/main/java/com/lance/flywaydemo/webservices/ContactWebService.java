package com.lance.flywaydemo.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lance.flywaydemo.dao.ContactDao;
import com.lance.flywaydemo.models.Contact;

@RestController
@RequestMapping(value="/api/contact")
public class ContactWebService {
	
	private ContactDao contactDao;
	
	@Autowired
	public ContactWebService(ContactDao contactDao){
		this.contactDao = contactDao;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Contact> getAll(){
		return contactDao.getAll();
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Contact getById(@PathVariable Integer id){
		return contactDao.getById(id);
	}	
}
