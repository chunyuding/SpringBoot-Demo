package com.demo.helloworld.multipart;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class multipartConfigurate {

	@Bean
	@ConfigurationProperties("multipart")
	public MultipartResolver configMultipart() {
		return new CommonsMultipartResolver();
	}
}
