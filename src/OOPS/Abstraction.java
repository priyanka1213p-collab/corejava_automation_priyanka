
package OOPS;
//abstarction means show feature of app and hide implementation detail/working 

abstract class Ab_test{
	
	abstract void Email_send();
	void Email_notification() {
		
	}
}


public class Abstraction extends Ab_test{
public static void main(String[] args) {
	
	Abstraction ab=new Abstraction();
	ab.Email_send();
	
}

@Override
void Email_send()
{
	
	System.out.println("workig detail of sms sending");
	// TODO Auto-generated method stub
	
}
}





