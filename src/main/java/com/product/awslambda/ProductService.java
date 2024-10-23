/*
 * package com.product.awslambda;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.product.entity.Product;
 * 
 * import software.amazon.awssdk.services.dynamodb.DynamoDbClient; import
 * software.amazon.awssdk.services.dynamodb.model.*;
 * 
 * import java.util.HashMap; import java.util.Map; import
 * org.springframework.cloud.function.adapter.aws.FunctionInvoker;
 * 
 * @Service("prodservice") public class ProductService {
 * 
 * private final DynamoDbClient dynamoDbClient; private final String tableName =
 * "Product"; // Adjust the table name as necessary
 * 
 * @Autowired public ProductService(DynamoDbClient dynamoDbClient) {
 * this.dynamoDbClient = dynamoDbClient; }
 * 
 * public Product getProductById(String productId) { GetItemRequest
 * getItemRequest = GetItemRequest.builder() .tableName(tableName)
 * .key(Map.of("productId", AttributeValue.builder().s(productId).build()))
 * .build();
 * 
 * Map<String, AttributeValue> item =
 * dynamoDbClient.getItem(getItemRequest).item(); if (item == null) return null;
 * 
 * return new Product(item.get("productId").s(), item.get("name").s(),
 * Double.parseDouble(item.get("price").n()), item.get("category").s()); }
 * 
 * public void saveProduct(Product product) { Map<String, AttributeValue>
 * itemValues = new HashMap<>(); itemValues.put("productId",
 * AttributeValue.builder().s(product.getProductId()).build());
 * itemValues.put("name",
 * AttributeValue.builder().s(product.getName()).build());
 * itemValues.put("price",
 * AttributeValue.builder().n(String.valueOf(product.getPrice())).build());
 * itemValues.put("category",
 * AttributeValue.builder().s(product.getCategory()).build());
 * 
 * PutItemRequest putItemRequest = PutItemRequest.builder()
 * .tableName(tableName) .item(itemValues) .build();
 * 
 * dynamoDbClient.putItem(putItemRequest); }
 * 
 * public void deleteProductById(String productId) { DeleteItemRequest
 * deleteItemRequest = DeleteItemRequest.builder() .tableName(tableName)
 * .key(Map.of("productId", AttributeValue.builder().s(productId).build()))
 * .build();
 * 
 * dynamoDbClient.deleteItem(deleteItemRequest); } }
 */