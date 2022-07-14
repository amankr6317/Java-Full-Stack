import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Aman");
		arrayList.add("Kumar");
		System.out.println(arrayList);
		ListIterator<String> iterator=arrayList.listIterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		while (iterator.hasPrevious()) {
			String string = (String) iterator.previous();
			System.out.println(string);
		}
	}
}
