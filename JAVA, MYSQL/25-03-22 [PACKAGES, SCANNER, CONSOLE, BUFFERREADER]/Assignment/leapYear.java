import java.util.Scanner;
public class leapYear {
  public static void main(String[] args) {
	  
	Scanner reader = new Scanner(System.in);  

    int year;
    boolean leap = false;
	
	System.out.print("Enter a Year: ");
    year = reader.nextInt();

    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      else
        leap = true;
    }
    else
      leap = false;
    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}