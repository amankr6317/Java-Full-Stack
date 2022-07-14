
//public class MultiThreadingDemo extends Thread {
//	public void run() {
//		System.out.println("Thread Started");
//	}
//	
//	public static void main(String[] args) {
//		MultiThreadingDemo multiThreadingDemo = new MultiThreadingDemo();
//		multiThreadingDemo.start();
//	}
//}

public class MultiThreadingDemo1 implements Runnable {
	public void run() {
		System.out.println("Thread Started");
	}
	
	public static void main(String[] args) {
		MultiThreadingDemo1 multiThreadingDemo = new MultiThreadingDemo1();
		Thread thread=new Thread(multiThreadingDemo);
		thread.start();
	}
}

