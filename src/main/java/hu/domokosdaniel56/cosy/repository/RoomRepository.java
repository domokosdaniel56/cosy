package hu.domokosdaniel56.cosy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.domokosdaniel56.cosy.domain.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

	List<Room> findAll();

}
