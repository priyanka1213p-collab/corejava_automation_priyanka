package OOPS;

public class Bank_implmentation implements Bank_app{
	
	double balance;
	@Override
	public void account_registration(String accountId, String accountName, String accountType, double balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
		System.out.println("Account is registerd "+accountId+" "+accountName+" "+balance);
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		int amount=500;
		if(balance>amount) {
		balance=balance-amount;
		}
		else {
			System.out.println("invalid amount of debit");
		}
		System.out.println("after debit avaiable balance is "+balance);


		 
		
		// TODO Auto-generated method stub
		int amount=1000;
		balance=balance+amount;
		System.out.println("after credit avaialbe bal is"+balance);
		
		
	}
public static void main(String[] args) {
	Bank_implmentation bank=new Bank_implmentation();
	bank.account_registration("10012121", "Tops", "current", 10000.00);
	bank.debit();
	bank.credit();
}
}



