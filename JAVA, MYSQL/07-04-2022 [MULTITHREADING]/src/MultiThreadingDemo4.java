
public class MultiThreadingDemo4 extends Thread {
	public void run() {
		Thread.currentThread().setName("Run");
		System.out.println("RUN Method "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("Yash");
//		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getName());
		MultiThreadingDemo4 thread1 = new MultiThreadingDemo4();
		System.out.println(thread1.isAlive());
		thread1.setName("thread 1");
		thread1.start();
		System.out.println(thread1.isAlive());
		System.out.println(Thread.currentThread().isAlive());
		MultiThreadingDemo4 thread2 = new MultiThreadingDemo4();
		thread2.setName("thread 2");
		thread2.start();
	}
}
