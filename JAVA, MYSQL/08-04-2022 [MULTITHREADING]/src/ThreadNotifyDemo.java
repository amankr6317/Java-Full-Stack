class Revenue extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				total = total + 400;
			}
			this.notify();
		}
	}
}

public class ThreadNotifyDemo {
	public static void main(String[] args) throws Exception {
		Revenue revenue = new Revenue();
		revenue.start();
		synchronized (revenue) {
			revenue.wait();
			System.out.println("Total Amount : "+revenue.total);
		}
	}
}
