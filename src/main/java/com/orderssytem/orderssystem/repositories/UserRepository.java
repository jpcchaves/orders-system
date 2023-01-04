package com.orderssytem.orderssystem.repositories;

import com.orderssytem.orderssystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
