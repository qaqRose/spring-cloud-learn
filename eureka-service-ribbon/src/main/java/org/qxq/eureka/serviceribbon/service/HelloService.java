package org.qxq.eureka.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: qiu
 */
@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;

	public String helloCall(String name) {
		// 在ribbon中它会根据服务名来选择具体的服务实例，
		// 根据服务实例在请求的时候会用具体的url替换掉服务名
		return restTemplate.getForObject("http://service-provider/hello?name="+name,String.class);
	}
}
