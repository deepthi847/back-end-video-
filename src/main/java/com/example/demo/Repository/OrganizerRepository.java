package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Organizer;
@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {

//	public Optional<Organizer> findById(Integer org_id);
//	public List<Organizer> findByO_name(String o_name);
//	
//	@Query("SELECT o FROM Organizer o")
//	List<Organizer> getAll();
//
//	
//	@Query("SELECT o FROM Organizer o WHERE org_id = 1")
//	public List<Organizer> findByOrgId();
//	
////	@Query(value="select * from organizer", nativeQuery = true)
////	public List<Organizer> getOrganizer();

			
	

//	List findAllById();
	
//	public List<Organizer>findBy
	
	
	
	

}
