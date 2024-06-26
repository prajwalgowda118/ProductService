package com.example.demo.controller;


import com.example.demo.service.FakeStoreCategoryImp;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RestController
@RequestMapping("/products/categories")

public class CatagoryController {

    private FakeStoreCategoryImp FakeStoreCategoryImp;

    public CatagoryController(FakeStoreCategoryImp fakeStoreCategoryImp) {
        this.FakeStoreCategoryImp = fakeStoreCategoryImp;
    }

    @GetMapping()
    public String getAllCategories() {
        return "All categories";
    }

    @GetMapping("/{categoryId}")
    public String GetProductInCategory(@PathVariable("categoryId") Long categoryId) {

        return "Single category";


    }

}
