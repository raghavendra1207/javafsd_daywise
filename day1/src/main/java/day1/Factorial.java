package day1;

public class Factorial {
	
	public int factorial(int n) {
		int fact=1;
		int mul=1;
		while(mul<=n) {
			fact*=mul;
			mul++;
		}
		return fact;
		
	}
	public static void main(String args[]) {
		Factorial fc=new Factorial();
		System.out.println(fc.factorial(5));
	}

}
