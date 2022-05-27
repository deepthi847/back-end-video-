package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PostRepository;
import com.example.demo.entity.Post;

@Service

public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    public Post findPost(int id) {
        return postRepository.findById(id).get();
    }

	public void save(Post post) {
		// TODO Auto-generated method stub
		
	}

}
