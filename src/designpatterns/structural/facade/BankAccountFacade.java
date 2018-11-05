package designpatterns.structural.facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck accountCheck;
	SecurityCodeCheck securityCheck;
	FundsCheck fundsCheck;
	
	WelcomeToBank welcome;
	
	public BankAccountFacade(int accountNumber, int securityCode){
		
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;
		
		welcome = new WelcomeToBank();
		accountCheck = new AccountNumberCheck();
		securityCheck = new SecurityCodeCheck();
		fundsCheck = new FundsCheck();
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public int getSecurityCode(){
		return securityCode;
	}
	
	public void withdrawCash(double withdrawl){
		
		if(accountCheck.accountActive(getAccountNumber()) && 
				securityCheck.isCodeCorrect(getSecurityCode()) &&
				fundsCheck.hasEnough(withdrawl)){
			System.out.println("Transaciton Complete");
		}else{
			System.out.println("Transaction Failed");
		}
	}
	
	public void depositCash(double deposit){
		if(accountCheck.accountActive(getAccountNumber()) && 
				securityCheck.isCodeCorrect(getSecurityCode())){
			
			fundsCheck.makeDeposit(deposit);
			System.out.println("Transaction Complete");
		}else{
			System.out.println("Transaction Failed");
		}
		
	}
}
