package com.example.demo.service;

import com.example.demo.DTO.ProductDto;
import com.example.demo.model.Product;
import java.util.List;


public interface ProductService {

     List<Product> getAllProduct();

     Product getSingleProduct( Long productId);

     Product addProduct(ProductDto product);
     Product updateProduct( Long productId,ProductDto product);
     Boolean deleteProduct( Long productId);

}
