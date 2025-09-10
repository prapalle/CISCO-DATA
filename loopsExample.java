package Basics;

public class loopsExample {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("Value of i is" +i);

	}
	        int j=0;
			while(j<5) {
				System.out.println("Value of j is "+j);
				j++;
			}
			System.out.println("************************");	
//Nested for loop
for(int i=0;i<5;i++) {//i=0,1,2,3,4
		System.out.println("Value of i is##### "+i);
			
	    for(int k=0;k<7;k++) {//i=0,1,2,3,4
				System.out.println("Value of k is "+k);
			}
		}
for(int l=0;l<10;l++) {//l=0,1,2,3,4,5,6,7,8,9
			
		if(l==6) {
			break;
		}
		System.out.println("Value of l is##### "+l);

					
				
		}
	}
}
