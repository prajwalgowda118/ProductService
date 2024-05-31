package com.example.demo.service;

import com.example.demo.model.Product;
import java.util.List;


public interface ProductService {

     List<Product> getAllProduct();

     Product getSingleProduct( Long productId);

     Product addProduct(Product product);
     Product updateProduct( Long productId,Product product);
     Boolean deleteProduct( Long productId);

}
