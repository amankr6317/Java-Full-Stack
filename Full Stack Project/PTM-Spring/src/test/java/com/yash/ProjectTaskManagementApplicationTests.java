package com.yash;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yash.entities.User;
import com.yash.repositories.UserRepository;

@SpringBootTest
class ProjectTaskManagementApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	public void testUser() {
		User user = new User();
//		user.setId(null);
//		user.setUsername("yogesh123@yash.com");
//		user.setFullName("Yogesh Sahu");
//		user.setPassword("123456");
//		user.setConfirmPassword("123456");
//		user.setCreate_At(new Date());
//		user.setUpdate_At(null);
//		userRepository.save(user);
		User user1 = userRepository.findByUsername("kumar.aman@yash.com");
		assertNotNull(user1);
//		assertThat(user1.getUsername().equals("test@yash.com"));
	}

}