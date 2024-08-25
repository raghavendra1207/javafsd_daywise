package day1;

public class Student {
	
	private String name;
	private int rollNo;
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		System.out.println("Name: "+this.name+" rollNo: "+this.rollNo);
		
	}
	public static void main(String[] args) {
		Student st=new Student("raghav",21);
		Student st1=new Student("raghav1",22);
		
	}
	

}
