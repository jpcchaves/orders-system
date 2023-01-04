package com.orderssytem.orderssystem.resources;

import com.orderssytem.orderssystem.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  public ResponseEntity<User> findAll() {

  }
}
