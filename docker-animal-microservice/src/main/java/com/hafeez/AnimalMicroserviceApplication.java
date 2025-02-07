package com.hafeez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AnimalMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalMicroserviceApplication.class, args);
	}

}
