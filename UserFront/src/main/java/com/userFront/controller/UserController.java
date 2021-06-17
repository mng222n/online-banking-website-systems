package com.userFront.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.userFront.domain.User;
import com.userFront.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile(Principal principal, Model model) {
		User user = userService.findByUsername(principal.getName());

		model.addAttribute("user", user);

		return "profile";
	}

	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public String profilePost(@ModelAttribute("user") User newUser, Model model) {
		User user = userService.findByUsername(newUser.getUsername());
		user.setUsername(newUser.getUsername());
		user.setFirstName(newUser.getFirstName());
		user.setLastName(newUser.getLastName());
		user.setEmail(newUser.getEmail());
		user.setPhone(newUser.getPhone());

		model.addAttribute("user", user);

		userService.saveUser(user);
		logger.debug("log the profile of users!");

		return "profile";
	}

}
