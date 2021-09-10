package com.example.hrapigatewayspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrApiGatewaySpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewaySpringcloudApplication.class, args);
	}

}
