package com.kumar.aman.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/self";
			String user = "root";
			String password = "Amankumar@1234";
			Connection con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				System.out.println("Connection is created Successfully");
			} else {
				System.out.println("Connection is not created");
			}
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
