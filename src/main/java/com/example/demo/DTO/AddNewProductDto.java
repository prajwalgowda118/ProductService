package com.example.demo.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class AddNewProductDto {

    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
