package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;

@Service
public class UserServiceImpl implements UserService {
	 @Autowired
	    private UserRepository userRepository;

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public User addUser(User user) {
	        return userRepository.save(user);
	    }

	    public User findUser(int id) {
	        return  userRepository.findById(id).get();

	    }
	

}
