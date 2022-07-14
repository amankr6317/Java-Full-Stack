package com.yash;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("I'm the " + "init() method");
	}

	public void destroy() throws Exception {
		System.out.println("I'm the destroy() method");
	}
	
	public void display( ) {
		System.out.println(getMessage());
	}

}
