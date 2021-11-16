package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserDao {

	void save(User user);
	List<User> getAll();
}
