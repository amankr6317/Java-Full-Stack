import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		FileOutputStream fin = new FileOutputStream("D:\\testout.txt");  
		DataOutputStream data = new DataOutputStream(fin);  
		data.writeInt(65);  
		data.flush();  
		data.close();  
		System.out.println("Succcess...");
	}
}
