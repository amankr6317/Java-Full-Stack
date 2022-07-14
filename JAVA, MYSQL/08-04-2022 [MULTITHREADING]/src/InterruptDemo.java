public class InterruptDemo extends Thread {
	public void run() {
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		for (int i = 1; i <= 3; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
				// System.out.println(Thread.interrupted());
				// System.out.println(Thread.currentThread().isInterrupted());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		InterruptDemo interruptDemo = new InterruptDemo();
		interruptDemo.start();
		interruptDemo.interrupt();
		InterruptDemo interruptDemo1 = new InterruptDemo();
		interruptDemo1.start();
	}
}
