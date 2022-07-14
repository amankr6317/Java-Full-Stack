package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/yash/applicationContext.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
	
		Triangle triangle1 = (Triangle) context.getBean("triangle");
		System.out.println(triangle1.getPointA());
		System.out.println(triangle1.getPointB());
		System.out.println(triangle1.getPointC());
	}
}
