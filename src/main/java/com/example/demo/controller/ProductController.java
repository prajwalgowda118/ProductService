package com.example.demo.controller;

import com.example.demo.DTO.ProductDto;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;



@Getter
@Setter
@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //get all product details
    @GetMapping()
    public String getAllProduct(){

        return "Hello World, Created my first prodcut";
    }

    //get all product details for single id
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
        ResponseEntity<Product> response = new ResponseEntity<>(product1, HttpStatus.OK);

        return response;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId,ProductDto productDto) {

        return "Hello World, Created my first product with id " + productId;
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Hello World, Created my first product with id " + productId;
    }

}
