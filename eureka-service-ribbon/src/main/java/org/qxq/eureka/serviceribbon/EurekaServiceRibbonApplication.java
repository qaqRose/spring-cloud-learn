package org.qxq.eureka.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: qiu
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceRibbonApplication {

	/**
	 * 通过@EnableDiscoveryClient向服务中心注册
	 *
	 */


	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRibbonApplication.class);
	}
}

