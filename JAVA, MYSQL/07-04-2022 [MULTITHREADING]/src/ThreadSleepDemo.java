
public class ThreadSleepDemo extends Thread {
	public void run() {
		for (int i = 0; i <= 3; i++) {
			try {
				// Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			// System.out.println(i);
		}
	}
	public static void main(String[] args)  {
		ThreadSleepDemo threadSleepDemo1 = new  ThreadSleepDemo();
		threadSleepDemo1.setName("1");
		threadSleepDemo1.setPriority(MAX_PRIORITY);
		threadSleepDemo1.start();
		ThreadSleepDemo threadSleepDemo2 = new  ThreadSleepDemo();
		threadSleepDemo2.setName("2");
		threadSleepDemo2.start();
		ThreadSleepDemo threadSleepDemo3 = new  ThreadSleepDemo();
		threadSleepDemo3.setName("3");
		threadSleepDemo1.setPriority(MIN_PRIORITY);
		threadSleepDemo3.start();
		ThreadSleepDemo threadSleepDemo4 = new  ThreadSleepDemo();
		threadSleepDemo4.setName("4");
		threadSleepDemo4.start();
	}
}
