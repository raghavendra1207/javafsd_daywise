package day1;


public class Person {

	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public void speak() {
		System.out.println(this.name+" is speaking");
	}
	public void walk() {
		System.out.println(this.name+" is walking");
	}
	
	public static void main(String[] args) {
		Person ps=new Person("raghav",19);
		ps.speak();
		ps.walk();
		
	}
}
