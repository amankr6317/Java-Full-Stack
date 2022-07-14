enum Seasons {
	SUMMER("April to June"), MONSOON("July to Mid-September"), AUTUMN("September end to November"),
	WINTER("December to January"), SPRING("Feburary to March");
	String season;
	Seasons(String season) {
		this.season = season;
	}
}
public class EnumWithConstructor {
	public static void main(String[] args) {
		for(Seasons s:Seasons.values()) {
			System.out.println(s+" "+s.season);
		}
	}
}