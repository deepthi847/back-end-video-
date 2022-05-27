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

import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserServiceImpl;
import com.example.demo.entity.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Data
    @NoArgsConstructor
    public static class Data2{
    	int uid;
    	String name;
    	String email;
    	String address;
    }
    
    
    
    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<Object>add(@RequestBody Data2 d) {
    	System.out.println(d.getUid());
    	System.out.println(d.getName());
    	System.out.println(d.getEmail());
    	System.out.println(d.getAddress());
    	
    	User user = new User();
    	user.setUid(d.getUid());
    	user.setName(d.getName());
    	user.setEmail(d.getEmail());
    	user.setAddress(d.getAddress());
    	userRepository.save(user);

		 return new ResponseEntity<Object>(HttpStatus.OK);
    	
    	
    	
    	
    	
       
    }
    @CrossOrigin

    @GetMapping("/all")
    public ResponseEntity<Object>all()
    {
    List User = userRepository.findAll();
    return new ResponseEntity<Object>(User,HttpStatus.OK);
    
    		
       
    }

//    @GetMapping("/find")
//    public User findUser(@PathVariable int uid) {
//        return userServiceImpl.findUser(uid);
//    }



}
