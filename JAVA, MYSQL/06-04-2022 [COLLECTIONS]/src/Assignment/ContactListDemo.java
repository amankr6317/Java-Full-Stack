package Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class ContactList {
	Map<String, Integer> map = new HashMap<String, Integer>();

	public void addContact(String name, Integer number) {
		map.put(name, number);
	}

	public void contactNameExists(String name) {
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
			if (entry.getKey().equals(name)) {
				System.out.println("Name Exists.");
				break;
			}
		}
	}

	public void contactNumberExists(Integer number) {
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
			if (entry.getValue().equals(number)) {
				System.out.println("Number Exists.");
				break;
			}
		}
	}
	
	public void allContactExists() {
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
			System.out.println(entry);
		}
	}
}

public class ContactListDemo {
	public static void main(String[] args) {
		ContactList contactList = new ContactList();
		contactList.addContact("Aman", 876578937);
		contactList.addContact("Kumar", 748494639);
		contactList.addContact("Amit", 293489237);
		contactList.addContact("Rohan", 846357867);
		contactList.addContact("Puja", 324687326);
		contactList.allContactExists();
		contactList.contactNameExists("Aman");
		contactList.contactNumberExists(293489237);
	}
}
