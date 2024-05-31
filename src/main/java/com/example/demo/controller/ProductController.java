package com.example.demo.controller;

import com.example.demo.DTO.ProductDto;
import com.example.demo.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping("/products")
public class ProductController {

    //get all product details
    @GetMapping()
    public String getAllProduct(){

        return "Hello World, Created my first prodcut";
    }

    //get all product details for single id
    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId) {
        return "Hello World, Created my first product with id " + productId;
    }

    @PostMapping()
    public String addProduct(@RequestBody ProductDto productDto) {
        return "Hello World, Created my first product with id 1"+productDto;
        //return "";
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId) {

        return "Hello World, Created my first product with id " + productId;
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Hello World, Created my first product with id " + productId;
    }

}
