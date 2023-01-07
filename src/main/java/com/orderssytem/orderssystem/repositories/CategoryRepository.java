package com.orderssytem.orderssystem.repositories;

import com.orderssytem.orderssystem.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
