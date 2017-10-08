package com.demo.helloworld.properties.propbean;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("propbean")
@Component
public class PropBean2 implements Serializable {

	private static final long serialVersionUID = 6315618811558699844L;

	private String prop_seve;
	private String propEight;

	public String getProp_seve() {
		return prop_seve;
	}

	public void setProp_seve(String prop_seve) {
		this.prop_seve = prop_seve;
	}

	public String getPropEight() {
		return propEight;
	}

	public void setPropEight(String propEight) {
		this.propEight = propEight;
	}

}
