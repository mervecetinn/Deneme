package eCommerceSystem;

public class JpaUserDao implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("Jpa ile eklendi: "+user.getFirstName()+" "+user.getLastName());
	}

	@Override
	public User getByEmail(String email) {
		return null;
	}

}
