package com.valdosm.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.valdosm.course.entities.User;
import com.valdosm.course.repository.UserRepository;

 @Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll(){
        return  userRepository.findAll();

    }
    
}
