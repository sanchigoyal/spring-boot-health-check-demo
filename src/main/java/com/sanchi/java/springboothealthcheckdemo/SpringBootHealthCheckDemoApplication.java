package com.sanchi.java.springboothealthcheckdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHealthCheckDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHealthCheckDemoApplication.class, args);
	}

}
