package ReadDataExcel;
public class MultiThreadExample extends Thread{
/*
public void test()	{
	for(int i=0;i<5;i++) {
		System.out.println("Value of i is "+i);
	}
*/
	public void run()	{
		for(int i=0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName()+i);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
}