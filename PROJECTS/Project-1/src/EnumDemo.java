import java.util.Scanner;

class EnumDemo {
	enum WeekDays {
		MON, TUE, WED, THUR, FRI, SAT, SUN;
	}

	public static void main(String[] args) {
		System.out.println("Chose the Weekday Days :");
		System.out.println("1 : MON, 2 : TUE, 3 : WED, 4 : THUR, 5 : FRI, 6 : SAT, 7 : SUN");
		System.out.print("Enter a Number between 1-7 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out
					.println("You have selected : " + WeekDays.valueOf("MON") + " at index " + WeekDays.MON.ordinal());
			break;
		case 2:
			System.out
					.println("You have selected : " + WeekDays.valueOf("TUE") + " at index " + WeekDays.TUE.ordinal());
			break;
		case 3:
			System.out
					.println("You have selected : " + WeekDays.valueOf("WED") + " at index " + WeekDays.WED.ordinal());
			break;
		case 4:
			System.out.println(
					"You have selected : " + WeekDays.valueOf("THUR") + " at index " + WeekDays.THUR.ordinal());
			break;
		case 5:
			System.out
					.println("You have selected : " + WeekDays.valueOf("FRI") + " at index " + WeekDays.FRI.ordinal());
			break;
		case 6:
			System.out
					.println("You have selected : " + WeekDays.valueOf("SAT") + " at index " + WeekDays.SAT.ordinal());
			break;
		case 7:
			System.out
					.println("You have selected : " + WeekDays.valueOf("SUN") + " at index " + WeekDays.SUN.ordinal());
			break;
		default:
			System.out.println("Enter value between 1-7");
			break;
		}
	}
}
