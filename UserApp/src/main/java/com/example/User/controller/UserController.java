package com.example.User.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.User.entity.User;
import com.example.User.exceptions.UserNotFoundException;
import com.example.User.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
private UserRepository userRepo;
	@GetMapping
	public Iterable<User> getUsers(){
		return userRepo.findAll();
	}
	@GetMapping("/{id}")
	public User getProduct(@PathVariable("id")Integer id) {
		Optional<User> optuser = userRepo.findById(id);
		if (optuser.isEmpty()) {
			throw new UserNotFoundException(id);
		}
		return optuser.get();
	}
	
	@PostMapping
	public User AddUser(@RequestBody User user) {
		return userRepo.save(user);
		
	}
	
	@PutMapping
	public User update(@RequestBody User user) {
		return userRepo.save(user);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id")Integer id) {
	userRepo.deleteById(id);}
	}


