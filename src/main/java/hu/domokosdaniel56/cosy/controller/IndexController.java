package hu.domokosdaniel56.cosy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hu.domokosdaniel56.cosy.service.RoomService;

@Controller
public class IndexController {

	@Autowired
	private RoomService roomService;
	
	@GetMapping("/")
	public String indexAction() {
		return "index";
	}
	
	@GetMapping("/rooms")
	public String roomsAction(Model model) {
		model.addAttribute("rooms", roomService.getRooms());
		return "rooms";
	}
}
