package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Category extends baseModel{

    private String categoryName;

    private String categoryDesc;

    private List<Product> productList;


}
