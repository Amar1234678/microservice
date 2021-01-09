package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootwithMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootwithMicroserviceApplication.class, args);
		System.out.println("eureka server ");
	}

}
