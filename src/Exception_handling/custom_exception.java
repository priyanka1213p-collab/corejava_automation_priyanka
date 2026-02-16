package Exception_handling;
class Priyanka_Exception extends Exception{
	public Priyanka_Exception(String string) {
		super(string);
	}
}


public class custom_exception {
	void throw_throws() throws Priyanka_Exception
	{
		int i = -10;
		if(i>0)
		{
			System.out.println("positive val");
		}
		else {
			throw new Priyanka_Exception("negative value");
		}
	}
	
	public static void main(String[] args) throws Priyanka_Exception{
		custom_exception c = new custom_exception();
		c.throw_throws();
		
	}

}
