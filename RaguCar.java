package OOPS;
public class RaguCar implements Car{
	public static void main(String[] args) {
		
		RaguCar rc=new RaguCar();
		rc.start();
		rc.accel();
		rc.music();
		rc.stop();
		
		
		Car c=new RaguCar();
		c.start();
		c.accel();
		c.stop();
		
		
		
	}
	
	public void start() {
		System.out.println("Start");
		
	}
	
	public void accel() {
		System.out.println("Accel");
		
	}
	
	public void stop() {
		System.out.println("Stop");
		
	}
	
	public void music() {
		System.out.println("Music");
		
	}
	
	
	
}
