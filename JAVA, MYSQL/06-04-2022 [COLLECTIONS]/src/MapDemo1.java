import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo1 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(1, "Aman");
		map.put(2, "Kumar");
		Set set=map.entrySet();
		Iterator iterator=set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry=(Map.Entry)iterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
