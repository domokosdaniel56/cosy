package hu.domokosdaniel56.cosy.repository;

import hu.domokosdaniel56.cosy.domain.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public List<User> findAll();
	
	public User findByUsernameAndPassword(String username, String password);
}
