
 package OOPS;

class Admin{
	int id;
	public Admin(int id) {
		
		System.out.println("parent class "+id);
		// TODO Auto-generated constructor stub
	}
	
}
class Child_class extends Admin{

	public Child_class(int id) {
		//call to parent class constructor
		super(13);
		System.out.println("child class"+id);
		
		// TODO Auto-generated constructor stub
	}
}


public class Singlelevel_inheritance {
	public static void main(String[] args) {
		Child_class c=new Child_class(12);
		
	}

}


//super keyword tyare use parents class no output show karava jyare koi paramater 
//define kriyo hoy toh aene output ma batavo padse n 
