package com.demo.helloworld.config;

import java.io.Serializable;

public class ConfigBean1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6277051964731151360L;

	private String value1;

	private String value2;

	public ConfigBean1() {

		super();
		// TODO Auto-generated constructor stub
	}

	public String getValue1() {

		return value1;
	}

	public void setValue1(String value1) {

		this.value1 = value1;
	}

	public String getValue2() {

		return value2;
	}

	public void setValue2(String value2) {

		this.value2 = value2;
	}

	@Override
	public String toString() {

		return "ConfigBean1 [value1=" + value1 + ", value2=" + value2 + "]";
	}

}
