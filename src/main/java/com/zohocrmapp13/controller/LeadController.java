package com.zohocrmapp13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp13.entity.Contact;
import com.zohocrmapp13.entity.Lead;
import com.zohocrmapp13.service.ContactService;
import com.zohocrmapp13.service.LeadService;
@Controller
public class LeadController {
	@Autowired
    private LeadService leadServ;  
	@RequestMapping("/show")
	public String show() {
		return "show";
		
	}
	@RequestMapping("/savedata")
	public String saveLeadData(Lead lead,Model model) {
		
		leadServ.saveLeadInfo(lead);
		model.addAttribute("lead",lead);
		return"LeadInfo";
		
	}
	@Autowired
	public ContactService contactServ;
	
	@RequestMapping("/contactdata")
	public String contactdata(Contact contact,@RequestParam("id") long id) {
		contactServ.saveContactData(contact);
		
		leadServ.deleteOneLead(id);
		
		
		return"show";
	}
	
	
	
	
	
	
	
	
}
