package com.orderssytem.orderssystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.orderssytem.orderssystem.entities.User;
import com.orderssytem.orderssystem.repositories.UserRepository;
import com.orderssytem.orderssystem.services.exceptions.DatabaseException;
import com.orderssytem.orderssystem.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);

		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User create(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}

	public void delete(Long id) {

		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User updateUser(@RequestBody Long id, User updatedUser) {
		try {
			User entity = userRepository.getReferenceById(id);

			updateUser(entity, updatedUser);

			return userRepository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}

	public void updateUser(User entity, User updatedUser) {
		entity.setName(updatedUser.getName());
		entity.setEmail(updatedUser.getEmail());
		entity.setPhone(updatedUser.getPhone());
	}

}
