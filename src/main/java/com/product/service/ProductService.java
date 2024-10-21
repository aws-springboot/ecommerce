package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product getProduct(String productId) {
    	Product product = repository.getProductById(productId);
    	return product;
    }

    public void addProduct(Product product) {
        repository.saveProduct(product);
    }

    public void deleteProduct(String productId) {
        repository.deleteProduct(productId);
    }
}
