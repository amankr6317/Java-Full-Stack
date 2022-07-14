package com.yash.springjdbc.dao;

import java.util.List;

import com.yash.springjdbc.entities.Student;

public interface StudentDao {

	public int insert(Student stu);
	public int update(Student stu);
	public int delete(Student stu);
	public Student select(Student stu);
	public List<Student> selectall();


}