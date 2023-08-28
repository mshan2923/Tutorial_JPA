package com.example.tutorial_jpa;

import com.example.tutorial_jpa.entity.Users;
import com.example.tutorial_jpa.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@DataJpaTest
class TutorialJpaApplicationTests {

	//@Autowired
	//UserRepository userRepository;

	@Test
	void contextLoads() {
		System.out.println("====> \n");
	}



}
