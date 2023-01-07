package com.orderssytem.orderssystem.services;

import com.orderssytem.orderssystem.entities.Order;
import com.orderssytem.orderssystem.entities.User;
import com.orderssytem.orderssystem.repositories.OrderRepository;
import com.orderssytem.orderssystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);

        return order.get();
    }

    public Order create(@RequestBody Order newUser) {
        return orderRepository.save(newUser);
    }

}
