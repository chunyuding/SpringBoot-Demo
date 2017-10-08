package com.demo.helloworld.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

	@Autowired(required = false)
	private ConfigBean1 bean1;

	@Autowired(required = false)
	private ConfigBean2 bean2;

	@RequestMapping(value = "/bean1", method = RequestMethod.GET)
	public String getConfigBean1() {

		if (null != bean1) {
			return bean1.toString();
		} else {
			return "bean1 is null";
		}
	}

	@RequestMapping(value = "/bean2", method = RequestMethod.GET)
	public String getConfigBean2() {

		if (null != bean2) {
			return bean2.toString();
		} else {
			return "bean2 is null";
		}
	}
}
