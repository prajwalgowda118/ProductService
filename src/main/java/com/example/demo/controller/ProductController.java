package com.example.demo.controller;

import com.example.demo.DTO.ProductDto;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.List;

@Getter
@Setter
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Get all product details
    @GetMapping()
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> products = productService.getAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // Get all product details for single id
    @GetMapping("/{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productId") Long productId) {
        Product product = productService.getSingleProduct(productId);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<Product> addProduct(@RequestBody ProductDto product) {
        // Call the service method to add the product
        Product product1 = productService.addProduct(product);
        // Create a ResponseEntity with the newly added product and HttpStatus.OK
        return new ResponseEntity<>(product1, HttpStatus.OK);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product>  updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductDto productDto) {
        // Implement the update logic
        Product product1 = productService.updateProduct(productId,productDto);
        // Create a ResponseEntity with the newly added product and HttpStatus.OK
        return new ResponseEntity<>(product1, HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        // Implement the delete logic
        return "Product with id " + productId + " deleted.";
    }
}