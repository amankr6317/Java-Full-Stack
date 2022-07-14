import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		int n, m;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements in the array");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements in the array");
        for(int i=0; i<n; i++)  
        {  
            array[i]=sc.nextInt();  
        }  
		try {
            System.out.println("Enter the index of the array element you want to access");
            m=sc.nextInt();
            System.out.println("The array element successfully accessed "+ array[m]);
        } catch (ArrayIndexOutOfBoundsException  ex){
            System.out.println(ex);
        }
	}
}