import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		Queue<Integer> queue1=new LinkedList<Integer>();
		queue1.add(1000);
		queue1.add(2000);
		queue1.add(3000);
		System.out.println(queue1.peek());
		System.out.println(queue1.poll());
		System.out.println(queue1.peek());
	}
}
