package com.zohocrmapp13.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrmapp13.entity.Lead;
import com.zohocrmapp13.repository.LeadRepository;

@RestController
public class LeadRestController {

	@Autowired
	private LeadRepository leadRepo;
	
	@GetMapping("/getallapi") //http://localhost:8080/getallapi
	public List<Lead>getallLeadsApi(){
		List<Lead>leads=leadRepo.findAll();
		return leads;
					
	}
	@PostMapping("/saveleadapi") //http://localhost:8080/saveleadapi
	public void saveapi(@RequestBody Lead lead) {
		leadRepo.save(lead);
		
	}
	
	@PutMapping("/updateleadapi") //http://localhost:8080/updateleadapi
	public void updateapi(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	@DeleteMapping("/deleteleadapi/{id}") //http://localhost:8080/deleteleadapi
	public void deleteleadapi(@PathVariable ("id")long id) {
		leadRepo.deleteById(id);
		
	}
	
}
