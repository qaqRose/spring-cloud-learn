package org.qxq.eureka.registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: qiu
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterCenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaRegisterCenterApplication.class);
	}
}
