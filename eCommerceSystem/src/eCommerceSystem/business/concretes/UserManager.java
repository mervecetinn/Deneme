package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.utilities.BusinessRules;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

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
		} 
	}

	private boolean checkPasswordLength(String password) {
		if (password.length() >= 6) {
			return true;
		}
		System.out.println("Şifre en az 6 karakterden oluşmalı!");
		return false;
	}

	private boolean checkIfEmailExists(String email) {
		var result=userDao.getAll();
		for(User user:result) {
			if(user.getEmail()==email) {
				System.out.println("Email sistemde mevcut!");
				return false;
			}
		}
		return true;
	}

	private boolean checkFirstNameAndLastNameLength(String firstName, String lastName) {
		if (firstName.length() >= 2 && lastName.length() >= 2) {
			return true;
		}
		System.out.println("Ad-soyad en az 2 karakterden oluşmalı!");
		return false;
	}

	private boolean checkEmailFormat(String email) {
		String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
		if (email.matches(pattern)) {
			return true;
		}
		System.out.println("Geçersiz email!");
		return false;

	}

}
