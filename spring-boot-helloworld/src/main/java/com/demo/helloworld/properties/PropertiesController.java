package com.demo.helloworld.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.helloworld.properties.propbean.PropBean1;
import com.demo.helloworld.properties.propbean.PropBean2;
import com.demo.helloworld.properties.propbean.PropBean3;

@ConfigurationProperties("myproperties")
@RestController()
@RequestMapping(value = "/properties")
public class PropertiesController {

	@Autowired
	private PropBean1 propBean1;

	@Autowired
	private PropBean2 propBean2;

	@Autowired
	private PropBean3 propBean3;

	@Autowired
	private Environment env;

	@Value("${myproperties.prop1}")
	private String prop1;

	private String prop4;

	@RequestMapping(value = "/myproperties", method = RequestMethod.GET)
	public String getProperties(@Value("${myproperties.prop2}") String prop2) {
		String prop3 = env.getProperty("myproperties.prop3");
		return this.prop1 + " : " + prop2 + " : " + prop3 + " : " + prop4 + " ： " + propBean1.getProp5() + " : "
				+ propBean1.getProp6() + " : " + propBean2.getProp_seve() + " : " + propBean2.getPropEight() + " : "
				+ propBean3.getProp9();
	}
	public String getProp4() {
		return prop4;
	}
	public void setProp4(String prop4) {
		this.prop4 = prop4;
	}
}
