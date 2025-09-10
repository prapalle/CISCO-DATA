package OOPS;
public class TestBank extends RaghuBank{
	public static void main(String[] args) {
		
		TestBank tb=new TestBank();
		tb.credit();
		tb.debit();
		tb.atm();
		tb.transfer();
		tb.onlinePin();
	}
	
	public void credit() {
		System.out.println("Credit");
		
	}
	
	public void atm() {
		System.out.println("ATM");
		
	}
	
	public void transfer() {
		System.out.println("Transfer");
		
	}
}

