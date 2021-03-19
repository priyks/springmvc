package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;

@Service
public class UserDaoService {
	
	@Autowired
	private UserDao userdao;
	
	public int createUser(User user) {
		
		
		
		int result=userdao.saveUser(user);
		return result;
	
	}
	
	
}
