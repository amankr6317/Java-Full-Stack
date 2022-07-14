package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class CountryMap {
	private HashMap<String, String> M1;

	public CountryMap() {
		M1 = new HashMap<String, String>();
	}

	public HashMap<String, String> saveCountryCapital(String country, String capital) {
		M1.put(country, capital);
		return M1;
	}

	public String getCapital(String country) {
		return M1.get(country);
	}

	public String getCountry(String capital) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) iterator.next();
			if (entry.getValue().equals(capital)) {
				capital = entry.getKey();
			}
		}
		return capital;
	}

	public HashMap<String, String> swapCountryCapital() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) iterator.next();
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}

	public ArrayList<String> allCountry() {
		ArrayList<String> arrayList = new ArrayList<String>();
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) iterator.next();
			arrayList.add(entry.getKey());
		}
		return arrayList;
	}
}

public class CountryMapDemo {
	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();
		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		String str1 = countryMap.getCapital("India");
		System.out.println(str1);
		String str2 = countryMap.getCountry("Delhi");
		System.out.println(str2);
		HashMap<String, String> hashMap = countryMap.swapCountryCapital();
		System.out.println(hashMap);
		ArrayList<String> arrayList = countryMap.allCountry();
		System.out.println(arrayList);
	}
}
