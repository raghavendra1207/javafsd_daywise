package week2;

public class ExceptionHandling {
	
	public static void main(String args[]) {
		try {
			int a=6;
			int b=6/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
