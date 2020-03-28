package hu.domokosdaniel56.cosy.service;

import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import hu.domokosdaniel56.cosy.domain.User;
import hu.domokosdaniel56.cosy.repository.UserRepository;

@Service
public class UserService {

	private UserRepository repo;
	
	public List<User> getUsers() {
		return repo.findAll();
	}
	
	public User findUserbyUsernameAndPassword(String username, String password) {
		return repo.findUserbyUsernameAndPassword(username, password);
	}
	
}
