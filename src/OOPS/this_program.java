package OOPS;

public class this_program {
	int a;
	public this_program(int a)
	{
		
		this.a=a;
		System.out.println(a);
		// TODO Auto-generated constructor stub
	}
	void display () {
		System.out.println(a);
	}
	
public static void main(String[] args) {
	this_program ty=new this_program(10);
	ty.display();
}
}

