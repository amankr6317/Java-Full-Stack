class ExceptionChecked2 {
	public static void main (String[] args) {
		// FileInputSream fileInputSream = new FileInputSream("D:\Yash Technology\Core JAVA\28-03-2022 Exceptions\abc.txt"); // File Not Found Exception
		try {
			// String s=null;
			// System.out.println(s.length());
			System.out.println("Hello");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Bye");
		// Class.forNAme("com.mysql.jdbc.Driver"); // Class Not Found Exception
	}
}