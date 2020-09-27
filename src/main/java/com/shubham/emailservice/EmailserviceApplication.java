package com.shubham.emailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@EnableConfigurationProperties
@SpringBootApplication
public class EmailserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmailserviceApplication.class, args);
	}
}
