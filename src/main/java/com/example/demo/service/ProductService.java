package com.example.demo.service;

public interface ProductService {
    String getAllProduct();

    String getSingleProduct( Long productId);

    public String addProduct();
    public String updateProduct( Long productId);
    public String deleteProduct( Long productId);

}
