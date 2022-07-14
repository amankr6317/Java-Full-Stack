import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("January");
		arrayList.add("February");
		arrayList.add("March");
		arrayList.add("April");
		arrayList.add("May");
		arrayList.add("June");
		arrayList.add("July");
		arrayList.add("August");
		arrayList.add("September");
		arrayList.add("October");
		arrayList.add("November");
		arrayList.add("December");
		System.out.println(arrayList);
		Iterator<String> iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		ListIterator<String> listIterator=arrayList.listIterator();
		listIterator.next();
		listIterator.next();
		listIterator.next();
		while (listIterator.hasPrevious()) {
			String string = (String) listIterator.previous();
			System.out.println(string);
		}
	}
}
