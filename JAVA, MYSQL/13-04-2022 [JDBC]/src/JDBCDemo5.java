import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo5 {
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
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Emp ID for which you want to upload picture : ");
			int id = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter path for the picture : ");
			String path = bufferedReader.readLine();
			InputStream inputStream = new FileInputStream(path);
			PreparedStatement stmt = con.prepareStatement("update employee_information set empPicture = ? where empID = ?");  
			stmt.setBlob(1, inputStream);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			System.out.println("Data inserted Successfully");
			con.close();  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
