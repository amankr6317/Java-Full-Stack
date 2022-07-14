package springfirstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		System.out.println("Welcome to Spring First Application");
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
//		Employee employee = (Employee) context.getBean("employee");
//		System.out.println(employee);
//		Employee employee1 = (Employee) context.getBean("employee1");
//		System.out.println(employee1);
		
		System.out.println("Welcome to Spring Second Application");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		A a = (A) context.getBean("refa");
		System.out.println(a.getX());
		System.out.println(a.getB().getY());
	}
}
