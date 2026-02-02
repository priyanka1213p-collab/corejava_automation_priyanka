package OOPS;
class School{
	public School() {
	System.out.println("Welcome to my school");
		
		// TODO Auto-generated constructor stub
	}
	
}
class  Student5 extends School{
	
	public Student5() {
	
		
		System.out.println("Student class");
		// TODO Auto-generated constructor stub
	}
	
}
class Admin_1 extends School{
	
	
	public Admin_1() {
	
		System.out.println("Admin class");
		// TODO Auto-generated constructor stub
	}
	
	
}
class Principle extends School{
	
	public Principle() {
	
		System.out.println("Prnciple class");
		
		// TODO Auto-generated constructor stub
	}
}


public class hierarchical_inheritance {
	public static void main(String[] args) {
		Student5 student=new Student5();	
		Admin_1 admin=new Admin_1();
		Principle p=new Principle();
	}
		
	}


