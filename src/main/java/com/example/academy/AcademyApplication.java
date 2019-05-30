package com.example.academy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories(basePackages = "com.example.academy.repository")
@SpringBootApplication



public class AcademyApplication {


	public static void main(String[] args) {

		SpringApplication.run(AcademyApplication.class, args);

	}



}
