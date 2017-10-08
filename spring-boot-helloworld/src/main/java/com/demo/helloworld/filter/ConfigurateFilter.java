package com.demo.helloworld.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurateFilter {

	@Bean
	public FilterRegistrationBean configFilter() {
		FilterRegistrationBean filter = new FilterRegistrationBean(new ConfigFillter());
		filter.addUrlPatterns("/*");
		filter.setOrder(0);
		// filter.addInitParameter(name, value);
		return filter;
	}
}
