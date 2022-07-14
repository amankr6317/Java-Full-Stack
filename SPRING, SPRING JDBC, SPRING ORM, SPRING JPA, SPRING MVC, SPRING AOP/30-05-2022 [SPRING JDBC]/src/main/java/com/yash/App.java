package com.yash;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/yash/applicationContext.xml");
		context.registerShutdownHook();
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		List<Student> list = studentDao.getAllStudentRowMapper();
		 for(Student student:list)  
		        System.out.println(student);  
	}
}
