package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class JpaUserDao implements UserDao {
    List<User> users;
    
    public JpaUserDao() {
    	users=new ArrayList<User>();
    }
	
	@Override
	public void save(User user) {
		users.add(user);
		System.out.println("Jpa ile eklendi: "+user.getFirstName()+" "+user.getLastName());
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	
	

}
