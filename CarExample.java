package OOPS;
public class CarExample {
	
	int cmodel;
	String cname;
	
	//Constructor without parameters
	public CarExample() {
		cmodel=129;
		cname="Skoda";
	}
	
	//Constructor with parameters
	public CarExample(int model, String name) {
		cmodel=model;
		cname=name;
	}
	
	
	
	public static void main(String[] args) {
		
		CarExample ce1=new CarExample();
		
		System.out.println(ce1.cmodel);
		System.out.println(ce1.cname);
	
		CarExample ce2=new CarExample();
		System.out.println(ce2.cmodel);
		System.out.println(ce2.cname);
		
		CarExample ce3=new CarExample(12345, "Scorpio");
		System.out.println(ce3.cmodel);
		System.out.println(ce3.cname);
	}
}
