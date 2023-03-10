package com.valdosm.course.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valdosm.course.entities.Product;
import com.valdosm.course.entities.DTO.ProductDTO;
import com.valdosm.course.service.ProductService;

@RestController
@RequestMapping(value = "products")
public class ProductResource {
    @Autowired
    private ProductService productService;
    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll(){
        List<Product> obj = productService.findAll();
        List<ProductDTO> dtos = obj.stream()
        .map(ob -> new ProductDTO(ob)).collect(Collectors.toList());
        return ResponseEntity.ok().body(dtos);

    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id){
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(obj);
        
    }
    
}
