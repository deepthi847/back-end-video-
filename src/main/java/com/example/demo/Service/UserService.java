package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public interface UserService {
	
	 List<User> getAllUsers();

	    User addUser(User user);

	    User findUser(int id);

}
