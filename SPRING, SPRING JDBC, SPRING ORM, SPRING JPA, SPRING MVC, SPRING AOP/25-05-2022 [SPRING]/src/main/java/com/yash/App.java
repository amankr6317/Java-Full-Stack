package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
//		Collection collection = (Collection) context.getBean("Collection");
//		collection.getAddressList();
//		collection.getAddressSet();
//		collection.getAddressMap();
//		collection.getAddressProperties();
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}
}
