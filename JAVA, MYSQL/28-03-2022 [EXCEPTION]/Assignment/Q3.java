import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		int n, m;  
        Scanner sc=new Scanner(System.in);  
		try {
		    System.out.print("Enter the number of elements in the array");
            n=sc.nextInt();
            int[] array = new int[n];
            System.out.print("Enter the elements in the array");
            for(int i=0; i<n; i++)  
            {  
                array[i]=Integer.parseInt(sc.next());  
            }
            System.out.println("Enter the index of the array element you want to access");
            m=sc.nextInt();
            System.out.println("The array element successfully accessed "+ array[m]);
        } catch (ArrayIndexOutOfBoundsException  ex){
            System.out.println(ex);
        } catch (NumberFormatException e) {
                System.out.println("NumberFormatException occurred");
        }
	}
}