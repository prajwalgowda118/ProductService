package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import com.example.demo.DTO.ProductDto;
import org.springframework.http.ResponseEntity;


import java.util.List;
import org.springframework.web.client.RestTemplate;


@Service
@Getter
@Setter

public class FakeStoreproductImp implements ProductService
{
    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreproductImp(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;

    }
    @Override
    public List<Product> getAllProduct(){
        return null;

    }
    @Override
    public Product getSingleProduct(Long productId){

            RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<ProductDto> response=
        restTemplate.getForEntity(
                "https://fakestoreapi.com/products/{productId}",ProductDto.class,productId
        );
        if (response.getStatusCode().is2xxSuccessful()) {
            ProductDto productDto = response.getBody();
            Product product = new Product();

            product.setId(productDto.getId());
            product.setTitle(productDto.getTitle());
            product.setPrice(productDto.getPrice());
            product.setDescription(productDto.getDescription());
            Category category = new Category();
            category.setCategoryName(productDto.getCategory());
            product.setCategory(category);
            product.setImageURl(productDto.getImage());

            return product;
        }
        return null;
    }
    @Override
    public Product addProduct(ProductDto product){
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<ProductDto> response=
                restTemplate.postForEntity(
                        "https://fakestoreapi.com/products",product,ProductDto.class
                );

        ProductDto productDto=response.getBody();
        Product product1 = new Product();

        product1.setId(productDto.getId());
        product1.setTitle(productDto.getTitle());
        product1.setPrice(productDto.getPrice());
        product1.setDescription(productDto.getDescription());
        Category category = new Category();
        category.setCategoryName(productDto.getCategory());
        product1.setCategory(category);
        product1.setImageURl(productDto.getImage());

        return product1;

    }

    @Override
    public Product updateProduct(Long id,Product product){
        return null;

    }
    @Override
    public Boolean deleteProduct(Long id){
        return null;
    }
}
