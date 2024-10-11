package com.hilgo.kuryeisbul.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.hilgo")
@ComponentScan(basePackages = "com.hilgo")
@EnableJpaRepositories(basePackages = "com.hilgo")
public class KuryeisbulApplication {

	public static void main(String[] args) {
		SpringApplication.run(KuryeisbulApplication.class, args);
	}

}
