package eCommerceSystem;

public interface UserDao {

	void save(User user);
	User getByEmail(String email);
}
