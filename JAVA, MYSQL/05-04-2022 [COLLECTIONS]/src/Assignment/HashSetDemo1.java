package Assignment;

import java.util.HashSet;
import java.util.Iterator;

class Country1 {
	HashSet<String> H1=new HashSet<String>();
	
	public HashSet<String> saveCountryName(String countryName) {
		H1.add(countryName);
		return H1;
	}
	
	public String getCountry(String countryName) {
		Iterator<String> iterator=H1.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if(string.equals(countryName)) {
				return countryName+" is a country";
			}
		}
		return countryName+" not is a country";
	}
}
public class HashSetDemo1 {
	public static void main(String[] args) {
		Country1 country=new Country1();
		country.saveCountryName("India");
		System.out.println(country.getCountry("India"));
		System.out.println(country.getCountry("England"));
	}
}
