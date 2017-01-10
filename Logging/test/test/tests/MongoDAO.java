package test.tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MongoDAO {
	Logger logger = Logger.getLogger(MongoDAO.class);
	
	@Autowired
	MongoTemplate template;
	
	public void insertUser(User user) {
		template.insert(user);
	}
	public void deleteUser(User user) {
		template.remove(user,"user2");
	}
	public void updateUser(User user) {
		template.save(user);
	}
	public List<User> getAllUsers() {
		return template.findAll(User.class);
	}
}
