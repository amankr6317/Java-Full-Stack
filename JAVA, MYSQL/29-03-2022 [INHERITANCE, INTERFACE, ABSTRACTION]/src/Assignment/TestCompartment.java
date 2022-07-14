package Assignment;

import java.util.Random;

abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment {
	@Override
	public String notice() {
		return "You are in First Class Compartment";
	}
}

class Ladies extends Compartment {
	@Override
	public String notice() {
		return "You are in Ladies Compartment";
	}
}

class General extends Compartment {
	@Override
	public String notice() {
		return "You are in General Compartment";
	}
}

class Luggage extends Compartment {
	@Override
	public String notice() {
		return "You are in Luggage Compartment";
	}
}

public class TestCompartment {
	public static void main(String[] args) {
		Compartment compartment[] = new Compartment[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int x = random.nextInt(4) + 1;
			if (x == 1) {
				compartment[i] = new FirstClass();
			} else if (x == 2) {
				compartment[i] = new Ladies();
			} else if (x == 3) {
				compartment[i] = new General();
			} else if (x == 4) {
				compartment[i] = new Luggage();
			}
			System.out.println(compartment[i].notice());
		}
	}
}