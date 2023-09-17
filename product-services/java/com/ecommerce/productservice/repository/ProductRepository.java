package com.ecommerce.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecommerce.productservice.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
