package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Comment;

@Service
public interface CommentService {
	 List<Comment> getAllComments();

	    Comment addComment(Comment comment);

	    Comment findComment(int id);


}
