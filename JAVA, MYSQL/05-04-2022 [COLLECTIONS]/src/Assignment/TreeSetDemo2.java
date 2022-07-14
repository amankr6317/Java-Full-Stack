package Assignment;

import java.util.Iterator;
import java.util.TreeSet;

class Country2 {
	TreeSet<String> T1=new TreeSet<String>();
	
	public TreeSet<String> saveCountryName(String countryName) {
		T1.add(countryName);
		return T1;
	}
	
	public String getCountry(String countryName) {
		Iterator<String> iterator=T1.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if(string.equals(countryName)) {
				return countryName+" is a country";
			}
		}
		return countryName+" not is a country";
	}
}

public class TreeSetDemo2 {
	public static void main(String[] args) {
		Country2 country=new Country2();
		country.saveCountryName("India");
		System.out.println(country.getCountry("India"));
		System.out.println(country.getCountry("England"));
	}
}
