package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.CommentRepository;
import com.example.demo.entity.Comment;

public class CommentServiceImpl implements CommentService {
	  @Autowired
	    private CommentRepository commentRepository;

	  
	    public List<Comment> getAllComments() {
	        return null;
	    }

	   
	    public Comment addComment(Comment comment) {
	        return null;
	    }

	   
	    public Comment findComment(int id) {
	        return null;
	    }
	
	

}
