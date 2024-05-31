package com.example.demo.controller;

import com.example.demo.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController

public class ProductController {

    //get all product details
    @GetMapping(("/products"))
    public String getAllProduct(){

        return "Hello World, Created my first prodcut";
    }

    //get all product details for single id
    @GetMapping("/products/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId) {
        return "Hello World, Created my first product with id " + productId;
    }

    @PostMapping("/products")
    public String addProduct() {
        return "Hello World, Created my first product with id 1";
        //return "";
    }

    @PutMapping("/products/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId) {

        return "Hello World, Created my first product with id " + productId;
    }


}
