
public class MultiThreadingDemo2 extends Thread {
	public void run() {
		System.out.println("Start");
	}

	public static void main(String[] args) {
		MultiThreadingDemo2 obj1 = new MultiThreadingDemo2();
		obj1.start();
		MultiThreadingDemo2 obj2 = new MultiThreadingDemo2();
		obj2.start();
	}
}
