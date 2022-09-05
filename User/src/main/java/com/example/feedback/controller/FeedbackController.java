package com.example.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.feedback.entity.Feedback;
import com.example.feedback.repository.FeedbackRepository;



@RestController
@Controller

public class FeedbackController {

	@Autowired

	private FeedbackRepository feedbackRepo;
	@RequestMapping("/addfeedback")
	public String ShowFeedbackPage(ModelMap model) {
		
		return "addFeedback";
	}

@PostMapping("/feedback1") 
@ResponseBody
public String userRegister(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("email") String email , @RequestParam("feedback1") String feedback1) { 

Feedback f = new Feedback(firstname, lastname, email,feedback1); 

Feedback data= feedbackRepo.save(f); 

if(data!=null) { 

return "Feedback added succesfully!"; 

} 

else { 

return "Unable to add the feedback"; 

} 

}
}


