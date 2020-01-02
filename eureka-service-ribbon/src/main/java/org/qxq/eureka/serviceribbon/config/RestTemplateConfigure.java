package org.qxq.eureka.serviceribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author: qiu
 */
@Component
@Configuration
public class RestTemplateConfigure {

	/**
	 * @LoadBalanced注解表明这个restRemplate开启负载均衡的功能
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
