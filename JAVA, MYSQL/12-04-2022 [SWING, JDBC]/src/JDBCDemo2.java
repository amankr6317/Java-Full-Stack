import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo2 {
	public static void main(String[] args) {
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
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?)");  
			stmt.setInt(1,1004);
			stmt.setString(2,"Rohan");
			stmt.executeUpdate();
			System.out.println("Data inserted Successfully");
			con.close();  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
