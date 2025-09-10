package ReadDataExcel;
public class TestThread {
	public static void main(String[] args) {
		
		
		MultiThreadExample m1=new MultiThreadExample();
		MultiThreadExample m2=new MultiThreadExample();
		MultiThreadExample m3=new MultiThreadExample();
	
		m1.start();
		m2.start();
		m3.start();
	}
}
