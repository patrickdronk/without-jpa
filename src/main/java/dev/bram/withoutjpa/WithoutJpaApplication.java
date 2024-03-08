package dev.bram.withoutjpa;

import dev.bram.withoutjpa.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WithoutJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WithoutJpaApplication.class, args);
	}

}