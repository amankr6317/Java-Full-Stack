import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("January");
		arrayList.add("February");
		arrayList.add("March");
		System.out.println(arrayList);
		Enumeration<String> enumeration=Collections.enumeration(arrayList);
		while (enumeration.hasMoreElements())
            System.out.println("Value : " + enumeration.nextElement());
	}
}
