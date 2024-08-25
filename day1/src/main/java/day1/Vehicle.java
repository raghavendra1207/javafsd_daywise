package day1;

public class Vehicle {
	private String make;
	private String model;
	public Vehicle(String make,String model) {
		this.make=make;
		this.model=model;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return this.model;
	}
	public String getMake() {
		return this.make;
	}
}
