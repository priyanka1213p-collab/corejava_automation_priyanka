package Encapsulation;

public class CallStudent_Encapsulation {
	public static void main(String[] args) {
		Student_Encapsulation E3 = new Student_Encapsulation();
		E3.setAge(20);
		E3.setRollNo(107);
		
		System.out.println("Student age:" +E3.getAge());
		System.out.println("Student RollNo:" +E3.getRollNo());
	}

}
