package org.qxq.eureka.servicefeign.clients;

import org.springframework.stereotype.Component;

/**
 * @author: qiu
 */
@Component
public class HelloServiceHystric implements HelloService {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}
