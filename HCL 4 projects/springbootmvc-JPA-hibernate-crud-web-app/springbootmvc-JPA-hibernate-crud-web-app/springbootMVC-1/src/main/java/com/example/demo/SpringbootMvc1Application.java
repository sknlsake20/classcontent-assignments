package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({
	@ComponentScan("com.src.controller"),
	@ComponentScan("com.src.service")
})
@EntityScan("com.src.entity")
@EnableJpaRepositories("com.src.dao")
public class SpringbootMvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvc1Application.class, args);
	}

}


