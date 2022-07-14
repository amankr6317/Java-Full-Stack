import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo6 {
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
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();  
			if(rs.next()) {              
				Blob blob = rs.getBlob(3);
				byte barr[] = blob.getBytes(1, (int)blob.length());         
				FileOutputStream fout=new FileOutputStream("D:/dummy.jpg");  
				fout.write(barr);             
				fout.close();  
			}
			con.close(); 
			System.out.println("Data downloaded Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
