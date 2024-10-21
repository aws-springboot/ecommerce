package com.product.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Data;

@DynamoDBTable(tableName = "product")
@Data
public class Product {

	  @DynamoDBHashKey(attributeName = "productId")
	    private String productId;

	    @DynamoDBAttribute(attributeName = "name")
	    private String name;

	    @DynamoDBAttribute(attributeName = "price")
	    private Double price;

	    @DynamoDBAttribute(attributeName = "category")
	    private String category;

    // Getters and Setters
}
