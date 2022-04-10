package com.example.ibs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.ibs")
public class IbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbsApplication.class, args);
	}

}
