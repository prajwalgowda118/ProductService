package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends baseModel{

    private String title;
    private double price;
    private String description;
    private Category category;
    private String imageUrl;
    private boolean isPublic;
}
