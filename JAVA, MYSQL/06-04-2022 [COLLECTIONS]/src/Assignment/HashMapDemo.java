package Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Aman");
		map.put("2", "Kumar");
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			if (entry.getKey().equals("1")) {
				System.out.println("Key Exists.");
				break;
			}
		}
		set = map.entrySet();
		iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			if (entry.getValue().equals("Kumar")) {
				System.out.println("Value Exists.");
				break;
			}
		}
		set = map.entrySet();
		iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
