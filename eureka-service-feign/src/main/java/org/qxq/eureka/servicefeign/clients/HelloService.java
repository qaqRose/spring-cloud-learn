package org.qxq.eureka.servicefeign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: qiu
 */
@FeignClient(value = "service-provider", fallback = HelloServiceHystric.class)
public interface HelloService {
	/**
	 * 通过 FeignClient 指定调用什么服务
	 *
	 */


	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
