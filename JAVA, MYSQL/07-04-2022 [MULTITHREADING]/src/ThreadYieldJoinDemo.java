
public class ThreadYieldJoinDemo extends Thread {
	public void run() {
		try {
			for(int i=1; i<=3; i++) {
				System.out.println("run thread "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadYieldJoinDemo threadYieldJoinDemo = new ThreadYieldJoinDemo();
		threadYieldJoinDemo.start();
		threadYieldJoinDemo.join();
		try {
			for(int i=1; i<=3; i++) {
				System.out.println("main thread "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
