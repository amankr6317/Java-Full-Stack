package com.yash.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.springjdbc.entities.*;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbctemp;

	public int insert(Student stu) {

		String q = "insert into student(id,name) values(?,?)";
		int msg = this.jdbctemp.update(q, stu.getId(), stu.getName());
		return msg;
	}

	public int update(Student stu) {
		String q = "update student set name = ? where id = ?";
		int msg = this.jdbctemp.update(q, stu.getName(), stu.getId());
		return msg;
	}

	public int delete(Student stu) {
		String q = "delete from student where id = ?";
		int msg = this.jdbctemp.update(q, stu.getId());
		return msg;
	}

	public Student select(Student stu) {
		String q = "select * from student where id=?";
		RowMapper<Student> rowmapper = new RowMapperimpl();
		Student student = this.jdbctemp.queryForObject(q, rowmapper, stu.getId());
		return student;
	}
	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	public List<Student> selectall() {
		String q = "select * from student";
		List<Student> students = this.jdbctemp.query(q, new RowMapperimpl());
		return students;
	}

}