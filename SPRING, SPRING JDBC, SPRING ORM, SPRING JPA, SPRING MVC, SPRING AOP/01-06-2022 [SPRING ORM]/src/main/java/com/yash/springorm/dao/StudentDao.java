package com.yash.springorm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.yash.springorm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernatetemp;

	@Transactional
	public int insert(Student stu) {
		Integer i = (Integer) this.hibernatetemp.save(stu);
		return i;
	}

	public Student getStudentDetails(int stuid) {
		Student stu = this.hibernatetemp.get(Student.class, stuid);
		return stu;
	}

	public List<Student> getAllStudents() {
		List<Student> stu = this.hibernatetemp.loadAll(Student.class);
		return stu;
	}

	@Transactional
	public void deleteDetails(int stuid) {
		Student stu = this.hibernatetemp.get(Student.class, stuid);
		this.hibernatetemp.delete(stu);
	}

	@Transactional
	public void updateDetails(Student stu) {
		this.hibernatetemp.update(stu);
	}

	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}

}