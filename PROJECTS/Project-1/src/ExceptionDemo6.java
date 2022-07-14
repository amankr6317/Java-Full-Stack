import java.util.Scanner;
class MarkCheck extends Exception  {
	MarkCheck(String s) {
		super(s);
	}
}
public class ExceptionDemo6
{
	public static void main(String[] args) {
		int marks, sum=0, avg;
		String subject;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<2; i++) {
            try {
		    System.out.println("Enter the subject name and marks of student "+(i+1));
		    for(int j=0; j<3; j++) {
		        System.out.println("Enter the subject name");
		        sc.next();
		        subject=sc.nextLine();
		        System.out.println("Enter the subject marks");
		        marks=Integer.parseInt(sc.next());
                if(marks<0) {
                    throw new MarkCheck("Negative value out of range");
                }
                sum=sum+marks;
		    }
		    avg=sum/3;
		    System.out.println("Average : "+avg);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException occurred");
            } catch (MarkCheck e) {
			    e.printStackTrace();
		    }
		    
        }
	}
}
