package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Post;

@Service
public interface PostService {
	
	List<Post> getAllPost();

    Post addPost(Post post);

    Post findPost(int id);

}
