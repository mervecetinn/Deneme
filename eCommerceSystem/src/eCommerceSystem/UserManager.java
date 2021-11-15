package eCommerceSystem;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void save(User user) {
		var result = BusinessRules.run(checkPasswordLength(user.getPassword()), checkIfEmailExists(user.getEmail()),
				checkFirstNameAndLastNameLength(user.getFirstName(), user.getLastName()),
				checkEmailFormat(user.getEmail()));

		if (result != false) {
			userDao.save(user);
		} else {
			System.out.println("Hata");
		}
	}

	private boolean checkPasswordLength(String password) {
		if (password.length() >= 6) {
			return true;
		}
		return false;
	}

	private boolean checkIfEmailExists(String email) {
		if (userDao.getByEmail(email) != null) {
			return false;
		}
		return true;
	}

	private boolean checkFirstNameAndLastNameLength(String firstName, String lastName) {
		if (firstName.length() >= 2 && lastName.length() >= 2) {
			return true;
		}
		return false;
	}

	private boolean checkEmailFormat(String email) {
		String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
		if (email.matches(pattern)) {
			return true;
		}
		return false;

	}

}
