import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Aman");
		map.put(2, "Kumar");
		map.put(3, "Amit");
		map.put(4, "Tushar");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
