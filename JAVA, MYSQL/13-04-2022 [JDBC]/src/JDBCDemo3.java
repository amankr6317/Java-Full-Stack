import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo3 {
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
			CallableStatement stmt = con.prepareCall("insert into employee values(?,?)");  
			stmt.setInt(1,1005);
			stmt.setString(2,"Rishabh");
			stmt.executeUpdate();
			System.out.println("Data inserted Successfully");
			con.close();  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
