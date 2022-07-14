class A {
	int i = 10;
}	 
class B extends A {
	int j = 20;
}
class C extends B {
	int k = 30;
}
public class UnCheckedExceptionDemo {
	public static void main(String[] args) {
		try {
			int a=10, b=0;
			int c=a/b;
			
			int arr[] = new int[10];
			System.out.println(arr[10]);
			
			String str=null;
			if(str.equalsIgnoreCase("test"));
			{
				System.out.println("same");
			}
			
			A a1 = new B();
	        	B b1 = (B) a1;     
	        	C c1 = (C) b1;
	        	System.out.println(c1.k);
	        
			Number[] ar = new Double[2];
			ar[0] = new Integer(4);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (ArrayStoreException e) {
			e.printStackTrace();
		}
	}
}
