class Test {
	String str;
}
class ReflectionDemo1 {
    public static void main(String args[]) {
		Test obj = new Test();
		Class cls1 = obj.getClass();
		Class cls2 = null;
		try {
			cls2 = Class.forName("Test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The name of class is " +cls1.getName());
		System.out.println("The name of class is " +cls2.getName());
    }
}