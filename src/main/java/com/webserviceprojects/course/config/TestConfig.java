package com.webserviceprojects.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webserviceprojects.course.entities.User;
import com.webserviceprojects.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Patricia", "patricia@email.com", "9632517", "1234567");
		User u2 = new User(null, "Geraldo", "geraldo@email.com", "2478682", "7654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
