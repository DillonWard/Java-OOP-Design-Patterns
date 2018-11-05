package designpatterns.structural.facade;

public class FundsCheck {

	private double cashInAccount = 100.00;
	
	public double getCashInAccount(){
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double withdrawl){
		cashInAccount -= withdrawl;
	}
	
	public void increaseCashInAccount(double deposit){
		cashInAccount += deposit;
	}
	
	public boolean hasEnough(double withdrawl){
		
		if(withdrawl > getCashInAccount()){
			System.out.println("You don't have enough money");
			System.out.println("Current balance: " + getCashInAccount());
			
			return false;
		}else{
			decreaseCashInAccount(withdrawl);
			System.out.println("Withdrawl made");
			System.out.println("Current balance: " + getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposit(double deposit){
		increaseCashInAccount(deposit);
		System.out.println("Deposit made");
		System.out.println("Current balance: " + getCashInAccount());
	}

}
