package com.example.MS_Microservice_Gestion_Comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsMicroserviceGestionCommentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMicroserviceGestionCommentApplication.class, args);
	}

}
