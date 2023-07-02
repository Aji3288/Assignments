package override;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("Deposit amount is 2000");
		
	}
	
	
	public static void main(String[] args) {
		
		AxisBank amount = new AxisBank();
		amount.saving();
		amount.fixed();
		amount.deposit();
	
	}
}
