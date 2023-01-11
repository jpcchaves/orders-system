package com.orderssytem.orderssystem.services;

import com.orderssytem.orderssystem.entities.User;
import com.orderssytem.orderssystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);

        return user.get();
    }

    public User create(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(@RequestBody Long id, User updatedUser) {
        User entity = userRepository.getReferenceById(id);

        updateUser(entity, updatedUser);

        return userRepository.save(entity);
    }

    public void updateUser(User entity, User updatedUser) {
        entity.setName(updatedUser.getName());
        entity.setEmail(updatedUser.getEmail());
        entity.setPhone(updatedUser.getPhone());
    }

}
