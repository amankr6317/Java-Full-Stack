package Assignment;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Automobile {
	public static void main(String[] args) {
		Hero hero = new Hero("Hero", "AB12", "TEST", 10);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		Honda honda = new Honda("Honda", "AB12", "TEST", 10);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();
	}
}