package com.yash.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/stereo/applicationcontext.xml");
		Employee e = context.getBean("employee", Employee.class);
		System.out.println(e);
	}
}
