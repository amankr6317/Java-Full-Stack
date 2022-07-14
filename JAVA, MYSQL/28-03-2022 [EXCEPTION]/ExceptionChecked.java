class ExceptionChecked {
	public static void main (String[] args) {
		try {
			FileInputSream fileInputSream = new FileInputSream("D:\Yash Technology\Core JAVA\28-03-2022 Exceptions\abc.txt"); // File Not Found Exception
		} catch (Exception e) {
			System.out.println(e);
		}
		
		Class.forNAme("com.mysql.jdbc.Driver"); // Class Not Found Exception
	}
}