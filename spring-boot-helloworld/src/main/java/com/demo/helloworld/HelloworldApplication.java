package com.demo.helloworld;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.helloworld.properties.propbean.PropBean3;

//@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.demo.helloworld")
public class HelloworldApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(HelloworldApplication.class).bannerMode(Banner.Mode.OFF).run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloworldApplication.class).bannerMode(Banner.Mode.OFF);
	}

	@RequestMapping("/")
	public String welcome() {
		return "redirect:/" + "index.html";
	}

	@ConfigurationProperties("propbean")
	@Bean
	public PropBean3 config() {
		return new PropBean3();
	}
}
