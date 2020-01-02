package org.qxq.eureka.serviceribbon.controller;

import org.qxq.eureka.serviceribbon.service.HelloService;
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

	@Autowired
	private HelloService helloService;

	@GetMapping
	public String hello(@RequestParam String name) {
		return helloService.helloCall(name);
	}
}
