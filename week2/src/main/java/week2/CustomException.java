package week2;

public class CustomException {
	
	public void age1(int age ) throws Custom {
		if(age<0) {
			throw new Custom("invalid age");
		}
	}
	public static void main(String[] args) {
		CustomException ce=new CustomException();
		try {
			ce.age1(-10);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
class Custom extends Exception
{
	public Custom(String message) {
		super(message);
	}
}
