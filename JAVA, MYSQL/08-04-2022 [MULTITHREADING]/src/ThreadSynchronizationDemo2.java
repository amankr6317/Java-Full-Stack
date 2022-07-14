//class BookTicket1 {
//	int totalseats = 12;
//
//	synchronized void bookset(int seats) {
//		if (totalseats >= seats) {
//			System.out.println("Booked Sucessfully");
//			totalseats = totalseats - seats;
//		} else {
//			System.out.println("Seats are not available " + totalseats);
//		}
//		System.out.println("Remaing seats " + totalseats);
//	}
//}
//
//public class ThreadSynchronizationDemo2 extends Thread {
//	static BookTicket1 b;
//	int seats;
//
//	public void run() {
//		b.bookset(seats);
//	}
//
//	public static void main(String[] args) {
//		b = new BookTicket1();
//		ThreadSynchronizationDemo2 thread1 = new ThreadSynchronizationDemo2();
//		thread1.seats = 8;
//		thread1.start();
//		ThreadSynchronizationDemo2 thread2 = new ThreadSynchronizationDemo2();
//		thread2.seats = 10;
//		thread2.start();
//	}
//}

//	-------------------------------------------------------------------------- 

//class BookTicket1 {
//	int totalseats = 12;
//
//	void bookset(int seats) {
//		synchronized (this) {
//			if (totalseats >= seats) {
//				System.out.println("Booked Sucessfully");
//				totalseats = totalseats - seats;
//			} else {
//				System.out.println("Seats are not available");
//			}
//		}
//		System.out.println("Remaing seats " + totalseats);
//	}
//}
//
//public class ThreadSynchronizationDemo2 extends Thread {
//	static BookTicket1 b;
//	int seats;
//
//	public void run() {
//		b.bookset(seats);
//	}
//
//	public static void main(String[] args) {
//		b = new BookTicket1();
//		ThreadSynchronizationDemo2 thread1 = new ThreadSynchronizationDemo2();
//		thread1.seats = 8;
//		thread1.start();
//		ThreadSynchronizationDemo2 thread2 = new ThreadSynchronizationDemo2();
//		thread2.seats = 10;
//		thread2.start();
//	}
//}

//	-------------------------------------------------------------------------- 

class BookTicket1 {
	static int totalseats = 12;

	static synchronized void bookset(int seats) {
		if (totalseats >= seats) {
			System.out.println("Booked Sucessfully");
			totalseats = totalseats - seats;
		} else {
			System.out.println("Seats are not available " + totalseats);
		}
		System.out.println("Remaing seats " + totalseats);
	}
}

class Thread1 extends Thread {
	static BookTicket1 b;
	int seats;

	public Thread1(BookTicket1 b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.bookset(seats);
	}
}

class Thread2 extends Thread {
	static BookTicket1 b;
	int seats;

	public Thread2(BookTicket1 b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.bookset(seats);
	}
}

public class ThreadSynchronizationDemo2 extends Thread {
	public static void main(String[] args) {
		BookTicket1 b = new BookTicket1();
		Thread1 thread1 = new Thread1(b, 8);
		thread1.start();
		Thread2 thread2 = new Thread2(b, 3);
		thread2.start();
	}
}