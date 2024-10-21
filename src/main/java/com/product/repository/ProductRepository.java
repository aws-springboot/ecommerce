package com.product.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.product.entity.Product;

@Repository
public class ProductRepository {

//    public Product getProductById(String productId);
//
//    public void saveProduct(Product product);
//
//    public void deleteProduct(String productId);

    private DynamoDBMapper dynamoDBMapper;

    @Autowired
    public ProductRepository(DynamoDBMapper dynamoDBMapper) {
    	 this.dynamoDBMapper = dynamoDBMapper;
    }

    public Product getProductById(String productId) {
        return dynamoDBMapper.load(Product.class, productId);
    }

    public void saveProduct(Product product) {
        dynamoDBMapper.save(product);
    }

    public void deleteProduct(String productId) {
        Product product = dynamoDBMapper.load(Product.class, productId);
        if (product != null) {
            dynamoDBMapper.delete(product);
        }
    }
}
