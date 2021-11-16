package eCommerceSystem;

import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.dataAccess.concretes.JpaUserDao;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Merve", "Çetin", "mervecetin@abc.com", "123456");
		User user2=new User(2,"Merve","Çet","mervecetin@abc.com","12121212");
		User user3=new User(3,"A","B","ab@abc.com","12");
		UserManager userManager = new UserManager(new JpaUserDao());
		userManager.save(user);
		userManager.save(user2);
		userManager.save(user3);


	}

}
