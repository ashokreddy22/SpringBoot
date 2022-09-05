package com.example.User.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.User.entity.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
