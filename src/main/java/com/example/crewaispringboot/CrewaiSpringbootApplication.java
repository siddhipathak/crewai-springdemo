package com.example.crewaispringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrewaiSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrewaiSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside command line runner");
	}
}
