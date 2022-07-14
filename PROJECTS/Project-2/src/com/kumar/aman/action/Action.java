package com.kumar.aman.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import com.kumar.aman.dao.Dao;
import com.kumar.aman.pojo.BeanStudents;
import com.kumar.aman.pojo.BeanTeacher;

public class Action {
	public void addStudent() {
		BeanStudents beanStudents = new BeanStudents();
		Dao dao = new Dao();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("\nEnter Student Name : ");
			while (true) {
				String name = bufferedReader.readLine();
				boolean nameResult = name.matches("[a-zA-Z]+");
				if (nameResult) {
					beanStudents.setStudentName(name);
					break;
				} else {
					System.out.println("Enter proper Name");
				}
			}
			System.out.println("Enter Student Roll : ");
			while (true) {
				String roll = bufferedReader.readLine();
				boolean rollResult = roll.matches("[1-2][0-9]{9}");
				if (rollResult) {
					beanStudents.setStudentRoll(Integer.parseInt(roll));
					break;
				} else {
					System.out.println("Enter proper Roll");
				}
			}
			System.out.println("Path for Student Photo : ");
			beanStudents.setStudentPhoto(bufferedReader.readLine());
			System.out.println("Enter Student Address : ");
			beanStudents.setStudentAddress(bufferedReader.readLine());
			System.out.println("Enter Student Phone Number : ");
			while (true) {
				String phoneno = bufferedReader.readLine();
				boolean phoneResult = phoneno.matches("[1-2][0-9]{9}");
				if (phoneResult) {
					beanStudents.setStudentNumber(Integer.parseInt(phoneno));
					break;
				} else {
					System.out.println("Enter proper Phone Number");
				}
			}
			System.out.println("Enter Student Email : ");
			while (true) {
				String email = bufferedReader.readLine();
				boolean emailResult = email.matches("^(.+)@(.+)$");
				if (emailResult) {
					beanStudents.setStudentEmail(email);
					break;
				} else {
					System.out.println("Enter proper Email");
				}
			}
			boolean flag = dao.studentDatabase(beanStudents);
			if(flag) {
				System.out.println("\nData Added Successfully");
			} else {
				System.out.println("\nData Not Added");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addTeacher() {
		BeanTeacher beanTeacher = new BeanTeacher();
		Dao dao = new Dao();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("\nEnter Teacher Name : ");
			while (true) {
				String name = bufferedReader.readLine();
				boolean nameResult = name.matches("[a-zA-Z]+");
				if (nameResult) {
					beanTeacher.setTeacherName(name);
					break;
				} else {
					System.out.println("Enter proper Name");
				}
			}
			System.out.println("Enter Teacher Roll : ");
			while (true) {
				String roll = bufferedReader.readLine();
				boolean rollResult = roll.matches("[1-2][0-9]{9}");
				if (rollResult) {
					beanTeacher.setTeacherRoll(Integer.parseInt(roll));
					break;
				} else {
					System.out.println("Enter proper Roll");
				}
			}
			System.out.println("Path for Teacher Photo : ");
			beanTeacher.setTeacherPhoto(bufferedReader.readLine());
			System.out.println("Enter Teacher Address : ");
			beanTeacher.setTeacherAddress(bufferedReader.readLine());
			System.out.println("Enter Teacher Phone Number : ");
			while (true) {
				String phoneno = bufferedReader.readLine();
				boolean phoneResult = phoneno.matches("[1-2][0-9]{9}");
				if (phoneResult) {
					beanTeacher.setTeacherNumber(Integer.parseInt(phoneno));
					break;
				} else {
					System.out.println("Enter proper Phone Number");
				}
			}
			System.out.println("Enter Teacher Email : ");
			while (true) {
				String email = bufferedReader.readLine();
				boolean emailResult = email.matches("^(.+)@(.+)$");
				if (emailResult) {
					beanTeacher.setTeacherEmail(email);
					break;
				} else {
					System.out.println("Enter proper Email");
				}
			}
			boolean flag = dao.teacherDatabase(beanTeacher);
			if(flag) {
				System.out.println("\nData Added Successfully");
			} else {
				System.out.println("\nData Not Added");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getStudent() {
		Dao dao = new Dao();
		ArrayList<Object> arrayList = new ArrayList<>();
		HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
		int count = dao.studentCount();
		arrayList = dao.showStudent();
		hashMap.put("Total count", count);
		hashMap.put("Student Details", arrayList);
		System.out.println(hashMap);
	}

	public void getTeacher() {
		Dao dao = new Dao();
		ArrayList<Object> arrayList = new ArrayList<>();
		HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
		int count = dao.teacherCount();
		arrayList = dao.showteacher();
		hashMap.put("Total count", count);
		hashMap.put("Teacher Details", arrayList);
		System.out.println(hashMap);	
	}
}
