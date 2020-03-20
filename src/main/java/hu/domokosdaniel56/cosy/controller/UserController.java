package hu.domokosdaniel56.cosy.controller;

import hu.domokosdaniel56.cosy.model.*;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ControllerAdvice
public class UserController {
	private Map<Integer, User> usermap = new HashMap<>();
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public String addUser(
			@ModelAttribute("user") User user, BindingResult result, ModelMap model) {
		//if(result.hasErrors()) {
		//	return "Binding had some error.";
		//} else {
			model.addAttribute("vezetek", user.getUsername());
			model.addAttribute("kereszt", user.getPwd());
			
			usermap.put(user.getId(), user);
			
			return "User added.";
		//}
	}
}