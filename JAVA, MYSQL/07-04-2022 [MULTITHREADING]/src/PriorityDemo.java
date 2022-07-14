
public class PriorityDemo extends Thread {
	public void run() {
		System.out.println("In run Method");
		System.out.println(Thread.currentThread().getPriority());;
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		PriorityDemo priorityDemo = new PriorityDemo();
		priorityDemo.start();
	}
}
