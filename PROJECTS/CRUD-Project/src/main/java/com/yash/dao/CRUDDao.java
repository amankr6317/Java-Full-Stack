package com.yash.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yash.model.CRUDModel;

public class CRUDDao {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/self", "root", "root");
			// System.out.println("Successfully connected to database");
		} catch (Exception e) {
			// System.out.println("Unable to connect to database.");
			System.out.println(e);
		}
		return connection;
	}

	public static List<CRUDModel> getAllEmployees() {
		List<CRUDModel> list = new ArrayList<CRUDModel>();
		try {
			Connection connection = CRUDDao.getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from crud");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CRUDModel crudModel = new CRUDModel();
				crudModel.setId(rs.getInt(1));
				crudModel.setName(rs.getString(2));
				crudModel.setPassword(rs.getString(3));
				crudModel.setEmail(rs.getString(4));
				list.add(crudModel);
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static int save(CRUDModel crudModel) {
		int status = 0;
		try {
			Connection connection = CRUDDao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into crud (username, password, email) values (?,?,?)");
			preparedStatement.setString(1, crudModel.getName());
			preparedStatement.setString(2, crudModel.getPassword());
			preparedStatement.setString(3, crudModel.getEmail());
			status = preparedStatement.executeUpdate();
			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}

	public static int update(CRUDModel crudModel) {
		int status = 0;
		try {
			Connection con = CRUDDao.getConnection();
			PreparedStatement ps = con.prepareStatement("update crud set username=?, password=?, email=? where id = ?");
			ps.setString(1, crudModel.getName());
			ps.setString(2, crudModel.getPassword());
			ps.setString(3, crudModel.getEmail());
			ps.setInt(4, crudModel.getId());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}

	public static int delete(int id) {
		int status = 0;
		try {
			Connection connection = CRUDDao.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from crud where id = ?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static CRUDModel getEmployeeById(int id) {
		CRUDModel crudModel = new CRUDModel();
		try {
			Connection con = CRUDDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from crud where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				crudModel.setId(rs.getInt(1));
				crudModel.setName(rs.getString(2));
				crudModel.setPassword(rs.getString(3));
				crudModel.setEmail(rs.getString(4));
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return crudModel;
	}

	public static boolean signIn(String email, String password) {
		CRUDModel crudModel = new CRUDModel();
		try {
			Connection connection = CRUDDao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT email, password FROM crud WHERE is_admin = 1;");
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				crudModel.setEmail(rs.getString(1));
				crudModel.setPassword(rs.getString(2));
			}
//			System.out.println(crudModel.getEmail()+" "+crudModel.getPassword());
			if(email.equals(crudModel.getEmail()) && password.equals(crudModel.getPassword())) {
				return true;
			}
			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
