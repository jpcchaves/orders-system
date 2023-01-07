package com.orderssytem.orderssystem.services;

import com.orderssytem.orderssystem.entities.Category;
import com.orderssytem.orderssystem.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);

        return category.get();
    }

    public Category create(@RequestBody Category newCategory) {
        return categoryRepository.save(newCategory);
    }

}
