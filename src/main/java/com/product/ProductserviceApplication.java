package com.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

import com.product.controller.PingController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableDynamoDBRepositories(basePackages = "com.product.repository")
@Import({ PingController.class })
public class ProductserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

}
