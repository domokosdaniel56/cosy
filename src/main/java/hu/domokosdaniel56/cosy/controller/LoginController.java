package hu.domokosdaniel56.cosy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String loginAction(@ModelAttribute User user) {
		if(userService.findUserbyUsernameAndPassword(user.getUsername(), user.getPassword()) == null) {
			return "login/login?error";
		} else {
			return "login/login";
		}
	}
	
	/*@GetMapping("/login")
	public String loginSubmit(@ModelAttribute User logindata) {
		if(userService.validateUser(logindata.getUsername(), logindata.getPassword()) == true) {
			return "index";
		}else {
			return "login";
		}
	}*/
	
	
}