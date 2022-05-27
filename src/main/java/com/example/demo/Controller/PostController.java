package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.PostRepository;
import com.example.demo.Service.PostServiceImpl;
import com.example.demo.entity.Post;

import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/post")
public class PostController {
	 @Autowired
	    private PostRepository postRepository;
	 @Data
	 @NoArgsConstructor
	 public static class Data1{ 
		 int post_id;
		 String text;
		 String image_url;
		 String date;
		 
	 }
	 @CrossOrigin
	 @PostMapping("/addPost")
	 public ResponseEntity<Object>addPost(@RequestBody Data1 d) {
		 System.out.println(d.getPost_id());
		 System.out.println(d.getText());
		 System.out.println(d.getImage_url());
		 System.out.println(d.getDate());
		 Post post = new Post();
		 post.setPost_id(d.getPost_id());
		 post.setText(d.getText());
		 post.setImage_url(d.getImage_url());
		 post.setDate(d.getDate());
		 postRepository.save(post);
		 return new ResponseEntity<Object>(HttpStatus.OK);
	 }
	 
	 
        @CrossOrigin
	    @GetMapping("/allPost")
	    public ResponseEntity<Object> allPost()
	    {
	    List Post = postRepository.findAll();
	    return new ResponseEntity<Object>(Post,HttpStatus.OK);
	        
	    }
        
//        @CrossOrigin
//        @GetMapping
//      @CrossOrigin
//
//	    @GetMapping("/find")
//	    public Post findPost(@PathVariable int post_id) {
//	    return postRepository.findByPost_id;
//	    }


}
