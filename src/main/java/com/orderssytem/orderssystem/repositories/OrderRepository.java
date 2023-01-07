package com.orderssytem.orderssystem.repositories;

import com.orderssytem.orderssystem.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
