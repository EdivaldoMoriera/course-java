package com.valdosm.course.entities.DTO;

import java.io.Serializable;

import com.valdosm.course.entities.Product;

public class ProductDTO  implements Serializable{
    private Integer id;
    private String name;
    private String description;
    public ProductDTO(Product product){
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
