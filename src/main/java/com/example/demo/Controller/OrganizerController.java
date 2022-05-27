package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.OrganizerRepository;
import com.example.demo.entity.Organizer;

import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/org")
public class OrganizerController {
	 @Autowired
	    private OrganizerRepository organizerRepository;
	 @Data
	 @NoArgsConstructor
	 public static class Orgs{
		 int org_id;
		 String o_name;
		 String o_address;
	 }
	 
	 @CrossOrigin
	 @PostMapping("/findOrgs")
	 public ResponseEntity<Object>findOrgs(@RequestBody Orgs o){
		 System.out.println(o.getO_name());
		 System.out.println(o.getO_address());
		 System.out.println(o.getOrg_id());
		 Organizer organizer = new Organizer();
		 organizer.setOrg_id(o.getOrg_id());
		 organizer.setO_name(o.getO_name());
		 organizer.setO_address(o.getO_address());
		 organizerRepository.save(organizer);
		 return new ResponseEntity<Object>(HttpStatus.OK);
		 
		 
		 
		 
	 }
	 @CrossOrigin
	 @GetMapping("/getOrgs")
	 public ResponseEntity<Object> getOrgs()
	 {
		 
		 List Organization = organizerRepository.findAll();
		 
		   return new ResponseEntity<Object>(Organization,HttpStatus.OK);
		 
	 }
		
	 
	 
	

}
