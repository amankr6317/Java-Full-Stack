import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo4 {
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
			PreparedStatement stmt = con.prepareStatement("UPDATE employee SET empID = ?, empName = ? WHERE empID = ?;");  
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Emp ID to Update : ");
			int id1 = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter Emp ID : ");
			int id2 = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter Emp Name : ");
			String name = bufferedReader.readLine();
			stmt.setInt(1, id2);
			stmt.setString(2, name);
			stmt.setInt(3, id1);
			stmt.executeUpdate();
			System.out.println("Data inserted Successfully");
			con.close();  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
