package com.zohocrmapp13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp13.entity.Lead;
import com.zohocrmapp13.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLeadInfo(Lead lead) {
		
		leadRepo.save(lead);

	}

	@Override
	public void deleteOneLead(long id) {
leadRepo.deleteById(id);		
	}

	

}
