import java.io.*;

class Employee implements Serializable {
	int empId;
	String empName;

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public String toString() {
		return empId + " " + empName;
	}
}

class EmployeeObjectDemo {
	public static void main(String[] args) throws Exception {
//		Employee e = new Employee(1, "Aman");
//		System.out.println(e);
//		File f = new File("D:/Yash Technology/Eclipse Workspace/31-03-2022/src/Assignment/abc.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
//		Employee e=(Employee)ois.readObject();
//		oos.close();
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
//		ois.writeObject(e);
//		ois.close();
	}
}
