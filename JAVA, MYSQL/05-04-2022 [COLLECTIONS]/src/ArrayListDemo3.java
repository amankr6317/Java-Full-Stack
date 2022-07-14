import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<Object> arrayList=new ArrayList<Object>();
		arrayList.add("Aman");
		arrayList.add("Learning Full Stack Web Development");
		System.out.println(arrayList);
		Iterator<Object> iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		for (Object object : arrayList) {
			System.out.println(object);
		}
	}
}
