package com.CurdOperation.CurdOp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@Configuration
@ComponentScan({ "com.controller", "com.service" })
@EntityScan("com.dto")
@EnableJpaRepositories("com.repo")
@SpringBootApplication
public class CurdOpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdOpApplication.class, args);
	}

}
