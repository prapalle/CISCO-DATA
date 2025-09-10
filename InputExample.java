package Basics;
import java.util.Scanner;
public class InputExample {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your Location: ");
		String location=input.nextLine();
		
		System.out.print("Enter ID: ");
		int id=input.nextInt();
		
		System.out.print("Enter Salary: ");
		float salary=input.nextFloat();
		
		System.out.println(location);
		System.out.println(id);
		System.out.println(salary);
		
	}
}
