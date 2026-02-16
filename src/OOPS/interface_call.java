package OOPS;

//public interface interface_call {
public class interface_call implements datadao,datadao1,datadao2 {

	@Override
	public void Email_send() {
		// TODO Auto-generated method stub
		System.out.println("sending email");
	}

	@Override
	public void Attachment(int a) {
		// TODO Auto-generated method stub
		System.out.println("sending attchment"+a);
	}
	public static void main(String[] args) {
		interface_call i=new interface_call();
		i.Email_send();
		i.Attachment(10);
		
	}

	@Override
	public void email_sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email_drive() {
		// TODO Auto-generated method stub
		
	}

}



