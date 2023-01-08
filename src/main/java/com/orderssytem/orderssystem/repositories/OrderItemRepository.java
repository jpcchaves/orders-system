package com.orderssytem.orderssystem.repositories;

import com.orderssytem.orderssystem.entities.OrderItem;
import com.orderssytem.orderssystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
