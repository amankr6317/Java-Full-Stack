import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("January");
		linkedList.add("February");
		linkedList.add("March");
		linkedList.add("April");
		linkedList.add("May");
		linkedList.add("June");
		linkedList.add("July");
		linkedList.add("August");
		linkedList.add("September");
		linkedList.add("October");
		linkedList.add("November");
		linkedList.add("December");
		System.out.println(linkedList);
		Iterator<String> iterator=linkedList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
