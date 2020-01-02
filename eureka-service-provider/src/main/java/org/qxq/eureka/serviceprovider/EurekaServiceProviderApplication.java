package org.qxq.eureka.serviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: qiu
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceProviderApplication.class);
	}
}
