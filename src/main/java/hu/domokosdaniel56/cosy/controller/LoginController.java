package hu.domokosdaniel56.cosy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import hu.domokosdaniel56.cosy.domain.User;
import hu.domokosdaniel56.cosy.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public String loginAction(@ModelAttribute("user") User user, BindingResult result, Model model) {
		model.addAttribute("user", new User());
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword()) == null) {
			return "login/login?error";
		} else {
			return "login/login";
		}
	}
}