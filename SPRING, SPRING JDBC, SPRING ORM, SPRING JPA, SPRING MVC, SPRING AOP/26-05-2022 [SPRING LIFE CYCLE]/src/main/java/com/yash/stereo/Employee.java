package com.yash.stereo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	@Value("Jaynam")
	private String empName;
	@Value("Indore")
	private String location;

	public String getEmpName() {
		return empName;
	}

	public String getLocation() {
		return location;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", location=" + location + "]";
	}

}
