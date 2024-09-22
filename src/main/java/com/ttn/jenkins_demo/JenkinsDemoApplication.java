package com.ttn.jenkins_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		System.out.println(sayHello());
//		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

	public static String sayHello() {
		return "Hello World!";
	}
}
