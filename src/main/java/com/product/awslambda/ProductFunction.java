/*
 * package com.product.awslambda;
 * 
 * import com.product.entity.Product;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component;
 * 
 * import java.util.function.Function; import
 * org.springframework.cloud.function.adapter.aws.FunctionInvoker;
 * 
 * @Component public class ProductFunction {
 * 
 * @Autowired private ProductService productService;
 * 
 * public Function<String, Product> getProductById() { return productId ->
 * productService.getProductById(productId); }
 * 
 * public Function<Product, String> saveProduct() { return product -> {
 * productService.saveProduct(product); return "Product saved successfully"; };
 * }
 * 
 * public Function<String, String> deleteProductById() { return productId -> {
 * productService.deleteProductById(productId); return
 * "Product deleted successfully"; }; } }
 */