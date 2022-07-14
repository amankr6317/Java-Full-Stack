import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		Iterator<String> iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			// System.out.println(string);
		}
		// System.out.println(arrayList.get(1));
		arrayList.set(1, "G");
		System.out.println(arrayList);
		Collections.sort(arrayList);;
		System.out.println(arrayList);
	}
}
