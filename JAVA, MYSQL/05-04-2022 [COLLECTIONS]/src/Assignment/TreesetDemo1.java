package Assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo1 {
	public static void main(String[] args) {
		TreeSet<String> hashSet=new TreeSet<String>();
		hashSet.add("Aman");
		hashSet.add("Kumar");
		
		String str1="Aman";
		boolean result=false;
		
		Iterator<String>  iterator1=hashSet.descendingIterator();
		while (iterator1.hasNext()) {
			String string = (String) iterator1.next();
			System.out.println(string);
		}
		
		Iterator<String>  iterator2=hashSet.iterator();
		while (iterator2.hasNext()) {
			String str2 = (String) iterator2.next();
			if (str2.equalsIgnoreCase(str1)) {
				result=true;
			} 
		}
		
		if (result) {
			System.out.println("Exists");
		} else {
			System.out.println("Not Exists");
		}
	}
}
