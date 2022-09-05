package com.example.Userapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.Userapp.dto.User;
import com.example.Userapp.entity.UserMail;
import com.example.Userapp.repository.UserEmailRepository;

@Controller
@RequestMapping("/userApp")
public class UserMailController {
@Autowired
private UserEmailRepository mailRepo;
private RestTemplate restTemplate=new RestTemplate();
@RequestMapping("/mail")
public String ShowUser(ModelMap model) {
	model.addAttribute("usermails",mailRepo.findAll());
	List<User>Users=(List<User>)restTemplate.getForObject("http://localhost:8083/user",List.class);
	model.addAttribute("users",Users);
	return "showUser";
}
@RequestMapping("/addEmail")
public String AddEmail(@ModelAttribute("UserMail")UserMail usermail,ModelMap model) {
	mailRepo.save(usermail);
	List<User>Users=(List<User>)restTemplate.getForObject("http://localhost:8083/user",List.class);
	model.addAttribute("users",Users);
	model.addAttribute("usermails",mailRepo.findAll());
	
	return "showUser";
}
}
