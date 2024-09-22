package com.ttn.jenkins_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	@Test
	void testSayHello() {
		assert JenkinsDemoApplication.sayHello().equals("Hello World!");
	}

}
