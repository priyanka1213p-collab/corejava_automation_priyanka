package OOPS;

//method overriding is same method name and same parameters in different classes
class Parent_class
{
	void test() {
		System.out.println("parent class method");
	}
	void test(int id) {
		System.out.println("parent class method with id "+id);
	}		
	
}
class Child_clas extends Parent_class{	
	void test() {
		super.test();
		System.out.println("child class method");
	}
	void test(int id) {
		
		super.test(14);
		System.out.println(id);
	}
	
}

public class Inheritancemethod_overriding {
	public static void main(String[] args) {
		Child_clas c=new Child_clas();
		c.test();
		c.test(13);
		
	}

}


//super class used to the parent class method 
//this keyword is used to the current class 