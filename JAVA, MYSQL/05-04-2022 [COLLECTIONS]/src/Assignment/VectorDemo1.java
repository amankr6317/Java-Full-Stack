package Assignment;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo1 {
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
		Vector<String> vector=new Vector<String>();
		vector.addAll(arrayList);
		System.out.println(vector);
	}
}
