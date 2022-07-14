
public class ThreadDaemonDemo extends Thread {
	public void run() {
		System.out.println("RUN");
		if(Thread.currentThread().isDaemon()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	public static void main(String[] args) {
		System.out.println("MAIN");
		ThreadDaemonDemo threadDaemonDemo = new ThreadDaemonDemo();
		threadDaemonDemo.setDaemon(true);
		threadDaemonDemo.start();
	}
}
