package hu.domokosdaniel56.cosy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import hu.domokosdaniel56.cosy.service.RoomService;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;

	@GetMapping("/rooms")
	public String roomsAction(Model model) {
		model.addAttribute("rooms", roomService.getRooms());
		return "room/rooms";
	}
	
	@GetMapping("/room/{id}")
	public String roomsAction(@PathVariable long id, Model model) {
		model.addAttribute("room", roomService.getRoom(id));
		return "room/room";
	}
}
