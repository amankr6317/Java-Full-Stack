
class Mythread1 extends Thread {
	public void run() {
		System.out.println("Thread1");
	}
}
class Mythread2 extends Thread {
	public void run() {
		System.out.println("Thread2");
	}
}
class Mythread3 extends Thread {
	public void run() {
		System.out.println("Thread3");
	}
}
public class MultiThreadingDemo3 {
	public static void main(String[] args) {
		Mythread1 mythread1=new Mythread1();
		mythread1.start();
		Mythread2 mythread2=new Mythread2();
		mythread2.start();
		Mythread3 mythread3=new Mythread3();
		mythread3.start();
	}
}
