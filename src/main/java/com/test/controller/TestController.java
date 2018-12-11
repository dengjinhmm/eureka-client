package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jin_deng
 *
 */
@RestController
@RequestMapping("/client")
public class TestController {

	@Value("${server.port}")
	String port;

	@GetMapping("/test")
	public String test(String name) {
		return name + "来自" + port + "端口项目接口";
	}
}
