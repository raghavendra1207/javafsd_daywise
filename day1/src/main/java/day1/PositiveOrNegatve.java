package day1;

import java.util.Scanner;

public class PositiveOrNegatve {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<0) {
			System.out.println("negative number");
			
		}
		else if(a>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("number is zero");
		}
	}

}
