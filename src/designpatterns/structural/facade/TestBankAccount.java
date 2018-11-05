package designpatterns.structural.facade;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccountFacade account = new BankAccountFacade(12345678, 1234);
		
		account.withdrawCash(500);
		
		account.withdrawCash(20);
		
		account.depositCash(200);
	}
}
