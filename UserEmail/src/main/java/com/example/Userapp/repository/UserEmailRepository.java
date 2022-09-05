package com.example.Userapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Userapp.entity.UserMail;

public interface UserEmailRepository extends CrudRepository<UserMail,Integer>{

}
