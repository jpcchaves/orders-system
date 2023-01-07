package com.orderssytem.orderssystem.repositories;

import com.orderssytem.orderssystem.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
