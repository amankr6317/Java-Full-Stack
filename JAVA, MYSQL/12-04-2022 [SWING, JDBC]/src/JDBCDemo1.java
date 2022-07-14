import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {
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
			String query = "select * from employee";
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				System.out.println("ID : "+id+", NAME : "+name);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
