package eCommerceSystem;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Merve", "Çetin", "mervecetin@gmail.com", "123456");
		UserManager userManager = new UserManager(new JpaUserDao());
		userManager.save(user);

	}

}
