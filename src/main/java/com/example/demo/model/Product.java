package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Product extends baseModel{

    private String title;
    private double price;
    private String description;
    private Category category;
    private String imageURl;
    private boolean isPublic;
}
