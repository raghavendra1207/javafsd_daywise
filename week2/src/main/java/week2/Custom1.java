package week2;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Custom1 {
	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner(System.in);
	try
	{
		int a=sc.nextInt();
	}
	catch(InputMismatchException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}
}
