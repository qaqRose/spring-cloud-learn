package org.qxq.eureka.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: qiu
 */
@EnableFeignClients
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceFeignApplication.class);
	}
}
