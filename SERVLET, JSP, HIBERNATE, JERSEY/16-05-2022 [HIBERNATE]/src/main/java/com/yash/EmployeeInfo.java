package com.yash;

import java.util.Date;

public class EmployeeInfo {
	private Integer EmpID;
	private String EmpFname;
	private String EmpLname;
	private String Department;
	private String Address;
	private Date DOB;
	private Character Gender;

	public Integer getEmpID() {
		return EmpID;
	}

	public void setEmpID(Integer empID) {
		EmpID = empID;
	}

	public String getEmpFname() {
		return EmpFname;
	}

	public void setEmpFname(String empFname) {
		EmpFname = empFname;
	}

	public String getEmpLname() {
		return EmpLname;
	}

	public void setEmpLname(String empLname) {
		EmpLname = empLname;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Character getGender() {
		return Gender;
	}

	public void setGender(Character gender) {
		Gender = gender;
	}
}
