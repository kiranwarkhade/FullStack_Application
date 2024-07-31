package com.ex.WhatsApp.controller;

//package com.example.formfill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ex.WhatsApp.dto.UserDto;
import com.ex.WhatsApp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/admin/dashboard")
	public String showDashboard(Model model) {
		return "admin-dashboard";
	}

	@GetMapping("/registration")
	public String showRegistrationForm(Model model) {
		UserDto userDto = new UserDto();
		model.addAttribute("user", userDto);
		return "registration";
	}

	@PostMapping("/registration")
	public String registerUser(@ModelAttribute("user") UserDto userDto, Model model) {
		userService.saveUser(userDto);
		model.addAttribute("message", "User registered successfully");
		return "registration";
	}
}
