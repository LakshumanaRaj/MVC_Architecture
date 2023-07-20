package com.zohocrmapp13.service;

import com.zohocrmapp13.entity.Lead;

public interface LeadService {
	public void saveLeadInfo(Lead lead);

	public void deleteOneLead(long id);


}
