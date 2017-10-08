package com.demo.helloworld.listener;

import java.util.EventListener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurateListener {

	@Bean
	public ServletListenerRegistrationBean<EventListener> configListener() {
		ServletListenerRegistrationBean<EventListener> listener = new ServletListenerRegistrationBean<EventListener>(
				new ConfigListener());
		return listener;
	}
}
