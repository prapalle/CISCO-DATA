package OOPS;
public class propertiesMethodsTest {
	
	String name="Skoda";
	int wheels=4;
	String color="Blue";
	
	int model;
	
	
	
	
	public static void main(String[] args) {
		
		propertiesMethodsTest c1= new propertiesMethodsTest();
		System.out.println(c1.name);
		System.out.println(c1.wheels);
		System.out.println(c1.color);
		c1.model=12345;
		System.out.println(c1.model);
		
		c1.startCar();
		c1.accelCar();
		c1.stopCar();
		
		propertiesMethodsTest c2= new propertiesMethodsTest();
		c2.model=123456;
		System.out.println(c2.model);
		
	}
	
	public void startCar() {
		System.out.println("Start the Car");
	}
	
	public void accelCar() {
		System.out.println("Accel the Car");
	}
	
	public void stopCar() {
		System.out.println("Stop the Car");
	}
}
