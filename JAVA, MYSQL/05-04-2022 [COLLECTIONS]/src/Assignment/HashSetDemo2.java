package Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("Aman");
		hashSet.add("Kumar");
		Iterator<String>  iterator=hashSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
