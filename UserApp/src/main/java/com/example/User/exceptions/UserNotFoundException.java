package com.example.User.exceptions;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(int id) {
		super("User with id " + id + " not found.");
	}

}
