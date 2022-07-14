package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		try {
			ArrayList<Object> arrayList=new ArrayList<Object>();
			arrayList.add(10);
			arrayList.add(10.5F);
			arrayList.add(10.55D);
			arrayList.add("Test");
			Iterator<Object> iterator=arrayList.iterator();
			while (iterator.hasNext()) {
				Object object = (Object) iterator.next();
				if (!(object instanceof Integer || object instanceof Float || object instanceof Double)) {
					throw new Exception("Only Integer, Float, Double is accepted.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
