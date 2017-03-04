package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class Application {

	public static HashMap<Long,Student> hmStudent;

	public static void main(String[] args) {
		hmStudent = new HashMap<Long,Student>();

		Student one = new Student("John", "math");
		hmStudent.put(new Long(one.getId()), one);
		SpringApplication.run(Application.class, args);

		Student two = new Student("Jane", "history");
		hmStudent.put(new Long(two.getId()), two);
	}
}
