class EnumOrdinalDemo {
	enum Directions {
		EAST, WEST, NORTH, SOUTH;
	}

	public static void main(String[] args) {
		for (Directions d : Directions.values()) {
			System.out.println(d);
		}
		System.out.println("Value of:" + Directions.valueOf("WEST"));
		System.out.println("Index of:" + Directions.valueOf("NORTH").ordinal());
	}
}