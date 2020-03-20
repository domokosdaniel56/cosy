package hu.domokosdaniel56.cosy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.domokosdaniel56.cosy.domain.Room;
import hu.domokosdaniel56.cosy.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository repo;
	
	public List<Room> getRooms() {
		return repo.findAll();
	}
}
