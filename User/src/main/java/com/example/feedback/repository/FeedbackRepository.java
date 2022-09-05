package com.example.feedback.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.feedback.entity.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback,Integer> {

}
