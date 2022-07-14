class BookTicket {
	int totalseats=12;
	void bookset(int seats) {
		if(totalseats>=seats) {
			System.out.println("Booked Sucessfully");
			totalseats=totalseats-seats;
		} else {
			System.out.println("Seats are not available "+totalseats);
		}
		System.out.println("Remaing seats "+totalseats);
	}
}
public class ThreadSynchronizationDemo1 extends Thread {
	static BookTicket b;
	int seats;
	public void run() {
		b.bookset(seats);
	}
	public static void main(String[] args) {
		b=new BookTicket();
		ThreadSynchronizationDemo1 thread1=new ThreadSynchronizationDemo1();
		thread1.seats=8;
		thread1.start();
		ThreadSynchronizationDemo1 thread2=new ThreadSynchronizationDemo1();
		thread2.seats=10;
		thread2.start();
	}
}
