package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

public class EcartClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcartClientApplication.class, args);
	}

}
