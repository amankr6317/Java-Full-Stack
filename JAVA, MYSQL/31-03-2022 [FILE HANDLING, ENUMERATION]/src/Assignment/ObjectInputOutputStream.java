package Assignment;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable {
	private String name;
	private String department;
	private String designation;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return name+" "+department+" "+designation+" "+salary;
	}
}
class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException, EOFException {
		Scanner sc = new Scanner(System.in);
		Employee employee1=new Employee();
		System.out.print("Enter Name : ");
		employee1.setName(sc.nextLine());
		System.out.print("Enter Department : ");
		employee1.setDepartment(sc.nextLine());
		System.out.print("Enter Designation : ");
		employee1.setDesignation(sc.nextLine());
		System.out.print("Enter Salary : ");
		employee1.setSalary(sc.nextDouble());
		System.out.println(employee1.toString());
		File file=new File("D:/yash.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
		objectOutputStream.writeObject(employee1);
		objectOutputStream.close();
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
		Employee employee2= (Employee) objectInputStream.readObject();
		System.out.println(employee2);
		objectInputStream.close();
	}
}

