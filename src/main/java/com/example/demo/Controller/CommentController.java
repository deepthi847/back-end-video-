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

import com.example.demo.Repository.CommentRepository;
import com.example.demo.entity.Comment;


import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api")

public class CommentController {
	@Autowired
	CommentRepository commentRepository;
	
	@Data
	@NoArgsConstructor
	public static class Data3 {
		int comment_id;
		String Commenter;
		String Comment;
		String Post;
		String date;
	}
	
	///////////////////add////////////////
	
	@CrossOrigin
	@PostMapping("/addComments")
	public ResponseEntity<Object> addComments(@RequestBody Data3 d)
	{
		System.out.println(d.getComment_id());
		System.out.println(d.getCommenter());
		System.out.println(d.getComment());
		System.out.println(d.getPost());
		System.out.println(d.getDate());
		
		Comment comment = new Comment();
		comment.setComment_id(d.getComment_id());
		comment.setCommenter(d.getCommenter());
		comment.setComment(d.getComment());
		comment.setPost(d.getPost());
		comment.setDate(d.getDate());
		commentRepository.save(comment);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
		///////////////////read//////////////
	}
	@CrossOrigin
	@GetMapping("/readComments")
	public ResponseEntity<Object> readComments()
	{
		List u =commentRepository.findAll();
		return new ResponseEntity<Object>(u,HttpStatus.OK);
		
	}
	
	
	/////////////////////delete//////////////////
	
	@CrossOrigin
	@PostMapping("/deleteComments")
	public ResponseEntity<Object> deleteComments(@RequestBody Data3 d){
		commentRepository.deleteById(d.getComment_id());
		return new ResponseEntity<Object>(HttpStatus.OK);
		
		
	}
	////////////////update/////////////////
	@CrossOrigin
	@PostMapping("/updateComments")
	public ResponseEntity<Object> updateComments(@RequestBody Data3 d){
		Comment comment = commentRepository.getById(d.getComment_id());
		comment.setComment(d.getComment());
		comment.setPost(d.getPost());
		commentRepository.save(comment);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	

}
