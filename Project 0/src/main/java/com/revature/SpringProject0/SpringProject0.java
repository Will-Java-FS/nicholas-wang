package com.revature.SpringProject0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.revature")
@EntityScan("com.revature.models")
@EnableJpaRepositories("com.revature.repositories")
public class SpringProject0 {

	public static void main(String[] args) {
		SpringApplication.run(SpringProject0.class, args);
	}

}
