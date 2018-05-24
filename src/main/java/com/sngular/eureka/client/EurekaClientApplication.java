package com.sngular.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Raul Arroyo
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
