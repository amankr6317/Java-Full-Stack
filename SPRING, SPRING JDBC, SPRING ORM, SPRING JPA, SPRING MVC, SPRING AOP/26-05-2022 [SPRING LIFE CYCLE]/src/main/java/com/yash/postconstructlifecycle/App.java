package com.yash.postconstructlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/com/yash/postconstructlifecycle/applicationcontext.xml");
		context.close();
	}
}
