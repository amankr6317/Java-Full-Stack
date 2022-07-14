import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add(10);
		arrayList.add("Aman");
		arrayList.add('A');
		System.out.println(arrayList);
		
		HashSet hashSet=new HashSet();
		hashSet.add(20);
		hashSet.add("Kumar");
		System.out.println(hashSet);
		
		HashMap hashMap=new HashMap();
		hashMap.put(0, "Aman");
		hashMap.put(1, "Kumar");
		System.out.println(hashMap);
	}
}
