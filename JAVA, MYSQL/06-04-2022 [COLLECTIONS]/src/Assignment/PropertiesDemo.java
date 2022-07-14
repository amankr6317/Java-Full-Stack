package Assignment;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("Jharkhand", "Rachi");
		properties.setProperty("Bihar", "Patna");
		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Object, Object> entry = (Entry<Object, Object>) iterator.next();
			System.out.println(entry);
		}
	}
}
