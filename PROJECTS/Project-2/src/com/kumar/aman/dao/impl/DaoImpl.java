package com.kumar.aman.dao.impl;

import java.util.ArrayList;

import com.kumar.aman.pojo.BeanStudents;
import com.kumar.aman.pojo.BeanTeacher;

public interface DaoImpl {
	public boolean studentDatabase(BeanStudents beanStudents);
	public boolean teacherDatabase(BeanTeacher beanTeacher);
	public int studentCount();
	public ArrayList<Object> showStudent();
	public int teacherCount();
	public ArrayList<Object> showteacher();
}
