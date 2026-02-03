package Encapsulation;
//Student Age Validation
//
//Create a Student class
//
//Private fields: rollNo, age
//
//Setter should allow age only between 5 and 25
//
//Getter to view age
//
//Concept: Range Validation

public class Student_Encapsulation {
//Private data member
private int RollNo;
private int age ;

public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>=5 && age<=25) {
	this.age = age;
}else {
	System.out.println("Age must be between 5 to 25 ");
}

}
}
