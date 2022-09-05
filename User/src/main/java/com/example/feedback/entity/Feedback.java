package com.example.feedback.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "feedback")

public class Feedback {

	@Override

	public String toString() {

		return "Feedback [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email

				+ ", feedback1=" + feedback1 + "]";

	}

	@Id
	@GeneratedValue

	private int id;

	private String firstname;

	private String lastname;

	private String email;

	private String feedback1;

	public Feedback() {

		super();

// TODO Auto-generated constructor stub 

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getFirstname() {

		return firstname;

	}

	public void setFirstname(String firstname) {

		this.firstname = firstname;

	}

	public String getLastname() {

		return lastname;

	}

	public void setLastname(String lastname) {

		this.lastname = lastname;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getFeedback1() {

		return feedback1;

	}

	public void setFeedback1(String feedback1) {

		this.feedback1 = feedback1;

	}

	public Feedback(String firstname, String lastname, String email, String feedback1) {

		super();

		this.firstname = firstname;

		this.lastname = lastname;

		this.email = email;

		this.feedback1 = feedback1;

	}
}