package com.yash.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springjdbc.dao.StudentDao;
import com.yash.springjdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (true) {
			System.out.println("Enter Email and Password to Login\n");
			System.out.print("Enter Email : ");
			String email = sc.nextLine();
			System.out.print("Enter Password : ");
			String password = sc.nextLine();
			System.out.println("");
			if (email.equalsIgnoreCase("aman@yash.com") && password.equalsIgnoreCase("yash1234")) {
				break;
			} else if (count == 3) {
				System.exit(0);
			} else {
				System.out.println("Wrong Email and Password");
				int flag = 3 - count;
				System.out.println("Attempt Remaining : " + flag);
				System.out.println();
				count++;
			}
		}
		lp: while (true) {
			System.out.println("Enter the number to perform the Opertion");
			System.out.println("1 : Display all records");
			System.out.println("2 : Display single record");
			System.out.println("3 : Add new record");
			System.out.println("4 : Update a record");
			System.out.println("5 : Delete a record");
			System.out.println("6 : Exit");
			System.out.println();
			System.out.print("Enter Key : ");
			int key = Integer.parseInt(sc.nextLine());
			System.out.println();
			App app = new App();
			switch (key) {
			case 1:
				app.displayall();
				break;
			case 2:
				app.display();
				break;
			case 3:
				app.add();
				break;
			case 4:
				app.update();
				break;
			case 5:
				app.delete();
				break;
			case 6:
				break lp;
			default:
				System.out.println("Wrong key");
				System.out.println();
				break;
			}
		}
	}

	private void delete() {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
		StudentDao stdao = context.getBean("StudentDao", StudentDao.class);
		Student student = new Student();
		System.out.print("Enter the id to delete : ");
		int id = Integer.parseInt(sc.nextLine());
		student.setId(id);
		student.setName(null);
		int rs = stdao.delete(student);
		System.out.println(rs + " Student delete Successfully ");
		System.out.println();
	}

	private void update() {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
		StudentDao stdao = context.getBean("StudentDao", StudentDao.class);
		Student student = new Student();
		System.out.print("Enter the id to update : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the name to update : ");
		String name = sc.nextLine();
		student.setId(id);
		student.setName(name);
		int r = stdao.update(student);
		System.out.println(r + " Student update Successfully ");
		System.out.println();
	}

	private void add() {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
		StudentDao stdao = context.getBean("StudentDao", StudentDao.class);
		Student student = new Student();
		System.out.print("Enter the id to add : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the name to add : ");
		String name = sc.nextLine();
		student.setId(id);
		student.setName(name);
		int r = stdao.insert(student);
		System.out.println(r + " Student added Successfully ");
		System.out.println();
	}

	private void display() {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
		StudentDao stdao = context.getBean("StudentDao", StudentDao.class);
		Student student = new Student();
		System.out.print("Enter the id to display : ");
		int id = Integer.parseInt(sc.nextLine());
		student.setId(id);
		student.setName(null);
		Student s1 = stdao.select(student);
		System.out.println(s1);
		System.out.println();
	}

	private void displayall() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
		StudentDao stdao = context.getBean("StudentDao", StudentDao.class);
		List<Student> list = stdao.selectall();
		for (Student s : list) {
			System.out.println(s);
		}
		System.out.println();
	}
}