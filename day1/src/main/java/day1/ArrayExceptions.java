package day1;

public class ArrayExceptions {
	
	public static void main(String args[]) {
		int[] arr1= {1,2,3};
		try {
			arr1[4]=4;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
