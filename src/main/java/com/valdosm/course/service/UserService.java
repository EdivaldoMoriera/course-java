package com.valdosm.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.valdosm.course.entities.User;
import com.valdosm.course.repository.UserRepository;
import com.valdosm.course.service.exceptions.DataBaseException;
import com.valdosm.course.service.exceptions.ResourceNotFoundException;

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
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }
    //inserir user
    public User insert(User user){
        return userRepository.save(user);
    }
        //atualizar dados do ususario
     public User update(Integer id,User obj ){
         User entity = userRepository.getReferenceById(id);
        updateData(entity, obj);
             return userRepository.save(entity);
            }
    private void updateData(User entity, User obj) {
    
            entity.setName(obj.getName());
            entity.setEmail(obj.getEmail());
            entity.setPhone(obj.getPhone());
            entity.setPassword(obj.getPassword());
        }
            //deletar usuario
    public void delete(Integer id){
        try{
         userRepository.deleteById(id);
        }catch(EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch(DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }
       }
    }
