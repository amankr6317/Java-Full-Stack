import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add("Aman");
		arrayList.add(101);
		for (Object object : arrayList) {
			System.out.println(object);
		}
	}
}
