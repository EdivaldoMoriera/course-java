package com.valdosm.course.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {
     public ResourceNotFoundException(Object id){
        super("Objeto não encontrado. Id "+id);

     }
     

    }
    

