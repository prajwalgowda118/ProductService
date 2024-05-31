package com.example.demo.service;

import com.example.demo.model.Category;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Getter
@Setter

public class FakeStoreCategoryImp implements CategoryService {

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public Category getProductInCategory(Long categoryId) {
        return null;
    }
}
