
 package OOPS;

//inheritance is process of acquiring the properties and behaviors (methods) of a   parent class by a child class.

//inheritance is used for code reusability

//types of inheritance
//1. single inheritance
//2. multilevel inheritance
//3. hierarchical inheritance
//4. multiple inheritance (not supported in java using classes but supported using interfaces)


class Parent
{
	public Parent() {
	
		
		System.out.println("parent class constructor");
		
		
		
		
	
	}
}
class Child extends Parent{
	public Child() {
	
		System.out.println("Child class constructor");
		// TODO Auto-generated constructor stub
	}
}


public class inheritance {
	public static void main(String[] args) {
		Child c=new Child();
		
	}

}


//first is parent class created and than child class 
// and keyword is "extends" for child class
