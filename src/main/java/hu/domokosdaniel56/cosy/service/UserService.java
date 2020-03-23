package hu.domokosdaniel56.cosy.service;

import java.util.List;

import org.springframework.stereotype.Service;
import hu.domokosdaniel56.cosy.domain.User;
import hu.domokosdaniel56.cosy.repository.UserRepository;

@Service
public class UserService {

	private UserRepository repo;
	
	public List<User> getUsers() {
		return repo.findAll();
	}
	
	/*public User getUserByName(String username) {
		
	}*/
	
}
