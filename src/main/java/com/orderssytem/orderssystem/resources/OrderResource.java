package com.orderssytem.orderssystem.resources;

import com.orderssytem.orderssystem.entities.Order;
import com.orderssytem.orderssystem.entities.User;
import com.orderssytem.orderssystem.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {

  @Autowired
  private OrderService orderService;

  @GetMapping
  public ResponseEntity<List<Order>> findAll() {
    List<Order> orders = orderService.findAll();
    return ResponseEntity.ok().body(orders);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findById(@PathVariable Long id) {
    Order order =  orderService.findById(id);
    return ResponseEntity.ok().body(order);
  }

  @PostMapping
  public ResponseEntity<Order> createOrder(@RequestBody Order newOrder) {
    orderService.create(newOrder);
    return ResponseEntity.ok().body(newOrder);
  }
}
