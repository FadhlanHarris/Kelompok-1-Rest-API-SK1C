package com.pemkom1.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.pemkom1.models.entities.Product;

import java.util.List;


public interface ProductRepo extends CrudRepository<Product, Long> {
    
    List<Product> findByNameContains(String name);
}
