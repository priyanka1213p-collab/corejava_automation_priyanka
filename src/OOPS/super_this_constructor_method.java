package OOPS;
class Student{
	String name;
	
	// parent constructor
	Student(String name){
		this.name = name; // this = current (student) object
	}
	
	//parent method 
	  void Studentinfo(){
		  System.out.println("Student name:" + name);
		 
	 }
}
 class ColleageStudent extends Student{
	 int rollNo;
	  
	 //child constructor
	 ColleageStudent(String name ,int rollNo){
		 super(name);
		 this.rollNo = rollNo;
		 
	 }
	 
	 //child method
	 void ColleageStudent() {
		 super.Studentinfo(); // parent method
		 System.out.println(" Student RollNo:"  + rollNo);
	 }
	 
 }


public class super_this_constructor_method {
	public static void main(String[] args) {
		ColleageStudent c1 = new ColleageStudent("Priyanka" , 107);
		c1.ColleageStudent();
	}

}


