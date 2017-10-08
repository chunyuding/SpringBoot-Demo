package com.demo.helloworld.properties.propbean;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("propbean")
@Component
public class PropBean1 implements Serializable {

	private static final long serialVersionUID = 1999660888820940044L;

	private String prop5;
	private String prop6;

	public String getProp5() {
		return prop5;
	}

	public void setProp5(String prop5) {
		this.prop5 = prop5;
	}

	public String getProp6() {
		return prop6;
	}

	public void setProp6(String prop6) {
		this.prop6 = prop6;
	}

}
