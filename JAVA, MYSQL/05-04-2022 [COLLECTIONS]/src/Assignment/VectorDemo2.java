package Assignment;

import java.util.Iterator;
import java.util.Vector;

class Employee {
	int employeeId;
	String employeeName;
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
}

public class VectorDemo2 {
	public static void main(String[] args) {
		Employee employee1=new Employee(1, "Aman");
		Employee employee2=new Employee(2, "Kumar");
		Vector<Employee> vector=new Vector<Employee>();
		vector.add(employee1);
		vector.add(employee2);
		Iterator<Employee>  iterator=vector. iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
	}
}
