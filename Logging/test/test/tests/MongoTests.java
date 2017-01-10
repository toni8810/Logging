package test.tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("dev")
@ContextConfiguration(locations={"classpath:test/config/testConfig.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoTests {
	
	Logger logger = Logger.getLogger(MongoTests.class);
	@Autowired
	MongoDAO dao;
	
	//@Test
	public void getAllUsersTest() {
		logger.info("Getting all users");
		List<User> users = dao.getAllUsers();
		logger.info("Number of users "+users.size());
		for (User user: users) {
			logger.info(user);
		}
	}
	//@Test
	public void insertUserTest() {
		User user = new User();
		user.setAge(56);
		user.setFirst_name("Johny");
		user.setLast_name("Cash");
		user.setName("Johny Cash");
		dao.insertUser(user);
	}
	@Test
	public void deleteUserTest() {
		User user = new User();
		user.setId("587520d9c3bf671ec353928e");
		user.setAge(56);
		user.setFirst_name("Johny");
		user.setLast_name("Cash");
		user.setName("Johny Cash");
		dao.deleteUser(user);
		logger.info("Object deleted");
	}
	
}
