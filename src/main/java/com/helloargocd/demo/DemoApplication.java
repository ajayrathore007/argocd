package com.helloargocd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {

  static Logger logger = Logger.getLogger(String.valueOf(DemoApplication.class));

	public static void main(String[] args) {
		logger.info("Main Method");
		SpringApplication.run(DemoApplication.class, args);
	}

}
