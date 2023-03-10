package com.valdosm.course.entities.DTO;

import java.io.Serializable;

import com.valdosm.course.entities.User;

public class UserDTO  implements Serializable{ 
    private Integer id;
    private String name;
    public UserDTO(User user){
       id =  user.getId();
       name = user.getName();
        
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     
}
