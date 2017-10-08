package com.demo.helloworld.config;

import java.io.Serializable;

public class ConfigBean2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6277051964731151360L;

	private String value3;

	private String value4;

	private ConfigBean1 configBean1;

	public ConfigBean2() {

		super();
		// TODO Auto-generated constructor stub
	}

	public String getValue3() {

		return value3;
	}

	public void setValue3(String value3) {

		this.value3 = value3;
	}

	public String getValue4() {

		return value4;
	}

	public void setValue4(String value4) {

		this.value4 = value4;
	}

	public ConfigBean1 getConfigBean1() {

		return configBean1;
	}

	public void setConfigBean1(ConfigBean1 configBean1) {

		this.configBean1 = configBean1;
	}

	@Override
	public String toString() {

		return "ConfigBean2 [value3=" + value3 + ", value4=" + value4 + ", configBean1=" + configBean1 + "]";
	}

}
