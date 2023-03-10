package com.valdosm.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.valdosm.course.entities.User;
import com.valdosm.course.repository.UserRepository;

 @Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll(){
        return  userRepository.findAll();

    }
    //por id
    public User findById(Integer id){
        Optional <User>obj =  userRepository.findById(id);
        return obj.get();
    }
    //inserir user
    public User insert(User user){
        return userRepository.save(user);
    }
    
}
