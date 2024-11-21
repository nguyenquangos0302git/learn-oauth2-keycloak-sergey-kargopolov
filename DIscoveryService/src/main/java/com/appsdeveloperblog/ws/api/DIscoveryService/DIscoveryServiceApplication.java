package com.appsdeveloperblog.ws.api.DIscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DIscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DIscoveryServiceApplication.class, args);
	}

}
