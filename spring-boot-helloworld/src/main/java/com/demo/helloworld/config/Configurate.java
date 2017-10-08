package com.demo.helloworld.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurate {

	@ConditionalOnExpression("${configbean.configbean1.configornot}")
	@ConfigurationProperties("configbean")
	@Bean
	public ConfigBean1 configBean1() {

		return new ConfigBean1();
	}

	@ConditionalOnExpression("${configbean.configbean2.configornot}")
	// @ConditionalOnBean(ConfigBean1.class)
	@ConfigurationProperties("configbean")
	@Bean
	public ConfigBean2 configBean2(ConfigBean1 configBean1) {

		ConfigBean2 configBean2 = new ConfigBean2();
		configBean2.setConfigBean1(configBean1);
		return configBean2;
	}

}
