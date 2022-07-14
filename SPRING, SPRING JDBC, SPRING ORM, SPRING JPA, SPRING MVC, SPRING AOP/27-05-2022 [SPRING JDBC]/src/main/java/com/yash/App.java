package com.yash;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/yash/applicationContext.xml");
		context.registerShutdownHook();
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		obj.display();

		JdbcTemplate temp = context.getBean("jdbctemplate", JdbcTemplate.class);
		String q = "insert into student (id, name) values (?, ?)";
		int msg = temp.update(q, 102, "Kumar");
		System.out.println("record inserted : " + msg);

	}
}
