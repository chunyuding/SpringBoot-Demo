package com.demo.helloworld.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//@WebListener
public class ConfigListener implements ServletContextListener, ServletRequestListener {

	public ConfigListener() {
	}
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("Test requestDestroyed");
	}
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("Test requestInitialized");
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Test contextDestroyed");
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Test contextInitialized");
	}
}
