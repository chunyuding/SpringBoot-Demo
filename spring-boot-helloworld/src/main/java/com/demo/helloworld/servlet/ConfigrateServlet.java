package com.demo.helloworld.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigrateServlet {

	@Bean
	public ServletRegistrationBean ConfigServlet() {
		ServletRegistrationBean servlet = new ServletRegistrationBean(new ConfigServlet(), "/ConfigServlet");
		// servlet.addInitParameter(name, value);
		// servlet.setInitParameters(initParameters);
		// servlet.addUrlMappings(urlMappings);
		return servlet;
	}
}
