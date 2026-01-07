package OOPS;

public class method_overloading {
	void payment() {
		System.out.println("welcome to paymemt services");
	}
	void payment(int amount) {
		System.out.println("cashpayment successfully with: "+amount);
	}
	void payment(String upiid) {
		System.out.println("UPI payment successfully with: "+upiid);
	}
	void payment(int amount , String cardnum) {
		System.out.println("card paymenyt successfully with: "+amount+" card number is "+cardnum);
	}
	void payment(String walletname,int amount)
	{
		System.out.println("wallet payment successfully with: "+walletname+" amount is "+amount);
	}
     public static void main(String[] args) {
    	 
    	 method_overloading obj=new method_overloading();
    	 obj.payment();
    	 obj.payment(700);
    	 obj.payment("priyanka1213@upi");
		 obj.payment(5000, "7849-78575-8959-8595");
		 obj.payment("paytm",5000);
	}
}