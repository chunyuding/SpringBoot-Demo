package com.demo.helloworld.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/hello")
public class HelloController {

	private CounterService counterService;

	private GaugeService gaugeService;

	@Autowired
	public HelloController(CounterService counterService, GaugeService gaugeService) {
		super();
		this.counterService = counterService;
		this.gaugeService = gaugeService;
	}
	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public String sayHello() {
		counterService.increment("hello.sayhello.times");
		gaugeService.submit("last.sayhello.time", System.currentTimeMillis());
		return "Hello";
	}
}
