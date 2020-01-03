package org.qxq.eureka.servicefeign.controller;

import org.qxq.eureka.servicefeign.clients.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: qiu
 */
@RestController
@RequestMapping("hello")
public class HelloController {


	//编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
	@Autowired
	HelloService helloService;

	@GetMapping
	public String sayHi(@RequestParam String name) {
		return helloService.sayHiFromClientOne( name );
	}

}
