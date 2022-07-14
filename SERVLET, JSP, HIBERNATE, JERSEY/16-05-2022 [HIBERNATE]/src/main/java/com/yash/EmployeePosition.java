package com.yash;

import java.util.Date;

public class EmployeePosition {
	private Integer ID;
	private EmployeeInfo employeeInfo;
	private String EmpPosition;
	private Date DateOfJoining;
	private Integer Salary;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public String getEmpPosition() {
		return EmpPosition;
	}

	public void setEmpPosition(String empPosition) {
		EmpPosition = empPosition;
	}

	public Date getDateOfJoining() {
		return DateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}

	public Integer getSalary() {
		return Salary;
	}

	public void setSalary(Integer salary) {
		Salary = salary;
	}
}
