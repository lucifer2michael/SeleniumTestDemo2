package com.funnygorilla.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication(scanBasePackages = {"com.funnygorilla.studentmanagement"})
@OpenAPIDefinition(info = @Info(title = "Student Domain APIs", 
								contact = @Contact(
									    name = "Platform Architecture Team",
									    email = "platform@ing.com.au"),
                                version = "0.0.2", 
                                description = "Hello, ING Platform Arc Team!"))
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
}
