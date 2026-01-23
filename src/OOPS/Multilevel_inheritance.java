package OOPS;
//multilevel inheritance is a process where a class inherits
//from a derived class
//which is also known as a child class
//that is inherited from another class

//class admin_class{
//	void test() {
//		System.out.println("admin class method");
//	}
//}
//class Child_class1 extends  admin_class{
//	void test() {
//		super.test();
//		System.out.println("child class1 method");
//	}
//}
//class Child_class2 extends Child_class1{
//	void test() {
//		super.test();
//		System.out.println("child class2 method");
//	}
//}
//public class Multilevel_inheritance {
//public static void main(String[] args) {
//	Child_class2 c=new Child_class2();
//	c.test();
//}
//}



class Manager{
	void test() {
		System.out.println("Manager class method ");
	}
}

class admin extends Manager {
	void test() {
		super.test();
		System.out.println("Admin class method");
		
	}
}

class person extends  admin{
	void test() {
		super.test();
		System.out.println("Person method ");
	
	}
}

public class Multilevel_inheritance {
public static void main(String[] args) {
	 person p1 = new  person();
	 p1.test();
}
	
}
