package com.kumar.aman.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kumar.aman.dao.impl.DaoImpl;
import com.kumar.aman.pojo.BeanStudents;
import com.kumar.aman.pojo.BeanTeacher;
import com.kumar.aman.util.DbConnection;

public class Dao implements DaoImpl {
	@Override
	public boolean studentDatabase(BeanStudents beanStudents) {
		DbConnection dbConnection = new DbConnection();
		try {
			Connection con = dbConnection.getConnection();
			InputStream inputStream = new FileInputStream(beanStudents.getStudentPhoto());
			PreparedStatement stmt = con.prepareStatement("insert into student_information (student_name, student_roll, student_photo, student_address, student_number, student_email) value (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, beanStudents.getStudentName());
			stmt.setInt(2, beanStudents.getStudentRoll());
			stmt.setBlob(3, inputStream);
			stmt.setString(4, beanStudents.getStudentAddress());
			stmt.setInt(5, beanStudents.getStudentNumber());
			stmt.setString(6, beanStudents.getStudentEmail());
			stmt.executeUpdate();
			con.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean teacherDatabase(BeanTeacher beanTeacher) {
		DbConnection dbConnection = new DbConnection();
		try {
			Connection con = dbConnection.getConnection();
			InputStream inputStream = new FileInputStream(beanTeacher.getTeacherPhoto());
			PreparedStatement stmt = con.prepareStatement("insert into teacher_infromation (teacher_name, teacher_roll, teacher_photo, teacher_address, teacher_number, teacher_email) value (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, beanTeacher.getTeacherName());
			stmt.setInt(2, beanTeacher.getTeacherRoll());
			stmt.setBlob(3, inputStream);
			stmt.setString(4, beanTeacher.getTeacherAddress());
			stmt.setInt(5, beanTeacher.getTeacherNumber());
			stmt.setString(6, beanTeacher.getTeacherEmail());
			stmt.executeUpdate();
			con.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public int studentCount() {
		int count=0;
		DbConnection dbConnection = new DbConnection();
		try {
			Connection con = dbConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement("select count(*) from student_information");
			ResultSet resultSet = stmt.executeQuery();
			resultSet.next();
			count = resultSet.getInt(1);
			con.close();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	@Override
	public ArrayList<Object> showStudent() {
		DbConnection dbConnection = new DbConnection();
		ArrayList<Object> arrayList = new ArrayList<Object>();
		BeanStudents beanStudents = new BeanStudents();
		try {
			Connection con = dbConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement("select * from student_information");
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				beanStudents.setStudentId(resultSet.getInt(1));
				beanStudents.setStudentName(resultSet.getString(2));
				beanStudents.setStudentRoll(resultSet.getInt(3));
				beanStudents.setStudentPhoto(resultSet.getString(4));
				beanStudents.setStudentAddress(resultSet.getString(5));
				arrayList.add(beanStudents);
			}
			con.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayList;
	}

	@Override
	public int teacherCount() {
		int count=0;
		DbConnection dbConnection = new DbConnection();
		try {
			Connection con = dbConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement("select count(*) from teacher_infromation");
			ResultSet resultSet = stmt.executeQuery();
			resultSet.next();
			count = resultSet.getInt(1);
			con.close();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<Object> showteacher() {
		DbConnection dbConnection = new DbConnection();
		ArrayList<Object> arrayList = new ArrayList<Object>();
		BeanTeacher beanTeacher = new BeanTeacher();
		try {
			Connection con = dbConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement("select * from teacher_infromation");
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				beanTeacher.setTeacherId(resultSet.getInt(1));
				beanTeacher.setTeacherName(resultSet.getString(2));
				beanTeacher.setTeacherRoll(resultSet.getInt(3));
				beanTeacher.setTeacherPhoto(resultSet.getString(4));
				beanTeacher.setTeacherAddress(resultSet.getString(5));
				arrayList.add(beanTeacher);
			}
			con.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayList;
	}
}
