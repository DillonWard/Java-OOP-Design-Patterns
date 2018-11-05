package designpatterns.structural.facade;

public class AccountNumberCheck {

	private int accountNumber = 12345678;
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public boolean accountActive(int account){
		
		if(account == getAccountNumber()){
			return true;
		}else{
			return false;
		}
	}
}
