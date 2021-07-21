package SpringMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.UserDao;
import SpringMVC.Model.User;


@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
}
