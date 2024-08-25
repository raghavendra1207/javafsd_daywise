package day1;
import day1.Vehicle;
public class Car extends Vehicle{
	
		private String make;
		private String model;
		public Car(String make,String model) {
			super(make,model);
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
		public void start() {
			System.out.println("car is starting");
		}
		public void stop() {
			System.out.println("car is stopped");
		}
	
		public static void main(String args[]) {
			Car honda=new Car("honda","civic");
			System.out.println(honda.getMake());
			System.out.println(honda.getModel());
			honda.start();
			honda.stop();
		}
}
