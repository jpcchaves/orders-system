package com.orderssytem.orderssystem.config;

import com.orderssytem.orderssystem.entities.Order;
import com.orderssytem.orderssystem.entities.User;
import com.orderssytem.orderssystem.entities.enums.OrderStatus;
import com.orderssytem.orderssystem.repositories.OrderRepository;
import com.orderssytem.orderssystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private OrderRepository orderRepository;

  @Override
  public void run(String... args) throws Exception {

  User u1 = new User(null, "João", "jooao@gmail.com", "12311212", "1234324");
  User u2 = new User(null, "Zezin", "zezin@gmail.com", "12311212", "1234324");

  Order o1 = new Order(null, Instant.parse("2023-01-06T22:35:00Z"),
          OrderStatus.PAID, u1);
  Order o2 = new Order(null, Instant.parse("2023-01-06T22:35:00Z"),
          OrderStatus.CANCELED, u2);

  userRepository.saveAll(Arrays.asList(u1, u2));
  orderRepository.saveAll(Arrays.asList(o1, o2));
  }
}
