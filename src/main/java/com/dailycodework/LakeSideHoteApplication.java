package com.dailycodework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication
public class LakeSideHoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(LakeSideHoteApplication.class, args);
	}

}
