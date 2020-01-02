package org.qxq.eureka.serviceprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
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

	@Value("${server.port}")
	private String port;

	@GetMapping
	public String hello(@RequestParam String name) {
		return String.format("hello %s, this app run at port : %s ", name, port);
	}
}
